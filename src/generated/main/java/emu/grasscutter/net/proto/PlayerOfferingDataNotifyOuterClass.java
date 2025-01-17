// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerOfferingDataNotify.proto

package emu.grasscutter.net.proto;

public final class PlayerOfferingDataNotifyOuterClass {
  private PlayerOfferingDataNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerOfferingDataNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerOfferingDataNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .PlayerOfferingData offerings = 5;</code>
     */
    java.util.List<emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData> 
        getOfferingsList();
    /**
     * <code>repeated .PlayerOfferingData offerings = 5;</code>
     */
    emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData getOfferings(int index);
    /**
     * <code>repeated .PlayerOfferingData offerings = 5;</code>
     */
    int getOfferingsCount();
    /**
     * <code>repeated .PlayerOfferingData offerings = 5;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingDataOrBuilder> 
        getOfferingsOrBuilderList();
    /**
     * <code>repeated .PlayerOfferingData offerings = 5;</code>
     */
    emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingDataOrBuilder getOfferingsOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code PlayerOfferingDataNotify}
   */
  public static final class PlayerOfferingDataNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerOfferingDataNotify)
      PlayerOfferingDataNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerOfferingDataNotify.newBuilder() to construct.
    private PlayerOfferingDataNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerOfferingDataNotify() {
      offerings_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerOfferingDataNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PlayerOfferingDataNotify(
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
                offerings_ = new java.util.ArrayList<emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData>();
                mutable_bitField0_ |= 0x00000001;
              }
              offerings_.add(
                  input.readMessage(emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData.parser(), extensionRegistry));
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
          offerings_ = java.util.Collections.unmodifiableList(offerings_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.PlayerOfferingDataNotifyOuterClass.internal_static_PlayerOfferingDataNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PlayerOfferingDataNotifyOuterClass.internal_static_PlayerOfferingDataNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify.class, emu.grasscutter.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify.Builder.class);
    }

    public static final int OFFERINGS_FIELD_NUMBER = 5;
    private java.util.List<emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData> offerings_;
    /**
     * <code>repeated .PlayerOfferingData offerings = 5;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData> getOfferingsList() {
      return offerings_;
    }
    /**
     * <code>repeated .PlayerOfferingData offerings = 5;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingDataOrBuilder> 
        getOfferingsOrBuilderList() {
      return offerings_;
    }
    /**
     * <code>repeated .PlayerOfferingData offerings = 5;</code>
     */
    @java.lang.Override
    public int getOfferingsCount() {
      return offerings_.size();
    }
    /**
     * <code>repeated .PlayerOfferingData offerings = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData getOfferings(int index) {
      return offerings_.get(index);
    }
    /**
     * <code>repeated .PlayerOfferingData offerings = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingDataOrBuilder getOfferingsOrBuilder(
        int index) {
      return offerings_.get(index);
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
      for (int i = 0; i < offerings_.size(); i++) {
        output.writeMessage(5, offerings_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < offerings_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, offerings_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify other = (emu.grasscutter.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify) obj;

      if (!getOfferingsList()
          .equals(other.getOfferingsList())) return false;
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
      if (getOfferingsCount() > 0) {
        hash = (37 * hash) + OFFERINGS_FIELD_NUMBER;
        hash = (53 * hash) + getOfferingsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify prototype) {
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
     * Protobuf type {@code PlayerOfferingDataNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerOfferingDataNotify)
        emu.grasscutter.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PlayerOfferingDataNotifyOuterClass.internal_static_PlayerOfferingDataNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PlayerOfferingDataNotifyOuterClass.internal_static_PlayerOfferingDataNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify.class, emu.grasscutter.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify.newBuilder()
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
          getOfferingsFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (offeringsBuilder_ == null) {
          offerings_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          offeringsBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PlayerOfferingDataNotifyOuterClass.internal_static_PlayerOfferingDataNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify build() {
        emu.grasscutter.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify buildPartial() {
        emu.grasscutter.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify result = new emu.grasscutter.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify(this);
        int from_bitField0_ = bitField0_;
        if (offeringsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            offerings_ = java.util.Collections.unmodifiableList(offerings_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.offerings_ = offerings_;
        } else {
          result.offerings_ = offeringsBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify) {
          return mergeFrom((emu.grasscutter.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify other) {
        if (other == emu.grasscutter.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify.getDefaultInstance()) return this;
        if (offeringsBuilder_ == null) {
          if (!other.offerings_.isEmpty()) {
            if (offerings_.isEmpty()) {
              offerings_ = other.offerings_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureOfferingsIsMutable();
              offerings_.addAll(other.offerings_);
            }
            onChanged();
          }
        } else {
          if (!other.offerings_.isEmpty()) {
            if (offeringsBuilder_.isEmpty()) {
              offeringsBuilder_.dispose();
              offeringsBuilder_ = null;
              offerings_ = other.offerings_;
              bitField0_ = (bitField0_ & ~0x00000001);
              offeringsBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getOfferingsFieldBuilder() : null;
            } else {
              offeringsBuilder_.addAllMessages(other.offerings_);
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
        emu.grasscutter.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData> offerings_ =
        java.util.Collections.emptyList();
      private void ensureOfferingsIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          offerings_ = new java.util.ArrayList<emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData>(offerings_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData, emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData.Builder, emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingDataOrBuilder> offeringsBuilder_;

      /**
       * <code>repeated .PlayerOfferingData offerings = 5;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData> getOfferingsList() {
        if (offeringsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(offerings_);
        } else {
          return offeringsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .PlayerOfferingData offerings = 5;</code>
       */
      public int getOfferingsCount() {
        if (offeringsBuilder_ == null) {
          return offerings_.size();
        } else {
          return offeringsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .PlayerOfferingData offerings = 5;</code>
       */
      public emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData getOfferings(int index) {
        if (offeringsBuilder_ == null) {
          return offerings_.get(index);
        } else {
          return offeringsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .PlayerOfferingData offerings = 5;</code>
       */
      public Builder setOfferings(
          int index, emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData value) {
        if (offeringsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureOfferingsIsMutable();
          offerings_.set(index, value);
          onChanged();
        } else {
          offeringsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .PlayerOfferingData offerings = 5;</code>
       */
      public Builder setOfferings(
          int index, emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData.Builder builderForValue) {
        if (offeringsBuilder_ == null) {
          ensureOfferingsIsMutable();
          offerings_.set(index, builderForValue.build());
          onChanged();
        } else {
          offeringsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .PlayerOfferingData offerings = 5;</code>
       */
      public Builder addOfferings(emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData value) {
        if (offeringsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureOfferingsIsMutable();
          offerings_.add(value);
          onChanged();
        } else {
          offeringsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .PlayerOfferingData offerings = 5;</code>
       */
      public Builder addOfferings(
          int index, emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData value) {
        if (offeringsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureOfferingsIsMutable();
          offerings_.add(index, value);
          onChanged();
        } else {
          offeringsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .PlayerOfferingData offerings = 5;</code>
       */
      public Builder addOfferings(
          emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData.Builder builderForValue) {
        if (offeringsBuilder_ == null) {
          ensureOfferingsIsMutable();
          offerings_.add(builderForValue.build());
          onChanged();
        } else {
          offeringsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .PlayerOfferingData offerings = 5;</code>
       */
      public Builder addOfferings(
          int index, emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData.Builder builderForValue) {
        if (offeringsBuilder_ == null) {
          ensureOfferingsIsMutable();
          offerings_.add(index, builderForValue.build());
          onChanged();
        } else {
          offeringsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .PlayerOfferingData offerings = 5;</code>
       */
      public Builder addAllOfferings(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData> values) {
        if (offeringsBuilder_ == null) {
          ensureOfferingsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, offerings_);
          onChanged();
        } else {
          offeringsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .PlayerOfferingData offerings = 5;</code>
       */
      public Builder clearOfferings() {
        if (offeringsBuilder_ == null) {
          offerings_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          offeringsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .PlayerOfferingData offerings = 5;</code>
       */
      public Builder removeOfferings(int index) {
        if (offeringsBuilder_ == null) {
          ensureOfferingsIsMutable();
          offerings_.remove(index);
          onChanged();
        } else {
          offeringsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .PlayerOfferingData offerings = 5;</code>
       */
      public emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData.Builder getOfferingsBuilder(
          int index) {
        return getOfferingsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .PlayerOfferingData offerings = 5;</code>
       */
      public emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingDataOrBuilder getOfferingsOrBuilder(
          int index) {
        if (offeringsBuilder_ == null) {
          return offerings_.get(index);  } else {
          return offeringsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .PlayerOfferingData offerings = 5;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingDataOrBuilder> 
           getOfferingsOrBuilderList() {
        if (offeringsBuilder_ != null) {
          return offeringsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(offerings_);
        }
      }
      /**
       * <code>repeated .PlayerOfferingData offerings = 5;</code>
       */
      public emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData.Builder addOfferingsBuilder() {
        return getOfferingsFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData.getDefaultInstance());
      }
      /**
       * <code>repeated .PlayerOfferingData offerings = 5;</code>
       */
      public emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData.Builder addOfferingsBuilder(
          int index) {
        return getOfferingsFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData.getDefaultInstance());
      }
      /**
       * <code>repeated .PlayerOfferingData offerings = 5;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData.Builder> 
           getOfferingsBuilderList() {
        return getOfferingsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData, emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData.Builder, emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingDataOrBuilder> 
          getOfferingsFieldBuilder() {
        if (offeringsBuilder_ == null) {
          offeringsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData, emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData.Builder, emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingDataOrBuilder>(
                  offerings_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          offerings_ = null;
        }
        return offeringsBuilder_;
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


      // @@protoc_insertion_point(builder_scope:PlayerOfferingDataNotify)
    }

    // @@protoc_insertion_point(class_scope:PlayerOfferingDataNotify)
    private static final emu.grasscutter.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify();
    }

    public static emu.grasscutter.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerOfferingDataNotify>
        PARSER = new com.google.protobuf.AbstractParser<PlayerOfferingDataNotify>() {
      @java.lang.Override
      public PlayerOfferingDataNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlayerOfferingDataNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PlayerOfferingDataNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerOfferingDataNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerOfferingDataNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerOfferingDataNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036PlayerOfferingDataNotify.proto\032\030Player" +
      "OfferingData.proto\"B\n\030PlayerOfferingData" +
      "Notify\022&\n\tofferings\030\005 \003(\0132\023.PlayerOfferi" +
      "ngDataB\033\n\031emu.grasscutter.net.protob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.getDescriptor(),
        });
    internal_static_PlayerOfferingDataNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerOfferingDataNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerOfferingDataNotify_descriptor,
        new java.lang.String[] { "Offerings", });
    emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
