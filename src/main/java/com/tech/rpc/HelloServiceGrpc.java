package com.tech.rpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: HelloService.proto")
public final class HelloServiceGrpc {

  private HelloServiceGrpc() {}

  public static final String SERVICE_NAME = "HelloService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tech.rpc.HelloServiceOuterClass.HelloRequest,
      com.tech.rpc.HelloServiceOuterClass.HelloResponse> getGetHelloMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getHelloMessage",
      requestType = com.tech.rpc.HelloServiceOuterClass.HelloRequest.class,
      responseType = com.tech.rpc.HelloServiceOuterClass.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tech.rpc.HelloServiceOuterClass.HelloRequest,
      com.tech.rpc.HelloServiceOuterClass.HelloResponse> getGetHelloMessageMethod() {
    io.grpc.MethodDescriptor<com.tech.rpc.HelloServiceOuterClass.HelloRequest, com.tech.rpc.HelloServiceOuterClass.HelloResponse> getGetHelloMessageMethod;
    if ((getGetHelloMessageMethod = HelloServiceGrpc.getGetHelloMessageMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getGetHelloMessageMethod = HelloServiceGrpc.getGetHelloMessageMethod) == null) {
          HelloServiceGrpc.getGetHelloMessageMethod = getGetHelloMessageMethod = 
              io.grpc.MethodDescriptor.<com.tech.rpc.HelloServiceOuterClass.HelloRequest, com.tech.rpc.HelloServiceOuterClass.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HelloService", "getHelloMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tech.rpc.HelloServiceOuterClass.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tech.rpc.HelloServiceOuterClass.HelloResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("getHelloMessage"))
                  .build();
          }
        }
     }
     return getGetHelloMessageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HelloServiceStub newStub(io.grpc.Channel channel) {
    return new HelloServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HelloServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HelloServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HelloServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HelloServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class HelloServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getHelloMessage(com.tech.rpc.HelloServiceOuterClass.HelloRequest request,
        io.grpc.stub.StreamObserver<com.tech.rpc.HelloServiceOuterClass.HelloResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetHelloMessageMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetHelloMessageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tech.rpc.HelloServiceOuterClass.HelloRequest,
                com.tech.rpc.HelloServiceOuterClass.HelloResponse>(
                  this, METHODID_GET_HELLO_MESSAGE)))
          .build();
    }
  }

  /**
   */
  public static final class HelloServiceStub extends io.grpc.stub.AbstractStub<HelloServiceStub> {
    private HelloServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloServiceStub(channel, callOptions);
    }

    /**
     */
    public void getHelloMessage(com.tech.rpc.HelloServiceOuterClass.HelloRequest request,
        io.grpc.stub.StreamObserver<com.tech.rpc.HelloServiceOuterClass.HelloResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetHelloMessageMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HelloServiceBlockingStub extends io.grpc.stub.AbstractStub<HelloServiceBlockingStub> {
    private HelloServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.tech.rpc.HelloServiceOuterClass.HelloResponse getHelloMessage(com.tech.rpc.HelloServiceOuterClass.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetHelloMessageMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HelloServiceFutureStub extends io.grpc.stub.AbstractStub<HelloServiceFutureStub> {
    private HelloServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tech.rpc.HelloServiceOuterClass.HelloResponse> getHelloMessage(
        com.tech.rpc.HelloServiceOuterClass.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetHelloMessageMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_HELLO_MESSAGE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HelloServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HelloServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_HELLO_MESSAGE:
          serviceImpl.getHelloMessage((com.tech.rpc.HelloServiceOuterClass.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.tech.rpc.HelloServiceOuterClass.HelloResponse>) responseObserver);
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

  private static abstract class HelloServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HelloServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tech.rpc.HelloServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HelloService");
    }
  }

  private static final class HelloServiceFileDescriptorSupplier
      extends HelloServiceBaseDescriptorSupplier {
    HelloServiceFileDescriptorSupplier() {}
  }

  private static final class HelloServiceMethodDescriptorSupplier
      extends HelloServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HelloServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HelloServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HelloServiceFileDescriptorSupplier())
              .addMethod(getGetHelloMessageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
