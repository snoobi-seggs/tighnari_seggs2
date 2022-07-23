// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MarkNewNotify.proto

package emu.grasscutter.net.proto;

public final class MarkNewNotifyOuterClass {
  private MarkNewNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MarkNewNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MarkNewNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 mark_new_type = 10;</code>
     * @return The markNewType.
     */
    int getMarkNewType();

    /**
     * <code>repeated uint32 id_list = 13;</code>
     * @return A list containing the idList.
     */
    java.util.List<java.lang.Integer> getIdListList();
    /**
     * <code>repeated uint32 id_list = 13;</code>
     * @return The count of idList.
     */
    int getIdListCount();
    /**
     * <code>repeated uint32 id_list = 13;</code>
     * @param index The index of the element to return.
     * @return The idList at the given index.
     */
    int getIdList(int index);
  }
  /**
   * Protobuf type {@code MarkNewNotify}
   */
  public static final class MarkNewNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MarkNewNotify)
      MarkNewNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MarkNewNotify.newBuilder() to construct.
    private MarkNewNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MarkNewNotify() {
      idList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MarkNewNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MarkNewNotify(
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
            case 80: {

              markNewType_ = input.readUInt32();
              break;
            }
            case 104: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                idList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              idList_.addInt(input.readUInt32());
              break;
            }
            case 106: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                idList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                idList_.addInt(input.readUInt32());
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          idList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.MarkNewNotifyOuterClass.internal_static_MarkNewNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MarkNewNotifyOuterClass.internal_static_MarkNewNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify.class, emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code MarkNewNotify.CmdId}
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
       * <code>CMD_ID = 1227;</code>
       */
      CMD_ID(3, 1227),
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
       * <code>CMD_ID = 1227;</code>
       */
      public static final int CMD_ID_VALUE = 1227;


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
          case 1227: return CMD_ID;
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
        return emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify.getDescriptor().getEnumTypes().get(0);
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

      // @@protoc_insertion_point(enum_scope:MarkNewNotify.CmdId)
    }

    public static final int MARK_NEW_TYPE_FIELD_NUMBER = 10;
    private int markNewType_;
    /**
     * <code>uint32 mark_new_type = 10;</code>
     * @return The markNewType.
     */
    @java.lang.Override
    public int getMarkNewType() {
      return markNewType_;
    }

    public static final int ID_LIST_FIELD_NUMBER = 13;
    private com.google.protobuf.Internal.IntList idList_;
    /**
     * <code>repeated uint32 id_list = 13;</code>
     * @return A list containing the idList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getIdListList() {
      return idList_;
    }
    /**
     * <code>repeated uint32 id_list = 13;</code>
     * @return The count of idList.
     */
    public int getIdListCount() {
      return idList_.size();
    }
    /**
     * <code>repeated uint32 id_list = 13;</code>
     * @param index The index of the element to return.
     * @return The idList at the given index.
     */
    public int getIdList(int index) {
      return idList_.getInt(index);
    }
    private int idListMemoizedSerializedSize = -1;

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
      if (markNewType_ != 0) {
        output.writeUInt32(10, markNewType_);
      }
      if (getIdListList().size() > 0) {
        output.writeUInt32NoTag(106);
        output.writeUInt32NoTag(idListMemoizedSerializedSize);
      }
      for (int i = 0; i < idList_.size(); i++) {
        output.writeUInt32NoTag(idList_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (markNewType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, markNewType_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < idList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(idList_.getInt(i));
        }
        size += dataSize;
        if (!getIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        idListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify other = (emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify) obj;

      if (getMarkNewType()
          != other.getMarkNewType()) return false;
      if (!getIdListList()
          .equals(other.getIdListList())) return false;
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
      hash = (37 * hash) + MARK_NEW_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getMarkNewType();
      if (getIdListCount() > 0) {
        hash = (37 * hash) + ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getIdListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify prototype) {
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
     * Protobuf type {@code MarkNewNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MarkNewNotify)
        emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MarkNewNotifyOuterClass.internal_static_MarkNewNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.MarkNewNotifyOuterClass.internal_static_MarkNewNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify.class, emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify.newBuilder()
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
        markNewType_ = 0;

        idList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.MarkNewNotifyOuterClass.internal_static_MarkNewNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify build() {
        emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify buildPartial() {
        emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify result = new emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify(this);
        int from_bitField0_ = bitField0_;
        result.markNewType_ = markNewType_;
        if (((bitField0_ & 0x00000001) != 0)) {
          idList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.idList_ = idList_;
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
        if (other instanceof emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify) {
          return mergeFrom((emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify other) {
        if (other == emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify.getDefaultInstance()) return this;
        if (other.getMarkNewType() != 0) {
          setMarkNewType(other.getMarkNewType());
        }
        if (!other.idList_.isEmpty()) {
          if (idList_.isEmpty()) {
            idList_ = other.idList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureIdListIsMutable();
            idList_.addAll(other.idList_);
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
        emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int markNewType_ ;
      /**
       * <code>uint32 mark_new_type = 10;</code>
       * @return The markNewType.
       */
      @java.lang.Override
      public int getMarkNewType() {
        return markNewType_;
      }
      /**
       * <code>uint32 mark_new_type = 10;</code>
       * @param value The markNewType to set.
       * @return This builder for chaining.
       */
      public Builder setMarkNewType(int value) {
        
        markNewType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 mark_new_type = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearMarkNewType() {
        
        markNewType_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList idList_ = emptyIntList();
      private void ensureIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          idList_ = mutableCopy(idList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 id_list = 13;</code>
       * @return A list containing the idList.
       */
      public java.util.List<java.lang.Integer>
          getIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(idList_) : idList_;
      }
      /**
       * <code>repeated uint32 id_list = 13;</code>
       * @return The count of idList.
       */
      public int getIdListCount() {
        return idList_.size();
      }
      /**
       * <code>repeated uint32 id_list = 13;</code>
       * @param index The index of the element to return.
       * @return The idList at the given index.
       */
      public int getIdList(int index) {
        return idList_.getInt(index);
      }
      /**
       * <code>repeated uint32 id_list = 13;</code>
       * @param index The index to set the value at.
       * @param value The idList to set.
       * @return This builder for chaining.
       */
      public Builder setIdList(
          int index, int value) {
        ensureIdListIsMutable();
        idList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 id_list = 13;</code>
       * @param value The idList to add.
       * @return This builder for chaining.
       */
      public Builder addIdList(int value) {
        ensureIdListIsMutable();
        idList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 id_list = 13;</code>
       * @param values The idList to add.
       * @return This builder for chaining.
       */
      public Builder addAllIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, idList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 id_list = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearIdList() {
        idList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
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


      // @@protoc_insertion_point(builder_scope:MarkNewNotify)
    }

    // @@protoc_insertion_point(class_scope:MarkNewNotify)
    private static final emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify();
    }

    public static emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MarkNewNotify>
        PARSER = new com.google.protobuf.AbstractParser<MarkNewNotify>() {
      @java.lang.Override
      public MarkNewNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MarkNewNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MarkNewNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MarkNewNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MarkNewNotifyOuterClass.MarkNewNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MarkNewNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MarkNewNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023MarkNewNotify.proto\"\206\001\n\rMarkNewNotify\022" +
      "\025\n\rmark_new_type\030\n \001(\r\022\017\n\007id_list\030\r \003(\r\"" +
      "M\n\005CmdId\022\010\n\004NONE\020\000\022\023\n\017ENET_CHANNEL_ID\020\000\022" +
      "\024\n\020ENET_IS_RELIABLE\020\001\022\013\n\006CMD_ID\020\313\t\032\002\020\001B\033" +
      "\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MarkNewNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MarkNewNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MarkNewNotify_descriptor,
        new java.lang.String[] { "MarkNewType", "IdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}