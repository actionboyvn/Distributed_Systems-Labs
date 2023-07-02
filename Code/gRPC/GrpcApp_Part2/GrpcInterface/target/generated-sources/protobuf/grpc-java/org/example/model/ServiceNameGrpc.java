package org.example.model;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: GrpcInterface.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ServiceNameGrpc {

  private ServiceNameGrpc() {}

  public static final String SERVICE_NAME = "ServiceName";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.model.SaveOneBookRequest,
      org.example.model.SaveBooksResponse> getSaveOneBookProcedureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveOneBookProcedure",
      requestType = org.example.model.SaveOneBookRequest.class,
      responseType = org.example.model.SaveBooksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.model.SaveOneBookRequest,
      org.example.model.SaveBooksResponse> getSaveOneBookProcedureMethod() {
    io.grpc.MethodDescriptor<org.example.model.SaveOneBookRequest, org.example.model.SaveBooksResponse> getSaveOneBookProcedureMethod;
    if ((getSaveOneBookProcedureMethod = ServiceNameGrpc.getSaveOneBookProcedureMethod) == null) {
      synchronized (ServiceNameGrpc.class) {
        if ((getSaveOneBookProcedureMethod = ServiceNameGrpc.getSaveOneBookProcedureMethod) == null) {
          ServiceNameGrpc.getSaveOneBookProcedureMethod = getSaveOneBookProcedureMethod =
              io.grpc.MethodDescriptor.<org.example.model.SaveOneBookRequest, org.example.model.SaveBooksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "saveOneBookProcedure"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.model.SaveOneBookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.model.SaveBooksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceNameMethodDescriptorSupplier("saveOneBookProcedure"))
              .build();
        }
      }
    }
    return getSaveOneBookProcedureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.model.SaveBooksRequest,
      org.example.model.SaveBooksResponse> getSaveBooksProcedureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveBooksProcedure",
      requestType = org.example.model.SaveBooksRequest.class,
      responseType = org.example.model.SaveBooksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.model.SaveBooksRequest,
      org.example.model.SaveBooksResponse> getSaveBooksProcedureMethod() {
    io.grpc.MethodDescriptor<org.example.model.SaveBooksRequest, org.example.model.SaveBooksResponse> getSaveBooksProcedureMethod;
    if ((getSaveBooksProcedureMethod = ServiceNameGrpc.getSaveBooksProcedureMethod) == null) {
      synchronized (ServiceNameGrpc.class) {
        if ((getSaveBooksProcedureMethod = ServiceNameGrpc.getSaveBooksProcedureMethod) == null) {
          ServiceNameGrpc.getSaveBooksProcedureMethod = getSaveBooksProcedureMethod =
              io.grpc.MethodDescriptor.<org.example.model.SaveBooksRequest, org.example.model.SaveBooksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "saveBooksProcedure"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.model.SaveBooksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.model.SaveBooksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceNameMethodDescriptorSupplier("saveBooksProcedure"))
              .build();
        }
      }
    }
    return getSaveBooksProcedureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.model.ReadBooksRequest,
      org.example.model.BookRepo> getReadBooksProcedureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "readBooksProcedure",
      requestType = org.example.model.ReadBooksRequest.class,
      responseType = org.example.model.BookRepo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.model.ReadBooksRequest,
      org.example.model.BookRepo> getReadBooksProcedureMethod() {
    io.grpc.MethodDescriptor<org.example.model.ReadBooksRequest, org.example.model.BookRepo> getReadBooksProcedureMethod;
    if ((getReadBooksProcedureMethod = ServiceNameGrpc.getReadBooksProcedureMethod) == null) {
      synchronized (ServiceNameGrpc.class) {
        if ((getReadBooksProcedureMethod = ServiceNameGrpc.getReadBooksProcedureMethod) == null) {
          ServiceNameGrpc.getReadBooksProcedureMethod = getReadBooksProcedureMethod =
              io.grpc.MethodDescriptor.<org.example.model.ReadBooksRequest, org.example.model.BookRepo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "readBooksProcedure"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.model.ReadBooksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.model.BookRepo.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceNameMethodDescriptorSupplier("readBooksProcedure"))
              .build();
        }
      }
    }
    return getReadBooksProcedureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.model.DeleteOneBookRequest,
      org.example.model.DeleteOneBookResponse> getDeleteOneBookProcedureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteOneBookProcedure",
      requestType = org.example.model.DeleteOneBookRequest.class,
      responseType = org.example.model.DeleteOneBookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.model.DeleteOneBookRequest,
      org.example.model.DeleteOneBookResponse> getDeleteOneBookProcedureMethod() {
    io.grpc.MethodDescriptor<org.example.model.DeleteOneBookRequest, org.example.model.DeleteOneBookResponse> getDeleteOneBookProcedureMethod;
    if ((getDeleteOneBookProcedureMethod = ServiceNameGrpc.getDeleteOneBookProcedureMethod) == null) {
      synchronized (ServiceNameGrpc.class) {
        if ((getDeleteOneBookProcedureMethod = ServiceNameGrpc.getDeleteOneBookProcedureMethod) == null) {
          ServiceNameGrpc.getDeleteOneBookProcedureMethod = getDeleteOneBookProcedureMethod =
              io.grpc.MethodDescriptor.<org.example.model.DeleteOneBookRequest, org.example.model.DeleteOneBookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteOneBookProcedure"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.model.DeleteOneBookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.model.DeleteOneBookResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceNameMethodDescriptorSupplier("deleteOneBookProcedure"))
              .build();
        }
      }
    }
    return getDeleteOneBookProcedureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.model.BookImageStreamingRequest,
      org.example.model.ByteResponse> getBookImageStreamingProcedureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "bookImageStreamingProcedure",
      requestType = org.example.model.BookImageStreamingRequest.class,
      responseType = org.example.model.ByteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.model.BookImageStreamingRequest,
      org.example.model.ByteResponse> getBookImageStreamingProcedureMethod() {
    io.grpc.MethodDescriptor<org.example.model.BookImageStreamingRequest, org.example.model.ByteResponse> getBookImageStreamingProcedureMethod;
    if ((getBookImageStreamingProcedureMethod = ServiceNameGrpc.getBookImageStreamingProcedureMethod) == null) {
      synchronized (ServiceNameGrpc.class) {
        if ((getBookImageStreamingProcedureMethod = ServiceNameGrpc.getBookImageStreamingProcedureMethod) == null) {
          ServiceNameGrpc.getBookImageStreamingProcedureMethod = getBookImageStreamingProcedureMethod =
              io.grpc.MethodDescriptor.<org.example.model.BookImageStreamingRequest, org.example.model.ByteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "bookImageStreamingProcedure"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.model.BookImageStreamingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.model.ByteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceNameMethodDescriptorSupplier("bookImageStreamingProcedure"))
              .build();
        }
      }
    }
    return getBookImageStreamingProcedureMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServiceNameStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceNameStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceNameStub>() {
        @java.lang.Override
        public ServiceNameStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceNameStub(channel, callOptions);
        }
      };
    return ServiceNameStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServiceNameBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceNameBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceNameBlockingStub>() {
        @java.lang.Override
        public ServiceNameBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceNameBlockingStub(channel, callOptions);
        }
      };
    return ServiceNameBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServiceNameFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceNameFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceNameFutureStub>() {
        @java.lang.Override
        public ServiceNameFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceNameFutureStub(channel, callOptions);
        }
      };
    return ServiceNameFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The service definition.
   * </pre>
   */
  public static abstract class ServiceNameImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Remote procedures:
     * </pre>
     */
    public void saveOneBookProcedure(org.example.model.SaveOneBookRequest request,
        io.grpc.stub.StreamObserver<org.example.model.SaveBooksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveOneBookProcedureMethod(), responseObserver);
    }

    /**
     */
    public void saveBooksProcedure(org.example.model.SaveBooksRequest request,
        io.grpc.stub.StreamObserver<org.example.model.SaveBooksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveBooksProcedureMethod(), responseObserver);
    }

    /**
     */
    public void readBooksProcedure(org.example.model.ReadBooksRequest request,
        io.grpc.stub.StreamObserver<org.example.model.BookRepo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadBooksProcedureMethod(), responseObserver);
    }

    /**
     */
    public void deleteOneBookProcedure(org.example.model.DeleteOneBookRequest request,
        io.grpc.stub.StreamObserver<org.example.model.DeleteOneBookResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteOneBookProcedureMethod(), responseObserver);
    }

    /**
     */
    public void bookImageStreamingProcedure(org.example.model.BookImageStreamingRequest request,
        io.grpc.stub.StreamObserver<org.example.model.ByteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBookImageStreamingProcedureMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSaveOneBookProcedureMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                org.example.model.SaveOneBookRequest,
                org.example.model.SaveBooksResponse>(
                  this, METHODID_SAVE_ONE_BOOK_PROCEDURE)))
          .addMethod(
            getSaveBooksProcedureMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                org.example.model.SaveBooksRequest,
                org.example.model.SaveBooksResponse>(
                  this, METHODID_SAVE_BOOKS_PROCEDURE)))
          .addMethod(
            getReadBooksProcedureMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                org.example.model.ReadBooksRequest,
                org.example.model.BookRepo>(
                  this, METHODID_READ_BOOKS_PROCEDURE)))
          .addMethod(
            getDeleteOneBookProcedureMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                org.example.model.DeleteOneBookRequest,
                org.example.model.DeleteOneBookResponse>(
                  this, METHODID_DELETE_ONE_BOOK_PROCEDURE)))
          .addMethod(
            getBookImageStreamingProcedureMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                org.example.model.BookImageStreamingRequest,
                org.example.model.ByteResponse>(
                  this, METHODID_BOOK_IMAGE_STREAMING_PROCEDURE)))
          .build();
    }
  }

  /**
   * <pre>
   * The service definition.
   * </pre>
   */
  public static final class ServiceNameStub extends io.grpc.stub.AbstractAsyncStub<ServiceNameStub> {
    private ServiceNameStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceNameStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceNameStub(channel, callOptions);
    }

    /**
     * <pre>
     * Remote procedures:
     * </pre>
     */
    public void saveOneBookProcedure(org.example.model.SaveOneBookRequest request,
        io.grpc.stub.StreamObserver<org.example.model.SaveBooksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSaveOneBookProcedureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveBooksProcedure(org.example.model.SaveBooksRequest request,
        io.grpc.stub.StreamObserver<org.example.model.SaveBooksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSaveBooksProcedureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void readBooksProcedure(org.example.model.ReadBooksRequest request,
        io.grpc.stub.StreamObserver<org.example.model.BookRepo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getReadBooksProcedureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteOneBookProcedure(org.example.model.DeleteOneBookRequest request,
        io.grpc.stub.StreamObserver<org.example.model.DeleteOneBookResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getDeleteOneBookProcedureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void bookImageStreamingProcedure(org.example.model.BookImageStreamingRequest request,
        io.grpc.stub.StreamObserver<org.example.model.ByteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getBookImageStreamingProcedureMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The service definition.
   * </pre>
   */
  public static final class ServiceNameBlockingStub extends io.grpc.stub.AbstractBlockingStub<ServiceNameBlockingStub> {
    private ServiceNameBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceNameBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceNameBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Remote procedures:
     * </pre>
     */
    public java.util.Iterator<org.example.model.SaveBooksResponse> saveOneBookProcedure(
        org.example.model.SaveOneBookRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSaveOneBookProcedureMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.example.model.SaveBooksResponse> saveBooksProcedure(
        org.example.model.SaveBooksRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSaveBooksProcedureMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.example.model.BookRepo> readBooksProcedure(
        org.example.model.ReadBooksRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getReadBooksProcedureMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.example.model.DeleteOneBookResponse> deleteOneBookProcedure(
        org.example.model.DeleteOneBookRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getDeleteOneBookProcedureMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.example.model.ByteResponse> bookImageStreamingProcedure(
        org.example.model.BookImageStreamingRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getBookImageStreamingProcedureMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The service definition.
   * </pre>
   */
  public static final class ServiceNameFutureStub extends io.grpc.stub.AbstractFutureStub<ServiceNameFutureStub> {
    private ServiceNameFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceNameFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceNameFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SAVE_ONE_BOOK_PROCEDURE = 0;
  private static final int METHODID_SAVE_BOOKS_PROCEDURE = 1;
  private static final int METHODID_READ_BOOKS_PROCEDURE = 2;
  private static final int METHODID_DELETE_ONE_BOOK_PROCEDURE = 3;
  private static final int METHODID_BOOK_IMAGE_STREAMING_PROCEDURE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ServiceNameImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ServiceNameImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAVE_ONE_BOOK_PROCEDURE:
          serviceImpl.saveOneBookProcedure((org.example.model.SaveOneBookRequest) request,
              (io.grpc.stub.StreamObserver<org.example.model.SaveBooksResponse>) responseObserver);
          break;
        case METHODID_SAVE_BOOKS_PROCEDURE:
          serviceImpl.saveBooksProcedure((org.example.model.SaveBooksRequest) request,
              (io.grpc.stub.StreamObserver<org.example.model.SaveBooksResponse>) responseObserver);
          break;
        case METHODID_READ_BOOKS_PROCEDURE:
          serviceImpl.readBooksProcedure((org.example.model.ReadBooksRequest) request,
              (io.grpc.stub.StreamObserver<org.example.model.BookRepo>) responseObserver);
          break;
        case METHODID_DELETE_ONE_BOOK_PROCEDURE:
          serviceImpl.deleteOneBookProcedure((org.example.model.DeleteOneBookRequest) request,
              (io.grpc.stub.StreamObserver<org.example.model.DeleteOneBookResponse>) responseObserver);
          break;
        case METHODID_BOOK_IMAGE_STREAMING_PROCEDURE:
          serviceImpl.bookImageStreamingProcedure((org.example.model.BookImageStreamingRequest) request,
              (io.grpc.stub.StreamObserver<org.example.model.ByteResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ServiceNameBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServiceNameBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.model.GrpcAppProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ServiceName");
    }
  }

  private static final class ServiceNameFileDescriptorSupplier
      extends ServiceNameBaseDescriptorSupplier {
    ServiceNameFileDescriptorSupplier() {}
  }

  private static final class ServiceNameMethodDescriptorSupplier
      extends ServiceNameBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ServiceNameMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ServiceNameGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServiceNameFileDescriptorSupplier())
              .addMethod(getSaveOneBookProcedureMethod())
              .addMethod(getSaveBooksProcedureMethod())
              .addMethod(getReadBooksProcedureMethod())
              .addMethod(getDeleteOneBookProcedureMethod())
              .addMethod(getBookImageStreamingProcedureMethod())
              .build();
        }
      }
    }
    return result;
  }
}
