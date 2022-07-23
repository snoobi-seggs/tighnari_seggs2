// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChangeGameTimeReq.proto

package emu.grasscutter.net.proto;

public final class ChangeGameTimeReqOuterClass {
  private ChangeGameTimeReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChangeGameTimeReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChangeGameTimeReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 game_time = 9;</code>
     * @return The gameTime.
     */
    int getGameTime();

    /**
     * <code>bool is_force_set = 7;</code>
     * @return The isForceSet.
     */
    boolean getIsForceSet();

    /**
     * <code>uint32 extra_days = 6;</code>
     * @return The extraDays.
     */
    int getExtraDays();
  }
  /**
   * Protobuf type {@code ChangeGameTimeReq}
   */
  public static final class ChangeGameTimeReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChangeGameTimeReq)
      ChangeGameTimeReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChangeGameTimeReq.newBuilder() to construct.
    private ChangeGameTimeReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChangeGameTimeReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChangeGameTimeReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ChangeGameTimeReq(
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
            case 48: {

              extraDays_ = input.readUInt32();
              break;
            }
            case 56: {

              isForceSet_ = input.readBool();
              break;
            }
            case 72: {

              gameTime_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.internal_static_ChangeGameTimeReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.internal_static_ChangeGameTimeReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq.class, emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq.Builder.class);
    }

    /**
     * Protobuf enum {@code ChangeGameTimeReq.CmdId}
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
       * <code>CMD_ID = 149;</code>
       */
      CMD_ID(4, 149),
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
       * <code>CMD_ID = 149;</code>
       */
      public static final int CMD_ID_VALUE = 149;


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
          case 149: return CMD_ID;
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
        return emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq.getDescriptor().getEnumTypes().get(0);
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

      // @@protoc_insertion_point(enum_scope:ChangeGameTimeReq.CmdId)
    }

    public static final int GAME_TIME_FIELD_NUMBER = 9;
    private int gameTime_;
    /**
     * <code>uint32 game_time = 9;</code>
     * @return The gameTime.
     */
    @java.lang.Override
    public int getGameTime() {
      return gameTime_;
    }

    public static final int IS_FORCE_SET_FIELD_NUMBER = 7;
    private boolean isForceSet_;
    /**
     * <code>bool is_force_set = 7;</code>
     * @return The isForceSet.
     */
    @java.lang.Override
    public boolean getIsForceSet() {
      return isForceSet_;
    }

    public static final int EXTRA_DAYS_FIELD_NUMBER = 6;
    private int extraDays_;
    /**
     * <code>uint32 extra_days = 6;</code>
     * @return The extraDays.
     */
    @java.lang.Override
    public int getExtraDays() {
      return extraDays_;
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
      if (extraDays_ != 0) {
        output.writeUInt32(6, extraDays_);
      }
      if (isForceSet_ != false) {
        output.writeBool(7, isForceSet_);
      }
      if (gameTime_ != 0) {
        output.writeUInt32(9, gameTime_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (extraDays_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, extraDays_);
      }
      if (isForceSet_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, isForceSet_);
      }
      if (gameTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, gameTime_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq other = (emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq) obj;

      if (getGameTime()
          != other.getGameTime()) return false;
      if (getIsForceSet()
          != other.getIsForceSet()) return false;
      if (getExtraDays()
          != other.getExtraDays()) return false;
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
      hash = (37 * hash) + GAME_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getGameTime();
      hash = (37 * hash) + IS_FORCE_SET_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsForceSet());
      hash = (37 * hash) + EXTRA_DAYS_FIELD_NUMBER;
      hash = (53 * hash) + getExtraDays();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq prototype) {
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
     * Protobuf type {@code ChangeGameTimeReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChangeGameTimeReq)
        emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.internal_static_ChangeGameTimeReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.internal_static_ChangeGameTimeReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq.class, emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq.newBuilder()
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
        gameTime_ = 0;

        isForceSet_ = false;

        extraDays_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.internal_static_ChangeGameTimeReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq build() {
        emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq buildPartial() {
        emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq result = new emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq(this);
        result.gameTime_ = gameTime_;
        result.isForceSet_ = isForceSet_;
        result.extraDays_ = extraDays_;
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
        if (other instanceof emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq) {
          return mergeFrom((emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq other) {
        if (other == emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq.getDefaultInstance()) return this;
        if (other.getGameTime() != 0) {
          setGameTime(other.getGameTime());
        }
        if (other.getIsForceSet() != false) {
          setIsForceSet(other.getIsForceSet());
        }
        if (other.getExtraDays() != 0) {
          setExtraDays(other.getExtraDays());
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
        emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int gameTime_ ;
      /**
       * <code>uint32 game_time = 9;</code>
       * @return The gameTime.
       */
      @java.lang.Override
      public int getGameTime() {
        return gameTime_;
      }
      /**
       * <code>uint32 game_time = 9;</code>
       * @param value The gameTime to set.
       * @return This builder for chaining.
       */
      public Builder setGameTime(int value) {
        
        gameTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 game_time = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearGameTime() {
        
        gameTime_ = 0;
        onChanged();
        return this;
      }

      private boolean isForceSet_ ;
      /**
       * <code>bool is_force_set = 7;</code>
       * @return The isForceSet.
       */
      @java.lang.Override
      public boolean getIsForceSet() {
        return isForceSet_;
      }
      /**
       * <code>bool is_force_set = 7;</code>
       * @param value The isForceSet to set.
       * @return This builder for chaining.
       */
      public Builder setIsForceSet(boolean value) {
        
        isForceSet_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_force_set = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsForceSet() {
        
        isForceSet_ = false;
        onChanged();
        return this;
      }

      private int extraDays_ ;
      /**
       * <code>uint32 extra_days = 6;</code>
       * @return The extraDays.
       */
      @java.lang.Override
      public int getExtraDays() {
        return extraDays_;
      }
      /**
       * <code>uint32 extra_days = 6;</code>
       * @param value The extraDays to set.
       * @return This builder for chaining.
       */
      public Builder setExtraDays(int value) {
        
        extraDays_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 extra_days = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearExtraDays() {
        
        extraDays_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ChangeGameTimeReq)
    }

    // @@protoc_insertion_point(class_scope:ChangeGameTimeReq)
    private static final emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq();
    }

    public static emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChangeGameTimeReq>
        PARSER = new com.google.protobuf.AbstractParser<ChangeGameTimeReq>() {
      @java.lang.Override
      public ChangeGameTimeReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChangeGameTimeReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ChangeGameTimeReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChangeGameTimeReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChangeGameTimeReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChangeGameTimeReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027ChangeGameTimeReq.proto\"\264\001\n\021ChangeGame" +
      "TimeReq\022\021\n\tgame_time\030\t \001(\r\022\024\n\014is_force_s" +
      "et\030\007 \001(\010\022\022\n\nextra_days\030\006 \001(\r\"b\n\005CmdId\022\010\n" +
      "\004NONE\020\000\022\023\n\017ENET_CHANNEL_ID\020\000\022\024\n\020ENET_IS_" +
      "RELIABLE\020\001\022\023\n\017IS_ALLOW_CLIENT\020\001\022\013\n\006CMD_I" +
      "D\020\225\001\032\002\020\001B\033\n\031emu.grasscutter.net.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ChangeGameTimeReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChangeGameTimeReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChangeGameTimeReq_descriptor,
        new java.lang.String[] { "GameTime", "IsForceSet", "ExtraDays", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
