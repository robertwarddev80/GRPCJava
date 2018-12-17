// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/api/v2/auth/cert.proto

package io.grpc.xds.shaded.envoy.api.v2.auth;

public final class Cert {
  private Cert() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_auth_TlsParameters_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_auth_TlsParameters_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_auth_TlsCertificate_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_auth_TlsCertificate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_auth_TlsSessionTicketKeys_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_auth_TlsSessionTicketKeys_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_auth_CertificateValidationContext_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_auth_CertificateValidationContext_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_auth_CommonTlsContext_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_auth_CommonTlsContext_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_auth_CommonTlsContext_CombinedCertificateValidationContext_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_auth_CommonTlsContext_CombinedCertificateValidationContext_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_auth_UpstreamTlsContext_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_auth_UpstreamTlsContext_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_auth_DownstreamTlsContext_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_auth_DownstreamTlsContext_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_auth_SdsSecretConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_auth_SdsSecretConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_envoy_api_v2_auth_Secret_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_envoy_api_v2_auth_Secret_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034envoy/api/v2/auth/cert.proto\022\021envoy.ap" +
      "i.v2.auth\032\034envoy/api/v2/core/base.proto\032" +
      "%envoy/api/v2/core/config_source.proto\032\036" +
      "google/protobuf/wrappers.proto\032\027validate" +
      "/validate.proto\"\314\002\n\rTlsParameters\022^\n\034tls" +
      "_minimum_protocol_version\030\001 \001(\0162,.envoy." +
      "api.v2.auth.TlsParameters.TlsProtocolB\n\272" +
      "\351\300\003\005\202\001\002\020\001\022^\n\034tls_maximum_protocol_versio" +
      "n\030\002 \001(\0162,.envoy.api.v2.auth.TlsParameter" +
      "s.TlsProtocolB\n\272\351\300\003\005\202\001\002\020\001\022\025\n\rcipher_suit" +
      "es\030\003 \003(\t\022\023\n\013ecdh_curves\030\004 \003(\t\"O\n\013TlsProt" +
      "ocol\022\014\n\010TLS_AUTO\020\000\022\013\n\007TLSv1_0\020\001\022\013\n\007TLSv1" +
      "_1\020\002\022\013\n\007TLSv1_2\020\003\022\013\n\007TLSv1_3\020\004\"\250\002\n\016TlsCe" +
      "rtificate\0228\n\021certificate_chain\030\001 \001(\0132\035.e" +
      "nvoy.api.v2.core.DataSource\0222\n\013private_k" +
      "ey\030\002 \001(\0132\035.envoy.api.v2.core.DataSource\022" +
      "/\n\010password\030\003 \001(\0132\035.envoy.api.v2.core.Da" +
      "taSource\0222\n\013ocsp_staple\030\004 \001(\0132\035.envoy.ap" +
      "i.v2.core.DataSource\022C\n\034signed_certifica" +
      "te_timestamp\030\005 \003(\0132\035.envoy.api.v2.core.D" +
      "ataSource\"O\n\024TlsSessionTicketKeys\0227\n\004key" +
      "s\030\001 \003(\0132\035.envoy.api.v2.core.DataSourceB\n" +
      "\272\351\300\003\005\222\001\002\010\001\"\252\003\n\034CertificateValidationCont" +
      "ext\0221\n\ntrusted_ca\030\001 \001(\0132\035.envoy.api.v2.c" +
      "ore.DataSource\0221\n\027verify_certificate_spk" +
      "i\030\003 \003(\tB\020\272\351\300\003\013\222\001\010\"\006r\004 ,(,\0221\n\027verify_cert" +
      "ificate_hash\030\002 \003(\tB\020\272\351\300\003\013\222\001\010\"\006r\004 @(_\022\037\n\027" +
      "verify_subject_alt_name\030\004 \003(\t\0227\n\023require" +
      "_ocsp_staple\030\005 \001(\0132\032.google.protobuf.Boo" +
      "lValue\022H\n$require_signed_certificate_tim" +
      "estamp\030\006 \001(\0132\032.google.protobuf.BoolValue" +
      "\022*\n\003crl\030\007 \001(\0132\035.envoy.api.v2.core.DataSo" +
      "urce\022!\n\031allow_expired_certificate\030\010 \001(\010\"" +
      "\212\006\n\020CommonTlsContext\0224\n\ntls_params\030\001 \001(\013" +
      "2 .envoy.api.v2.auth.TlsParameters\022;\n\020tl" +
      "s_certificates\030\002 \003(\0132!.envoy.api.v2.auth" +
      ".TlsCertificate\022N\n\"tls_certificate_sds_s" +
      "ecret_configs\030\006 \003(\0132\".envoy.api.v2.auth." +
      "SdsSecretConfig\022M\n\022validation_context\030\003 " +
      "\001(\0132/.envoy.api.v2.auth.CertificateValid" +
      "ationContextH\000\022R\n$validation_context_sds" +
      "_secret_config\030\007 \001(\0132\".envoy.api.v2.auth" +
      ".SdsSecretConfigH\000\022o\n\033combined_validatio" +
      "n_context\030\010 \001(\0132H.envoy.api.v2.auth.Comm" +
      "onTlsContext.CombinedCertificateValidati" +
      "onContextH\000\022\026\n\016alpn_protocols\030\004 \003(\t\032\345\001\n$" +
      "CombinedCertificateValidationContext\022_\n\032" +
      "default_validation_context\030\001 \001(\0132/.envoy" +
      ".api.v2.auth.CertificateValidationContex" +
      "tB\n\272\351\300\003\005\212\001\002\020\001\022\\\n$validation_context_sds_" +
      "secret_config\030\002 \001(\0132\".envoy.api.v2.auth." +
      "SdsSecretConfigB\n\272\351\300\003\005\212\001\002\020\001B\031\n\027validatio" +
      "n_context_typeJ\004\010\005\020\006\"\303\001\n\022UpstreamTlsCont" +
      "ext\022?\n\022common_tls_context\030\001 \001(\0132#.envoy." +
      "api.v2.auth.CommonTlsContext\022\027\n\003sni\030\002 \001(" +
      "\tB\n\272\351\300\003\005r\003(\377\001\022\033\n\023allow_renegotiation\030\003 \001" +
      "(\010\0226\n\020max_session_keys\030\004 \001(\0132\034.google.pr" +
      "otobuf.UInt32Value\"\201\003\n\024DownstreamTlsCont" +
      "ext\022?\n\022common_tls_context\030\001 \001(\0132#.envoy." +
      "api.v2.auth.CommonTlsContext\022>\n\032require_" +
      "client_certificate\030\002 \001(\0132\032.google.protob" +
      "uf.BoolValue\022/\n\013require_sni\030\003 \001(\0132\032.goog" +
      "le.protobuf.BoolValue\022F\n\023session_ticket_" +
      "keys\030\004 \001(\0132\'.envoy.api.v2.auth.TlsSessio" +
      "nTicketKeysH\000\022S\n%session_ticket_keys_sds" +
      "_secret_config\030\005 \001(\0132\".envoy.api.v2.auth" +
      ".SdsSecretConfigH\000B\032\n\030session_ticket_key" +
      "s_type\"T\n\017SdsSecretConfig\022\014\n\004name\030\001 \001(\t\022" +
      "3\n\nsds_config\030\002 \001(\0132\037.envoy.api.v2.core." +
      "ConfigSource\"\363\001\n\006Secret\022\014\n\004name\030\001 \001(\t\022<\n" +
      "\017tls_certificate\030\002 \001(\0132!.envoy.api.v2.au" +
      "th.TlsCertificateH\000\022F\n\023session_ticket_ke" +
      "ys\030\003 \001(\0132\'.envoy.api.v2.auth.TlsSessionT" +
      "icketKeysH\000\022M\n\022validation_context\030\004 \001(\0132" +
      "/.envoy.api.v2.auth.CertificateValidatio" +
      "nContextH\000B\006\n\004typeB.\n$io.grpc.xds.shaded" +
      ".envoy.api.v2.authP\001Z\004authb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grpc.xds.shaded.envoy.api.v2.core.Base.getDescriptor(),
          io.grpc.xds.shaded.envoy.api.v2.core.ConfigSourceOuterClass.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          io.grpc.xds.shaded.validate.Validate.getDescriptor(),
        }, assigner);
    internal_static_envoy_api_v2_auth_TlsParameters_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_envoy_api_v2_auth_TlsParameters_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_auth_TlsParameters_descriptor,
        new java.lang.String[] { "TlsMinimumProtocolVersion", "TlsMaximumProtocolVersion", "CipherSuites", "EcdhCurves", });
    internal_static_envoy_api_v2_auth_TlsCertificate_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_envoy_api_v2_auth_TlsCertificate_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_auth_TlsCertificate_descriptor,
        new java.lang.String[] { "CertificateChain", "PrivateKey", "Password", "OcspStaple", "SignedCertificateTimestamp", });
    internal_static_envoy_api_v2_auth_TlsSessionTicketKeys_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_envoy_api_v2_auth_TlsSessionTicketKeys_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_auth_TlsSessionTicketKeys_descriptor,
        new java.lang.String[] { "Keys", });
    internal_static_envoy_api_v2_auth_CertificateValidationContext_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_envoy_api_v2_auth_CertificateValidationContext_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_auth_CertificateValidationContext_descriptor,
        new java.lang.String[] { "TrustedCa", "VerifyCertificateSpki", "VerifyCertificateHash", "VerifySubjectAltName", "RequireOcspStaple", "RequireSignedCertificateTimestamp", "Crl", "AllowExpiredCertificate", });
    internal_static_envoy_api_v2_auth_CommonTlsContext_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_envoy_api_v2_auth_CommonTlsContext_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_auth_CommonTlsContext_descriptor,
        new java.lang.String[] { "TlsParams", "TlsCertificates", "TlsCertificateSdsSecretConfigs", "ValidationContext", "ValidationContextSdsSecretConfig", "CombinedValidationContext", "AlpnProtocols", "ValidationContextType", });
    internal_static_envoy_api_v2_auth_CommonTlsContext_CombinedCertificateValidationContext_descriptor =
      internal_static_envoy_api_v2_auth_CommonTlsContext_descriptor.getNestedTypes().get(0);
    internal_static_envoy_api_v2_auth_CommonTlsContext_CombinedCertificateValidationContext_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_auth_CommonTlsContext_CombinedCertificateValidationContext_descriptor,
        new java.lang.String[] { "DefaultValidationContext", "ValidationContextSdsSecretConfig", });
    internal_static_envoy_api_v2_auth_UpstreamTlsContext_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_envoy_api_v2_auth_UpstreamTlsContext_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_auth_UpstreamTlsContext_descriptor,
        new java.lang.String[] { "CommonTlsContext", "Sni", "AllowRenegotiation", "MaxSessionKeys", });
    internal_static_envoy_api_v2_auth_DownstreamTlsContext_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_envoy_api_v2_auth_DownstreamTlsContext_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_auth_DownstreamTlsContext_descriptor,
        new java.lang.String[] { "CommonTlsContext", "RequireClientCertificate", "RequireSni", "SessionTicketKeys", "SessionTicketKeysSdsSecretConfig", "SessionTicketKeysType", });
    internal_static_envoy_api_v2_auth_SdsSecretConfig_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_envoy_api_v2_auth_SdsSecretConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_auth_SdsSecretConfig_descriptor,
        new java.lang.String[] { "Name", "SdsConfig", });
    internal_static_envoy_api_v2_auth_Secret_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_envoy_api_v2_auth_Secret_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_envoy_api_v2_auth_Secret_descriptor,
        new java.lang.String[] { "Name", "TlsCertificate", "SessionTicketKeys", "ValidationContext", "Type", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(io.grpc.xds.shaded.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.grpc.xds.shaded.envoy.api.v2.core.Base.getDescriptor();
    io.grpc.xds.shaded.envoy.api.v2.core.ConfigSourceOuterClass.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    io.grpc.xds.shaded.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
