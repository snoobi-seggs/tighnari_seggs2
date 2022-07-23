// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarFlycloakChangeNotify.proto

package emu.grasscutter.net.proto;

public final class AvatarFlycloakChangeNotifyOuterClass {
  private AvatarFlycloakChangeNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarFlycloakChangeNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarFlycloakChangeNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 avatar_guid = 12;</code>
     * @return The avatarGuid.
     */
    long getAvatarGuid();

    /**
     * <code>uint32 flycloak_id = 14;</code>
     * @return The flycloakId.
     */
    int getFlycloakId();
  }
  /**
   * <pre>
   * CmdId: 1681
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code AvatarFlycloakChangeNotify}
   */
  public static final class AvatarFlycloakChangeNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AvatarFlycloakChangeNotify)
      AvatarFlycloakChangeNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AvatarFlycloakChangeNotify.newBuilder() to construct.
    private AvatarFlycloakChangeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AvatarFlycloakChangeNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AvatarFlycloakChangeNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AvatarFlycloakChangeNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 96: {

              avatarGuid_ = input.readUInt64();
              break;
            }
            case 112: {

              flycloakId_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.internal_static_AvatarFlycloakChangeNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.internal_static_AvatarFlycloakChangeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify.class, emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify.Builder.class);
    }

    public static final int AVATAR_GUID_FIELD_NUMBER = 12;
    private long avatarGuid_;
    /**
     * <code>uint64 avatar_guid = 12;</code>
     * @return The avatarGuid.
     */
    @java.lang.Override
    public long getAvatarGuid() {
      return avatarGuid_;
    }

    public static final int FLYCLOAK_ID_FIELD_NUMBER = 14;
    private int flycloakId_;
    /**
     * <code>uint32 flycloak_id = 14;</code>
     * @return The flycloakId.
     */
    @java.lang.Override
    public int getFlycloakId() {
      return flycloakId_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (avatarGuid_ != 0L) {
        output.writeUInt64(12, avatarGuid_);
      }
      if (flycloakId_ != 0) {
        output.writeUInt32(14, flycloakId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (avatarGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(12, avatarGuid_);
      }
      if (flycloakId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, flycloakId_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify other = (emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify) obj;

      if (getAvatarGuid()
          != other.getAvatarGuid()) return false;
      if (getFlycloakId()
          != other.getFlycloakId()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + AVATAR_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAvatarGuid());
      hash = (37 * hash) + FLYCLOAK_ID_FIELD_NUMBER;
      hash = (53 * hash) + getFlycloakId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
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
     * <pre>
     * CmdId: 1681
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code AvatarFlycloakChangeNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarFlycloakChangeNotify)
        emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.internal_static_AvatarFlycloakChangeNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.internal_static_AvatarFlycloakChangeNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify.class, emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify.newBuilder()
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
      @java.lang.Override
      public Builder clear() {
        super.clear();
        avatarGuid_ = 0L;

        flycloakId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.internal_static_AvatarFlycloakChangeNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify build() {
        emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify buildPartial() {
        emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify result = new emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify(this);
        result.avatarGuid_ = avatarGuid_;
        result.flycloakId_ = flycloakId_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify) {
          return mergeFrom((emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify other) {
        if (other == emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify.getDefaultInstance()) return this;
        if (other.getAvatarGuid() != 0L) {
          setAvatarGuid(other.getAvatarGuid());
        }
        if (other.getFlycloakId() != 0) {
          setFlycloakId(other.getFlycloakId());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long avatarGuid_ ;
      /**
       * <code>uint64 avatar_guid = 12;</code>
       * @return The avatarGuid.
       */
      @java.lang.Override
      public long getAvatarGuid() {
        return avatarGuid_;
      }
      /**
       * <code>uint64 avatar_guid = 12;</code>
       * @param value The avatarGuid to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarGuid(long value) {
        
        avatarGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 avatar_guid = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarGuid() {
        
        avatarGuid_ = 0L;
        onChanged();
        return this;
      }

      private int flycloakId_ ;
      /**
       * <code>uint32 flycloak_id = 14;</code>
       * @return The flycloakId.
       */
      @java.lang.Override
      public int getFlycloakId() {
        return flycloakId_;
      }
      /**
       * <code>uint32 flycloak_id = 14;</code>
       * @param value The flycloakId to set.
       * @return This builder for chaining.
       */
      public Builder setFlycloakId(int value) {
        
        flycloakId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 flycloak_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearFlycloakId() {
        
        flycloakId_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:AvatarFlycloakChangeNotify)
    }

    // @@protoc_insertion_point(class_scope:AvatarFlycloakChangeNotify)
    private static final emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify();
    }

    public static emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarFlycloakChangeNotify>
        PARSER = new com.google.protobuf.AbstractParser<AvatarFlycloakChangeNotify>() {
      @java.lang.Override
      public AvatarFlycloakChangeNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AvatarFlycloakChangeNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AvatarFlycloakChangeNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AvatarFlycloakChangeNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AvatarFlycloakChangeNotifyOuterClass.AvatarFlycloakChangeNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarFlycloakChangeNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarFlycloakChangeNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n AvatarFlycloakChangeNotify.proto\"F\n\032Av" +
      "atarFlycloakChangeNotify\022\023\n\013avatar_guid\030" +
      "\014 \001(\004\022\023\n\013flycloak_id\030\016 \001(\rB\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AvatarFlycloakChangeNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarFlycloakChangeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarFlycloakChangeNotify_descriptor,
        new java.lang.String[] { "AvatarGuid", "FlycloakId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
