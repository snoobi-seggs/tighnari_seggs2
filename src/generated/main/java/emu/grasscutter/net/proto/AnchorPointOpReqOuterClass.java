// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AnchorPointOpReq.proto

package emu.grasscutter.net.proto;

public final class AnchorPointOpReqOuterClass {
  private AnchorPointOpReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AnchorPointOpReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AnchorPointOpReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 anchor_point_op_type = 6;</code>
     * @return The anchorPointOpType.
     */
    int getAnchorPointOpType();

    /**
     * <code>uint32 anchor_point_id = 1;</code>
     * @return The anchorPointId.
     */
    int getAnchorPointId();
  }
  /**
   * <pre>
   * CmdId: 4254
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code AnchorPointOpReq}
   */
  public static final class AnchorPointOpReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AnchorPointOpReq)
      AnchorPointOpReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AnchorPointOpReq.newBuilder() to construct.
    private AnchorPointOpReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AnchorPointOpReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AnchorPointOpReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AnchorPointOpReq(
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
            case 8: {

              anchorPointId_ = input.readUInt32();
              break;
            }
            case 48: {

              anchorPointOpType_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.AnchorPointOpReqOuterClass.internal_static_AnchorPointOpReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AnchorPointOpReqOuterClass.internal_static_AnchorPointOpReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AnchorPointOpReqOuterClass.AnchorPointOpReq.class, emu.grasscutter.net.proto.AnchorPointOpReqOuterClass.AnchorPointOpReq.Builder.class);
    }

    /**
     * Protobuf enum {@code AnchorPointOpReq.AnchorPointOpType}
     */
    public enum AnchorPointOpType
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>ANCHOR_POINT_OP_TYPE_NONE = 0;</code>
       */
      ANCHOR_POINT_OP_TYPE_NONE(0),
      /**
       * <code>ANCHOR_POINT_OP_TYPE_TELEPORT = 1;</code>
       */
      ANCHOR_POINT_OP_TYPE_TELEPORT(1),
      /**
       * <code>ANCHOR_POINT_OP_TYPE_REMOVE = 2;</code>
       */
      ANCHOR_POINT_OP_TYPE_REMOVE(2),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>ANCHOR_POINT_OP_TYPE_NONE = 0;</code>
       */
      public static final int ANCHOR_POINT_OP_TYPE_NONE_VALUE = 0;
      /**
       * <code>ANCHOR_POINT_OP_TYPE_TELEPORT = 1;</code>
       */
      public static final int ANCHOR_POINT_OP_TYPE_TELEPORT_VALUE = 1;
      /**
       * <code>ANCHOR_POINT_OP_TYPE_REMOVE = 2;</code>
       */
      public static final int ANCHOR_POINT_OP_TYPE_REMOVE_VALUE = 2;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
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
      public static AnchorPointOpType valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static AnchorPointOpType forNumber(int value) {
        switch (value) {
          case 0: return ANCHOR_POINT_OP_TYPE_NONE;
          case 1: return ANCHOR_POINT_OP_TYPE_TELEPORT;
          case 2: return ANCHOR_POINT_OP_TYPE_REMOVE;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<AnchorPointOpType>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          AnchorPointOpType> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<AnchorPointOpType>() {
              public AnchorPointOpType findValueByNumber(int number) {
                return AnchorPointOpType.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AnchorPointOpReqOuterClass.AnchorPointOpReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final AnchorPointOpType[] VALUES = values();

      public static AnchorPointOpType valueOf(
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

      private final int value;

      private AnchorPointOpType(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:AnchorPointOpReq.AnchorPointOpType)
    }

    public static final int ANCHOR_POINT_OP_TYPE_FIELD_NUMBER = 6;
    private int anchorPointOpType_;
    /**
     * <code>uint32 anchor_point_op_type = 6;</code>
     * @return The anchorPointOpType.
     */
    @java.lang.Override
    public int getAnchorPointOpType() {
      return anchorPointOpType_;
    }

    public static final int ANCHOR_POINT_ID_FIELD_NUMBER = 1;
    private int anchorPointId_;
    /**
     * <code>uint32 anchor_point_id = 1;</code>
     * @return The anchorPointId.
     */
    @java.lang.Override
    public int getAnchorPointId() {
      return anchorPointId_;
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
      if (anchorPointId_ != 0) {
        output.writeUInt32(1, anchorPointId_);
      }
      if (anchorPointOpType_ != 0) {
        output.writeUInt32(6, anchorPointOpType_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (anchorPointId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, anchorPointId_);
      }
      if (anchorPointOpType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, anchorPointOpType_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.AnchorPointOpReqOuterClass.AnchorPointOpReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AnchorPointOpReqOuterClass.AnchorPointOpReq other = (emu.grasscutter.net.proto.AnchorPointOpReqOuterClass.AnchorPointOpReq) obj;

      if (getAnchorPointOpType()
          != other.getAnchorPointOpType()) return false;
      if (getAnchorPointId()
          != other.getAnchorPointId()) return false;
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
      hash = (37 * hash) + ANCHOR_POINT_OP_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getAnchorPointOpType();
      hash = (37 * hash) + ANCHOR_POINT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAnchorPointId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AnchorPointOpReqOuterClass.AnchorPointOpReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AnchorPointOpReqOuterClass.AnchorPointOpReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AnchorPointOpReqOuterClass.AnchorPointOpReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AnchorPointOpReqOuterClass.AnchorPointOpReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AnchorPointOpReqOuterClass.AnchorPointOpReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AnchorPointOpReqOuterClass.AnchorPointOpReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AnchorPointOpReqOuterClass.AnchorPointOpReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AnchorPointOpReqOuterClass.AnchorPointOpReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AnchorPointOpReqOuterClass.AnchorPointOpReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AnchorPointOpReqOuterClass.AnchorPointOpReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AnchorPointOpReqOuterClass.AnchorPointOpReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AnchorPointOpReqOuterClass.AnchorPointOpReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AnchorPointOpReqOuterClass.AnchorPointOpReq prototype) {
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
     * <pre>
     * CmdId: 4254
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code AnchorPointOpReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AnchorPointOpReq)
        emu.grasscutter.net.proto.AnchorPointOpReqOuterClass.AnchorPointOpReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AnchorPointOpReqOuterClass.internal_static_AnchorPointOpReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AnchorPointOpReqOuterClass.internal_static_AnchorPointOpReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AnchorPointOpReqOuterClass.AnchorPointOpReq.class, emu.grasscutter.net.proto.AnchorPointOpReqOuterClass.AnchorPointOpReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AnchorPointOpReqOuterClass.AnchorPointOpReq.newBuilder()
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
        anchorPointOpType_ = 0;

        anchorPointId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AnchorPointOpReqOuterClass.internal_static_AnchorPointOpReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AnchorPointOpReqOuterClass.AnchorPointOpReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AnchorPointOpReqOuterClass.AnchorPointOpReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AnchorPointOpReqOuterClass.AnchorPointOpReq build() {
        emu.grasscutter.net.proto.AnchorPointOpReqOuterClass.AnchorPointOpReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AnchorPointOpReqOuterClass.AnchorPointOpReq buildPartial() {
        emu.grasscutter.net.proto.AnchorPointOpReqOuterClass.AnchorPointOpReq result = new emu.grasscutter.net.proto.AnchorPointOpReqOuterClass.AnchorPointOpReq(this);
        result.anchorPointOpType_ = anchorPointOpType_;
        result.anchorPointId_ = anchorPointId_;
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
        if (other instanceof emu.grasscutter.net.proto.AnchorPointOpReqOuterClass.AnchorPointOpReq) {
          return mergeFrom((emu.grasscutter.net.proto.AnchorPointOpReqOuterClass.AnchorPointOpReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AnchorPointOpReqOuterClass.AnchorPointOpReq other) {
        if (other == emu.grasscutter.net.proto.AnchorPointOpReqOuterClass.AnchorPointOpReq.getDefaultInstance()) return this;
        if (other.getAnchorPointOpType() != 0) {
          setAnchorPointOpType(other.getAnchorPointOpType());
        }
        if (other.getAnchorPointId() != 0) {
          setAnchorPointId(other.getAnchorPointId());
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
        emu.grasscutter.net.proto.AnchorPointOpReqOuterClass.AnchorPointOpReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.AnchorPointOpReqOuterClass.AnchorPointOpReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int anchorPointOpType_ ;
      /**
       * <code>uint32 anchor_point_op_type = 6;</code>
       * @return The anchorPointOpType.
       */
      @java.lang.Override
      public int getAnchorPointOpType() {
        return anchorPointOpType_;
      }
      /**
       * <code>uint32 anchor_point_op_type = 6;</code>
       * @param value The anchorPointOpType to set.
       * @return This builder for chaining.
       */
      public Builder setAnchorPointOpType(int value) {
        
        anchorPointOpType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 anchor_point_op_type = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearAnchorPointOpType() {
        
        anchorPointOpType_ = 0;
        onChanged();
        return this;
      }

      private int anchorPointId_ ;
      /**
       * <code>uint32 anchor_point_id = 1;</code>
       * @return The anchorPointId.
       */
      @java.lang.Override
      public int getAnchorPointId() {
        return anchorPointId_;
      }
      /**
       * <code>uint32 anchor_point_id = 1;</code>
       * @param value The anchorPointId to set.
       * @return This builder for chaining.
       */
      public Builder setAnchorPointId(int value) {
        
        anchorPointId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 anchor_point_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearAnchorPointId() {
        
        anchorPointId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:AnchorPointOpReq)
    }

    // @@protoc_insertion_point(class_scope:AnchorPointOpReq)
    private static final emu.grasscutter.net.proto.AnchorPointOpReqOuterClass.AnchorPointOpReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AnchorPointOpReqOuterClass.AnchorPointOpReq();
    }

    public static emu.grasscutter.net.proto.AnchorPointOpReqOuterClass.AnchorPointOpReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AnchorPointOpReq>
        PARSER = new com.google.protobuf.AbstractParser<AnchorPointOpReq>() {
      @java.lang.Override
      public AnchorPointOpReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AnchorPointOpReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AnchorPointOpReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AnchorPointOpReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AnchorPointOpReqOuterClass.AnchorPointOpReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AnchorPointOpReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AnchorPointOpReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026AnchorPointOpReq.proto\"\301\001\n\020AnchorPoint" +
      "OpReq\022\034\n\024anchor_point_op_type\030\006 \001(\r\022\027\n\017a" +
      "nchor_point_id\030\001 \001(\r\"v\n\021AnchorPointOpTyp" +
      "e\022\035\n\031ANCHOR_POINT_OP_TYPE_NONE\020\000\022!\n\035ANCH" +
      "OR_POINT_OP_TYPE_TELEPORT\020\001\022\037\n\033ANCHOR_PO" +
      "INT_OP_TYPE_REMOVE\020\002B\033\n\031emu.grasscutter." +
      "net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AnchorPointOpReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AnchorPointOpReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AnchorPointOpReq_descriptor,
        new java.lang.String[] { "AnchorPointOpType", "AnchorPointId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
