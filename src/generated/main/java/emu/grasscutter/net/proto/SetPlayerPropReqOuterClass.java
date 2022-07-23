// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SetPlayerPropReq.proto

package emu.grasscutter.net.proto;

public final class SetPlayerPropReqOuterClass {
  private SetPlayerPropReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SetPlayerPropReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SetPlayerPropReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .PropValue prop_list = 14;</code>
     */
    java.util.List<emu.grasscutter.net.proto.PropValueOuterClass.PropValue> 
        getPropListList();
    /**
     * <code>repeated .PropValue prop_list = 14;</code>
     */
    emu.grasscutter.net.proto.PropValueOuterClass.PropValue getPropList(int index);
    /**
     * <code>repeated .PropValue prop_list = 14;</code>
     */
    int getPropListCount();
    /**
     * <code>repeated .PropValue prop_list = 14;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.PropValueOuterClass.PropValueOrBuilder> 
        getPropListOrBuilderList();
    /**
     * <code>repeated .PropValue prop_list = 14;</code>
     */
    emu.grasscutter.net.proto.PropValueOuterClass.PropValueOrBuilder getPropListOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code SetPlayerPropReq}
   */
  public static final class SetPlayerPropReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SetPlayerPropReq)
      SetPlayerPropReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SetPlayerPropReq.newBuilder() to construct.
    private SetPlayerPropReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SetPlayerPropReq() {
      propList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SetPlayerPropReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SetPlayerPropReq(
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
            case 114: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                propList_ = new java.util.ArrayList<emu.grasscutter.net.proto.PropValueOuterClass.PropValue>();
                mutable_bitField0_ |= 0x00000001;
              }
              propList_.add(
                  input.readMessage(emu.grasscutter.net.proto.PropValueOuterClass.PropValue.parser(), extensionRegistry));
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
          propList_ = java.util.Collections.unmodifiableList(propList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.SetPlayerPropReqOuterClass.internal_static_SetPlayerPropReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SetPlayerPropReqOuterClass.internal_static_SetPlayerPropReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SetPlayerPropReqOuterClass.SetPlayerPropReq.class, emu.grasscutter.net.proto.SetPlayerPropReqOuterClass.SetPlayerPropReq.Builder.class);
    }

    /**
     * Protobuf enum {@code SetPlayerPropReq.CmdId}
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
       * <code>CMD_ID = 130;</code>
       */
      CMD_ID(4, 130),
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
       * <code>CMD_ID = 130;</code>
       */
      public static final int CMD_ID_VALUE = 130;


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
          case 130: return CMD_ID;
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
        return emu.grasscutter.net.proto.SetPlayerPropReqOuterClass.SetPlayerPropReq.getDescriptor().getEnumTypes().get(0);
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

      // @@protoc_insertion_point(enum_scope:SetPlayerPropReq.CmdId)
    }

    public static final int PROP_LIST_FIELD_NUMBER = 14;
    private java.util.List<emu.grasscutter.net.proto.PropValueOuterClass.PropValue> propList_;
    /**
     * <code>repeated .PropValue prop_list = 14;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.PropValueOuterClass.PropValue> getPropListList() {
      return propList_;
    }
    /**
     * <code>repeated .PropValue prop_list = 14;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.PropValueOuterClass.PropValueOrBuilder> 
        getPropListOrBuilderList() {
      return propList_;
    }
    /**
     * <code>repeated .PropValue prop_list = 14;</code>
     */
    @java.lang.Override
    public int getPropListCount() {
      return propList_.size();
    }
    /**
     * <code>repeated .PropValue prop_list = 14;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.PropValueOuterClass.PropValue getPropList(int index) {
      return propList_.get(index);
    }
    /**
     * <code>repeated .PropValue prop_list = 14;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.PropValueOuterClass.PropValueOrBuilder getPropListOrBuilder(
        int index) {
      return propList_.get(index);
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
      for (int i = 0; i < propList_.size(); i++) {
        output.writeMessage(14, propList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < propList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(14, propList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.SetPlayerPropReqOuterClass.SetPlayerPropReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SetPlayerPropReqOuterClass.SetPlayerPropReq other = (emu.grasscutter.net.proto.SetPlayerPropReqOuterClass.SetPlayerPropReq) obj;

      if (!getPropListList()
          .equals(other.getPropListList())) return false;
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
      if (getPropListCount() > 0) {
        hash = (37 * hash) + PROP_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getPropListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SetPlayerPropReqOuterClass.SetPlayerPropReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetPlayerPropReqOuterClass.SetPlayerPropReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetPlayerPropReqOuterClass.SetPlayerPropReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetPlayerPropReqOuterClass.SetPlayerPropReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetPlayerPropReqOuterClass.SetPlayerPropReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetPlayerPropReqOuterClass.SetPlayerPropReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetPlayerPropReqOuterClass.SetPlayerPropReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetPlayerPropReqOuterClass.SetPlayerPropReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetPlayerPropReqOuterClass.SetPlayerPropReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetPlayerPropReqOuterClass.SetPlayerPropReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetPlayerPropReqOuterClass.SetPlayerPropReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetPlayerPropReqOuterClass.SetPlayerPropReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SetPlayerPropReqOuterClass.SetPlayerPropReq prototype) {
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
     * Protobuf type {@code SetPlayerPropReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SetPlayerPropReq)
        emu.grasscutter.net.proto.SetPlayerPropReqOuterClass.SetPlayerPropReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SetPlayerPropReqOuterClass.internal_static_SetPlayerPropReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SetPlayerPropReqOuterClass.internal_static_SetPlayerPropReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SetPlayerPropReqOuterClass.SetPlayerPropReq.class, emu.grasscutter.net.proto.SetPlayerPropReqOuterClass.SetPlayerPropReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SetPlayerPropReqOuterClass.SetPlayerPropReq.newBuilder()
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
          getPropListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (propListBuilder_ == null) {
          propList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          propListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SetPlayerPropReqOuterClass.internal_static_SetPlayerPropReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetPlayerPropReqOuterClass.SetPlayerPropReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SetPlayerPropReqOuterClass.SetPlayerPropReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetPlayerPropReqOuterClass.SetPlayerPropReq build() {
        emu.grasscutter.net.proto.SetPlayerPropReqOuterClass.SetPlayerPropReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetPlayerPropReqOuterClass.SetPlayerPropReq buildPartial() {
        emu.grasscutter.net.proto.SetPlayerPropReqOuterClass.SetPlayerPropReq result = new emu.grasscutter.net.proto.SetPlayerPropReqOuterClass.SetPlayerPropReq(this);
        int from_bitField0_ = bitField0_;
        if (propListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            propList_ = java.util.Collections.unmodifiableList(propList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.propList_ = propList_;
        } else {
          result.propList_ = propListBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.SetPlayerPropReqOuterClass.SetPlayerPropReq) {
          return mergeFrom((emu.grasscutter.net.proto.SetPlayerPropReqOuterClass.SetPlayerPropReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SetPlayerPropReqOuterClass.SetPlayerPropReq other) {
        if (other == emu.grasscutter.net.proto.SetPlayerPropReqOuterClass.SetPlayerPropReq.getDefaultInstance()) return this;
        if (propListBuilder_ == null) {
          if (!other.propList_.isEmpty()) {
            if (propList_.isEmpty()) {
              propList_ = other.propList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensurePropListIsMutable();
              propList_.addAll(other.propList_);
            }
            onChanged();
          }
        } else {
          if (!other.propList_.isEmpty()) {
            if (propListBuilder_.isEmpty()) {
              propListBuilder_.dispose();
              propListBuilder_ = null;
              propList_ = other.propList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              propListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getPropListFieldBuilder() : null;
            } else {
              propListBuilder_.addAllMessages(other.propList_);
            }
          }
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
        emu.grasscutter.net.proto.SetPlayerPropReqOuterClass.SetPlayerPropReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SetPlayerPropReqOuterClass.SetPlayerPropReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.PropValueOuterClass.PropValue> propList_ =
        java.util.Collections.emptyList();
      private void ensurePropListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          propList_ = new java.util.ArrayList<emu.grasscutter.net.proto.PropValueOuterClass.PropValue>(propList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.PropValueOuterClass.PropValue, emu.grasscutter.net.proto.PropValueOuterClass.PropValue.Builder, emu.grasscutter.net.proto.PropValueOuterClass.PropValueOrBuilder> propListBuilder_;

      /**
       * <code>repeated .PropValue prop_list = 14;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.PropValueOuterClass.PropValue> getPropListList() {
        if (propListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(propList_);
        } else {
          return propListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .PropValue prop_list = 14;</code>
       */
      public int getPropListCount() {
        if (propListBuilder_ == null) {
          return propList_.size();
        } else {
          return propListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .PropValue prop_list = 14;</code>
       */
      public emu.grasscutter.net.proto.PropValueOuterClass.PropValue getPropList(int index) {
        if (propListBuilder_ == null) {
          return propList_.get(index);
        } else {
          return propListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .PropValue prop_list = 14;</code>
       */
      public Builder setPropList(
          int index, emu.grasscutter.net.proto.PropValueOuterClass.PropValue value) {
        if (propListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePropListIsMutable();
          propList_.set(index, value);
          onChanged();
        } else {
          propListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .PropValue prop_list = 14;</code>
       */
      public Builder setPropList(
          int index, emu.grasscutter.net.proto.PropValueOuterClass.PropValue.Builder builderForValue) {
        if (propListBuilder_ == null) {
          ensurePropListIsMutable();
          propList_.set(index, builderForValue.build());
          onChanged();
        } else {
          propListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .PropValue prop_list = 14;</code>
       */
      public Builder addPropList(emu.grasscutter.net.proto.PropValueOuterClass.PropValue value) {
        if (propListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePropListIsMutable();
          propList_.add(value);
          onChanged();
        } else {
          propListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .PropValue prop_list = 14;</code>
       */
      public Builder addPropList(
          int index, emu.grasscutter.net.proto.PropValueOuterClass.PropValue value) {
        if (propListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePropListIsMutable();
          propList_.add(index, value);
          onChanged();
        } else {
          propListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .PropValue prop_list = 14;</code>
       */
      public Builder addPropList(
          emu.grasscutter.net.proto.PropValueOuterClass.PropValue.Builder builderForValue) {
        if (propListBuilder_ == null) {
          ensurePropListIsMutable();
          propList_.add(builderForValue.build());
          onChanged();
        } else {
          propListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .PropValue prop_list = 14;</code>
       */
      public Builder addPropList(
          int index, emu.grasscutter.net.proto.PropValueOuterClass.PropValue.Builder builderForValue) {
        if (propListBuilder_ == null) {
          ensurePropListIsMutable();
          propList_.add(index, builderForValue.build());
          onChanged();
        } else {
          propListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .PropValue prop_list = 14;</code>
       */
      public Builder addAllPropList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.PropValueOuterClass.PropValue> values) {
        if (propListBuilder_ == null) {
          ensurePropListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, propList_);
          onChanged();
        } else {
          propListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .PropValue prop_list = 14;</code>
       */
      public Builder clearPropList() {
        if (propListBuilder_ == null) {
          propList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          propListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .PropValue prop_list = 14;</code>
       */
      public Builder removePropList(int index) {
        if (propListBuilder_ == null) {
          ensurePropListIsMutable();
          propList_.remove(index);
          onChanged();
        } else {
          propListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .PropValue prop_list = 14;</code>
       */
      public emu.grasscutter.net.proto.PropValueOuterClass.PropValue.Builder getPropListBuilder(
          int index) {
        return getPropListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .PropValue prop_list = 14;</code>
       */
      public emu.grasscutter.net.proto.PropValueOuterClass.PropValueOrBuilder getPropListOrBuilder(
          int index) {
        if (propListBuilder_ == null) {
          return propList_.get(index);  } else {
          return propListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .PropValue prop_list = 14;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.PropValueOuterClass.PropValueOrBuilder> 
           getPropListOrBuilderList() {
        if (propListBuilder_ != null) {
          return propListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(propList_);
        }
      }
      /**
       * <code>repeated .PropValue prop_list = 14;</code>
       */
      public emu.grasscutter.net.proto.PropValueOuterClass.PropValue.Builder addPropListBuilder() {
        return getPropListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.PropValueOuterClass.PropValue.getDefaultInstance());
      }
      /**
       * <code>repeated .PropValue prop_list = 14;</code>
       */
      public emu.grasscutter.net.proto.PropValueOuterClass.PropValue.Builder addPropListBuilder(
          int index) {
        return getPropListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.PropValueOuterClass.PropValue.getDefaultInstance());
      }
      /**
       * <code>repeated .PropValue prop_list = 14;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.PropValueOuterClass.PropValue.Builder> 
           getPropListBuilderList() {
        return getPropListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.PropValueOuterClass.PropValue, emu.grasscutter.net.proto.PropValueOuterClass.PropValue.Builder, emu.grasscutter.net.proto.PropValueOuterClass.PropValueOrBuilder> 
          getPropListFieldBuilder() {
        if (propListBuilder_ == null) {
          propListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.PropValueOuterClass.PropValue, emu.grasscutter.net.proto.PropValueOuterClass.PropValue.Builder, emu.grasscutter.net.proto.PropValueOuterClass.PropValueOrBuilder>(
                  propList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          propList_ = null;
        }
        return propListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:SetPlayerPropReq)
    }

    // @@protoc_insertion_point(class_scope:SetPlayerPropReq)
    private static final emu.grasscutter.net.proto.SetPlayerPropReqOuterClass.SetPlayerPropReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SetPlayerPropReqOuterClass.SetPlayerPropReq();
    }

    public static emu.grasscutter.net.proto.SetPlayerPropReqOuterClass.SetPlayerPropReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SetPlayerPropReq>
        PARSER = new com.google.protobuf.AbstractParser<SetPlayerPropReq>() {
      @java.lang.Override
      public SetPlayerPropReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SetPlayerPropReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SetPlayerPropReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SetPlayerPropReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SetPlayerPropReqOuterClass.SetPlayerPropReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SetPlayerPropReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SetPlayerPropReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026SetPlayerPropReq.proto\032\017PropValue.prot" +
      "o\"\225\001\n\020SetPlayerPropReq\022\035\n\tprop_list\030\016 \003(" +
      "\0132\n.PropValue\"b\n\005CmdId\022\010\n\004NONE\020\000\022\023\n\017ENET" +
      "_CHANNEL_ID\020\000\022\024\n\020ENET_IS_RELIABLE\020\001\022\023\n\017I" +
      "S_ALLOW_CLIENT\020\001\022\013\n\006CMD_ID\020\202\001\032\002\020\001B\033\n\031emu" +
      ".grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.PropValueOuterClass.getDescriptor(),
        });
    internal_static_SetPlayerPropReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SetPlayerPropReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SetPlayerPropReq_descriptor,
        new java.lang.String[] { "PropList", });
    emu.grasscutter.net.proto.PropValueOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
