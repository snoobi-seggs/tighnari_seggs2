// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TowerTeamSelectReq.proto

package emu.grasscutter.net.proto;

public final class TowerTeamSelectReqOuterClass {
  private TowerTeamSelectReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TowerTeamSelectReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TowerTeamSelectReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 floor_id = 15;</code>
     * @return The floorId.
     */
    int getFloorId();

    /**
     * <code>repeated .TowerTeam tower_team_list = 2;</code>
     */
    java.util.List<emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam> 
        getTowerTeamListList();
    /**
     * <code>repeated .TowerTeam tower_team_list = 2;</code>
     */
    emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam getTowerTeamList(int index);
    /**
     * <code>repeated .TowerTeam tower_team_list = 2;</code>
     */
    int getTowerTeamListCount();
    /**
     * <code>repeated .TowerTeam tower_team_list = 2;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeamOrBuilder> 
        getTowerTeamListOrBuilderList();
    /**
     * <code>repeated .TowerTeam tower_team_list = 2;</code>
     */
    emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeamOrBuilder getTowerTeamListOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code TowerTeamSelectReq}
   */
  public static final class TowerTeamSelectReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TowerTeamSelectReq)
      TowerTeamSelectReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TowerTeamSelectReq.newBuilder() to construct.
    private TowerTeamSelectReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TowerTeamSelectReq() {
      towerTeamList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TowerTeamSelectReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TowerTeamSelectReq(
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
            case 18: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                towerTeamList_ = new java.util.ArrayList<emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam>();
                mutable_bitField0_ |= 0x00000001;
              }
              towerTeamList_.add(
                  input.readMessage(emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam.parser(), extensionRegistry));
              break;
            }
            case 120: {

              floorId_ = input.readUInt32();
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
          towerTeamList_ = java.util.Collections.unmodifiableList(towerTeamList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.internal_static_TowerTeamSelectReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.internal_static_TowerTeamSelectReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq.class, emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq.Builder.class);
    }

    /**
     * Protobuf enum {@code TowerTeamSelectReq.CmdId}
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
       * <code>CMD_ID = 2417;</code>
       */
      CMD_ID(4, 2417),
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
       * <code>CMD_ID = 2417;</code>
       */
      public static final int CMD_ID_VALUE = 2417;


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
          case 2417: return CMD_ID;
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
        return emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq.getDescriptor().getEnumTypes().get(0);
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

      // @@protoc_insertion_point(enum_scope:TowerTeamSelectReq.CmdId)
    }

    public static final int FLOOR_ID_FIELD_NUMBER = 15;
    private int floorId_;
    /**
     * <code>uint32 floor_id = 15;</code>
     * @return The floorId.
     */
    @java.lang.Override
    public int getFloorId() {
      return floorId_;
    }

    public static final int TOWER_TEAM_LIST_FIELD_NUMBER = 2;
    private java.util.List<emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam> towerTeamList_;
    /**
     * <code>repeated .TowerTeam tower_team_list = 2;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam> getTowerTeamListList() {
      return towerTeamList_;
    }
    /**
     * <code>repeated .TowerTeam tower_team_list = 2;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeamOrBuilder> 
        getTowerTeamListOrBuilderList() {
      return towerTeamList_;
    }
    /**
     * <code>repeated .TowerTeam tower_team_list = 2;</code>
     */
    @java.lang.Override
    public int getTowerTeamListCount() {
      return towerTeamList_.size();
    }
    /**
     * <code>repeated .TowerTeam tower_team_list = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam getTowerTeamList(int index) {
      return towerTeamList_.get(index);
    }
    /**
     * <code>repeated .TowerTeam tower_team_list = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeamOrBuilder getTowerTeamListOrBuilder(
        int index) {
      return towerTeamList_.get(index);
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
      for (int i = 0; i < towerTeamList_.size(); i++) {
        output.writeMessage(2, towerTeamList_.get(i));
      }
      if (floorId_ != 0) {
        output.writeUInt32(15, floorId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < towerTeamList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, towerTeamList_.get(i));
      }
      if (floorId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, floorId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq other = (emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq) obj;

      if (getFloorId()
          != other.getFloorId()) return false;
      if (!getTowerTeamListList()
          .equals(other.getTowerTeamListList())) return false;
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
      hash = (37 * hash) + FLOOR_ID_FIELD_NUMBER;
      hash = (53 * hash) + getFloorId();
      if (getTowerTeamListCount() > 0) {
        hash = (37 * hash) + TOWER_TEAM_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getTowerTeamListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq prototype) {
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
     * Protobuf type {@code TowerTeamSelectReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TowerTeamSelectReq)
        emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.internal_static_TowerTeamSelectReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.internal_static_TowerTeamSelectReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq.class, emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq.newBuilder()
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
          getTowerTeamListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        floorId_ = 0;

        if (towerTeamListBuilder_ == null) {
          towerTeamList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          towerTeamListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.internal_static_TowerTeamSelectReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq build() {
        emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq buildPartial() {
        emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq result = new emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq(this);
        int from_bitField0_ = bitField0_;
        result.floorId_ = floorId_;
        if (towerTeamListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            towerTeamList_ = java.util.Collections.unmodifiableList(towerTeamList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.towerTeamList_ = towerTeamList_;
        } else {
          result.towerTeamList_ = towerTeamListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq) {
          return mergeFrom((emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq other) {
        if (other == emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq.getDefaultInstance()) return this;
        if (other.getFloorId() != 0) {
          setFloorId(other.getFloorId());
        }
        if (towerTeamListBuilder_ == null) {
          if (!other.towerTeamList_.isEmpty()) {
            if (towerTeamList_.isEmpty()) {
              towerTeamList_ = other.towerTeamList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureTowerTeamListIsMutable();
              towerTeamList_.addAll(other.towerTeamList_);
            }
            onChanged();
          }
        } else {
          if (!other.towerTeamList_.isEmpty()) {
            if (towerTeamListBuilder_.isEmpty()) {
              towerTeamListBuilder_.dispose();
              towerTeamListBuilder_ = null;
              towerTeamList_ = other.towerTeamList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              towerTeamListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getTowerTeamListFieldBuilder() : null;
            } else {
              towerTeamListBuilder_.addAllMessages(other.towerTeamList_);
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
        emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int floorId_ ;
      /**
       * <code>uint32 floor_id = 15;</code>
       * @return The floorId.
       */
      @java.lang.Override
      public int getFloorId() {
        return floorId_;
      }
      /**
       * <code>uint32 floor_id = 15;</code>
       * @param value The floorId to set.
       * @return This builder for chaining.
       */
      public Builder setFloorId(int value) {
        
        floorId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 floor_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearFloorId() {
        
        floorId_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam> towerTeamList_ =
        java.util.Collections.emptyList();
      private void ensureTowerTeamListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          towerTeamList_ = new java.util.ArrayList<emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam>(towerTeamList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam, emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam.Builder, emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeamOrBuilder> towerTeamListBuilder_;

      /**
       * <code>repeated .TowerTeam tower_team_list = 2;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam> getTowerTeamListList() {
        if (towerTeamListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(towerTeamList_);
        } else {
          return towerTeamListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .TowerTeam tower_team_list = 2;</code>
       */
      public int getTowerTeamListCount() {
        if (towerTeamListBuilder_ == null) {
          return towerTeamList_.size();
        } else {
          return towerTeamListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .TowerTeam tower_team_list = 2;</code>
       */
      public emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam getTowerTeamList(int index) {
        if (towerTeamListBuilder_ == null) {
          return towerTeamList_.get(index);
        } else {
          return towerTeamListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .TowerTeam tower_team_list = 2;</code>
       */
      public Builder setTowerTeamList(
          int index, emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam value) {
        if (towerTeamListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTowerTeamListIsMutable();
          towerTeamList_.set(index, value);
          onChanged();
        } else {
          towerTeamListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .TowerTeam tower_team_list = 2;</code>
       */
      public Builder setTowerTeamList(
          int index, emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam.Builder builderForValue) {
        if (towerTeamListBuilder_ == null) {
          ensureTowerTeamListIsMutable();
          towerTeamList_.set(index, builderForValue.build());
          onChanged();
        } else {
          towerTeamListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .TowerTeam tower_team_list = 2;</code>
       */
      public Builder addTowerTeamList(emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam value) {
        if (towerTeamListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTowerTeamListIsMutable();
          towerTeamList_.add(value);
          onChanged();
        } else {
          towerTeamListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .TowerTeam tower_team_list = 2;</code>
       */
      public Builder addTowerTeamList(
          int index, emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam value) {
        if (towerTeamListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTowerTeamListIsMutable();
          towerTeamList_.add(index, value);
          onChanged();
        } else {
          towerTeamListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .TowerTeam tower_team_list = 2;</code>
       */
      public Builder addTowerTeamList(
          emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam.Builder builderForValue) {
        if (towerTeamListBuilder_ == null) {
          ensureTowerTeamListIsMutable();
          towerTeamList_.add(builderForValue.build());
          onChanged();
        } else {
          towerTeamListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .TowerTeam tower_team_list = 2;</code>
       */
      public Builder addTowerTeamList(
          int index, emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam.Builder builderForValue) {
        if (towerTeamListBuilder_ == null) {
          ensureTowerTeamListIsMutable();
          towerTeamList_.add(index, builderForValue.build());
          onChanged();
        } else {
          towerTeamListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .TowerTeam tower_team_list = 2;</code>
       */
      public Builder addAllTowerTeamList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam> values) {
        if (towerTeamListBuilder_ == null) {
          ensureTowerTeamListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, towerTeamList_);
          onChanged();
        } else {
          towerTeamListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .TowerTeam tower_team_list = 2;</code>
       */
      public Builder clearTowerTeamList() {
        if (towerTeamListBuilder_ == null) {
          towerTeamList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          towerTeamListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .TowerTeam tower_team_list = 2;</code>
       */
      public Builder removeTowerTeamList(int index) {
        if (towerTeamListBuilder_ == null) {
          ensureTowerTeamListIsMutable();
          towerTeamList_.remove(index);
          onChanged();
        } else {
          towerTeamListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .TowerTeam tower_team_list = 2;</code>
       */
      public emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam.Builder getTowerTeamListBuilder(
          int index) {
        return getTowerTeamListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .TowerTeam tower_team_list = 2;</code>
       */
      public emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeamOrBuilder getTowerTeamListOrBuilder(
          int index) {
        if (towerTeamListBuilder_ == null) {
          return towerTeamList_.get(index);  } else {
          return towerTeamListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .TowerTeam tower_team_list = 2;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeamOrBuilder> 
           getTowerTeamListOrBuilderList() {
        if (towerTeamListBuilder_ != null) {
          return towerTeamListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(towerTeamList_);
        }
      }
      /**
       * <code>repeated .TowerTeam tower_team_list = 2;</code>
       */
      public emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam.Builder addTowerTeamListBuilder() {
        return getTowerTeamListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam.getDefaultInstance());
      }
      /**
       * <code>repeated .TowerTeam tower_team_list = 2;</code>
       */
      public emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam.Builder addTowerTeamListBuilder(
          int index) {
        return getTowerTeamListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam.getDefaultInstance());
      }
      /**
       * <code>repeated .TowerTeam tower_team_list = 2;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam.Builder> 
           getTowerTeamListBuilderList() {
        return getTowerTeamListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam, emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam.Builder, emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeamOrBuilder> 
          getTowerTeamListFieldBuilder() {
        if (towerTeamListBuilder_ == null) {
          towerTeamListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam, emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeam.Builder, emu.grasscutter.net.proto.TowerTeamOuterClass.TowerTeamOrBuilder>(
                  towerTeamList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          towerTeamList_ = null;
        }
        return towerTeamListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:TowerTeamSelectReq)
    }

    // @@protoc_insertion_point(class_scope:TowerTeamSelectReq)
    private static final emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq();
    }

    public static emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TowerTeamSelectReq>
        PARSER = new com.google.protobuf.AbstractParser<TowerTeamSelectReq>() {
      @java.lang.Override
      public TowerTeamSelectReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TowerTeamSelectReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TowerTeamSelectReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TowerTeamSelectReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.TowerTeamSelectReqOuterClass.TowerTeamSelectReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TowerTeamSelectReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TowerTeamSelectReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030TowerTeamSelectReq.proto\032\017TowerTeam.pr" +
      "oto\"\257\001\n\022TowerTeamSelectReq\022\020\n\010floor_id\030\017" +
      " \001(\r\022#\n\017tower_team_list\030\002 \003(\0132\n.TowerTea" +
      "m\"b\n\005CmdId\022\010\n\004NONE\020\000\022\023\n\017ENET_CHANNEL_ID\020" +
      "\000\022\024\n\020ENET_IS_RELIABLE\020\001\022\023\n\017IS_ALLOW_CLIE" +
      "NT\020\001\022\013\n\006CMD_ID\020\361\022\032\002\020\001B\033\n\031emu.grasscutter" +
      ".net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.TowerTeamOuterClass.getDescriptor(),
        });
    internal_static_TowerTeamSelectReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TowerTeamSelectReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TowerTeamSelectReq_descriptor,
        new java.lang.String[] { "FloorId", "TowerTeamList", });
    emu.grasscutter.net.proto.TowerTeamOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
