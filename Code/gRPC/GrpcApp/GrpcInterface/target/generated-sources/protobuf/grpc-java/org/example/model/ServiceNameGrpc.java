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
  private static volatile io.grpc.MethodDescriptor<org.example.model.TheRequest,
      org.example.model.TheResponse> getUnaryProcedureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "unaryProcedure",
      requestType = org.example.model.TheRequest.class,
      responseType = org.example.model.TheResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.model.TheRequest,
      org.example.model.TheResponse> getUnaryProcedureMethod() {
    io.grpc.MethodDescriptor<org.example.model.TheRequest, org.example.model.TheResponse> getUnaryProcedureMethod;
    if ((getUnaryProcedureMethod = ServiceNameGrpc.getUnaryProcedureMethod) == null) {
      synchronized (ServiceNameGrpc.class) {
        if ((getUnaryProcedureMethod = ServiceNameGrpc.getUnaryProcedureMethod) == null) {
          ServiceNameGrpc.getUnaryProcedureMethod = getUnaryProcedureMethod =
              io.grpc.MethodDescriptor.<org.example.model.TheRequest, org.example.model.TheResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "unaryProcedure"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.model.TheRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.model.TheResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceNameMethodDescriptorSupplier("unaryProcedure"))
              .build();
        }
      }
    }
    return getUnaryProcedureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.model.TheRequest,
      org.example.model.TheResponse> getStreamProcedureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "streamProcedure",
      requestType = org.example.model.TheRequest.class,
      responseType = org.example.model.TheResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.model.TheRequest,
      org.example.model.TheResponse> getStreamProcedureMethod() {
    io.grpc.MethodDescriptor<org.example.model.TheRequest, org.example.model.TheResponse> getStreamProcedureMethod;
    if ((getStreamProcedureMethod = ServiceNameGrpc.getStreamProcedureMethod) == null) {
      synchronized (ServiceNameGrpc.class) {
        if ((getStreamProcedureMethod = ServiceNameGrpc.getStreamProcedureMethod) == null) {
          ServiceNameGrpc.getStreamProcedureMethod = getStreamProcedureMethod =
              io.grpc.MethodDescriptor.<org.example.model.TheRequest, org.example.model.TheResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "streamProcedure"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.model.TheRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.model.TheResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceNameMethodDescriptorSupplier("streamProcedure"))
              .build();
        }
      }
    }
    return getStreamProcedureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.model.TheRequest2,
      org.example.model.TheResponse2> getProcFacFibMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "procFacFib",
      requestType = org.example.model.TheRequest2.class,
      responseType = org.example.model.TheResponse2.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.model.TheRequest2,
      org.example.model.TheResponse2> getProcFacFibMethod() {
    io.grpc.MethodDescriptor<org.example.model.TheRequest2, org.example.model.TheResponse2> getProcFacFibMethod;
    if ((getProcFacFibMethod = ServiceNameGrpc.getProcFacFibMethod) == null) {
      synchronized (ServiceNameGrpc.class) {
        if ((getProcFacFibMethod = ServiceNameGrpc.getProcFacFibMethod) == null) {
          ServiceNameGrpc.getProcFacFibMethod = getProcFacFibMethod =
              io.grpc.MethodDescriptor.<org.example.model.TheRequest2, org.example.model.TheResponse2>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "procFacFib"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.model.TheRequest2.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.model.TheResponse2.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceNameMethodDescriptorSupplier("procFacFib"))
              .build();
        }
      }
    }
    return getProcFacFibMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.model.FileStreamingRequest,
      org.example.model.ByteResponse> getFileStreamingProcedureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "fileStreamingProcedure",
      requestType = org.example.model.FileStreamingRequest.class,
      responseType = org.example.model.ByteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.model.FileStreamingRequest,
      org.example.model.ByteResponse> getFileStreamingProcedureMethod() {
    io.grpc.MethodDescriptor<org.example.model.FileStreamingRequest, org.example.model.ByteResponse> getFileStreamingProcedureMethod;
    if ((getFileStreamingProcedureMethod = ServiceNameGrpc.getFileStreamingProcedureMethod) == null) {
      synchronized (ServiceNameGrpc.class) {
        if ((getFileStreamingProcedureMethod = ServiceNameGrpc.getFileStreamingProcedureMethod) == null) {
          ServiceNameGrpc.getFileStreamingProcedureMethod = getFileStreamingProcedureMethod =
              io.grpc.MethodDescriptor.<org.example.model.FileStreamingRequest, org.example.model.ByteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "fileStreamingProcedure"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.model.FileStreamingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.model.ByteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceNameMethodDescriptorSupplier("fileStreamingProcedure"))
              .build();
        }
      }
    }
    return getFileStreamingProcedureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.model.FileCheckRequest,
      org.example.model.FileCheckResponse> getFileCheckProcedureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "fileCheckProcedure",
      requestType = org.example.model.FileCheckRequest.class,
      responseType = org.example.model.FileCheckResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.model.FileCheckRequest,
      org.example.model.FileCheckResponse> getFileCheckProcedureMethod() {
    io.grpc.MethodDescriptor<org.example.model.FileCheckRequest, org.example.model.FileCheckResponse> getFileCheckProcedureMethod;
    if ((getFileCheckProcedureMethod = ServiceNameGrpc.getFileCheckProcedureMethod) == null) {
      synchronized (ServiceNameGrpc.class) {
        if ((getFileCheckProcedureMethod = ServiceNameGrpc.getFileCheckProcedureMethod) == null) {
          ServiceNameGrpc.getFileCheckProcedureMethod = getFileCheckProcedureMethod =
              io.grpc.MethodDescriptor.<org.example.model.FileCheckRequest, org.example.model.FileCheckResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "fileCheckProcedure"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.model.FileCheckRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.model.FileCheckResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceNameMethodDescriptorSupplier("fileCheckProcedure"))
              .build();
        }
      }
    }
    return getFileCheckProcedureMethod;
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
    public void unaryProcedure(org.example.model.TheRequest request,
        io.grpc.stub.StreamObserver<org.example.model.TheResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnaryProcedureMethod(), responseObserver);
    }

    /**
     */
    public void streamProcedure(org.example.model.TheRequest request,
        io.grpc.stub.StreamObserver<org.example.model.TheResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamProcedureMethod(), responseObserver);
    }

    /**
     */
    public void procFacFib(org.example.model.TheRequest2 request,
        io.grpc.stub.StreamObserver<org.example.model.TheResponse2> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProcFacFibMethod(), responseObserver);
    }

    /**
     */
    public void fileStreamingProcedure(org.example.model.FileStreamingRequest request,
        io.grpc.stub.StreamObserver<org.example.model.ByteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFileStreamingProcedureMethod(), responseObserver);
    }

    /**
     */
    public void fileCheckProcedure(org.example.model.FileCheckRequest request,
        io.grpc.stub.StreamObserver<org.example.model.FileCheckResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFileCheckProcedureMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUnaryProcedureMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.example.model.TheRequest,
                org.example.model.TheResponse>(
                  this, METHODID_UNARY_PROCEDURE)))
          .addMethod(
            getStreamProcedureMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                org.example.model.TheRequest,
                org.example.model.TheResponse>(
                  this, METHODID_STREAM_PROCEDURE)))
          .addMethod(
            getProcFacFibMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                org.example.model.TheRequest2,
                org.example.model.TheResponse2>(
                  this, METHODID_PROC_FAC_FIB)))
          .addMethod(
            getFileStreamingProcedureMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                org.example.model.FileStreamingRequest,
                org.example.model.ByteResponse>(
                  this, METHODID_FILE_STREAMING_PROCEDURE)))
          .addMethod(
            getFileCheckProcedureMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.example.model.FileCheckRequest,
                org.example.model.FileCheckResponse>(
                  this, METHODID_FILE_CHECK_PROCEDURE)))
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
    public void unaryProcedure(org.example.model.TheRequest request,
        io.grpc.stub.StreamObserver<org.example.model.TheResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnaryProcedureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void streamProcedure(org.example.model.TheRequest request,
        io.grpc.stub.StreamObserver<org.example.model.TheResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamProcedureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void procFacFib(org.example.model.TheRequest2 request,
        io.grpc.stub.StreamObserver<org.example.model.TheResponse2> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getProcFacFibMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void fileStreamingProcedure(org.example.model.FileStreamingRequest request,
        io.grpc.stub.StreamObserver<org.example.model.ByteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getFileStreamingProcedureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void fileCheckProcedure(org.example.model.FileCheckRequest request,
        io.grpc.stub.StreamObserver<org.example.model.FileCheckResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFileCheckProcedureMethod(), getCallOptions()), request, responseObserver);
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
    public org.example.model.TheResponse unaryProcedure(org.example.model.TheRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnaryProcedureMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.example.model.TheResponse> streamProcedure(
        org.example.model.TheRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamProcedureMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.example.model.TheResponse2> procFacFib(
        org.example.model.TheRequest2 request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getProcFacFibMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.example.model.ByteResponse> fileStreamingProcedure(
        org.example.model.FileStreamingRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getFileStreamingProcedureMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.model.FileCheckResponse fileCheckProcedure(org.example.model.FileCheckRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFileCheckProcedureMethod(), getCallOptions(), request);
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

    /**
     * <pre>
     * Remote procedures:
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.model.TheResponse> unaryProcedure(
        org.example.model.TheRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnaryProcedureMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.model.FileCheckResponse> fileCheckProcedure(
        org.example.model.FileCheckRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFileCheckProcedureMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UNARY_PROCEDURE = 0;
  private static final int METHODID_STREAM_PROCEDURE = 1;
  private static final int METHODID_PROC_FAC_FIB = 2;
  private static final int METHODID_FILE_STREAMING_PROCEDURE = 3;
  private static final int METHODID_FILE_CHECK_PROCEDURE = 4;

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
        case METHODID_UNARY_PROCEDURE:
          serviceImpl.unaryProcedure((org.example.model.TheRequest) request,
              (io.grpc.stub.StreamObserver<org.example.model.TheResponse>) responseObserver);
          break;
        case METHODID_STREAM_PROCEDURE:
          serviceImpl.streamProcedure((org.example.model.TheRequest) request,
              (io.grpc.stub.StreamObserver<org.example.model.TheResponse>) responseObserver);
          break;
        case METHODID_PROC_FAC_FIB:
          serviceImpl.procFacFib((org.example.model.TheRequest2) request,
              (io.grpc.stub.StreamObserver<org.example.model.TheResponse2>) responseObserver);
          break;
        case METHODID_FILE_STREAMING_PROCEDURE:
          serviceImpl.fileStreamingProcedure((org.example.model.FileStreamingRequest) request,
              (io.grpc.stub.StreamObserver<org.example.model.ByteResponse>) responseObserver);
          break;
        case METHODID_FILE_CHECK_PROCEDURE:
          serviceImpl.fileCheckProcedure((org.example.model.FileCheckRequest) request,
              (io.grpc.stub.StreamObserver<org.example.model.FileCheckResponse>) responseObserver);
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
              .addMethod(getUnaryProcedureMethod())
              .addMethod(getStreamProcedureMethod())
              .addMethod(getProcFacFibMethod())
              .addMethod(getFileStreamingProcedureMethod())
              .addMethod(getFileCheckProcedureMethod())
              .build();
        }
      }
    }
    return result;
  }
}
