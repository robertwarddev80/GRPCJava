// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qpstest.proto

package io.grpc.testing;

/**
 * Protobuf type {@code grpc.testing.ClientArgs}
 */
public  final class ClientArgs extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:grpc.testing.ClientArgs)
    ClientArgsOrBuilder {
  // Use ClientArgs.newBuilder() to construct.
  private ClientArgs(com.google.protobuf.GeneratedMessage.Builder builder) {
    super(builder);
  }
  private ClientArgs() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ClientArgs(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
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
          case 10: {
            io.grpc.testing.ClientConfig.Builder subBuilder = null;
            if (argtypeCase_ == 1) {
              subBuilder = ((io.grpc.testing.ClientConfig) argtype_).toBuilder();
            }
            argtype_ = input.readMessage(io.grpc.testing.ClientConfig.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((io.grpc.testing.ClientConfig) argtype_);
              argtype_ = subBuilder.buildPartial();
            }
            argtypeCase_ = 1;
            break;
          }
          case 18: {
            io.grpc.testing.Mark.Builder subBuilder = null;
            if (argtypeCase_ == 2) {
              subBuilder = ((io.grpc.testing.Mark) argtype_).toBuilder();
            }
            argtype_ = input.readMessage(io.grpc.testing.Mark.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((io.grpc.testing.Mark) argtype_);
              argtype_ = subBuilder.buildPartial();
            }
            argtypeCase_ = 2;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw new RuntimeException(e.setUnfinishedMessage(this));
    } catch (java.io.IOException e) {
      throw new RuntimeException(
          new com.google.protobuf.InvalidProtocolBufferException(
              e.getMessage()).setUnfinishedMessage(this));
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.testing.QpsTestProto.internal_static_grpc_testing_ClientArgs_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.testing.QpsTestProto.internal_static_grpc_testing_ClientArgs_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.testing.ClientArgs.class, io.grpc.testing.ClientArgs.Builder.class);
  }

  private int argtypeCase_ = 0;
  private java.lang.Object argtype_;
  public enum ArgtypeCase
      implements com.google.protobuf.Internal.EnumLite {
    SETUP(1),
    MARK(2),
    ARGTYPE_NOT_SET(0);
    private int value = 0;
    private ArgtypeCase(int value) {
      this.value = value;
    }
    public static ArgtypeCase valueOf(int value) {
      switch (value) {
        case 1: return SETUP;
        case 2: return MARK;
        case 0: return ARGTYPE_NOT_SET;
        default: throw new java.lang.IllegalArgumentException(
          "Value is undefined for this oneof enum.");
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ArgtypeCase
  getArgtypeCase() {
    return ArgtypeCase.valueOf(
        argtypeCase_);
  }

  public static final int SETUP_FIELD_NUMBER = 1;
  /**
   * <code>optional .grpc.testing.ClientConfig setup = 1;</code>
   */
  public io.grpc.testing.ClientConfig getSetup() {
    if (argtypeCase_ == 1) {
       return (io.grpc.testing.ClientConfig) argtype_;
    }
    return io.grpc.testing.ClientConfig.getDefaultInstance();
  }
  /**
   * <code>optional .grpc.testing.ClientConfig setup = 1;</code>
   */
  public io.grpc.testing.ClientConfigOrBuilder getSetupOrBuilder() {
    if (argtypeCase_ == 1) {
       return (io.grpc.testing.ClientConfig) argtype_;
    }
    return io.grpc.testing.ClientConfig.getDefaultInstance();
  }

  public static final int MARK_FIELD_NUMBER = 2;
  /**
   * <code>optional .grpc.testing.Mark mark = 2;</code>
   */
  public io.grpc.testing.Mark getMark() {
    if (argtypeCase_ == 2) {
       return (io.grpc.testing.Mark) argtype_;
    }
    return io.grpc.testing.Mark.getDefaultInstance();
  }
  /**
   * <code>optional .grpc.testing.Mark mark = 2;</code>
   */
  public io.grpc.testing.MarkOrBuilder getMarkOrBuilder() {
    if (argtypeCase_ == 2) {
       return (io.grpc.testing.Mark) argtype_;
    }
    return io.grpc.testing.Mark.getDefaultInstance();
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
    if (argtypeCase_ == 1) {
      output.writeMessage(1, (io.grpc.testing.ClientConfig) argtype_);
    }
    if (argtypeCase_ == 2) {
      output.writeMessage(2, (io.grpc.testing.Mark) argtype_);
    }
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (argtypeCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (io.grpc.testing.ClientConfig) argtype_);
    }
    if (argtypeCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (io.grpc.testing.Mark) argtype_);
    }
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static io.grpc.testing.ClientArgs parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.testing.ClientArgs parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.testing.ClientArgs parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.testing.ClientArgs parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.testing.ClientArgs parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static io.grpc.testing.ClientArgs parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static io.grpc.testing.ClientArgs parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static io.grpc.testing.ClientArgs parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static io.grpc.testing.ClientArgs parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static io.grpc.testing.ClientArgs parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.grpc.testing.ClientArgs prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code grpc.testing.ClientArgs}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.testing.ClientArgs)
      io.grpc.testing.ClientArgsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.testing.QpsTestProto.internal_static_grpc_testing_ClientArgs_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.testing.QpsTestProto.internal_static_grpc_testing_ClientArgs_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.testing.ClientArgs.class, io.grpc.testing.ClientArgs.Builder.class);
    }

    // Construct using io.grpc.testing.ClientArgs.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      argtypeCase_ = 0;
      argtype_ = null;
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.testing.QpsTestProto.internal_static_grpc_testing_ClientArgs_descriptor;
    }

    public io.grpc.testing.ClientArgs getDefaultInstanceForType() {
      return io.grpc.testing.ClientArgs.getDefaultInstance();
    }

    public io.grpc.testing.ClientArgs build() {
      io.grpc.testing.ClientArgs result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.grpc.testing.ClientArgs buildPartial() {
      io.grpc.testing.ClientArgs result = new io.grpc.testing.ClientArgs(this);
      if (argtypeCase_ == 1) {
        if (setupBuilder_ == null) {
          result.argtype_ = argtype_;
        } else {
          result.argtype_ = setupBuilder_.build();
        }
      }
      if (argtypeCase_ == 2) {
        if (markBuilder_ == null) {
          result.argtype_ = argtype_;
        } else {
          result.argtype_ = markBuilder_.build();
        }
      }
      result.argtypeCase_ = argtypeCase_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grpc.testing.ClientArgs) {
        return mergeFrom((io.grpc.testing.ClientArgs)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.testing.ClientArgs other) {
      if (other == io.grpc.testing.ClientArgs.getDefaultInstance()) return this;
      switch (other.getArgtypeCase()) {
        case SETUP: {
          mergeSetup(other.getSetup());
          break;
        }
        case MARK: {
          mergeMark(other.getMark());
          break;
        }
        case ARGTYPE_NOT_SET: {
          break;
        }
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
      io.grpc.testing.ClientArgs parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.testing.ClientArgs) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int argtypeCase_ = 0;
    private java.lang.Object argtype_;
    public ArgtypeCase
        getArgtypeCase() {
      return ArgtypeCase.valueOf(
          argtypeCase_);
    }

    public Builder clearArgtype() {
      argtypeCase_ = 0;
      argtype_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilder<
        io.grpc.testing.ClientConfig, io.grpc.testing.ClientConfig.Builder, io.grpc.testing.ClientConfigOrBuilder> setupBuilder_;
    /**
     * <code>optional .grpc.testing.ClientConfig setup = 1;</code>
     */
    public io.grpc.testing.ClientConfig getSetup() {
      if (setupBuilder_ == null) {
        if (argtypeCase_ == 1) {
          return (io.grpc.testing.ClientConfig) argtype_;
        }
        return io.grpc.testing.ClientConfig.getDefaultInstance();
      } else {
        if (argtypeCase_ == 1) {
          return setupBuilder_.getMessage();
        }
        return io.grpc.testing.ClientConfig.getDefaultInstance();
      }
    }
    /**
     * <code>optional .grpc.testing.ClientConfig setup = 1;</code>
     */
    public Builder setSetup(io.grpc.testing.ClientConfig value) {
      if (setupBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        argtype_ = value;
        onChanged();
      } else {
        setupBuilder_.setMessage(value);
      }
      argtypeCase_ = 1;
      return this;
    }
    /**
     * <code>optional .grpc.testing.ClientConfig setup = 1;</code>
     */
    public Builder setSetup(
        io.grpc.testing.ClientConfig.Builder builderForValue) {
      if (setupBuilder_ == null) {
        argtype_ = builderForValue.build();
        onChanged();
      } else {
        setupBuilder_.setMessage(builderForValue.build());
      }
      argtypeCase_ = 1;
      return this;
    }
    /**
     * <code>optional .grpc.testing.ClientConfig setup = 1;</code>
     */
    public Builder mergeSetup(io.grpc.testing.ClientConfig value) {
      if (setupBuilder_ == null) {
        if (argtypeCase_ == 1 &&
            argtype_ != io.grpc.testing.ClientConfig.getDefaultInstance()) {
          argtype_ = io.grpc.testing.ClientConfig.newBuilder((io.grpc.testing.ClientConfig) argtype_)
              .mergeFrom(value).buildPartial();
        } else {
          argtype_ = value;
        }
        onChanged();
      } else {
        if (argtypeCase_ == 1) {
          setupBuilder_.mergeFrom(value);
        }
        setupBuilder_.setMessage(value);
      }
      argtypeCase_ = 1;
      return this;
    }
    /**
     * <code>optional .grpc.testing.ClientConfig setup = 1;</code>
     */
    public Builder clearSetup() {
      if (setupBuilder_ == null) {
        if (argtypeCase_ == 1) {
          argtypeCase_ = 0;
          argtype_ = null;
          onChanged();
        }
      } else {
        if (argtypeCase_ == 1) {
          argtypeCase_ = 0;
          argtype_ = null;
        }
        setupBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>optional .grpc.testing.ClientConfig setup = 1;</code>
     */
    public io.grpc.testing.ClientConfig.Builder getSetupBuilder() {
      return getSetupFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .grpc.testing.ClientConfig setup = 1;</code>
     */
    public io.grpc.testing.ClientConfigOrBuilder getSetupOrBuilder() {
      if ((argtypeCase_ == 1) && (setupBuilder_ != null)) {
        return setupBuilder_.getMessageOrBuilder();
      } else {
        if (argtypeCase_ == 1) {
          return (io.grpc.testing.ClientConfig) argtype_;
        }
        return io.grpc.testing.ClientConfig.getDefaultInstance();
      }
    }
    /**
     * <code>optional .grpc.testing.ClientConfig setup = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        io.grpc.testing.ClientConfig, io.grpc.testing.ClientConfig.Builder, io.grpc.testing.ClientConfigOrBuilder> 
        getSetupFieldBuilder() {
      if (setupBuilder_ == null) {
        if (!(argtypeCase_ == 1)) {
          argtype_ = io.grpc.testing.ClientConfig.getDefaultInstance();
        }
        setupBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            io.grpc.testing.ClientConfig, io.grpc.testing.ClientConfig.Builder, io.grpc.testing.ClientConfigOrBuilder>(
                (io.grpc.testing.ClientConfig) argtype_,
                getParentForChildren(),
                isClean());
        argtype_ = null;
      }
      argtypeCase_ = 1;
      onChanged();;
      return setupBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilder<
        io.grpc.testing.Mark, io.grpc.testing.Mark.Builder, io.grpc.testing.MarkOrBuilder> markBuilder_;
    /**
     * <code>optional .grpc.testing.Mark mark = 2;</code>
     */
    public io.grpc.testing.Mark getMark() {
      if (markBuilder_ == null) {
        if (argtypeCase_ == 2) {
          return (io.grpc.testing.Mark) argtype_;
        }
        return io.grpc.testing.Mark.getDefaultInstance();
      } else {
        if (argtypeCase_ == 2) {
          return markBuilder_.getMessage();
        }
        return io.grpc.testing.Mark.getDefaultInstance();
      }
    }
    /**
     * <code>optional .grpc.testing.Mark mark = 2;</code>
     */
    public Builder setMark(io.grpc.testing.Mark value) {
      if (markBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        argtype_ = value;
        onChanged();
      } else {
        markBuilder_.setMessage(value);
      }
      argtypeCase_ = 2;
      return this;
    }
    /**
     * <code>optional .grpc.testing.Mark mark = 2;</code>
     */
    public Builder setMark(
        io.grpc.testing.Mark.Builder builderForValue) {
      if (markBuilder_ == null) {
        argtype_ = builderForValue.build();
        onChanged();
      } else {
        markBuilder_.setMessage(builderForValue.build());
      }
      argtypeCase_ = 2;
      return this;
    }
    /**
     * <code>optional .grpc.testing.Mark mark = 2;</code>
     */
    public Builder mergeMark(io.grpc.testing.Mark value) {
      if (markBuilder_ == null) {
        if (argtypeCase_ == 2 &&
            argtype_ != io.grpc.testing.Mark.getDefaultInstance()) {
          argtype_ = io.grpc.testing.Mark.newBuilder((io.grpc.testing.Mark) argtype_)
              .mergeFrom(value).buildPartial();
        } else {
          argtype_ = value;
        }
        onChanged();
      } else {
        if (argtypeCase_ == 2) {
          markBuilder_.mergeFrom(value);
        }
        markBuilder_.setMessage(value);
      }
      argtypeCase_ = 2;
      return this;
    }
    /**
     * <code>optional .grpc.testing.Mark mark = 2;</code>
     */
    public Builder clearMark() {
      if (markBuilder_ == null) {
        if (argtypeCase_ == 2) {
          argtypeCase_ = 0;
          argtype_ = null;
          onChanged();
        }
      } else {
        if (argtypeCase_ == 2) {
          argtypeCase_ = 0;
          argtype_ = null;
        }
        markBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>optional .grpc.testing.Mark mark = 2;</code>
     */
    public io.grpc.testing.Mark.Builder getMarkBuilder() {
      return getMarkFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .grpc.testing.Mark mark = 2;</code>
     */
    public io.grpc.testing.MarkOrBuilder getMarkOrBuilder() {
      if ((argtypeCase_ == 2) && (markBuilder_ != null)) {
        return markBuilder_.getMessageOrBuilder();
      } else {
        if (argtypeCase_ == 2) {
          return (io.grpc.testing.Mark) argtype_;
        }
        return io.grpc.testing.Mark.getDefaultInstance();
      }
    }
    /**
     * <code>optional .grpc.testing.Mark mark = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        io.grpc.testing.Mark, io.grpc.testing.Mark.Builder, io.grpc.testing.MarkOrBuilder> 
        getMarkFieldBuilder() {
      if (markBuilder_ == null) {
        if (!(argtypeCase_ == 2)) {
          argtype_ = io.grpc.testing.Mark.getDefaultInstance();
        }
        markBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            io.grpc.testing.Mark, io.grpc.testing.Mark.Builder, io.grpc.testing.MarkOrBuilder>(
                (io.grpc.testing.Mark) argtype_,
                getParentForChildren(),
                isClean());
        argtype_ = null;
      }
      argtypeCase_ = 2;
      onChanged();;
      return markBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:grpc.testing.ClientArgs)
  }

  // @@protoc_insertion_point(class_scope:grpc.testing.ClientArgs)
  private static final io.grpc.testing.ClientArgs DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.testing.ClientArgs();
  }

  public static io.grpc.testing.ClientArgs getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  public static final com.google.protobuf.Parser<ClientArgs> PARSER =
      new com.google.protobuf.AbstractParser<ClientArgs>() {
    public ClientArgs parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new ClientArgs(input, extensionRegistry);
      } catch (RuntimeException e) {
        if (e.getCause() instanceof
            com.google.protobuf.InvalidProtocolBufferException) {
          throw (com.google.protobuf.InvalidProtocolBufferException)
              e.getCause();
        }
        throw e;
      }
    }
  };

  public static com.google.protobuf.Parser<ClientArgs> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClientArgs> getParserForType() {
    return PARSER;
  }

  public io.grpc.testing.ClientArgs getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

