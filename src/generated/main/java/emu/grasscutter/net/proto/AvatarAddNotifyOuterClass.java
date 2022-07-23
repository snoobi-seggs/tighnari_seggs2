// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarAddNotify.proto

package emu.grasscutter.net.proto;

public final class AvatarAddNotifyOuterClass {
  private AvatarAddNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarAddNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarAddNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.AvatarInfo avatar = 11;</code>
     * @return Whether the avatar field is set.
     */
    boolean hasAvatar();
    /**
     * <code>.AvatarInfo avatar = 11;</code>
     * @return The avatar.
     */
    emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo getAvatar();
    /**
     * <code>.AvatarInfo avatar = 11;</code>
     */
    emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfoOrBuilder getAvatarOrBuilder();

    /**
     * <code>bool is_in_team = 15;</code>
     * @return The isInTeam.
     */
    boolean getIsInTeam();
  }
  /**
   * <pre>
   * CmdId: 1757
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code AvatarAddNotify}
   */
  public static final class AvatarAddNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AvatarAddNotify)
      AvatarAddNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AvatarAddNotify.newBuilder() to construct.
    private AvatarAddNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AvatarAddNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AvatarAddNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AvatarAddNotify(
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
            case 90: {
              emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo.Builder subBuilder = null;
              if (avatar_ != null) {
                subBuilder = avatar_.toBuilder();
              }
              avatar_ = input.readMessage(emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(avatar_);
                avatar_ = subBuilder.buildPartial();
              }

              break;
            }
            case 120: {

              isInTeam_ = input.readBool();
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
      return emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.internal_static_AvatarAddNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.internal_static_AvatarAddNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify.class, emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify.Builder.class);
    }

    public static final int AVATAR_FIELD_NUMBER = 11;
    private emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo avatar_;
    /**
     * <code>.AvatarInfo avatar = 11;</code>
     * @return Whether the avatar field is set.
     */
    @java.lang.Override
    public boolean hasAvatar() {
      return avatar_ != null;
    }
    /**
     * <code>.AvatarInfo avatar = 11;</code>
     * @return The avatar.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo getAvatar() {
      return avatar_ == null ? emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo.getDefaultInstance() : avatar_;
    }
    /**
     * <code>.AvatarInfo avatar = 11;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfoOrBuilder getAvatarOrBuilder() {
      return getAvatar();
    }

    public static final int IS_IN_TEAM_FIELD_NUMBER = 15;
    private boolean isInTeam_;
    /**
     * <code>bool is_in_team = 15;</code>
     * @return The isInTeam.
     */
    @java.lang.Override
    public boolean getIsInTeam() {
      return isInTeam_;
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
      if (avatar_ != null) {
        output.writeMessage(11, getAvatar());
      }
      if (isInTeam_ != false) {
        output.writeBool(15, isInTeam_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (avatar_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, getAvatar());
      }
      if (isInTeam_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(15, isInTeam_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify other = (emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify) obj;

      if (hasAvatar() != other.hasAvatar()) return false;
      if (hasAvatar()) {
        if (!getAvatar()
            .equals(other.getAvatar())) return false;
      }
      if (getIsInTeam()
          != other.getIsInTeam()) return false;
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
      if (hasAvatar()) {
        hash = (37 * hash) + AVATAR_FIELD_NUMBER;
        hash = (53 * hash) + getAvatar().hashCode();
      }
      hash = (37 * hash) + IS_IN_TEAM_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsInTeam());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify prototype) {
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
     * CmdId: 1757
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code AvatarAddNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarAddNotify)
        emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.internal_static_AvatarAddNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.internal_static_AvatarAddNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify.class, emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify.newBuilder()
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
        if (avatarBuilder_ == null) {
          avatar_ = null;
        } else {
          avatar_ = null;
          avatarBuilder_ = null;
        }
        isInTeam_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.internal_static_AvatarAddNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify build() {
        emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify buildPartial() {
        emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify result = new emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify(this);
        if (avatarBuilder_ == null) {
          result.avatar_ = avatar_;
        } else {
          result.avatar_ = avatarBuilder_.build();
        }
        result.isInTeam_ = isInTeam_;
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
        if (other instanceof emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify) {
          return mergeFrom((emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify other) {
        if (other == emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify.getDefaultInstance()) return this;
        if (other.hasAvatar()) {
          mergeAvatar(other.getAvatar());
        }
        if (other.getIsInTeam() != false) {
          setIsInTeam(other.getIsInTeam());
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
        emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo avatar_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo, emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo.Builder, emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfoOrBuilder> avatarBuilder_;
      /**
       * <code>.AvatarInfo avatar = 11;</code>
       * @return Whether the avatar field is set.
       */
      public boolean hasAvatar() {
        return avatarBuilder_ != null || avatar_ != null;
      }
      /**
       * <code>.AvatarInfo avatar = 11;</code>
       * @return The avatar.
       */
      public emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo getAvatar() {
        if (avatarBuilder_ == null) {
          return avatar_ == null ? emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo.getDefaultInstance() : avatar_;
        } else {
          return avatarBuilder_.getMessage();
        }
      }
      /**
       * <code>.AvatarInfo avatar = 11;</code>
       */
      public Builder setAvatar(emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo value) {
        if (avatarBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          avatar_ = value;
          onChanged();
        } else {
          avatarBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.AvatarInfo avatar = 11;</code>
       */
      public Builder setAvatar(
          emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo.Builder builderForValue) {
        if (avatarBuilder_ == null) {
          avatar_ = builderForValue.build();
          onChanged();
        } else {
          avatarBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.AvatarInfo avatar = 11;</code>
       */
      public Builder mergeAvatar(emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo value) {
        if (avatarBuilder_ == null) {
          if (avatar_ != null) {
            avatar_ =
              emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo.newBuilder(avatar_).mergeFrom(value).buildPartial();
          } else {
            avatar_ = value;
          }
          onChanged();
        } else {
          avatarBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.AvatarInfo avatar = 11;</code>
       */
      public Builder clearAvatar() {
        if (avatarBuilder_ == null) {
          avatar_ = null;
          onChanged();
        } else {
          avatar_ = null;
          avatarBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.AvatarInfo avatar = 11;</code>
       */
      public emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo.Builder getAvatarBuilder() {
        
        onChanged();
        return getAvatarFieldBuilder().getBuilder();
      }
      /**
       * <code>.AvatarInfo avatar = 11;</code>
       */
      public emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfoOrBuilder getAvatarOrBuilder() {
        if (avatarBuilder_ != null) {
          return avatarBuilder_.getMessageOrBuilder();
        } else {
          return avatar_ == null ?
              emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo.getDefaultInstance() : avatar_;
        }
      }
      /**
       * <code>.AvatarInfo avatar = 11;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo, emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo.Builder, emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfoOrBuilder> 
          getAvatarFieldBuilder() {
        if (avatarBuilder_ == null) {
          avatarBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo, emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfo.Builder, emu.grasscutter.net.proto.AvatarInfoOuterClass.AvatarInfoOrBuilder>(
                  getAvatar(),
                  getParentForChildren(),
                  isClean());
          avatar_ = null;
        }
        return avatarBuilder_;
      }

      private boolean isInTeam_ ;
      /**
       * <code>bool is_in_team = 15;</code>
       * @return The isInTeam.
       */
      @java.lang.Override
      public boolean getIsInTeam() {
        return isInTeam_;
      }
      /**
       * <code>bool is_in_team = 15;</code>
       * @param value The isInTeam to set.
       * @return This builder for chaining.
       */
      public Builder setIsInTeam(boolean value) {
        
        isInTeam_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_in_team = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsInTeam() {
        
        isInTeam_ = false;
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


      // @@protoc_insertion_point(builder_scope:AvatarAddNotify)
    }

    // @@protoc_insertion_point(class_scope:AvatarAddNotify)
    private static final emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify();
    }

    public static emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarAddNotify>
        PARSER = new com.google.protobuf.AbstractParser<AvatarAddNotify>() {
      @java.lang.Override
      public AvatarAddNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AvatarAddNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AvatarAddNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AvatarAddNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AvatarAddNotifyOuterClass.AvatarAddNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarAddNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarAddNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025AvatarAddNotify.proto\032\020AvatarInfo.prot" +
      "o\"B\n\017AvatarAddNotify\022\033\n\006avatar\030\013 \001(\0132\013.A" +
      "vatarInfo\022\022\n\nis_in_team\030\017 \001(\010B\033\n\031emu.gra" +
      "sscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.AvatarInfoOuterClass.getDescriptor(),
        });
    internal_static_AvatarAddNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarAddNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarAddNotify_descriptor,
        new java.lang.String[] { "Avatar", "IsInTeam", });
    emu.grasscutter.net.proto.AvatarInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}