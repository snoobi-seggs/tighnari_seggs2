// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CombineReq.proto

package emu.grasscutter.net.proto;

public final class CombineReqOuterClass {
  private CombineReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CombineReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CombineReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 combine_id = 5;</code>
     * @return The combineId.
     */
    int getCombineId();

    /**
     * <code>uint32 combine_count = 3;</code>
     * @return The combineCount.
     */
    int getCombineCount();

    /**
     * <code>uint64 avatar_guid = 8;</code>
     * @return The avatarGuid.
     */
    long getAvatarGuid();
  }
  /**
   * Protobuf type {@code CombineReq}
   */
  public static final class CombineReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CombineReq)
      CombineReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CombineReq.newBuilder() to construct.
    private CombineReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CombineReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CombineReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CombineReq(
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

              combineCount_ = input.readUInt32();
              break;
            }
            case 40: {

              combineId_ = input.readUInt32();
              break;
            }
            case 64: {

              avatarGuid_ = input.readUInt64();
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
      return emu.grasscutter.net.proto.CombineReqOuterClass.internal_static_CombineReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CombineReqOuterClass.internal_static_CombineReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq.class, emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq.Builder.class);
    }

    /**
     * Protobuf enum {@code CombineReq.CmdId}
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
       * <code>CMD_ID = 654;</code>
       */
      CMD_ID(4, 654),
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
       * <code>CMD_ID = 654;</code>
       */
      public static final int CMD_ID_VALUE = 654;


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
          case 654: return CMD_ID;
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
        return emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq.getDescriptor().getEnumTypes().get(0);
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

      // @@protoc_insertion_point(enum_scope:CombineReq.CmdId)
    }

    public static final int COMBINE_ID_FIELD_NUMBER = 5;
    private int combineId_;
    /**
     * <code>uint32 combine_id = 5;</code>
     * @return The combineId.
     */
    @java.lang.Override
    public int getCombineId() {
      return combineId_;
    }

    public static final int COMBINE_COUNT_FIELD_NUMBER = 3;
    private int combineCount_;
    /**
     * <code>uint32 combine_count = 3;</code>
     * @return The combineCount.
     */
    @java.lang.Override
    public int getCombineCount() {
      return combineCount_;
    }

    public static final int AVATAR_GUID_FIELD_NUMBER = 8;
    private long avatarGuid_;
    /**
     * <code>uint64 avatar_guid = 8;</code>
     * @return The avatarGuid.
     */
    @java.lang.Override
    public long getAvatarGuid() {
      return avatarGuid_;
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
      if (combineCount_ != 0) {
        output.writeUInt32(3, combineCount_);
      }
      if (combineId_ != 0) {
        output.writeUInt32(5, combineId_);
      }
      if (avatarGuid_ != 0L) {
        output.writeUInt64(8, avatarGuid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (combineCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, combineCount_);
      }
      if (combineId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, combineId_);
      }
      if (avatarGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(8, avatarGuid_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq other = (emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq) obj;

      if (getCombineId()
          != other.getCombineId()) return false;
      if (getCombineCount()
          != other.getCombineCount()) return false;
      if (getAvatarGuid()
          != other.getAvatarGuid()) return false;
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
      hash = (37 * hash) + COMBINE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCombineId();
      hash = (37 * hash) + COMBINE_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getCombineCount();
      hash = (37 * hash) + AVATAR_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAvatarGuid());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq prototype) {
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
     * Protobuf type {@code CombineReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CombineReq)
        emu.grasscutter.net.proto.CombineReqOuterClass.CombineReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CombineReqOuterClass.internal_static_CombineReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CombineReqOuterClass.internal_static_CombineReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq.class, emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq.newBuilder()
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
        combineId_ = 0;

        combineCount_ = 0;

        avatarGuid_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CombineReqOuterClass.internal_static_CombineReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq build() {
        emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq buildPartial() {
        emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq result = new emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq(this);
        result.combineId_ = combineId_;
        result.combineCount_ = combineCount_;
        result.avatarGuid_ = avatarGuid_;
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
        if (other instanceof emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq) {
          return mergeFrom((emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq other) {
        if (other == emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq.getDefaultInstance()) return this;
        if (other.getCombineId() != 0) {
          setCombineId(other.getCombineId());
        }
        if (other.getCombineCount() != 0) {
          setCombineCount(other.getCombineCount());
        }
        if (other.getAvatarGuid() != 0L) {
          setAvatarGuid(other.getAvatarGuid());
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
        emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int combineId_ ;
      /**
       * <code>uint32 combine_id = 5;</code>
       * @return The combineId.
       */
      @java.lang.Override
      public int getCombineId() {
        return combineId_;
      }
      /**
       * <code>uint32 combine_id = 5;</code>
       * @param value The combineId to set.
       * @return This builder for chaining.
       */
      public Builder setCombineId(int value) {
        
        combineId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 combine_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearCombineId() {
        
        combineId_ = 0;
        onChanged();
        return this;
      }

      private int combineCount_ ;
      /**
       * <code>uint32 combine_count = 3;</code>
       * @return The combineCount.
       */
      @java.lang.Override
      public int getCombineCount() {
        return combineCount_;
      }
      /**
       * <code>uint32 combine_count = 3;</code>
       * @param value The combineCount to set.
       * @return This builder for chaining.
       */
      public Builder setCombineCount(int value) {
        
        combineCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 combine_count = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearCombineCount() {
        
        combineCount_ = 0;
        onChanged();
        return this;
      }

      private long avatarGuid_ ;
      /**
       * <code>uint64 avatar_guid = 8;</code>
       * @return The avatarGuid.
       */
      @java.lang.Override
      public long getAvatarGuid() {
        return avatarGuid_;
      }
      /**
       * <code>uint64 avatar_guid = 8;</code>
       * @param value The avatarGuid to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarGuid(long value) {
        
        avatarGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 avatar_guid = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarGuid() {
        
        avatarGuid_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:CombineReq)
    }

    // @@protoc_insertion_point(class_scope:CombineReq)
    private static final emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq();
    }

    public static emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CombineReq>
        PARSER = new com.google.protobuf.AbstractParser<CombineReq>() {
      @java.lang.Override
      public CombineReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CombineReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CombineReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CombineReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CombineReqOuterClass.CombineReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CombineReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CombineReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020CombineReq.proto\"\260\001\n\nCombineReq\022\022\n\ncom" +
      "bine_id\030\005 \001(\r\022\025\n\rcombine_count\030\003 \001(\r\022\023\n\013" +
      "avatar_guid\030\010 \001(\004\"b\n\005CmdId\022\010\n\004NONE\020\000\022\023\n\017" +
      "ENET_CHANNEL_ID\020\000\022\024\n\020ENET_IS_RELIABLE\020\001\022" +
      "\023\n\017IS_ALLOW_CLIENT\020\001\022\013\n\006CMD_ID\020\216\005\032\002\020\001B\033\n" +
      "\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CombineReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CombineReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CombineReq_descriptor,
        new java.lang.String[] { "CombineId", "CombineCount", "AvatarGuid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
