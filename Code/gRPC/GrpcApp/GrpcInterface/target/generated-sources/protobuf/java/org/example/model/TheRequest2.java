// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GrpcInterface.proto

package org.example.model;

/**
 * Protobuf type {@code TheRequest2}
 */
public final class TheRequest2 extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:TheRequest2)
    TheRequest2OrBuilder {
private static final long serialVersionUID = 0L;
  // Use TheRequest2.newBuilder() to construct.
  private TheRequest2(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TheRequest2() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TheRequest2();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.example.model.GrpcAppProto.internal_static_TheRequest2_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.example.model.GrpcAppProto.internal_static_TheRequest2_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.example.model.TheRequest2.class, org.example.model.TheRequest2.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private boolean type_;
  /**
   * <code>bool type = 1;</code>
   * @return The type.
   */
  @java.lang.Override
  public boolean getType() {
    return type_;
  }

  public static final int N_FIELD_NUMBER = 2;
  private int n_;
  /**
   * <code>int32 n = 2;</code>
   * @return The n.
   */
  @java.lang.Override
  public int getN() {
    return n_;
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
    if (type_ != false) {
      output.writeBool(1, type_);
    }
    if (n_ != 0) {
      output.writeInt32(2, n_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, type_);
    }
    if (n_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, n_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.example.model.TheRequest2)) {
      return super.equals(obj);
    }
    org.example.model.TheRequest2 other = (org.example.model.TheRequest2) obj;

    if (getType()
        != other.getType()) return false;
    if (getN()
        != other.getN()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getType());
    hash = (37 * hash) + N_FIELD_NUMBER;
    hash = (53 * hash) + getN();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.example.model.TheRequest2 parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.model.TheRequest2 parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.model.TheRequest2 parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.model.TheRequest2 parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.model.TheRequest2 parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.model.TheRequest2 parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.model.TheRequest2 parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.example.model.TheRequest2 parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.example.model.TheRequest2 parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.example.model.TheRequest2 parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.example.model.TheRequest2 parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.example.model.TheRequest2 parseFrom(
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
  public static Builder newBuilder(org.example.model.TheRequest2 prototype) {
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
   * Protobuf type {@code TheRequest2}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:TheRequest2)
      org.example.model.TheRequest2OrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.example.model.GrpcAppProto.internal_static_TheRequest2_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.example.model.GrpcAppProto.internal_static_TheRequest2_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.example.model.TheRequest2.class, org.example.model.TheRequest2.Builder.class);
    }

    // Construct using org.example.model.TheRequest2.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      type_ = false;

      n_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.example.model.GrpcAppProto.internal_static_TheRequest2_descriptor;
    }

    @java.lang.Override
    public org.example.model.TheRequest2 getDefaultInstanceForType() {
      return org.example.model.TheRequest2.getDefaultInstance();
    }

    @java.lang.Override
    public org.example.model.TheRequest2 build() {
      org.example.model.TheRequest2 result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.example.model.TheRequest2 buildPartial() {
      org.example.model.TheRequest2 result = new org.example.model.TheRequest2(this);
      result.type_ = type_;
      result.n_ = n_;
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
      if (other instanceof org.example.model.TheRequest2) {
        return mergeFrom((org.example.model.TheRequest2)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.example.model.TheRequest2 other) {
      if (other == org.example.model.TheRequest2.getDefaultInstance()) return this;
      if (other.getType() != false) {
        setType(other.getType());
      }
      if (other.getN() != 0) {
        setN(other.getN());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              type_ = input.readBool();

              break;
            } // case 8
            case 16: {
              n_ = input.readInt32();

              break;
            } // case 16
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private boolean type_ ;
    /**
     * <code>bool type = 1;</code>
     * @return The type.
     */
    @java.lang.Override
    public boolean getType() {
      return type_;
    }
    /**
     * <code>bool type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(boolean value) {
      
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = false;
      onChanged();
      return this;
    }

    private int n_ ;
    /**
     * <code>int32 n = 2;</code>
     * @return The n.
     */
    @java.lang.Override
    public int getN() {
      return n_;
    }
    /**
     * <code>int32 n = 2;</code>
     * @param value The n to set.
     * @return This builder for chaining.
     */
    public Builder setN(int value) {
      
      n_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 n = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearN() {
      
      n_ = 0;
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


    // @@protoc_insertion_point(builder_scope:TheRequest2)
  }

  // @@protoc_insertion_point(class_scope:TheRequest2)
  private static final org.example.model.TheRequest2 DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.example.model.TheRequest2();
  }

  public static org.example.model.TheRequest2 getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TheRequest2>
      PARSER = new com.google.protobuf.AbstractParser<TheRequest2>() {
    @java.lang.Override
    public TheRequest2 parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<TheRequest2> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TheRequest2> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.example.model.TheRequest2 getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

