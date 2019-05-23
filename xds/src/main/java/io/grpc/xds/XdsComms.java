/*
 * Copyright 2019 The gRPC Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.grpc.xds;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Preconditions.checkState;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Struct;
import com.google.protobuf.Value;
import io.envoyproxy.envoy.api.v2.ClusterLoadAssignment;
import io.envoyproxy.envoy.api.v2.DiscoveryRequest;
import io.envoyproxy.envoy.api.v2.DiscoveryResponse;
import io.envoyproxy.envoy.api.v2.core.Node;
import io.envoyproxy.envoy.api.v2.core.SocketAddress;
import io.envoyproxy.envoy.api.v2.endpoint.LocalityLbEndpoints;
import io.envoyproxy.envoy.service.discovery.v2.AggregatedDiscoveryServiceGrpc;
import io.grpc.EquivalentAddressGroup;
import io.grpc.LoadBalancer.Helper;
import io.grpc.ManagedChannel;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * ADS client implementation.
 */
final class XdsComms {
  private final ManagedChannel channel;
  private final Helper helper;

  // never null
  private AdsStream adsStream;

  static final class Locality {
    final String region;
    final String zone;
    final String subzone;

    Locality(io.envoyproxy.envoy.api.v2.core.Locality locality) {
      this(
          /* region = */ locality.getRegion(),
          /* zone = */ locality.getZone(),
          /* subzone = */ locality.getSubZone());
    }

    @VisibleForTesting
    Locality(String region, String zone, String subzone) {
      this.region = region;
      this.zone = zone;
      this.subzone = subzone;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      Locality locality = (Locality) o;
      return Objects.equal(region, locality.region)
          && Objects.equal(zone, locality.zone)
          && Objects.equal(subzone, locality.subzone);
    }

    @Override
    public int hashCode() {
      return Objects.hashCode(region, zone, subzone);
    }

    @Override
    public String toString() {
      return MoreObjects.toStringHelper(this)
          .add("region", region)
          .add("zone", zone)
          .add("subzone", subzone)
          .toString();
    }
  }

  /**
   * Information about the locality from EDS response.
   */
  static final class LocalityInfo {
    final List<EquivalentAddressGroup> eags;
    final List<Integer> endPointWeights;
    final int localityWeight;

    LocalityInfo(Collection<LbEndpoint> lbEndPoints, int localityWeight) {
      List<EquivalentAddressGroup> eags = new ArrayList<>(lbEndPoints.size());
      List<Integer> endPointWeights = new ArrayList<>(lbEndPoints.size());
      for (LbEndpoint lbEndPoint : lbEndPoints) {
        eags.add(lbEndPoint.eag);
        endPointWeights.add(lbEndPoint.endPointWeight);
      }
      this.eags = Collections.unmodifiableList(eags);
      this.endPointWeights = Collections.unmodifiableList(new ArrayList<>(endPointWeights));
      this.localityWeight = localityWeight;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      LocalityInfo that = (LocalityInfo) o;
      return localityWeight == that.localityWeight
          && Objects.equal(eags, that.eags)
          && Objects.equal(endPointWeights, that.endPointWeights);
    }

    @Override
    public int hashCode() {
      return Objects.hashCode(eags, endPointWeights, localityWeight);
    }
  }

  static final class LbEndpoint {
    final EquivalentAddressGroup eag;
    final int endPointWeight;

    LbEndpoint(io.envoyproxy.envoy.api.v2.endpoint.LbEndpoint lbEndpointProto) {

      this(
          new EquivalentAddressGroup(ImmutableList.of(fromEnvoyProtoAddress(lbEndpointProto))),
          lbEndpointProto.getLoadBalancingWeight().getValue());
    }

    @VisibleForTesting
    LbEndpoint(EquivalentAddressGroup eag, int endPointWeight) {
      this.eag = eag;
      this.endPointWeight = endPointWeight;
    }

    private static java.net.SocketAddress fromEnvoyProtoAddress(
        io.envoyproxy.envoy.api.v2.endpoint.LbEndpoint lbEndpointProto) {
      SocketAddress socketAddress = lbEndpointProto.getEndpoint().getAddress().getSocketAddress();
      return new InetSocketAddress(socketAddress.getAddress(), socketAddress.getPortValue());
    }
  }

  private final class AdsStream {
    static final String EDS_TYPE_URL =
        "type.googleapis.com/envoy.api.v2.ClusterLoadAssignment";
    static final String TRAFFICDIRECTOR_GRPC_HOSTNAME = "TRAFFICDIRECTOR_GRPC_HOSTNAME";
    final LocalityStore localityStore;

    final AdsStreamCallback adsStreamCallback;

    final StreamObserver<DiscoveryRequest> xdsRequestWriter;

    final StreamObserver<DiscoveryResponse> xdsResponseReader =
        new StreamObserver<DiscoveryResponse>() {

          boolean firstEdsResponseReceived;

          @Override
          public void onNext(final DiscoveryResponse value) {

            class HandleResponseRunnable implements Runnable {

              @Override
              public void run() {
                String typeUrl = value.getTypeUrl();
                if (EDS_TYPE_URL.equals(typeUrl)) {
                  // Assuming standard mode.

                  ClusterLoadAssignment clusterLoadAssignment;
                  try {
                    // maybe better to run this deserialization task out of syncContext?
                    clusterLoadAssignment =
                        value.getResources(0).unpack(ClusterLoadAssignment.class);
                  } catch (InvalidProtocolBufferException | NullPointerException e) {
                    cancelRpc("Received invalid EDS response", e);
                    adsStreamCallback.onError();
                    return;
                  }
                  if (!firstEdsResponseReceived) {
                    firstEdsResponseReceived = true;
                    adsStreamCallback.onWorking();
                  }
                  List<LocalityLbEndpoints> localities = clusterLoadAssignment.getEndpointsList();
                  Map<Locality, LocalityInfo> localityEndpointsMapping = new LinkedHashMap<>();
                  for (LocalityLbEndpoints localityLbEndpoints : localities) {
                    io.envoyproxy.envoy.api.v2.core.Locality localityProto =
                        localityLbEndpoints.getLocality();
                    Locality locality = new Locality(localityProto);
                    List<LbEndpoint> lbEndPoints = new ArrayList<>();
                    for (io.envoyproxy.envoy.api.v2.endpoint.LbEndpoint lbEndpoint
                        : localityLbEndpoints.getLbEndpointsList()) {
                      lbEndPoints.add(new LbEndpoint(lbEndpoint));
                    }
                    int localityWeight = localityLbEndpoints.getLoadBalancingWeight().getValue();

                    localityEndpointsMapping.put(
                        locality, new LocalityInfo(lbEndPoints, localityWeight));
                  }

                  localityEndpointsMapping = Collections.unmodifiableMap(localityEndpointsMapping);

                  // TODO: parse drop_percentage, and also updateLoacalistyStore with dropPercentage
                  localityStore.updateLocalityStore(localityEndpointsMapping);
                }
              }
            }

            helper.getSynchronizationContext().execute(new HandleResponseRunnable());
          }

          @Override
          public void onError(Throwable t) {
            helper.getSynchronizationContext().execute(
                new Runnable() {
                  @Override
                  public void run() {
                    // TODO: schedule retry
                    closed = true;
                    if (cancelled) {
                      return;
                    }
                    adsStreamCallback.onError();
                  }
                });
          }

          @Override
          public void onCompleted() {
            onError(Status.INTERNAL.withDescription("Server closed the ADS streaming RPC")
                .asException());
          }
        };

    boolean cancelled;
    boolean closed;

    AdsStream(AdsStreamCallback adsStreamCallback, LocalityStore localityStore) {
      this.adsStreamCallback = adsStreamCallback;
      this.xdsRequestWriter = AggregatedDiscoveryServiceGrpc.newStub(channel).withWaitForReady()
          .streamAggregatedResources(xdsResponseReader);
      this.localityStore = localityStore;

      // Assuming standard mode, and send EDS request only
      xdsRequestWriter.onNext(
          DiscoveryRequest.newBuilder()
              .setNode(Node.newBuilder()
                  .setMetadata(Struct.newBuilder()
                      .putFields(
                          TRAFFICDIRECTOR_GRPC_HOSTNAME,
                          Value.newBuilder().setStringValue(helper.getAuthority())
                              .build())
                      .putFields(
                          "endpoints_required",
                          Value.newBuilder().setBoolValue(true).build())))
              .setTypeUrl(EDS_TYPE_URL).build());
    }

    AdsStream(AdsStream adsStream) {
      this(adsStream.adsStreamCallback, adsStream.localityStore);
    }

    void cancelRpc(String message, Throwable cause) {
      if (cancelled) {
        return;
      }
      cancelled = true;
      xdsRequestWriter.onError(
          Status.CANCELLED.withDescription(message).withCause(cause).asRuntimeException());
    }
  }

  /**
   * Starts a new ADS streaming RPC.
   */
  XdsComms(
      ManagedChannel channel, Helper helper, AdsStreamCallback adsStreamCallback,
      LocalityStore localityStore) {
    this.channel = checkNotNull(channel, "channel");
    this.helper = checkNotNull(helper, "helper");
    this.adsStream = new AdsStream(
        checkNotNull(adsStreamCallback, "adsStreamCallback"),
        checkNotNull(localityStore, "localityStore"));
  }

  void shutdownChannel() {
    channel.shutdown();
    shutdownLbRpc("Loadbalancer client shutdown");
  }

  void refreshAdsStream() {
    checkState(!channel.isShutdown(), "channel is alreday shutdown");

    if (adsStream.closed || adsStream.cancelled) {
      adsStream = new AdsStream(adsStream);
    }
  }

  void shutdownLbRpc(String message) {
    adsStream.cancelRpc(message, null);
  }

  /**
   * Callback on ADS stream events. The callback methods should be called in a proper {@link
   * io.grpc.SynchronizationContext}.
   */
  interface AdsStreamCallback {

    /**
     * Once the response observer receives the first response.
     */
    void onWorking();

    /**
     * Once an error occurs in ADS stream.
     */
    void onError();
  }
}
