// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SetUpLunchBoxWidgetRsp.proto

package emu.grasscutter.net.proto;

public final class SetUpLunchBoxWidgetRspOuterClass {
  private SetUpLunchBoxWidgetRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SetUpLunchBoxWidgetRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SetUpLunchBoxWidgetRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.LunchBoxData lunch_box_data = 3;</code>
     * @return Whether the lunchBoxData field is set.
     */
    boolean hasLunchBoxData();
    /**
     * <code>.LunchBoxData lunch_box_data = 3;</code>
     * @return The lunchBoxData.
     */
    emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData getLunchBoxData();
    /**
     * <code>.LunchBoxData lunch_box_data = 3;</code>
     */
    emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxDataOrBuilder getLunchBoxDataOrBuilder();

    /**
     * <code>int32 retcode = 13;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 4294
   * EnetChannelId: 0
   * EnetIsReliable: false
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code SetUpLunchBoxWidgetRsp}
   */
  public static final class SetUpLunchBoxWidgetRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SetUpLunchBoxWidgetRsp)
      SetUpLunchBoxWidgetRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SetUpLunchBoxWidgetRsp.newBuilder() to construct.
    private SetUpLunchBoxWidgetRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SetUpLunchBoxWidgetRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SetUpLunchBoxWidgetRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SetUpLunchBoxWidgetRsp(
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
            case 26: {
              emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData.Builder subBuilder = null;
              if (lunchBoxData_ != null) {
                subBuilder = lunchBoxData_.toBuilder();
              }
              lunchBoxData_ = input.readMessage(emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(lunchBoxData_);
                lunchBoxData_ = subBuilder.buildPartial();
              }

              break;
            }
            case 104: {

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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.SetUpLunchBoxWidgetRspOuterClass.internal_static_SetUpLunchBoxWidgetRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SetUpLunchBoxWidgetRspOuterClass.internal_static_SetUpLunchBoxWidgetRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SetUpLunchBoxWidgetRspOuterClass.SetUpLunchBoxWidgetRsp.class, emu.grasscutter.net.proto.SetUpLunchBoxWidgetRspOuterClass.SetUpLunchBoxWidgetRsp.Builder.class);
    }

    public static final int LUNCH_BOX_DATA_FIELD_NUMBER = 3;
    private emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData lunchBoxData_;
    /**
     * <code>.LunchBoxData lunch_box_data = 3;</code>
     * @return Whether the lunchBoxData field is set.
     */
    @java.lang.Override
    public boolean hasLunchBoxData() {
      return lunchBoxData_ != null;
    }
    /**
     * <code>.LunchBoxData lunch_box_data = 3;</code>
     * @return The lunchBoxData.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData getLunchBoxData() {
      return lunchBoxData_ == null ? emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData.getDefaultInstance() : lunchBoxData_;
    }
    /**
     * <code>.LunchBoxData lunch_box_data = 3;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxDataOrBuilder getLunchBoxDataOrBuilder() {
      return getLunchBoxData();
    }

    public static final int RETCODE_FIELD_NUMBER = 13;
    private int retcode_;
    /**
     * <code>int32 retcode = 13;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      if (lunchBoxData_ != null) {
        output.writeMessage(3, getLunchBoxData());
      }
      if (retcode_ != 0) {
        output.writeInt32(13, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (lunchBoxData_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getLunchBoxData());
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(13, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SetUpLunchBoxWidgetRspOuterClass.SetUpLunchBoxWidgetRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SetUpLunchBoxWidgetRspOuterClass.SetUpLunchBoxWidgetRsp other = (emu.grasscutter.net.proto.SetUpLunchBoxWidgetRspOuterClass.SetUpLunchBoxWidgetRsp) obj;

      if (hasLunchBoxData() != other.hasLunchBoxData()) return false;
      if (hasLunchBoxData()) {
        if (!getLunchBoxData()
            .equals(other.getLunchBoxData())) return false;
      }
      if (getRetcode()
          != other.getRetcode()) return false;
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
      if (hasLunchBoxData()) {
        hash = (37 * hash) + LUNCH_BOX_DATA_FIELD_NUMBER;
        hash = (53 * hash) + getLunchBoxData().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SetUpLunchBoxWidgetRspOuterClass.SetUpLunchBoxWidgetRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetUpLunchBoxWidgetRspOuterClass.SetUpLunchBoxWidgetRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetUpLunchBoxWidgetRspOuterClass.SetUpLunchBoxWidgetRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetUpLunchBoxWidgetRspOuterClass.SetUpLunchBoxWidgetRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetUpLunchBoxWidgetRspOuterClass.SetUpLunchBoxWidgetRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetUpLunchBoxWidgetRspOuterClass.SetUpLunchBoxWidgetRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetUpLunchBoxWidgetRspOuterClass.SetUpLunchBoxWidgetRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetUpLunchBoxWidgetRspOuterClass.SetUpLunchBoxWidgetRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetUpLunchBoxWidgetRspOuterClass.SetUpLunchBoxWidgetRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetUpLunchBoxWidgetRspOuterClass.SetUpLunchBoxWidgetRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetUpLunchBoxWidgetRspOuterClass.SetUpLunchBoxWidgetRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetUpLunchBoxWidgetRspOuterClass.SetUpLunchBoxWidgetRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SetUpLunchBoxWidgetRspOuterClass.SetUpLunchBoxWidgetRsp prototype) {
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
     * CmdId: 4294
     * EnetChannelId: 0
     * EnetIsReliable: false
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code SetUpLunchBoxWidgetRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SetUpLunchBoxWidgetRsp)
        emu.grasscutter.net.proto.SetUpLunchBoxWidgetRspOuterClass.SetUpLunchBoxWidgetRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SetUpLunchBoxWidgetRspOuterClass.internal_static_SetUpLunchBoxWidgetRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SetUpLunchBoxWidgetRspOuterClass.internal_static_SetUpLunchBoxWidgetRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SetUpLunchBoxWidgetRspOuterClass.SetUpLunchBoxWidgetRsp.class, emu.grasscutter.net.proto.SetUpLunchBoxWidgetRspOuterClass.SetUpLunchBoxWidgetRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SetUpLunchBoxWidgetRspOuterClass.SetUpLunchBoxWidgetRsp.newBuilder()
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
        if (lunchBoxDataBuilder_ == null) {
          lunchBoxData_ = null;
        } else {
          lunchBoxData_ = null;
          lunchBoxDataBuilder_ = null;
        }
        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SetUpLunchBoxWidgetRspOuterClass.internal_static_SetUpLunchBoxWidgetRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetUpLunchBoxWidgetRspOuterClass.SetUpLunchBoxWidgetRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SetUpLunchBoxWidgetRspOuterClass.SetUpLunchBoxWidgetRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetUpLunchBoxWidgetRspOuterClass.SetUpLunchBoxWidgetRsp build() {
        emu.grasscutter.net.proto.SetUpLunchBoxWidgetRspOuterClass.SetUpLunchBoxWidgetRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetUpLunchBoxWidgetRspOuterClass.SetUpLunchBoxWidgetRsp buildPartial() {
        emu.grasscutter.net.proto.SetUpLunchBoxWidgetRspOuterClass.SetUpLunchBoxWidgetRsp result = new emu.grasscutter.net.proto.SetUpLunchBoxWidgetRspOuterClass.SetUpLunchBoxWidgetRsp(this);
        if (lunchBoxDataBuilder_ == null) {
          result.lunchBoxData_ = lunchBoxData_;
        } else {
          result.lunchBoxData_ = lunchBoxDataBuilder_.build();
        }
        result.retcode_ = retcode_;
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
        if (other instanceof emu.grasscutter.net.proto.SetUpLunchBoxWidgetRspOuterClass.SetUpLunchBoxWidgetRsp) {
          return mergeFrom((emu.grasscutter.net.proto.SetUpLunchBoxWidgetRspOuterClass.SetUpLunchBoxWidgetRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SetUpLunchBoxWidgetRspOuterClass.SetUpLunchBoxWidgetRsp other) {
        if (other == emu.grasscutter.net.proto.SetUpLunchBoxWidgetRspOuterClass.SetUpLunchBoxWidgetRsp.getDefaultInstance()) return this;
        if (other.hasLunchBoxData()) {
          mergeLunchBoxData(other.getLunchBoxData());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
        emu.grasscutter.net.proto.SetUpLunchBoxWidgetRspOuterClass.SetUpLunchBoxWidgetRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SetUpLunchBoxWidgetRspOuterClass.SetUpLunchBoxWidgetRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData lunchBoxData_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData, emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData.Builder, emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxDataOrBuilder> lunchBoxDataBuilder_;
      /**
       * <code>.LunchBoxData lunch_box_data = 3;</code>
       * @return Whether the lunchBoxData field is set.
       */
      public boolean hasLunchBoxData() {
        return lunchBoxDataBuilder_ != null || lunchBoxData_ != null;
      }
      /**
       * <code>.LunchBoxData lunch_box_data = 3;</code>
       * @return The lunchBoxData.
       */
      public emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData getLunchBoxData() {
        if (lunchBoxDataBuilder_ == null) {
          return lunchBoxData_ == null ? emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData.getDefaultInstance() : lunchBoxData_;
        } else {
          return lunchBoxDataBuilder_.getMessage();
        }
      }
      /**
       * <code>.LunchBoxData lunch_box_data = 3;</code>
       */
      public Builder setLunchBoxData(emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData value) {
        if (lunchBoxDataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          lunchBoxData_ = value;
          onChanged();
        } else {
          lunchBoxDataBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.LunchBoxData lunch_box_data = 3;</code>
       */
      public Builder setLunchBoxData(
          emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData.Builder builderForValue) {
        if (lunchBoxDataBuilder_ == null) {
          lunchBoxData_ = builderForValue.build();
          onChanged();
        } else {
          lunchBoxDataBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.LunchBoxData lunch_box_data = 3;</code>
       */
      public Builder mergeLunchBoxData(emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData value) {
        if (lunchBoxDataBuilder_ == null) {
          if (lunchBoxData_ != null) {
            lunchBoxData_ =
              emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData.newBuilder(lunchBoxData_).mergeFrom(value).buildPartial();
          } else {
            lunchBoxData_ = value;
          }
          onChanged();
        } else {
          lunchBoxDataBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.LunchBoxData lunch_box_data = 3;</code>
       */
      public Builder clearLunchBoxData() {
        if (lunchBoxDataBuilder_ == null) {
          lunchBoxData_ = null;
          onChanged();
        } else {
          lunchBoxData_ = null;
          lunchBoxDataBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.LunchBoxData lunch_box_data = 3;</code>
       */
      public emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData.Builder getLunchBoxDataBuilder() {
        
        onChanged();
        return getLunchBoxDataFieldBuilder().getBuilder();
      }
      /**
       * <code>.LunchBoxData lunch_box_data = 3;</code>
       */
      public emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxDataOrBuilder getLunchBoxDataOrBuilder() {
        if (lunchBoxDataBuilder_ != null) {
          return lunchBoxDataBuilder_.getMessageOrBuilder();
        } else {
          return lunchBoxData_ == null ?
              emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData.getDefaultInstance() : lunchBoxData_;
        }
      }
      /**
       * <code>.LunchBoxData lunch_box_data = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData, emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData.Builder, emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxDataOrBuilder> 
          getLunchBoxDataFieldBuilder() {
        if (lunchBoxDataBuilder_ == null) {
          lunchBoxDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData, emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxData.Builder, emu.grasscutter.net.proto.LunchBoxDataOuterClass.LunchBoxDataOrBuilder>(
                  getLunchBoxData(),
                  getParentForChildren(),
                  isClean());
          lunchBoxData_ = null;
        }
        return lunchBoxDataBuilder_;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 13;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 13;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SetUpLunchBoxWidgetRsp)
    }

    // @@protoc_insertion_point(class_scope:SetUpLunchBoxWidgetRsp)
    private static final emu.grasscutter.net.proto.SetUpLunchBoxWidgetRspOuterClass.SetUpLunchBoxWidgetRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SetUpLunchBoxWidgetRspOuterClass.SetUpLunchBoxWidgetRsp();
    }

    public static emu.grasscutter.net.proto.SetUpLunchBoxWidgetRspOuterClass.SetUpLunchBoxWidgetRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SetUpLunchBoxWidgetRsp>
        PARSER = new com.google.protobuf.AbstractParser<SetUpLunchBoxWidgetRsp>() {
      @java.lang.Override
      public SetUpLunchBoxWidgetRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SetUpLunchBoxWidgetRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SetUpLunchBoxWidgetRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SetUpLunchBoxWidgetRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SetUpLunchBoxWidgetRspOuterClass.SetUpLunchBoxWidgetRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SetUpLunchBoxWidgetRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SetUpLunchBoxWidgetRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034SetUpLunchBoxWidgetRsp.proto\032\022LunchBox" +
      "Data.proto\"P\n\026SetUpLunchBoxWidgetRsp\022%\n\016" +
      "lunch_box_data\030\003 \001(\0132\r.LunchBoxData\022\017\n\007r" +
      "etcode\030\r \001(\005B\033\n\031emu.grasscutter.net.prot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.LunchBoxDataOuterClass.getDescriptor(),
        });
    internal_static_SetUpLunchBoxWidgetRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SetUpLunchBoxWidgetRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SetUpLunchBoxWidgetRsp_descriptor,
        new java.lang.String[] { "LunchBoxData", "Retcode", });
    emu.grasscutter.net.proto.LunchBoxDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
