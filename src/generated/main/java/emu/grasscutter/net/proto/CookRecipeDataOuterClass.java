// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CookRecipeData.proto

package emu.grasscutter.net.proto;

public final class CookRecipeDataOuterClass {
  private CookRecipeDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CookRecipeDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CookRecipeData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 recipe_id = 6;</code>
     * @return The recipeId.
     */
    int getRecipeId();

    /**
     * <code>uint32 proficiency = 12;</code>
     * @return The proficiency.
     */
    int getProficiency();
  }
  /**
   * Protobuf type {@code CookRecipeData}
   */
  public static final class CookRecipeData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CookRecipeData)
      CookRecipeDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CookRecipeData.newBuilder() to construct.
    private CookRecipeData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CookRecipeData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CookRecipeData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CookRecipeData(
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

              recipeId_ = input.readUInt32();
              break;
            }
            case 96: {

              proficiency_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.CookRecipeDataOuterClass.internal_static_CookRecipeData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CookRecipeDataOuterClass.internal_static_CookRecipeData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData.class, emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData.Builder.class);
    }

    public static final int RECIPE_ID_FIELD_NUMBER = 6;
    private int recipeId_;
    /**
     * <code>uint32 recipe_id = 6;</code>
     * @return The recipeId.
     */
    @java.lang.Override
    public int getRecipeId() {
      return recipeId_;
    }

    public static final int PROFICIENCY_FIELD_NUMBER = 12;
    private int proficiency_;
    /**
     * <code>uint32 proficiency = 12;</code>
     * @return The proficiency.
     */
    @java.lang.Override
    public int getProficiency() {
      return proficiency_;
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
      if (recipeId_ != 0) {
        output.writeUInt32(6, recipeId_);
      }
      if (proficiency_ != 0) {
        output.writeUInt32(12, proficiency_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (recipeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, recipeId_);
      }
      if (proficiency_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, proficiency_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData other = (emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData) obj;

      if (getRecipeId()
          != other.getRecipeId()) return false;
      if (getProficiency()
          != other.getProficiency()) return false;
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
      hash = (37 * hash) + RECIPE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRecipeId();
      hash = (37 * hash) + PROFICIENCY_FIELD_NUMBER;
      hash = (53 * hash) + getProficiency();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData prototype) {
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
     * Protobuf type {@code CookRecipeData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CookRecipeData)
        emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CookRecipeDataOuterClass.internal_static_CookRecipeData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CookRecipeDataOuterClass.internal_static_CookRecipeData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData.class, emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData.newBuilder()
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
        recipeId_ = 0;

        proficiency_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CookRecipeDataOuterClass.internal_static_CookRecipeData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData build() {
        emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData buildPartial() {
        emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData result = new emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData(this);
        result.recipeId_ = recipeId_;
        result.proficiency_ = proficiency_;
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
        if (other instanceof emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData) {
          return mergeFrom((emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData other) {
        if (other == emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData.getDefaultInstance()) return this;
        if (other.getRecipeId() != 0) {
          setRecipeId(other.getRecipeId());
        }
        if (other.getProficiency() != 0) {
          setProficiency(other.getProficiency());
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
        emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int recipeId_ ;
      /**
       * <code>uint32 recipe_id = 6;</code>
       * @return The recipeId.
       */
      @java.lang.Override
      public int getRecipeId() {
        return recipeId_;
      }
      /**
       * <code>uint32 recipe_id = 6;</code>
       * @param value The recipeId to set.
       * @return This builder for chaining.
       */
      public Builder setRecipeId(int value) {
        
        recipeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 recipe_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearRecipeId() {
        
        recipeId_ = 0;
        onChanged();
        return this;
      }

      private int proficiency_ ;
      /**
       * <code>uint32 proficiency = 12;</code>
       * @return The proficiency.
       */
      @java.lang.Override
      public int getProficiency() {
        return proficiency_;
      }
      /**
       * <code>uint32 proficiency = 12;</code>
       * @param value The proficiency to set.
       * @return This builder for chaining.
       */
      public Builder setProficiency(int value) {
        
        proficiency_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 proficiency = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearProficiency() {
        
        proficiency_ = 0;
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


      // @@protoc_insertion_point(builder_scope:CookRecipeData)
    }

    // @@protoc_insertion_point(class_scope:CookRecipeData)
    private static final emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData();
    }

    public static emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CookRecipeData>
        PARSER = new com.google.protobuf.AbstractParser<CookRecipeData>() {
      @java.lang.Override
      public CookRecipeData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CookRecipeData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CookRecipeData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CookRecipeData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CookRecipeDataOuterClass.CookRecipeData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CookRecipeData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CookRecipeData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024CookRecipeData.proto\"8\n\016CookRecipeData" +
      "\022\021\n\trecipe_id\030\006 \001(\r\022\023\n\013proficiency\030\014 \001(\r" +
      "B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CookRecipeData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CookRecipeData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CookRecipeData_descriptor,
        new java.lang.String[] { "RecipeId", "Proficiency", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
