// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PacketHead.proto

package emu.grasscutter.net.proto;

public final class PacketHeadOuterClass {
  private PacketHeadOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PacketHeadOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PacketHead)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 client_sequence_id = 3;</code>
     * @return The clientSequenceId.
     */
    int getClientSequenceId();

    /**
     * <code>uint64 sent_ms = 6;</code>
     * @return The sentMs.
     */
    long getSentMs();
  }
  /**
   * Protobuf type {@code PacketHead}
   */
  public static final class PacketHead extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PacketHead)
      PacketHeadOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PacketHead.newBuilder() to construct.
    private PacketHead(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PacketHead() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PacketHead();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PacketHead(
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
            case 24: {

              clientSequenceId_ = input.readUInt32();
              break;
            }
            case 48: {

              sentMs_ = input.readUInt64();
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
      return emu.grasscutter.net.proto.PacketHeadOuterClass.internal_static_PacketHead_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PacketHeadOuterClass.internal_static_PacketHead_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PacketHeadOuterClass.PacketHead.class, emu.grasscutter.net.proto.PacketHeadOuterClass.PacketHead.Builder.class);
    }

    public static final int CLIENT_SEQUENCE_ID_FIELD_NUMBER = 3;
    private int clientSequenceId_;
    /**
     * <code>uint32 client_sequence_id = 3;</code>
     * @return The clientSequenceId.
     */
    @java.lang.Override
    public int getClientSequenceId() {
      return clientSequenceId_;
    }

    public static final int SENT_MS_FIELD_NUMBER = 6;
    private long sentMs_;
    /**
     * <code>uint64 sent_ms = 6;</code>
     * @return The sentMs.
     */
    @java.lang.Override
    public long getSentMs() {
      return sentMs_;
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
      if (clientSequenceId_ != 0) {
        output.writeUInt32(3, clientSequenceId_);
      }
      if (sentMs_ != 0L) {
        output.writeUInt64(6, sentMs_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (clientSequenceId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, clientSequenceId_);
      }
      if (sentMs_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(6, sentMs_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.PacketHeadOuterClass.PacketHead)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PacketHeadOuterClass.PacketHead other = (emu.grasscutter.net.proto.PacketHeadOuterClass.PacketHead) obj;

      if (getClientSequenceId()
          != other.getClientSequenceId()) return false;
      if (getSentMs()
          != other.getSentMs()) return false;
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
      hash = (37 * hash) + CLIENT_SEQUENCE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getClientSequenceId();
      hash = (37 * hash) + SENT_MS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getSentMs());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PacketHeadOuterClass.PacketHead parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PacketHeadOuterClass.PacketHead parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PacketHeadOuterClass.PacketHead parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PacketHeadOuterClass.PacketHead parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PacketHeadOuterClass.PacketHead parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PacketHeadOuterClass.PacketHead parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PacketHeadOuterClass.PacketHead parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PacketHeadOuterClass.PacketHead parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PacketHeadOuterClass.PacketHead parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PacketHeadOuterClass.PacketHead parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PacketHeadOuterClass.PacketHead parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PacketHeadOuterClass.PacketHead parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PacketHeadOuterClass.PacketHead prototype) {
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
     * Protobuf type {@code PacketHead}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PacketHead)
        emu.grasscutter.net.proto.PacketHeadOuterClass.PacketHeadOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PacketHeadOuterClass.internal_static_PacketHead_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PacketHeadOuterClass.internal_static_PacketHead_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PacketHeadOuterClass.PacketHead.class, emu.grasscutter.net.proto.PacketHeadOuterClass.PacketHead.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PacketHeadOuterClass.PacketHead.newBuilder()
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
        clientSequenceId_ = 0;

        sentMs_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PacketHeadOuterClass.internal_static_PacketHead_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PacketHeadOuterClass.PacketHead getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PacketHeadOuterClass.PacketHead.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PacketHeadOuterClass.PacketHead build() {
        emu.grasscutter.net.proto.PacketHeadOuterClass.PacketHead result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PacketHeadOuterClass.PacketHead buildPartial() {
        emu.grasscutter.net.proto.PacketHeadOuterClass.PacketHead result = new emu.grasscutter.net.proto.PacketHeadOuterClass.PacketHead(this);
        result.clientSequenceId_ = clientSequenceId_;
        result.sentMs_ = sentMs_;
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
        if (other instanceof emu.grasscutter.net.proto.PacketHeadOuterClass.PacketHead) {
          return mergeFrom((emu.grasscutter.net.proto.PacketHeadOuterClass.PacketHead)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PacketHeadOuterClass.PacketHead other) {
        if (other == emu.grasscutter.net.proto.PacketHeadOuterClass.PacketHead.getDefaultInstance()) return this;
        if (other.getClientSequenceId() != 0) {
          setClientSequenceId(other.getClientSequenceId());
        }
        if (other.getSentMs() != 0L) {
          setSentMs(other.getSentMs());
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
        emu.grasscutter.net.proto.PacketHeadOuterClass.PacketHead parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.PacketHeadOuterClass.PacketHead) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int clientSequenceId_ ;
      /**
       * <code>uint32 client_sequence_id = 3;</code>
       * @return The clientSequenceId.
       */
      @java.lang.Override
      public int getClientSequenceId() {
        return clientSequenceId_;
      }
      /**
       * <code>uint32 client_sequence_id = 3;</code>
       * @param value The clientSequenceId to set.
       * @return This builder for chaining.
       */
      public Builder setClientSequenceId(int value) {
        
        clientSequenceId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 client_sequence_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearClientSequenceId() {
        
        clientSequenceId_ = 0;
        onChanged();
        return this;
      }

      private long sentMs_ ;
      /**
       * <code>uint64 sent_ms = 6;</code>
       * @return The sentMs.
       */
      @java.lang.Override
      public long getSentMs() {
        return sentMs_;
      }
      /**
       * <code>uint64 sent_ms = 6;</code>
       * @param value The sentMs to set.
       * @return This builder for chaining.
       */
      public Builder setSentMs(long value) {
        
        sentMs_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 sent_ms = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearSentMs() {
        
        sentMs_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:PacketHead)
    }

    // @@protoc_insertion_point(class_scope:PacketHead)
    private static final emu.grasscutter.net.proto.PacketHeadOuterClass.PacketHead DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PacketHeadOuterClass.PacketHead();
    }

    public static emu.grasscutter.net.proto.PacketHeadOuterClass.PacketHead getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PacketHead>
        PARSER = new com.google.protobuf.AbstractParser<PacketHead>() {
      @java.lang.Override
      public PacketHead parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PacketHead(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PacketHead> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PacketHead> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PacketHeadOuterClass.PacketHead getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PacketHead_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PacketHead_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020PacketHead.proto\"9\n\nPacketHead\022\032\n\022clie" +
      "nt_sequence_id\030\003 \001(\r\022\017\n\007sent_ms\030\006 \001(\004B\033\n" +
      "\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PacketHead_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PacketHead_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PacketHead_descriptor,
        new java.lang.String[] { "ClientSequenceId", "SentMs", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
