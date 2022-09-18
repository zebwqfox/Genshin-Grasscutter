// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BattlePassMissionUpdateNotify.proto

package emu.grasscutter.net.proto;

public final class BattlePassMissionUpdateNotifyOuterClass {
  private BattlePassMissionUpdateNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BattlePassMissionUpdateNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BattlePassMissionUpdateNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .BattlePassMission mission_list = 1;</code>
     */
    java.util.List<emu.grasscutter.net.proto.BattlePassMissionOuterClass.BattlePassMission> 
        getMissionListList();
    /**
     * <code>repeated .BattlePassMission mission_list = 1;</code>
     */
    emu.grasscutter.net.proto.BattlePassMissionOuterClass.BattlePassMission getMissionList(int index);
    /**
     * <code>repeated .BattlePassMission mission_list = 1;</code>
     */
    int getMissionListCount();
    /**
     * <code>repeated .BattlePassMission mission_list = 1;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.BattlePassMissionOuterClass.BattlePassMissionOrBuilder> 
        getMissionListOrBuilderList();
    /**
     * <code>repeated .BattlePassMission mission_list = 1;</code>
     */
    emu.grasscutter.net.proto.BattlePassMissionOuterClass.BattlePassMissionOrBuilder getMissionListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 2618
   * EnetChannelId: 0
   * EnetIsReliable: false
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code BattlePassMissionUpdateNotify}
   */
  public static final class BattlePassMissionUpdateNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BattlePassMissionUpdateNotify)
      BattlePassMissionUpdateNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BattlePassMissionUpdateNotify.newBuilder() to construct.
    private BattlePassMissionUpdateNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BattlePassMissionUpdateNotify() {
      missionList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BattlePassMissionUpdateNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BattlePassMissionUpdateNotify(
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
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                missionList_ = new java.util.ArrayList<emu.grasscutter.net.proto.BattlePassMissionOuterClass.BattlePassMission>();
                mutable_bitField0_ |= 0x00000001;
              }
              missionList_.add(
                  input.readMessage(emu.grasscutter.net.proto.BattlePassMissionOuterClass.BattlePassMission.parser(), extensionRegistry));
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
          missionList_ = java.util.Collections.unmodifiableList(missionList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.BattlePassMissionUpdateNotifyOuterClass.internal_static_BattlePassMissionUpdateNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.BattlePassMissionUpdateNotifyOuterClass.internal_static_BattlePassMissionUpdateNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.BattlePassMissionUpdateNotifyOuterClass.BattlePassMissionUpdateNotify.class, emu.grasscutter.net.proto.BattlePassMissionUpdateNotifyOuterClass.BattlePassMissionUpdateNotify.Builder.class);
    }

    public static final int MISSION_LIST_FIELD_NUMBER = 1;
    private java.util.List<emu.grasscutter.net.proto.BattlePassMissionOuterClass.BattlePassMission> missionList_;
    /**
     * <code>repeated .BattlePassMission mission_list = 1;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.BattlePassMissionOuterClass.BattlePassMission> getMissionListList() {
      return missionList_;
    }
    /**
     * <code>repeated .BattlePassMission mission_list = 1;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.BattlePassMissionOuterClass.BattlePassMissionOrBuilder> 
        getMissionListOrBuilderList() {
      return missionList_;
    }
    /**
     * <code>repeated .BattlePassMission mission_list = 1;</code>
     */
    @java.lang.Override
    public int getMissionListCount() {
      return missionList_.size();
    }
    /**
     * <code>repeated .BattlePassMission mission_list = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.BattlePassMissionOuterClass.BattlePassMission getMissionList(int index) {
      return missionList_.get(index);
    }
    /**
     * <code>repeated .BattlePassMission mission_list = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.BattlePassMissionOuterClass.BattlePassMissionOrBuilder getMissionListOrBuilder(
        int index) {
      return missionList_.get(index);
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
      for (int i = 0; i < missionList_.size(); i++) {
        output.writeMessage(1, missionList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < missionList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, missionList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.BattlePassMissionUpdateNotifyOuterClass.BattlePassMissionUpdateNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.BattlePassMissionUpdateNotifyOuterClass.BattlePassMissionUpdateNotify other = (emu.grasscutter.net.proto.BattlePassMissionUpdateNotifyOuterClass.BattlePassMissionUpdateNotify) obj;

      if (!getMissionListList()
          .equals(other.getMissionListList())) return false;
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
      if (getMissionListCount() > 0) {
        hash = (37 * hash) + MISSION_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getMissionListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.BattlePassMissionUpdateNotifyOuterClass.BattlePassMissionUpdateNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BattlePassMissionUpdateNotifyOuterClass.BattlePassMissionUpdateNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BattlePassMissionUpdateNotifyOuterClass.BattlePassMissionUpdateNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BattlePassMissionUpdateNotifyOuterClass.BattlePassMissionUpdateNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BattlePassMissionUpdateNotifyOuterClass.BattlePassMissionUpdateNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BattlePassMissionUpdateNotifyOuterClass.BattlePassMissionUpdateNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BattlePassMissionUpdateNotifyOuterClass.BattlePassMissionUpdateNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BattlePassMissionUpdateNotifyOuterClass.BattlePassMissionUpdateNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BattlePassMissionUpdateNotifyOuterClass.BattlePassMissionUpdateNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BattlePassMissionUpdateNotifyOuterClass.BattlePassMissionUpdateNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BattlePassMissionUpdateNotifyOuterClass.BattlePassMissionUpdateNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BattlePassMissionUpdateNotifyOuterClass.BattlePassMissionUpdateNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.BattlePassMissionUpdateNotifyOuterClass.BattlePassMissionUpdateNotify prototype) {
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
     * CmdId: 2618
     * EnetChannelId: 0
     * EnetIsReliable: false
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code BattlePassMissionUpdateNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BattlePassMissionUpdateNotify)
        emu.grasscutter.net.proto.BattlePassMissionUpdateNotifyOuterClass.BattlePassMissionUpdateNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.BattlePassMissionUpdateNotifyOuterClass.internal_static_BattlePassMissionUpdateNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.BattlePassMissionUpdateNotifyOuterClass.internal_static_BattlePassMissionUpdateNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.BattlePassMissionUpdateNotifyOuterClass.BattlePassMissionUpdateNotify.class, emu.grasscutter.net.proto.BattlePassMissionUpdateNotifyOuterClass.BattlePassMissionUpdateNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.BattlePassMissionUpdateNotifyOuterClass.BattlePassMissionUpdateNotify.newBuilder()
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
          getMissionListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (missionListBuilder_ == null) {
          missionList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          missionListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.BattlePassMissionUpdateNotifyOuterClass.internal_static_BattlePassMissionUpdateNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BattlePassMissionUpdateNotifyOuterClass.BattlePassMissionUpdateNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.BattlePassMissionUpdateNotifyOuterClass.BattlePassMissionUpdateNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BattlePassMissionUpdateNotifyOuterClass.BattlePassMissionUpdateNotify build() {
        emu.grasscutter.net.proto.BattlePassMissionUpdateNotifyOuterClass.BattlePassMissionUpdateNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BattlePassMissionUpdateNotifyOuterClass.BattlePassMissionUpdateNotify buildPartial() {
        emu.grasscutter.net.proto.BattlePassMissionUpdateNotifyOuterClass.BattlePassMissionUpdateNotify result = new emu.grasscutter.net.proto.BattlePassMissionUpdateNotifyOuterClass.BattlePassMissionUpdateNotify(this);
        int from_bitField0_ = bitField0_;
        if (missionListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            missionList_ = java.util.Collections.unmodifiableList(missionList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.missionList_ = missionList_;
        } else {
          result.missionList_ = missionListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.BattlePassMissionUpdateNotifyOuterClass.BattlePassMissionUpdateNotify) {
          return mergeFrom((emu.grasscutter.net.proto.BattlePassMissionUpdateNotifyOuterClass.BattlePassMissionUpdateNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.BattlePassMissionUpdateNotifyOuterClass.BattlePassMissionUpdateNotify other) {
        if (other == emu.grasscutter.net.proto.BattlePassMissionUpdateNotifyOuterClass.BattlePassMissionUpdateNotify.getDefaultInstance()) return this;
        if (missionListBuilder_ == null) {
          if (!other.missionList_.isEmpty()) {
            if (missionList_.isEmpty()) {
              missionList_ = other.missionList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureMissionListIsMutable();
              missionList_.addAll(other.missionList_);
            }
            onChanged();
          }
        } else {
          if (!other.missionList_.isEmpty()) {
            if (missionListBuilder_.isEmpty()) {
              missionListBuilder_.dispose();
              missionListBuilder_ = null;
              missionList_ = other.missionList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              missionListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getMissionListFieldBuilder() : null;
            } else {
              missionListBuilder_.addAllMessages(other.missionList_);
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
        emu.grasscutter.net.proto.BattlePassMissionUpdateNotifyOuterClass.BattlePassMissionUpdateNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.BattlePassMissionUpdateNotifyOuterClass.BattlePassMissionUpdateNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.BattlePassMissionOuterClass.BattlePassMission> missionList_ =
        java.util.Collections.emptyList();
      private void ensureMissionListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          missionList_ = new java.util.ArrayList<emu.grasscutter.net.proto.BattlePassMissionOuterClass.BattlePassMission>(missionList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.BattlePassMissionOuterClass.BattlePassMission, emu.grasscutter.net.proto.BattlePassMissionOuterClass.BattlePassMission.Builder, emu.grasscutter.net.proto.BattlePassMissionOuterClass.BattlePassMissionOrBuilder> missionListBuilder_;

      /**
       * <code>repeated .BattlePassMission mission_list = 1;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.BattlePassMissionOuterClass.BattlePassMission> getMissionListList() {
        if (missionListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(missionList_);
        } else {
          return missionListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .BattlePassMission mission_list = 1;</code>
       */
      public int getMissionListCount() {
        if (missionListBuilder_ == null) {
          return missionList_.size();
        } else {
          return missionListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .BattlePassMission mission_list = 1;</code>
       */
      public emu.grasscutter.net.proto.BattlePassMissionOuterClass.BattlePassMission getMissionList(int index) {
        if (missionListBuilder_ == null) {
          return missionList_.get(index);
        } else {
          return missionListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .BattlePassMission mission_list = 1;</code>
       */
      public Builder setMissionList(
          int index, emu.grasscutter.net.proto.BattlePassMissionOuterClass.BattlePassMission value) {
        if (missionListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMissionListIsMutable();
          missionList_.set(index, value);
          onChanged();
        } else {
          missionListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .BattlePassMission mission_list = 1;</code>
       */
      public Builder setMissionList(
          int index, emu.grasscutter.net.proto.BattlePassMissionOuterClass.BattlePassMission.Builder builderForValue) {
        if (missionListBuilder_ == null) {
          ensureMissionListIsMutable();
          missionList_.set(index, builderForValue.build());
          onChanged();
        } else {
          missionListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .BattlePassMission mission_list = 1;</code>
       */
      public Builder addMissionList(emu.grasscutter.net.proto.BattlePassMissionOuterClass.BattlePassMission value) {
        if (missionListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMissionListIsMutable();
          missionList_.add(value);
          onChanged();
        } else {
          missionListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .BattlePassMission mission_list = 1;</code>
       */
      public Builder addMissionList(
          int index, emu.grasscutter.net.proto.BattlePassMissionOuterClass.BattlePassMission value) {
        if (missionListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMissionListIsMutable();
          missionList_.add(index, value);
          onChanged();
        } else {
          missionListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .BattlePassMission mission_list = 1;</code>
       */
      public Builder addMissionList(
          emu.grasscutter.net.proto.BattlePassMissionOuterClass.BattlePassMission.Builder builderForValue) {
        if (missionListBuilder_ == null) {
          ensureMissionListIsMutable();
          missionList_.add(builderForValue.build());
          onChanged();
        } else {
          missionListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .BattlePassMission mission_list = 1;</code>
       */
      public Builder addMissionList(
          int index, emu.grasscutter.net.proto.BattlePassMissionOuterClass.BattlePassMission.Builder builderForValue) {
        if (missionListBuilder_ == null) {
          ensureMissionListIsMutable();
          missionList_.add(index, builderForValue.build());
          onChanged();
        } else {
          missionListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .BattlePassMission mission_list = 1;</code>
       */
      public Builder addAllMissionList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.BattlePassMissionOuterClass.BattlePassMission> values) {
        if (missionListBuilder_ == null) {
          ensureMissionListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, missionList_);
          onChanged();
        } else {
          missionListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .BattlePassMission mission_list = 1;</code>
       */
      public Builder clearMissionList() {
        if (missionListBuilder_ == null) {
          missionList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          missionListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .BattlePassMission mission_list = 1;</code>
       */
      public Builder removeMissionList(int index) {
        if (missionListBuilder_ == null) {
          ensureMissionListIsMutable();
          missionList_.remove(index);
          onChanged();
        } else {
          missionListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .BattlePassMission mission_list = 1;</code>
       */
      public emu.grasscutter.net.proto.BattlePassMissionOuterClass.BattlePassMission.Builder getMissionListBuilder(
          int index) {
        return getMissionListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .BattlePassMission mission_list = 1;</code>
       */
      public emu.grasscutter.net.proto.BattlePassMissionOuterClass.BattlePassMissionOrBuilder getMissionListOrBuilder(
          int index) {
        if (missionListBuilder_ == null) {
          return missionList_.get(index);  } else {
          return missionListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .BattlePassMission mission_list = 1;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.BattlePassMissionOuterClass.BattlePassMissionOrBuilder> 
           getMissionListOrBuilderList() {
        if (missionListBuilder_ != null) {
          return missionListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(missionList_);
        }
      }
      /**
       * <code>repeated .BattlePassMission mission_list = 1;</code>
       */
      public emu.grasscutter.net.proto.BattlePassMissionOuterClass.BattlePassMission.Builder addMissionListBuilder() {
        return getMissionListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.BattlePassMissionOuterClass.BattlePassMission.getDefaultInstance());
      }
      /**
       * <code>repeated .BattlePassMission mission_list = 1;</code>
       */
      public emu.grasscutter.net.proto.BattlePassMissionOuterClass.BattlePassMission.Builder addMissionListBuilder(
          int index) {
        return getMissionListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.BattlePassMissionOuterClass.BattlePassMission.getDefaultInstance());
      }
      /**
       * <code>repeated .BattlePassMission mission_list = 1;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.BattlePassMissionOuterClass.BattlePassMission.Builder> 
           getMissionListBuilderList() {
        return getMissionListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.BattlePassMissionOuterClass.BattlePassMission, emu.grasscutter.net.proto.BattlePassMissionOuterClass.BattlePassMission.Builder, emu.grasscutter.net.proto.BattlePassMissionOuterClass.BattlePassMissionOrBuilder> 
          getMissionListFieldBuilder() {
        if (missionListBuilder_ == null) {
          missionListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.BattlePassMissionOuterClass.BattlePassMission, emu.grasscutter.net.proto.BattlePassMissionOuterClass.BattlePassMission.Builder, emu.grasscutter.net.proto.BattlePassMissionOuterClass.BattlePassMissionOrBuilder>(
                  missionList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          missionList_ = null;
        }
        return missionListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:BattlePassMissionUpdateNotify)
    }

    // @@protoc_insertion_point(class_scope:BattlePassMissionUpdateNotify)
    private static final emu.grasscutter.net.proto.BattlePassMissionUpdateNotifyOuterClass.BattlePassMissionUpdateNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.BattlePassMissionUpdateNotifyOuterClass.BattlePassMissionUpdateNotify();
    }

    public static emu.grasscutter.net.proto.BattlePassMissionUpdateNotifyOuterClass.BattlePassMissionUpdateNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BattlePassMissionUpdateNotify>
        PARSER = new com.google.protobuf.AbstractParser<BattlePassMissionUpdateNotify>() {
      @java.lang.Override
      public BattlePassMissionUpdateNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BattlePassMissionUpdateNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BattlePassMissionUpdateNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BattlePassMissionUpdateNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.BattlePassMissionUpdateNotifyOuterClass.BattlePassMissionUpdateNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BattlePassMissionUpdateNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BattlePassMissionUpdateNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#BattlePassMissionUpdateNotify.proto\032\027B" +
      "attlePassMission.proto\"I\n\035BattlePassMiss" +
      "ionUpdateNotify\022(\n\014mission_list\030\001 \003(\0132\022." +
      "BattlePassMissionB\033\n\031emu.grasscutter.net" +
      ".protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.BattlePassMissionOuterClass.getDescriptor(),
        });
    internal_static_BattlePassMissionUpdateNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BattlePassMissionUpdateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BattlePassMissionUpdateNotify_descriptor,
        new java.lang.String[] { "MissionList", });
    emu.grasscutter.net.proto.BattlePassMissionOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
