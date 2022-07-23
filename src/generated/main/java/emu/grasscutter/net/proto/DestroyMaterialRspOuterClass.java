// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DestroyMaterialRsp.proto

package emu.grasscutter.net.proto;

public final class DestroyMaterialRspOuterClass {
  private DestroyMaterialRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DestroyMaterialRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DestroyMaterialRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 9;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>repeated uint32 item_id_list = 11;</code>
     * @return A list containing the itemIdList.
     */
    java.util.List<java.lang.Integer> getItemIdListList();
    /**
     * <code>repeated uint32 item_id_list = 11;</code>
     * @return The count of itemIdList.
     */
    int getItemIdListCount();
    /**
     * <code>repeated uint32 item_id_list = 11;</code>
     * @param index The index of the element to return.
     * @return The itemIdList at the given index.
     */
    int getItemIdList(int index);

    /**
     * <code>repeated uint32 item_count_list = 10;</code>
     * @return A list containing the itemCountList.
     */
    java.util.List<java.lang.Integer> getItemCountListList();
    /**
     * <code>repeated uint32 item_count_list = 10;</code>
     * @return The count of itemCountList.
     */
    int getItemCountListCount();
    /**
     * <code>repeated uint32 item_count_list = 10;</code>
     * @param index The index of the element to return.
     * @return The itemCountList at the given index.
     */
    int getItemCountList(int index);
  }
  /**
   * Protobuf type {@code DestroyMaterialRsp}
   */
  public static final class DestroyMaterialRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DestroyMaterialRsp)
      DestroyMaterialRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DestroyMaterialRsp.newBuilder() to construct.
    private DestroyMaterialRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DestroyMaterialRsp() {
      itemIdList_ = emptyIntList();
      itemCountList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DestroyMaterialRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DestroyMaterialRsp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 72: {

              retcode_ = input.readInt32();
              break;
            }
            case 80: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                itemCountList_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              itemCountList_.addInt(input.readUInt32());
              break;
            }
            case 82: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
                itemCountList_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              while (input.getBytesUntilLimit() > 0) {
                itemCountList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 88: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                itemIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              itemIdList_.addInt(input.readUInt32());
              break;
            }
            case 90: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                itemIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                itemIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
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
        if (((mutable_bitField0_ & 0x00000002) != 0)) {
          itemCountList_.makeImmutable(); // C
        }
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          itemIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.internal_static_DestroyMaterialRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.internal_static_DestroyMaterialRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp.class, emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp.Builder.class);
    }

    /**
     * Protobuf enum {@code DestroyMaterialRsp.CmdId}
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
       * <code>CMD_ID = 608;</code>
       */
      CMD_ID(3, 608),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>ENET_CHANNEL_ID = 0;</code>
       */
      public static final CmdId ENET_CHANNEL_ID = NONE;
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
       * <code>CMD_ID = 608;</code>
       */
      public static final int CMD_ID_VALUE = 608;


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
          case 608: return CMD_ID;
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
        return emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp.getDescriptor().getEnumTypes().get(0);
      }

      private static final CmdId[] VALUES = getStaticValuesArray();
      private static CmdId[] getStaticValuesArray() {
        return new CmdId[] {
          NONE, ENET_CHANNEL_ID, ENET_IS_RELIABLE, CMD_ID, 
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

      // @@protoc_insertion_point(enum_scope:DestroyMaterialRsp.CmdId)
    }

    public static final int RETCODE_FIELD_NUMBER = 9;
    private int retcode_;
    /**
     * <code>int32 retcode = 9;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int ITEM_ID_LIST_FIELD_NUMBER = 11;
    private com.google.protobuf.Internal.IntList itemIdList_;
    /**
     * <code>repeated uint32 item_id_list = 11;</code>
     * @return A list containing the itemIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getItemIdListList() {
      return itemIdList_;
    }
    /**
     * <code>repeated uint32 item_id_list = 11;</code>
     * @return The count of itemIdList.
     */
    public int getItemIdListCount() {
      return itemIdList_.size();
    }
    /**
     * <code>repeated uint32 item_id_list = 11;</code>
     * @param index The index of the element to return.
     * @return The itemIdList at the given index.
     */
    public int getItemIdList(int index) {
      return itemIdList_.getInt(index);
    }
    private int itemIdListMemoizedSerializedSize = -1;

    public static final int ITEM_COUNT_LIST_FIELD_NUMBER = 10;
    private com.google.protobuf.Internal.IntList itemCountList_;
    /**
     * <code>repeated uint32 item_count_list = 10;</code>
     * @return A list containing the itemCountList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getItemCountListList() {
      return itemCountList_;
    }
    /**
     * <code>repeated uint32 item_count_list = 10;</code>
     * @return The count of itemCountList.
     */
    public int getItemCountListCount() {
      return itemCountList_.size();
    }
    /**
     * <code>repeated uint32 item_count_list = 10;</code>
     * @param index The index of the element to return.
     * @return The itemCountList at the given index.
     */
    public int getItemCountList(int index) {
      return itemCountList_.getInt(index);
    }
    private int itemCountListMemoizedSerializedSize = -1;

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
      getSerializedSize();
      if (retcode_ != 0) {
        output.writeInt32(9, retcode_);
      }
      if (getItemCountListList().size() > 0) {
        output.writeUInt32NoTag(82);
        output.writeUInt32NoTag(itemCountListMemoizedSerializedSize);
      }
      for (int i = 0; i < itemCountList_.size(); i++) {
        output.writeUInt32NoTag(itemCountList_.getInt(i));
      }
      if (getItemIdListList().size() > 0) {
        output.writeUInt32NoTag(90);
        output.writeUInt32NoTag(itemIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < itemIdList_.size(); i++) {
        output.writeUInt32NoTag(itemIdList_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(9, retcode_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < itemCountList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(itemCountList_.getInt(i));
        }
        size += dataSize;
        if (!getItemCountListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        itemCountListMemoizedSerializedSize = dataSize;
      }
      {
        int dataSize = 0;
        for (int i = 0; i < itemIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(itemIdList_.getInt(i));
        }
        size += dataSize;
        if (!getItemIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        itemIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp other = (emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (!getItemIdListList()
          .equals(other.getItemIdListList())) return false;
      if (!getItemCountListList()
          .equals(other.getItemCountListList())) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      if (getItemIdListCount() > 0) {
        hash = (37 * hash) + ITEM_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getItemIdListList().hashCode();
      }
      if (getItemCountListCount() > 0) {
        hash = (37 * hash) + ITEM_COUNT_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getItemCountListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp prototype) {
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
     * Protobuf type {@code DestroyMaterialRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DestroyMaterialRsp)
        emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.internal_static_DestroyMaterialRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.internal_static_DestroyMaterialRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp.class, emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp.newBuilder()
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
        retcode_ = 0;

        itemIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        itemCountList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.internal_static_DestroyMaterialRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp build() {
        emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp buildPartial() {
        emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp result = new emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp(this);
        int from_bitField0_ = bitField0_;
        result.retcode_ = retcode_;
        if (((bitField0_ & 0x00000001) != 0)) {
          itemIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.itemIdList_ = itemIdList_;
        if (((bitField0_ & 0x00000002) != 0)) {
          itemCountList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.itemCountList_ = itemCountList_;
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
        if (other instanceof emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp) {
          return mergeFrom((emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp other) {
        if (other == emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (!other.itemIdList_.isEmpty()) {
          if (itemIdList_.isEmpty()) {
            itemIdList_ = other.itemIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureItemIdListIsMutable();
            itemIdList_.addAll(other.itemIdList_);
          }
          onChanged();
        }
        if (!other.itemCountList_.isEmpty()) {
          if (itemCountList_.isEmpty()) {
            itemCountList_ = other.itemCountList_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureItemCountListIsMutable();
            itemCountList_.addAll(other.itemCountList_);
          }
          onChanged();
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
        emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int retcode_ ;
      /**
       * <code>int32 retcode = 9;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 9;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList itemIdList_ = emptyIntList();
      private void ensureItemIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          itemIdList_ = mutableCopy(itemIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 item_id_list = 11;</code>
       * @return A list containing the itemIdList.
       */
      public java.util.List<java.lang.Integer>
          getItemIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(itemIdList_) : itemIdList_;
      }
      /**
       * <code>repeated uint32 item_id_list = 11;</code>
       * @return The count of itemIdList.
       */
      public int getItemIdListCount() {
        return itemIdList_.size();
      }
      /**
       * <code>repeated uint32 item_id_list = 11;</code>
       * @param index The index of the element to return.
       * @return The itemIdList at the given index.
       */
      public int getItemIdList(int index) {
        return itemIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 item_id_list = 11;</code>
       * @param index The index to set the value at.
       * @param value The itemIdList to set.
       * @return This builder for chaining.
       */
      public Builder setItemIdList(
          int index, int value) {
        ensureItemIdListIsMutable();
        itemIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 item_id_list = 11;</code>
       * @param value The itemIdList to add.
       * @return This builder for chaining.
       */
      public Builder addItemIdList(int value) {
        ensureItemIdListIsMutable();
        itemIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 item_id_list = 11;</code>
       * @param values The itemIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllItemIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureItemIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, itemIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 item_id_list = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearItemIdList() {
        itemIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList itemCountList_ = emptyIntList();
      private void ensureItemCountListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          itemCountList_ = mutableCopy(itemCountList_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated uint32 item_count_list = 10;</code>
       * @return A list containing the itemCountList.
       */
      public java.util.List<java.lang.Integer>
          getItemCountListList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(itemCountList_) : itemCountList_;
      }
      /**
       * <code>repeated uint32 item_count_list = 10;</code>
       * @return The count of itemCountList.
       */
      public int getItemCountListCount() {
        return itemCountList_.size();
      }
      /**
       * <code>repeated uint32 item_count_list = 10;</code>
       * @param index The index of the element to return.
       * @return The itemCountList at the given index.
       */
      public int getItemCountList(int index) {
        return itemCountList_.getInt(index);
      }
      /**
       * <code>repeated uint32 item_count_list = 10;</code>
       * @param index The index to set the value at.
       * @param value The itemCountList to set.
       * @return This builder for chaining.
       */
      public Builder setItemCountList(
          int index, int value) {
        ensureItemCountListIsMutable();
        itemCountList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 item_count_list = 10;</code>
       * @param value The itemCountList to add.
       * @return This builder for chaining.
       */
      public Builder addItemCountList(int value) {
        ensureItemCountListIsMutable();
        itemCountList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 item_count_list = 10;</code>
       * @param values The itemCountList to add.
       * @return This builder for chaining.
       */
      public Builder addAllItemCountList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureItemCountListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, itemCountList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 item_count_list = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearItemCountList() {
        itemCountList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
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


      // @@protoc_insertion_point(builder_scope:DestroyMaterialRsp)
    }

    // @@protoc_insertion_point(class_scope:DestroyMaterialRsp)
    private static final emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp();
    }

    public static emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DestroyMaterialRsp>
        PARSER = new com.google.protobuf.AbstractParser<DestroyMaterialRsp>() {
      @java.lang.Override
      public DestroyMaterialRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DestroyMaterialRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DestroyMaterialRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DestroyMaterialRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DestroyMaterialRspOuterClass.DestroyMaterialRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DestroyMaterialRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DestroyMaterialRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030DestroyMaterialRsp.proto\"\243\001\n\022DestroyMa" +
      "terialRsp\022\017\n\007retcode\030\t \001(\005\022\024\n\014item_id_li" +
      "st\030\013 \003(\r\022\027\n\017item_count_list\030\n \003(\r\"M\n\005Cmd" +
      "Id\022\010\n\004NONE\020\000\022\023\n\017ENET_CHANNEL_ID\020\000\022\024\n\020ENE" +
      "T_IS_RELIABLE\020\001\022\013\n\006CMD_ID\020\340\004\032\002\020\001B\033\n\031emu." +
      "grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DestroyMaterialRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DestroyMaterialRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DestroyMaterialRsp_descriptor,
        new java.lang.String[] { "Retcode", "ItemIdList", "ItemCountList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
