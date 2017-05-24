// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: health.proto

package io.grpc.health.v1;

/**
 * Protobuf type {@code grpc.health.v1.HealthCheckResponse}
 */
public  final class HealthCheckResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grpc.health.v1.HealthCheckResponse)
    HealthCheckResponseOrBuilder {
  // Use HealthCheckResponse.newBuilder() to construct.
  private HealthCheckResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HealthCheckResponse() {
    status_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private HealthCheckResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {
            int rawValue = input.readEnum();

            status_ = rawValue;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.health.v1.HealthProto.internal_static_grpc_health_v1_HealthCheckResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.health.v1.HealthProto.internal_static_grpc_health_v1_HealthCheckResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.health.v1.HealthCheckResponse.class, io.grpc.health.v1.HealthCheckResponse.Builder.class);
  }

  /**
   * Protobuf enum {@code grpc.health.v1.HealthCheckResponse.ServingStatus}
   */
  public enum ServingStatus
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN = 0;</code>
     */
    UNKNOWN(0),
    /**
     * <code>SERVING = 1;</code>
     */
    SERVING(1),
    /**
     * <code>NOT_SERVING = 2;</code>
     */
    NOT_SERVING(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNKNOWN = 0;</code>
     */
    public static final int UNKNOWN_VALUE = 0;
    /**
     * <code>SERVING = 1;</code>
     */
    public static final int SERVING_VALUE = 1;
    /**
     * <code>NOT_SERVING = 2;</code>
     */
    public static final int NOT_SERVING_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ServingStatus valueOf(int value) {
      return forNumber(value);
    }

    public static ServingStatus forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN;
        case 1: return SERVING;
        case 2: return NOT_SERVING;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ServingStatus>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ServingStatus> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ServingStatus>() {
            public ServingStatus findValueByNumber(int number) {
              return ServingStatus.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return io.grpc.health.v1.HealthCheckResponse.getDescriptor().getEnumTypes().get(0);
    }

    private static final ServingStatus[] VALUES = values();

    public static ServingStatus valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ServingStatus(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:grpc.health.v1.HealthCheckResponse.ServingStatus)
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_;
  /**
   * <code>.grpc.health.v1.HealthCheckResponse.ServingStatus status = 1;</code>
   */
  public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.grpc.health.v1.HealthCheckResponse.ServingStatus status = 1;</code>
   */
  public io.grpc.health.v1.HealthCheckResponse.ServingStatus getStatus() {
    io.grpc.health.v1.HealthCheckResponse.ServingStatus result = io.grpc.health.v1.HealthCheckResponse.ServingStatus.valueOf(status_);
    return result == null ? io.grpc.health.v1.HealthCheckResponse.ServingStatus.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (status_ != io.grpc.health.v1.HealthCheckResponse.ServingStatus.UNKNOWN.getNumber()) {
      output.writeEnum(1, status_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != io.grpc.health.v1.HealthCheckResponse.ServingStatus.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, status_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.grpc.health.v1.HealthCheckResponse)) {
      return super.equals(obj);
    }
    io.grpc.health.v1.HealthCheckResponse other = (io.grpc.health.v1.HealthCheckResponse) obj;

    boolean result = true;
    result = result && status_ == other.status_;
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.health.v1.HealthCheckResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.health.v1.HealthCheckResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.health.v1.HealthCheckResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.health.v1.HealthCheckResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.health.v1.HealthCheckResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.health.v1.HealthCheckResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.health.v1.HealthCheckResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.health.v1.HealthCheckResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.health.v1.HealthCheckResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.health.v1.HealthCheckResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.health.v1.HealthCheckResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.health.v1.HealthCheckResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.grpc.health.v1.HealthCheckResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code grpc.health.v1.HealthCheckResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.health.v1.HealthCheckResponse)
      io.grpc.health.v1.HealthCheckResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.health.v1.HealthProto.internal_static_grpc_health_v1_HealthCheckResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.health.v1.HealthProto.internal_static_grpc_health_v1_HealthCheckResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.health.v1.HealthCheckResponse.class, io.grpc.health.v1.HealthCheckResponse.Builder.class);
    }

    // Construct using io.grpc.health.v1.HealthCheckResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      status_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.health.v1.HealthProto.internal_static_grpc_health_v1_HealthCheckResponse_descriptor;
    }

    public io.grpc.health.v1.HealthCheckResponse getDefaultInstanceForType() {
      return io.grpc.health.v1.HealthCheckResponse.getDefaultInstance();
    }

    public io.grpc.health.v1.HealthCheckResponse build() {
      io.grpc.health.v1.HealthCheckResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.grpc.health.v1.HealthCheckResponse buildPartial() {
      io.grpc.health.v1.HealthCheckResponse result = new io.grpc.health.v1.HealthCheckResponse(this);
      result.status_ = status_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grpc.health.v1.HealthCheckResponse) {
        return mergeFrom((io.grpc.health.v1.HealthCheckResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.health.v1.HealthCheckResponse other) {
      if (other == io.grpc.health.v1.HealthCheckResponse.getDefaultInstance()) return this;
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.grpc.health.v1.HealthCheckResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.health.v1.HealthCheckResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int status_ = 0;
    /**
     * <code>.grpc.health.v1.HealthCheckResponse.ServingStatus status = 1;</code>
     */
    public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.grpc.health.v1.HealthCheckResponse.ServingStatus status = 1;</code>
     */
    public Builder setStatusValue(int value) {
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.grpc.health.v1.HealthCheckResponse.ServingStatus status = 1;</code>
     */
    public io.grpc.health.v1.HealthCheckResponse.ServingStatus getStatus() {
      io.grpc.health.v1.HealthCheckResponse.ServingStatus result = io.grpc.health.v1.HealthCheckResponse.ServingStatus.valueOf(status_);
      return result == null ? io.grpc.health.v1.HealthCheckResponse.ServingStatus.UNRECOGNIZED : result;
    }
    /**
     * <code>.grpc.health.v1.HealthCheckResponse.ServingStatus status = 1;</code>
     */
    public Builder setStatus(io.grpc.health.v1.HealthCheckResponse.ServingStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.grpc.health.v1.HealthCheckResponse.ServingStatus status = 1;</code>
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:grpc.health.v1.HealthCheckResponse)
  }

  // @@protoc_insertion_point(class_scope:grpc.health.v1.HealthCheckResponse)
  private static final io.grpc.health.v1.HealthCheckResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.health.v1.HealthCheckResponse();
  }

  public static io.grpc.health.v1.HealthCheckResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HealthCheckResponse>
      PARSER = new com.google.protobuf.AbstractParser<HealthCheckResponse>() {
    public HealthCheckResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new HealthCheckResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HealthCheckResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HealthCheckResponse> getParserForType() {
    return PARSER;
  }

  public io.grpc.health.v1.HealthCheckResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

