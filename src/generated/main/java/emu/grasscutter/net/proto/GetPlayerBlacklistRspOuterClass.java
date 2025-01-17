// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetPlayerBlacklistRsp.proto

package emu.grasscutter.net.proto;

public final class GetPlayerBlacklistRspOuterClass {
  private GetPlayerBlacklistRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetPlayerBlacklistRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetPlayerBlacklistRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 12;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>repeated .FriendBrief blacklist = 5;</code>
     */
    java.util.List<emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief> 
        getBlacklistList();
    /**
     * <code>repeated .FriendBrief blacklist = 5;</code>
     */
    emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief getBlacklist(int index);
    /**
     * <code>repeated .FriendBrief blacklist = 5;</code>
     */
    int getBlacklistCount();
    /**
     * <code>repeated .FriendBrief blacklist = 5;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBriefOrBuilder> 
        getBlacklistOrBuilderList();
    /**
     * <code>repeated .FriendBrief blacklist = 5;</code>
     */
    emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBriefOrBuilder getBlacklistOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code GetPlayerBlacklistRsp}
   */
  public static final class GetPlayerBlacklistRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetPlayerBlacklistRsp)
      GetPlayerBlacklistRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetPlayerBlacklistRsp.newBuilder() to construct.
    private GetPlayerBlacklistRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetPlayerBlacklistRsp() {
      blacklist_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetPlayerBlacklistRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetPlayerBlacklistRsp(
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
            case 42: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                blacklist_ = new java.util.ArrayList<emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief>();
                mutable_bitField0_ |= 0x00000001;
              }
              blacklist_.add(
                  input.readMessage(emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.parser(), extensionRegistry));
              break;
            }
            case 96: {

              retcode_ = input.readInt32();
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
          blacklist_ = java.util.Collections.unmodifiableList(blacklist_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GetPlayerBlacklistRspOuterClass.internal_static_GetPlayerBlacklistRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GetPlayerBlacklistRspOuterClass.internal_static_GetPlayerBlacklistRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GetPlayerBlacklistRspOuterClass.GetPlayerBlacklistRsp.class, emu.grasscutter.net.proto.GetPlayerBlacklistRspOuterClass.GetPlayerBlacklistRsp.Builder.class);
    }

    /**
     * Protobuf enum {@code GetPlayerBlacklistRsp.CmdId}
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
       * <code>CMD_ID = 4072;</code>
       */
      CMD_ID(3, 4072),
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
       * <code>CMD_ID = 4072;</code>
       */
      public static final int CMD_ID_VALUE = 4072;


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
          case 4072: return CMD_ID;
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
        return emu.grasscutter.net.proto.GetPlayerBlacklistRspOuterClass.GetPlayerBlacklistRsp.getDescriptor().getEnumTypes().get(0);
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

      // @@protoc_insertion_point(enum_scope:GetPlayerBlacklistRsp.CmdId)
    }

    public static final int RETCODE_FIELD_NUMBER = 12;
    private int retcode_;
    /**
     * <code>int32 retcode = 12;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int BLACKLIST_FIELD_NUMBER = 5;
    private java.util.List<emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief> blacklist_;
    /**
     * <code>repeated .FriendBrief blacklist = 5;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief> getBlacklistList() {
      return blacklist_;
    }
    /**
     * <code>repeated .FriendBrief blacklist = 5;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBriefOrBuilder> 
        getBlacklistOrBuilderList() {
      return blacklist_;
    }
    /**
     * <code>repeated .FriendBrief blacklist = 5;</code>
     */
    @java.lang.Override
    public int getBlacklistCount() {
      return blacklist_.size();
    }
    /**
     * <code>repeated .FriendBrief blacklist = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief getBlacklist(int index) {
      return blacklist_.get(index);
    }
    /**
     * <code>repeated .FriendBrief blacklist = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBriefOrBuilder getBlacklistOrBuilder(
        int index) {
      return blacklist_.get(index);
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
      for (int i = 0; i < blacklist_.size(); i++) {
        output.writeMessage(5, blacklist_.get(i));
      }
      if (retcode_ != 0) {
        output.writeInt32(12, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < blacklist_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, blacklist_.get(i));
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(12, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GetPlayerBlacklistRspOuterClass.GetPlayerBlacklistRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GetPlayerBlacklistRspOuterClass.GetPlayerBlacklistRsp other = (emu.grasscutter.net.proto.GetPlayerBlacklistRspOuterClass.GetPlayerBlacklistRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (!getBlacklistList()
          .equals(other.getBlacklistList())) return false;
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
      if (getBlacklistCount() > 0) {
        hash = (37 * hash) + BLACKLIST_FIELD_NUMBER;
        hash = (53 * hash) + getBlacklistList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GetPlayerBlacklistRspOuterClass.GetPlayerBlacklistRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetPlayerBlacklistRspOuterClass.GetPlayerBlacklistRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetPlayerBlacklistRspOuterClass.GetPlayerBlacklistRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetPlayerBlacklistRspOuterClass.GetPlayerBlacklistRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetPlayerBlacklistRspOuterClass.GetPlayerBlacklistRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetPlayerBlacklistRspOuterClass.GetPlayerBlacklistRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetPlayerBlacklistRspOuterClass.GetPlayerBlacklistRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetPlayerBlacklistRspOuterClass.GetPlayerBlacklistRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetPlayerBlacklistRspOuterClass.GetPlayerBlacklistRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetPlayerBlacklistRspOuterClass.GetPlayerBlacklistRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetPlayerBlacklistRspOuterClass.GetPlayerBlacklistRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetPlayerBlacklistRspOuterClass.GetPlayerBlacklistRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GetPlayerBlacklistRspOuterClass.GetPlayerBlacklistRsp prototype) {
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
     * Protobuf type {@code GetPlayerBlacklistRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetPlayerBlacklistRsp)
        emu.grasscutter.net.proto.GetPlayerBlacklistRspOuterClass.GetPlayerBlacklistRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GetPlayerBlacklistRspOuterClass.internal_static_GetPlayerBlacklistRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GetPlayerBlacklistRspOuterClass.internal_static_GetPlayerBlacklistRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GetPlayerBlacklistRspOuterClass.GetPlayerBlacklistRsp.class, emu.grasscutter.net.proto.GetPlayerBlacklistRspOuterClass.GetPlayerBlacklistRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GetPlayerBlacklistRspOuterClass.GetPlayerBlacklistRsp.newBuilder()
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
          getBlacklistFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        retcode_ = 0;

        if (blacklistBuilder_ == null) {
          blacklist_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          blacklistBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GetPlayerBlacklistRspOuterClass.internal_static_GetPlayerBlacklistRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetPlayerBlacklistRspOuterClass.GetPlayerBlacklistRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GetPlayerBlacklistRspOuterClass.GetPlayerBlacklistRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetPlayerBlacklistRspOuterClass.GetPlayerBlacklistRsp build() {
        emu.grasscutter.net.proto.GetPlayerBlacklistRspOuterClass.GetPlayerBlacklistRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetPlayerBlacklistRspOuterClass.GetPlayerBlacklistRsp buildPartial() {
        emu.grasscutter.net.proto.GetPlayerBlacklistRspOuterClass.GetPlayerBlacklistRsp result = new emu.grasscutter.net.proto.GetPlayerBlacklistRspOuterClass.GetPlayerBlacklistRsp(this);
        int from_bitField0_ = bitField0_;
        result.retcode_ = retcode_;
        if (blacklistBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            blacklist_ = java.util.Collections.unmodifiableList(blacklist_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.blacklist_ = blacklist_;
        } else {
          result.blacklist_ = blacklistBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.GetPlayerBlacklistRspOuterClass.GetPlayerBlacklistRsp) {
          return mergeFrom((emu.grasscutter.net.proto.GetPlayerBlacklistRspOuterClass.GetPlayerBlacklistRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GetPlayerBlacklistRspOuterClass.GetPlayerBlacklistRsp other) {
        if (other == emu.grasscutter.net.proto.GetPlayerBlacklistRspOuterClass.GetPlayerBlacklistRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (blacklistBuilder_ == null) {
          if (!other.blacklist_.isEmpty()) {
            if (blacklist_.isEmpty()) {
              blacklist_ = other.blacklist_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureBlacklistIsMutable();
              blacklist_.addAll(other.blacklist_);
            }
            onChanged();
          }
        } else {
          if (!other.blacklist_.isEmpty()) {
            if (blacklistBuilder_.isEmpty()) {
              blacklistBuilder_.dispose();
              blacklistBuilder_ = null;
              blacklist_ = other.blacklist_;
              bitField0_ = (bitField0_ & ~0x00000001);
              blacklistBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getBlacklistFieldBuilder() : null;
            } else {
              blacklistBuilder_.addAllMessages(other.blacklist_);
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
        emu.grasscutter.net.proto.GetPlayerBlacklistRspOuterClass.GetPlayerBlacklistRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GetPlayerBlacklistRspOuterClass.GetPlayerBlacklistRsp) e.getUnfinishedMessage();
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
       * <code>int32 retcode = 12;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 12;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief> blacklist_ =
        java.util.Collections.emptyList();
      private void ensureBlacklistIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          blacklist_ = new java.util.ArrayList<emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief>(blacklist_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief, emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.Builder, emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBriefOrBuilder> blacklistBuilder_;

      /**
       * <code>repeated .FriendBrief blacklist = 5;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief> getBlacklistList() {
        if (blacklistBuilder_ == null) {
          return java.util.Collections.unmodifiableList(blacklist_);
        } else {
          return blacklistBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .FriendBrief blacklist = 5;</code>
       */
      public int getBlacklistCount() {
        if (blacklistBuilder_ == null) {
          return blacklist_.size();
        } else {
          return blacklistBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .FriendBrief blacklist = 5;</code>
       */
      public emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief getBlacklist(int index) {
        if (blacklistBuilder_ == null) {
          return blacklist_.get(index);
        } else {
          return blacklistBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .FriendBrief blacklist = 5;</code>
       */
      public Builder setBlacklist(
          int index, emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief value) {
        if (blacklistBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBlacklistIsMutable();
          blacklist_.set(index, value);
          onChanged();
        } else {
          blacklistBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .FriendBrief blacklist = 5;</code>
       */
      public Builder setBlacklist(
          int index, emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.Builder builderForValue) {
        if (blacklistBuilder_ == null) {
          ensureBlacklistIsMutable();
          blacklist_.set(index, builderForValue.build());
          onChanged();
        } else {
          blacklistBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .FriendBrief blacklist = 5;</code>
       */
      public Builder addBlacklist(emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief value) {
        if (blacklistBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBlacklistIsMutable();
          blacklist_.add(value);
          onChanged();
        } else {
          blacklistBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .FriendBrief blacklist = 5;</code>
       */
      public Builder addBlacklist(
          int index, emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief value) {
        if (blacklistBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBlacklistIsMutable();
          blacklist_.add(index, value);
          onChanged();
        } else {
          blacklistBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .FriendBrief blacklist = 5;</code>
       */
      public Builder addBlacklist(
          emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.Builder builderForValue) {
        if (blacklistBuilder_ == null) {
          ensureBlacklistIsMutable();
          blacklist_.add(builderForValue.build());
          onChanged();
        } else {
          blacklistBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .FriendBrief blacklist = 5;</code>
       */
      public Builder addBlacklist(
          int index, emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.Builder builderForValue) {
        if (blacklistBuilder_ == null) {
          ensureBlacklistIsMutable();
          blacklist_.add(index, builderForValue.build());
          onChanged();
        } else {
          blacklistBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .FriendBrief blacklist = 5;</code>
       */
      public Builder addAllBlacklist(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief> values) {
        if (blacklistBuilder_ == null) {
          ensureBlacklistIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, blacklist_);
          onChanged();
        } else {
          blacklistBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .FriendBrief blacklist = 5;</code>
       */
      public Builder clearBlacklist() {
        if (blacklistBuilder_ == null) {
          blacklist_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          blacklistBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .FriendBrief blacklist = 5;</code>
       */
      public Builder removeBlacklist(int index) {
        if (blacklistBuilder_ == null) {
          ensureBlacklistIsMutable();
          blacklist_.remove(index);
          onChanged();
        } else {
          blacklistBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .FriendBrief blacklist = 5;</code>
       */
      public emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.Builder getBlacklistBuilder(
          int index) {
        return getBlacklistFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .FriendBrief blacklist = 5;</code>
       */
      public emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBriefOrBuilder getBlacklistOrBuilder(
          int index) {
        if (blacklistBuilder_ == null) {
          return blacklist_.get(index);  } else {
          return blacklistBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .FriendBrief blacklist = 5;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBriefOrBuilder> 
           getBlacklistOrBuilderList() {
        if (blacklistBuilder_ != null) {
          return blacklistBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(blacklist_);
        }
      }
      /**
       * <code>repeated .FriendBrief blacklist = 5;</code>
       */
      public emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.Builder addBlacklistBuilder() {
        return getBlacklistFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.getDefaultInstance());
      }
      /**
       * <code>repeated .FriendBrief blacklist = 5;</code>
       */
      public emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.Builder addBlacklistBuilder(
          int index) {
        return getBlacklistFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.getDefaultInstance());
      }
      /**
       * <code>repeated .FriendBrief blacklist = 5;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.Builder> 
           getBlacklistBuilderList() {
        return getBlacklistFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief, emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.Builder, emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBriefOrBuilder> 
          getBlacklistFieldBuilder() {
        if (blacklistBuilder_ == null) {
          blacklistBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief, emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.Builder, emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBriefOrBuilder>(
                  blacklist_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          blacklist_ = null;
        }
        return blacklistBuilder_;
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


      // @@protoc_insertion_point(builder_scope:GetPlayerBlacklistRsp)
    }

    // @@protoc_insertion_point(class_scope:GetPlayerBlacklistRsp)
    private static final emu.grasscutter.net.proto.GetPlayerBlacklistRspOuterClass.GetPlayerBlacklistRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GetPlayerBlacklistRspOuterClass.GetPlayerBlacklistRsp();
    }

    public static emu.grasscutter.net.proto.GetPlayerBlacklistRspOuterClass.GetPlayerBlacklistRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetPlayerBlacklistRsp>
        PARSER = new com.google.protobuf.AbstractParser<GetPlayerBlacklistRsp>() {
      @java.lang.Override
      public GetPlayerBlacklistRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetPlayerBlacklistRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetPlayerBlacklistRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetPlayerBlacklistRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GetPlayerBlacklistRspOuterClass.GetPlayerBlacklistRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetPlayerBlacklistRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetPlayerBlacklistRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033GetPlayerBlacklistRsp.proto\032\021FriendBri" +
      "ef.proto\"\230\001\n\025GetPlayerBlacklistRsp\022\017\n\007re" +
      "tcode\030\014 \001(\005\022\037\n\tblacklist\030\005 \003(\0132\014.FriendB" +
      "rief\"M\n\005CmdId\022\010\n\004NONE\020\000\022\023\n\017ENET_CHANNEL_" +
      "ID\020\000\022\024\n\020ENET_IS_RELIABLE\020\001\022\013\n\006CMD_ID\020\350\037\032" +
      "\002\020\001B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.FriendBriefOuterClass.getDescriptor(),
        });
    internal_static_GetPlayerBlacklistRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetPlayerBlacklistRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetPlayerBlacklistRsp_descriptor,
        new java.lang.String[] { "Retcode", "Blacklist", });
    emu.grasscutter.net.proto.FriendBriefOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
