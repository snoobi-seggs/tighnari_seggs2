// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ItemHint.proto

package emu.grasscutter.net.proto;

public final class ItemHintOuterClass {
  private ItemHintOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ItemHintOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ItemHint)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 item_id = 7;</code>
     * @return The itemId.
     */
    int getItemId();

    /**
     * <code>uint32 count = 14;</code>
     * @return The count.
     */
    int getCount();

    /**
     * <code>bool is_new = 2;</code>
     * @return The isNew.
     */
    boolean getIsNew();

    /**
     * <code>uint64 guid = 15;</code>
     * @return The guid.
     */
    long getGuid();
  }
  /**
   * Protobuf type {@code ItemHint}
   */
  public static final class ItemHint extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ItemHint)
      ItemHintOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ItemHint.newBuilder() to construct.
    private ItemHint(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ItemHint() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ItemHint();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ItemHint(
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
            case 16: {

              isNew_ = input.readBool();
              break;
            }
            case 56: {

              itemId_ = input.readUInt32();
              break;
            }
            case 112: {

              count_ = input.readUInt32();
              break;
            }
            case 120: {

              guid_ = input.readUInt64();
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
      return emu.grasscutter.net.proto.ItemHintOuterClass.internal_static_ItemHint_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ItemHintOuterClass.internal_static_ItemHint_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ItemHintOuterClass.ItemHint.class, emu.grasscutter.net.proto.ItemHintOuterClass.ItemHint.Builder.class);
    }

    public static final int ITEM_ID_FIELD_NUMBER = 7;
    private int itemId_;
    /**
     * <code>uint32 item_id = 7;</code>
     * @return The itemId.
     */
    @java.lang.Override
    public int getItemId() {
      return itemId_;
    }

    public static final int COUNT_FIELD_NUMBER = 14;
    private int count_;
    /**
     * <code>uint32 count = 14;</code>
     * @return The count.
     */
    @java.lang.Override
    public int getCount() {
      return count_;
    }

    public static final int IS_NEW_FIELD_NUMBER = 2;
    private boolean isNew_;
    /**
     * <code>bool is_new = 2;</code>
     * @return The isNew.
     */
    @java.lang.Override
    public boolean getIsNew() {
      return isNew_;
    }

    public static final int GUID_FIELD_NUMBER = 15;
    private long guid_;
    /**
     * <code>uint64 guid = 15;</code>
     * @return The guid.
     */
    @java.lang.Override
    public long getGuid() {
      return guid_;
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
      if (isNew_ != false) {
        output.writeBool(2, isNew_);
      }
      if (itemId_ != 0) {
        output.writeUInt32(7, itemId_);
      }
      if (count_ != 0) {
        output.writeUInt32(14, count_);
      }
      if (guid_ != 0L) {
        output.writeUInt64(15, guid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isNew_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, isNew_);
      }
      if (itemId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, itemId_);
      }
      if (count_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, count_);
      }
      if (guid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(15, guid_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ItemHintOuterClass.ItemHint)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ItemHintOuterClass.ItemHint other = (emu.grasscutter.net.proto.ItemHintOuterClass.ItemHint) obj;

      if (getItemId()
          != other.getItemId()) return false;
      if (getCount()
          != other.getCount()) return false;
      if (getIsNew()
          != other.getIsNew()) return false;
      if (getGuid()
          != other.getGuid()) return false;
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
      hash = (37 * hash) + ITEM_ID_FIELD_NUMBER;
      hash = (53 * hash) + getItemId();
      hash = (37 * hash) + COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getCount();
      hash = (37 * hash) + IS_NEW_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsNew());
      hash = (37 * hash) + GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getGuid());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ItemHintOuterClass.ItemHint parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ItemHintOuterClass.ItemHint parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ItemHintOuterClass.ItemHint parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ItemHintOuterClass.ItemHint parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ItemHintOuterClass.ItemHint parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ItemHintOuterClass.ItemHint parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ItemHintOuterClass.ItemHint parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ItemHintOuterClass.ItemHint parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ItemHintOuterClass.ItemHint parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ItemHintOuterClass.ItemHint parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ItemHintOuterClass.ItemHint parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ItemHintOuterClass.ItemHint parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ItemHintOuterClass.ItemHint prototype) {
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
     * Protobuf type {@code ItemHint}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ItemHint)
        emu.grasscutter.net.proto.ItemHintOuterClass.ItemHintOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ItemHintOuterClass.internal_static_ItemHint_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ItemHintOuterClass.internal_static_ItemHint_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ItemHintOuterClass.ItemHint.class, emu.grasscutter.net.proto.ItemHintOuterClass.ItemHint.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ItemHintOuterClass.ItemHint.newBuilder()
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
        itemId_ = 0;

        count_ = 0;

        isNew_ = false;

        guid_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ItemHintOuterClass.internal_static_ItemHint_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ItemHintOuterClass.ItemHint getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ItemHintOuterClass.ItemHint.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ItemHintOuterClass.ItemHint build() {
        emu.grasscutter.net.proto.ItemHintOuterClass.ItemHint result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ItemHintOuterClass.ItemHint buildPartial() {
        emu.grasscutter.net.proto.ItemHintOuterClass.ItemHint result = new emu.grasscutter.net.proto.ItemHintOuterClass.ItemHint(this);
        result.itemId_ = itemId_;
        result.count_ = count_;
        result.isNew_ = isNew_;
        result.guid_ = guid_;
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
        if (other instanceof emu.grasscutter.net.proto.ItemHintOuterClass.ItemHint) {
          return mergeFrom((emu.grasscutter.net.proto.ItemHintOuterClass.ItemHint)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ItemHintOuterClass.ItemHint other) {
        if (other == emu.grasscutter.net.proto.ItemHintOuterClass.ItemHint.getDefaultInstance()) return this;
        if (other.getItemId() != 0) {
          setItemId(other.getItemId());
        }
        if (other.getCount() != 0) {
          setCount(other.getCount());
        }
        if (other.getIsNew() != false) {
          setIsNew(other.getIsNew());
        }
        if (other.getGuid() != 0L) {
          setGuid(other.getGuid());
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
        emu.grasscutter.net.proto.ItemHintOuterClass.ItemHint parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ItemHintOuterClass.ItemHint) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int itemId_ ;
      /**
       * <code>uint32 item_id = 7;</code>
       * @return The itemId.
       */
      @java.lang.Override
      public int getItemId() {
        return itemId_;
      }
      /**
       * <code>uint32 item_id = 7;</code>
       * @param value The itemId to set.
       * @return This builder for chaining.
       */
      public Builder setItemId(int value) {
        
        itemId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 item_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearItemId() {
        
        itemId_ = 0;
        onChanged();
        return this;
      }

      private int count_ ;
      /**
       * <code>uint32 count = 14;</code>
       * @return The count.
       */
      @java.lang.Override
      public int getCount() {
        return count_;
      }
      /**
       * <code>uint32 count = 14;</code>
       * @param value The count to set.
       * @return This builder for chaining.
       */
      public Builder setCount(int value) {
        
        count_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 count = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearCount() {
        
        count_ = 0;
        onChanged();
        return this;
      }

      private boolean isNew_ ;
      /**
       * <code>bool is_new = 2;</code>
       * @return The isNew.
       */
      @java.lang.Override
      public boolean getIsNew() {
        return isNew_;
      }
      /**
       * <code>bool is_new = 2;</code>
       * @param value The isNew to set.
       * @return This builder for chaining.
       */
      public Builder setIsNew(boolean value) {
        
        isNew_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_new = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsNew() {
        
        isNew_ = false;
        onChanged();
        return this;
      }

      private long guid_ ;
      /**
       * <code>uint64 guid = 15;</code>
       * @return The guid.
       */
      @java.lang.Override
      public long getGuid() {
        return guid_;
      }
      /**
       * <code>uint64 guid = 15;</code>
       * @param value The guid to set.
       * @return This builder for chaining.
       */
      public Builder setGuid(long value) {
        
        guid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 guid = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearGuid() {
        
        guid_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:ItemHint)
    }

    // @@protoc_insertion_point(class_scope:ItemHint)
    private static final emu.grasscutter.net.proto.ItemHintOuterClass.ItemHint DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ItemHintOuterClass.ItemHint();
    }

    public static emu.grasscutter.net.proto.ItemHintOuterClass.ItemHint getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ItemHint>
        PARSER = new com.google.protobuf.AbstractParser<ItemHint>() {
      @java.lang.Override
      public ItemHint parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ItemHint(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ItemHint> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ItemHint> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ItemHintOuterClass.ItemHint getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ItemHint_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ItemHint_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016ItemHint.proto\"H\n\010ItemHint\022\017\n\007item_id\030" +
      "\007 \001(\r\022\r\n\005count\030\016 \001(\r\022\016\n\006is_new\030\002 \001(\010\022\014\n\004" +
      "guid\030\017 \001(\004B\033\n\031emu.grasscutter.net.protob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ItemHint_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ItemHint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ItemHint_descriptor,
        new java.lang.String[] { "ItemId", "Count", "IsNew", "Guid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}