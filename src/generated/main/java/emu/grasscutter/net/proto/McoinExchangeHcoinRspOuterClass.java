// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: McoinExchangeHcoinRsp.proto

package emu.grasscutter.net.proto;

public final class McoinExchangeHcoinRspOuterClass {
  private McoinExchangeHcoinRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface McoinExchangeHcoinRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:McoinExchangeHcoinRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 9;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 mcoin_cost = 10;</code>
     * @return The mcoinCost.
     */
    int getMcoinCost();

    /**
     * <code>uint32 hcoin = 15;</code>
     * @return The hcoin.
     */
    int getHcoin();
  }
  /**
   * Protobuf type {@code McoinExchangeHcoinRsp}
   */
  public static final class McoinExchangeHcoinRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:McoinExchangeHcoinRsp)
      McoinExchangeHcoinRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use McoinExchangeHcoinRsp.newBuilder() to construct.
    private McoinExchangeHcoinRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private McoinExchangeHcoinRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new McoinExchangeHcoinRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private McoinExchangeHcoinRsp(
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
            case 72: {

              retcode_ = input.readInt32();
              break;
            }
            case 80: {

              mcoinCost_ = input.readUInt32();
              break;
            }
            case 120: {

              hcoin_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.internal_static_McoinExchangeHcoinRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.internal_static_McoinExchangeHcoinRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp.class, emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp.Builder.class);
    }

    /**
     * Protobuf enum {@code McoinExchangeHcoinRsp.CmdId}
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
       * <code>CMD_ID = 689;</code>
       */
      CMD_ID(3, 689),
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
       * <code>CMD_ID = 689;</code>
       */
      public static final int CMD_ID_VALUE = 689;


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
          case 689: return CMD_ID;
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
        return emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp.getDescriptor().getEnumTypes().get(0);
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

      // @@protoc_insertion_point(enum_scope:McoinExchangeHcoinRsp.CmdId)
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

    public static final int MCOIN_COST_FIELD_NUMBER = 10;
    private int mcoinCost_;
    /**
     * <code>uint32 mcoin_cost = 10;</code>
     * @return The mcoinCost.
     */
    @java.lang.Override
    public int getMcoinCost() {
      return mcoinCost_;
    }

    public static final int HCOIN_FIELD_NUMBER = 15;
    private int hcoin_;
    /**
     * <code>uint32 hcoin = 15;</code>
     * @return The hcoin.
     */
    @java.lang.Override
    public int getHcoin() {
      return hcoin_;
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
      if (retcode_ != 0) {
        output.writeInt32(9, retcode_);
      }
      if (mcoinCost_ != 0) {
        output.writeUInt32(10, mcoinCost_);
      }
      if (hcoin_ != 0) {
        output.writeUInt32(15, hcoin_);
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
      if (mcoinCost_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, mcoinCost_);
      }
      if (hcoin_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, hcoin_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp other = (emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getMcoinCost()
          != other.getMcoinCost()) return false;
      if (getHcoin()
          != other.getHcoin()) return false;
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
      hash = (37 * hash) + MCOIN_COST_FIELD_NUMBER;
      hash = (53 * hash) + getMcoinCost();
      hash = (37 * hash) + HCOIN_FIELD_NUMBER;
      hash = (53 * hash) + getHcoin();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp prototype) {
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
     * Protobuf type {@code McoinExchangeHcoinRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:McoinExchangeHcoinRsp)
        emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.internal_static_McoinExchangeHcoinRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.internal_static_McoinExchangeHcoinRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp.class, emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp.newBuilder()
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

        mcoinCost_ = 0;

        hcoin_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.internal_static_McoinExchangeHcoinRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp build() {
        emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp buildPartial() {
        emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp result = new emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp(this);
        result.retcode_ = retcode_;
        result.mcoinCost_ = mcoinCost_;
        result.hcoin_ = hcoin_;
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
        if (other instanceof emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp) {
          return mergeFrom((emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp other) {
        if (other == emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getMcoinCost() != 0) {
          setMcoinCost(other.getMcoinCost());
        }
        if (other.getHcoin() != 0) {
          setHcoin(other.getHcoin());
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
        emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

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

      private int mcoinCost_ ;
      /**
       * <code>uint32 mcoin_cost = 10;</code>
       * @return The mcoinCost.
       */
      @java.lang.Override
      public int getMcoinCost() {
        return mcoinCost_;
      }
      /**
       * <code>uint32 mcoin_cost = 10;</code>
       * @param value The mcoinCost to set.
       * @return This builder for chaining.
       */
      public Builder setMcoinCost(int value) {
        
        mcoinCost_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 mcoin_cost = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearMcoinCost() {
        
        mcoinCost_ = 0;
        onChanged();
        return this;
      }

      private int hcoin_ ;
      /**
       * <code>uint32 hcoin = 15;</code>
       * @return The hcoin.
       */
      @java.lang.Override
      public int getHcoin() {
        return hcoin_;
      }
      /**
       * <code>uint32 hcoin = 15;</code>
       * @param value The hcoin to set.
       * @return This builder for chaining.
       */
      public Builder setHcoin(int value) {
        
        hcoin_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 hcoin = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearHcoin() {
        
        hcoin_ = 0;
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


      // @@protoc_insertion_point(builder_scope:McoinExchangeHcoinRsp)
    }

    // @@protoc_insertion_point(class_scope:McoinExchangeHcoinRsp)
    private static final emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp();
    }

    public static emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<McoinExchangeHcoinRsp>
        PARSER = new com.google.protobuf.AbstractParser<McoinExchangeHcoinRsp>() {
      @java.lang.Override
      public McoinExchangeHcoinRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new McoinExchangeHcoinRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<McoinExchangeHcoinRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<McoinExchangeHcoinRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.McoinExchangeHcoinRspOuterClass.McoinExchangeHcoinRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_McoinExchangeHcoinRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_McoinExchangeHcoinRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033McoinExchangeHcoinRsp.proto\"\232\001\n\025McoinE" +
      "xchangeHcoinRsp\022\017\n\007retcode\030\t \001(\005\022\022\n\nmcoi" +
      "n_cost\030\n \001(\r\022\r\n\005hcoin\030\017 \001(\r\"M\n\005CmdId\022\010\n\004" +
      "NONE\020\000\022\023\n\017ENET_CHANNEL_ID\020\000\022\024\n\020ENET_IS_R" +
      "ELIABLE\020\001\022\013\n\006CMD_ID\020\261\005\032\002\020\001B\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_McoinExchangeHcoinRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_McoinExchangeHcoinRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_McoinExchangeHcoinRsp_descriptor,
        new java.lang.String[] { "Retcode", "McoinCost", "Hcoin", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
