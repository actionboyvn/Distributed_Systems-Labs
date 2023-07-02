// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GrpcInterface.proto

package org.example.model;

/**
 * Protobuf type {@code SaveOneBookRequest}
 */
public final class SaveOneBookRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:SaveOneBookRequest)
    SaveOneBookRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SaveOneBookRequest.newBuilder() to construct.
  private SaveOneBookRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SaveOneBookRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SaveOneBookRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.example.model.GrpcAppProto.internal_static_SaveOneBookRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.example.model.GrpcAppProto.internal_static_SaveOneBookRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.example.model.SaveOneBookRequest.class, org.example.model.SaveOneBookRequest.Builder.class);
  }

  public static final int NEW_BOOK_FIELD_NUMBER = 1;
  private org.example.model.Book newBook_;
  /**
   * <code>.Book new_book = 1;</code>
   * @return Whether the newBook field is set.
   */
  @java.lang.Override
  public boolean hasNewBook() {
    return newBook_ != null;
  }
  /**
   * <code>.Book new_book = 1;</code>
   * @return The newBook.
   */
  @java.lang.Override
  public org.example.model.Book getNewBook() {
    return newBook_ == null ? org.example.model.Book.getDefaultInstance() : newBook_;
  }
  /**
   * <code>.Book new_book = 1;</code>
   */
  @java.lang.Override
  public org.example.model.BookOrBuilder getNewBookOrBuilder() {
    return getNewBook();
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
    if (newBook_ != null) {
      output.writeMessage(1, getNewBook());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (newBook_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getNewBook());
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
    if (!(obj instanceof org.example.model.SaveOneBookRequest)) {
      return super.equals(obj);
    }
    org.example.model.SaveOneBookRequest other = (org.example.model.SaveOneBookRequest) obj;

    if (hasNewBook() != other.hasNewBook()) return false;
    if (hasNewBook()) {
      if (!getNewBook()
          .equals(other.getNewBook())) return false;
    }
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
    if (hasNewBook()) {
      hash = (37 * hash) + NEW_BOOK_FIELD_NUMBER;
      hash = (53 * hash) + getNewBook().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.example.model.SaveOneBookRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.model.SaveOneBookRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.model.SaveOneBookRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.model.SaveOneBookRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.model.SaveOneBookRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.model.SaveOneBookRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.model.SaveOneBookRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.example.model.SaveOneBookRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.example.model.SaveOneBookRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.example.model.SaveOneBookRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.example.model.SaveOneBookRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.example.model.SaveOneBookRequest parseFrom(
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
  public static Builder newBuilder(org.example.model.SaveOneBookRequest prototype) {
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
   * Protobuf type {@code SaveOneBookRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SaveOneBookRequest)
      org.example.model.SaveOneBookRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.example.model.GrpcAppProto.internal_static_SaveOneBookRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.example.model.GrpcAppProto.internal_static_SaveOneBookRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.example.model.SaveOneBookRequest.class, org.example.model.SaveOneBookRequest.Builder.class);
    }

    // Construct using org.example.model.SaveOneBookRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (newBookBuilder_ == null) {
        newBook_ = null;
      } else {
        newBook_ = null;
        newBookBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.example.model.GrpcAppProto.internal_static_SaveOneBookRequest_descriptor;
    }

    @java.lang.Override
    public org.example.model.SaveOneBookRequest getDefaultInstanceForType() {
      return org.example.model.SaveOneBookRequest.getDefaultInstance();
    }

    @java.lang.Override
    public org.example.model.SaveOneBookRequest build() {
      org.example.model.SaveOneBookRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.example.model.SaveOneBookRequest buildPartial() {
      org.example.model.SaveOneBookRequest result = new org.example.model.SaveOneBookRequest(this);
      if (newBookBuilder_ == null) {
        result.newBook_ = newBook_;
      } else {
        result.newBook_ = newBookBuilder_.build();
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
      if (other instanceof org.example.model.SaveOneBookRequest) {
        return mergeFrom((org.example.model.SaveOneBookRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.example.model.SaveOneBookRequest other) {
      if (other == org.example.model.SaveOneBookRequest.getDefaultInstance()) return this;
      if (other.hasNewBook()) {
        mergeNewBook(other.getNewBook());
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
            case 10: {
              input.readMessage(
                  getNewBookFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
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

    private org.example.model.Book newBook_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.example.model.Book, org.example.model.Book.Builder, org.example.model.BookOrBuilder> newBookBuilder_;
    /**
     * <code>.Book new_book = 1;</code>
     * @return Whether the newBook field is set.
     */
    public boolean hasNewBook() {
      return newBookBuilder_ != null || newBook_ != null;
    }
    /**
     * <code>.Book new_book = 1;</code>
     * @return The newBook.
     */
    public org.example.model.Book getNewBook() {
      if (newBookBuilder_ == null) {
        return newBook_ == null ? org.example.model.Book.getDefaultInstance() : newBook_;
      } else {
        return newBookBuilder_.getMessage();
      }
    }
    /**
     * <code>.Book new_book = 1;</code>
     */
    public Builder setNewBook(org.example.model.Book value) {
      if (newBookBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        newBook_ = value;
        onChanged();
      } else {
        newBookBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Book new_book = 1;</code>
     */
    public Builder setNewBook(
        org.example.model.Book.Builder builderForValue) {
      if (newBookBuilder_ == null) {
        newBook_ = builderForValue.build();
        onChanged();
      } else {
        newBookBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Book new_book = 1;</code>
     */
    public Builder mergeNewBook(org.example.model.Book value) {
      if (newBookBuilder_ == null) {
        if (newBook_ != null) {
          newBook_ =
            org.example.model.Book.newBuilder(newBook_).mergeFrom(value).buildPartial();
        } else {
          newBook_ = value;
        }
        onChanged();
      } else {
        newBookBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Book new_book = 1;</code>
     */
    public Builder clearNewBook() {
      if (newBookBuilder_ == null) {
        newBook_ = null;
        onChanged();
      } else {
        newBook_ = null;
        newBookBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Book new_book = 1;</code>
     */
    public org.example.model.Book.Builder getNewBookBuilder() {
      
      onChanged();
      return getNewBookFieldBuilder().getBuilder();
    }
    /**
     * <code>.Book new_book = 1;</code>
     */
    public org.example.model.BookOrBuilder getNewBookOrBuilder() {
      if (newBookBuilder_ != null) {
        return newBookBuilder_.getMessageOrBuilder();
      } else {
        return newBook_ == null ?
            org.example.model.Book.getDefaultInstance() : newBook_;
      }
    }
    /**
     * <code>.Book new_book = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.example.model.Book, org.example.model.Book.Builder, org.example.model.BookOrBuilder> 
        getNewBookFieldBuilder() {
      if (newBookBuilder_ == null) {
        newBookBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.example.model.Book, org.example.model.Book.Builder, org.example.model.BookOrBuilder>(
                getNewBook(),
                getParentForChildren(),
                isClean());
        newBook_ = null;
      }
      return newBookBuilder_;
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


    // @@protoc_insertion_point(builder_scope:SaveOneBookRequest)
  }

  // @@protoc_insertion_point(class_scope:SaveOneBookRequest)
  private static final org.example.model.SaveOneBookRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.example.model.SaveOneBookRequest();
  }

  public static org.example.model.SaveOneBookRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SaveOneBookRequest>
      PARSER = new com.google.protobuf.AbstractParser<SaveOneBookRequest>() {
    @java.lang.Override
    public SaveOneBookRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<SaveOneBookRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SaveOneBookRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.example.model.SaveOneBookRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

