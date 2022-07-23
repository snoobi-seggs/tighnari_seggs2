// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReliquaryPromoteReq.proto

package emu.grasscutter.net.proto;

public final class ReliquaryPromoteReqOuterClass {
  private ReliquaryPromoteReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ReliquaryPromoteReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ReliquaryPromoteReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 target_guid = 4;</code>
     * @return The targetGuid.
     */
    long getTargetGuid();

    /**
     * <code>uint64 item_guid = 14;</code>
     * @return The itemGuid.
     */
    long getItemGuid();
  }
  /**
   * Protobuf type {@code ReliquaryPromoteReq}
   */
  public static final class ReliquaryPromoteReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ReliquaryPromoteReq)
      ReliquaryPromoteReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ReliquaryPromoteReq.newBuilder() to construct.
    private ReliquaryPromoteReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReliquaryPromoteReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ReliquaryPromoteReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ReliquaryPromoteReq(
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
            case 32: {

              targetGuid_ = input.readUInt64();
              break;
            }
            case 112: {

              itemGuid_ = input.readUInt64();
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
      return emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.internal_static_ReliquaryPromoteReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.internal_static_ReliquaryPromoteReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq.class, emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq.Builder.class);
    }

    /**
     * Protobuf enum {@code ReliquaryPromoteReq.CmdId}
     */
    public enum CmdId
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>ENET_IS_RELIABLE = 1;</code>
       */
      ENET_IS_RELIABLE(2, 1),
      /**
       * <code>CMD_ID = 612;</code>
       */
      CMD_ID(4, 612),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>ENET_CHANNEL_ID = 0;</code>
       */
      public static final CmdId ENET_CHANNEL_ID = NONE;
      /**
       * <code>IS_ALLOW_CLIENT = 1;</code>
       */
      public static final CmdId IS_ALLOW_CLIENT = ENET_IS_RELIABLE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>ENET_CHANNEL_ID = 0;</code>
       */
      public static final int ENET_CHANNEL_ID_VALUE = 0;
      /**
       * <code>ENET_IS_RELIABLE = 1;</code>
       */
      public static final int ENET_IS_RELIABLE_VALUE = 1;
      /**
       * <code>IS_ALLOW_CLIENT = 1;</code>
       */
      public static final int IS_ALLOW_CLIENT_VALUE = 1;
      /**
       * <code>CMD_ID = 612;</code>
       */
      public static final int CMD_ID_VALUE = 612;


      public final int getNumber() {
        if (index == -1) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static CmdId valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static CmdId forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 1: return ENET_IS_RELIABLE;
          case 612: return CMD_ID;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<CmdId>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          CmdId> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<CmdId>() {
              public CmdId findValueByNumber(int number) {
                return CmdId.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (index == -1) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final CmdId[] VALUES = getStaticValuesArray();
      private static CmdId[] getStaticValuesArray() {
        return new CmdId[] {
          NONE, ENET_CHANNEL_ID, ENET_IS_RELIABLE, IS_ALLOW_CLIENT, CMD_ID, 
        };
      }
      public static CmdId valueOf(
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

      private final int index;
      private final int value;

      private CmdId(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:ReliquaryPromoteReq.CmdId)
    }

    public static final int TARGET_GUID_FIELD_NUMBER = 4;
    private long targetGuid_;
    /**
     * <code>uint64 target_guid = 4;</code>
     * @return The targetGuid.
     */
    @java.lang.Override
    public long getTargetGuid() {
      return targetGuid_;
    }

    public static final int ITEM_GUID_FIELD_NUMBER = 14;
    private long itemGuid_;
    /**
     * <code>uint64 item_guid = 14;</code>
     * @return The itemGuid.
     */
    @java.lang.Override
    public long getItemGuid() {
      return itemGuid_;
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
      if (targetGuid_ != 0L) {
        output.writeUInt64(4, targetGuid_);
      }
      if (itemGuid_ != 0L) {
        output.writeUInt64(14, itemGuid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (targetGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(4, targetGuid_);
      }
      if (itemGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(14, itemGuid_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq other = (emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq) obj;

      if (getTargetGuid()
          != other.getTargetGuid()) return false;
      if (getItemGuid()
          != other.getItemGuid()) return false;
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
      hash = (37 * hash) + TARGET_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTargetGuid());
      hash = (37 * hash) + ITEM_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getItemGuid());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq prototype) {
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
     * Protobuf type {@code ReliquaryPromoteReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ReliquaryPromoteReq)
        emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.internal_static_ReliquaryPromoteReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.internal_static_ReliquaryPromoteReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq.class, emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq.newBuilder()
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
        targetGuid_ = 0L;

        itemGuid_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.internal_static_ReliquaryPromoteReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq build() {
        emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq buildPartial() {
        emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq result = new emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq(this);
        result.targetGuid_ = targetGuid_;
        result.itemGuid_ = itemGuid_;
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
        if (other instanceof emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq) {
          return mergeFrom((emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq other) {
        if (other == emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq.getDefaultInstance()) return this;
        if (other.getTargetGuid() != 0L) {
          setTargetGuid(other.getTargetGuid());
        }
        if (other.getItemGuid() != 0L) {
          setItemGuid(other.getItemGuid());
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
        emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long targetGuid_ ;
      /**
       * <code>uint64 target_guid = 4;</code>
       * @return The targetGuid.
       */
      @java.lang.Override
      public long getTargetGuid() {
        return targetGuid_;
      }
      /**
       * <code>uint64 target_guid = 4;</code>
       * @param value The targetGuid to set.
       * @return This builder for chaining.
       */
      public Builder setTargetGuid(long value) {
        
        targetGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 target_guid = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetGuid() {
        
        targetGuid_ = 0L;
        onChanged();
        return this;
      }

      private long itemGuid_ ;
      /**
       * <code>uint64 item_guid = 14;</code>
       * @return The itemGuid.
       */
      @java.lang.Override
      public long getItemGuid() {
        return itemGuid_;
      }
      /**
       * <code>uint64 item_guid = 14;</code>
       * @param value The itemGuid to set.
       * @return This builder for chaining.
       */
      public Builder setItemGuid(long value) {
        
        itemGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 item_guid = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearItemGuid() {
        
        itemGuid_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:ReliquaryPromoteReq)
    }

    // @@protoc_insertion_point(class_scope:ReliquaryPromoteReq)
    private static final emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq();
    }

    public static emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ReliquaryPromoteReq>
        PARSER = new com.google.protobuf.AbstractParser<ReliquaryPromoteReq>() {
      @java.lang.Override
      public ReliquaryPromoteReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReliquaryPromoteReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ReliquaryPromoteReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ReliquaryPromoteReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ReliquaryPromoteReqOuterClass.ReliquaryPromoteReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ReliquaryPromoteReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ReliquaryPromoteReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031ReliquaryPromoteReq.proto\"\241\001\n\023Reliquar" +
      "yPromoteReq\022\023\n\013target_guid\030\004 \001(\004\022\021\n\titem" +
      "_guid\030\016 \001(\004\"b\n\005CmdId\022\010\n\004NONE\020\000\022\023\n\017ENET_C" +
      "HANNEL_ID\020\000\022\024\n\020ENET_IS_RELIABLE\020\001\022\023\n\017IS_" +
      "ALLOW_CLIENT\020\001\022\013\n\006CMD_ID\020\344\004\032\002\020\001B\033\n\031emu.g" +
      "rasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ReliquaryPromoteReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ReliquaryPromoteReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ReliquaryPromoteReq_descriptor,
        new java.lang.String[] { "TargetGuid", "ItemGuid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
