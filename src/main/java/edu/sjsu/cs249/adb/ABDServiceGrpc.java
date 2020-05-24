package edu.sjsu.cs249.adb;

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
    comments = "Source: abd.proto")
public final class ABDServiceGrpc {

  private ABDServiceGrpc() {}

  public static final String SERVICE_NAME = "adb.ABDService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      edu.sjsu.cs249.adb.NameResponse> getNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "name",
      requestType = com.google.protobuf.Empty.class,
      responseType = edu.sjsu.cs249.adb.NameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      edu.sjsu.cs249.adb.NameResponse> getNameMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, edu.sjsu.cs249.adb.NameResponse> getNameMethod;
    if ((getNameMethod = ABDServiceGrpc.getNameMethod) == null) {
      synchronized (ABDServiceGrpc.class) {
        if ((getNameMethod = ABDServiceGrpc.getNameMethod) == null) {
          ABDServiceGrpc.getNameMethod = getNameMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, edu.sjsu.cs249.adb.NameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "adb.ABDService", "name"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.sjsu.cs249.adb.NameResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ABDServiceMethodDescriptorSupplier("name"))
                  .build();
          }
        }
     }
     return getNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<edu.sjsu.cs249.adb.Read1Request,
      edu.sjsu.cs249.adb.Read1Response> getRead1Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "read1",
      requestType = edu.sjsu.cs249.adb.Read1Request.class,
      responseType = edu.sjsu.cs249.adb.Read1Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<edu.sjsu.cs249.adb.Read1Request,
      edu.sjsu.cs249.adb.Read1Response> getRead1Method() {
    io.grpc.MethodDescriptor<edu.sjsu.cs249.adb.Read1Request, edu.sjsu.cs249.adb.Read1Response> getRead1Method;
    if ((getRead1Method = ABDServiceGrpc.getRead1Method) == null) {
      synchronized (ABDServiceGrpc.class) {
        if ((getRead1Method = ABDServiceGrpc.getRead1Method) == null) {
          ABDServiceGrpc.getRead1Method = getRead1Method = 
              io.grpc.MethodDescriptor.<edu.sjsu.cs249.adb.Read1Request, edu.sjsu.cs249.adb.Read1Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "adb.ABDService", "read1"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.sjsu.cs249.adb.Read1Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.sjsu.cs249.adb.Read1Response.getDefaultInstance()))
                  .setSchemaDescriptor(new ABDServiceMethodDescriptorSupplier("read1"))
                  .build();
          }
        }
     }
     return getRead1Method;
  }

  private static volatile io.grpc.MethodDescriptor<edu.sjsu.cs249.adb.Read2Request,
      edu.sjsu.cs249.adb.AckResponse> getRead2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "read2",
      requestType = edu.sjsu.cs249.adb.Read2Request.class,
      responseType = edu.sjsu.cs249.adb.AckResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<edu.sjsu.cs249.adb.Read2Request,
      edu.sjsu.cs249.adb.AckResponse> getRead2Method() {
    io.grpc.MethodDescriptor<edu.sjsu.cs249.adb.Read2Request, edu.sjsu.cs249.adb.AckResponse> getRead2Method;
    if ((getRead2Method = ABDServiceGrpc.getRead2Method) == null) {
      synchronized (ABDServiceGrpc.class) {
        if ((getRead2Method = ABDServiceGrpc.getRead2Method) == null) {
          ABDServiceGrpc.getRead2Method = getRead2Method = 
              io.grpc.MethodDescriptor.<edu.sjsu.cs249.adb.Read2Request, edu.sjsu.cs249.adb.AckResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "adb.ABDService", "read2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.sjsu.cs249.adb.Read2Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.sjsu.cs249.adb.AckResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ABDServiceMethodDescriptorSupplier("read2"))
                  .build();
          }
        }
     }
     return getRead2Method;
  }

  private static volatile io.grpc.MethodDescriptor<edu.sjsu.cs249.adb.WriteRequest,
      edu.sjsu.cs249.adb.AckResponse> getWriteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "write",
      requestType = edu.sjsu.cs249.adb.WriteRequest.class,
      responseType = edu.sjsu.cs249.adb.AckResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<edu.sjsu.cs249.adb.WriteRequest,
      edu.sjsu.cs249.adb.AckResponse> getWriteMethod() {
    io.grpc.MethodDescriptor<edu.sjsu.cs249.adb.WriteRequest, edu.sjsu.cs249.adb.AckResponse> getWriteMethod;
    if ((getWriteMethod = ABDServiceGrpc.getWriteMethod) == null) {
      synchronized (ABDServiceGrpc.class) {
        if ((getWriteMethod = ABDServiceGrpc.getWriteMethod) == null) {
          ABDServiceGrpc.getWriteMethod = getWriteMethod = 
              io.grpc.MethodDescriptor.<edu.sjsu.cs249.adb.WriteRequest, edu.sjsu.cs249.adb.AckResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "adb.ABDService", "write"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.sjsu.cs249.adb.WriteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.sjsu.cs249.adb.AckResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ABDServiceMethodDescriptorSupplier("write"))
                  .build();
          }
        }
     }
     return getWriteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ABDServiceStub newStub(io.grpc.Channel channel) {
    return new ABDServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ABDServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ABDServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ABDServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ABDServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ABDServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void name(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<edu.sjsu.cs249.adb.NameResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNameMethod(), responseObserver);
    }

    /**
     */
    public void read1(edu.sjsu.cs249.adb.Read1Request request,
        io.grpc.stub.StreamObserver<edu.sjsu.cs249.adb.Read1Response> responseObserver) {
      asyncUnimplementedUnaryCall(getRead1Method(), responseObserver);
    }

    /**
     */
    public void read2(edu.sjsu.cs249.adb.Read2Request request,
        io.grpc.stub.StreamObserver<edu.sjsu.cs249.adb.AckResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRead2Method(), responseObserver);
    }

    /**
     */
    public void write(edu.sjsu.cs249.adb.WriteRequest request,
        io.grpc.stub.StreamObserver<edu.sjsu.cs249.adb.AckResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWriteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                edu.sjsu.cs249.adb.NameResponse>(
                  this, METHODID_NAME)))
          .addMethod(
            getRead1Method(),
            asyncUnaryCall(
              new MethodHandlers<
                edu.sjsu.cs249.adb.Read1Request,
                edu.sjsu.cs249.adb.Read1Response>(
                  this, METHODID_READ1)))
          .addMethod(
            getRead2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                edu.sjsu.cs249.adb.Read2Request,
                edu.sjsu.cs249.adb.AckResponse>(
                  this, METHODID_READ2)))
          .addMethod(
            getWriteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                edu.sjsu.cs249.adb.WriteRequest,
                edu.sjsu.cs249.adb.AckResponse>(
                  this, METHODID_WRITE)))
          .build();
    }
  }

  /**
   */
  public static final class ABDServiceStub extends io.grpc.stub.AbstractStub<ABDServiceStub> {
    private ABDServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ABDServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ABDServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ABDServiceStub(channel, callOptions);
    }

    /**
     */
    public void name(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<edu.sjsu.cs249.adb.NameResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void read1(edu.sjsu.cs249.adb.Read1Request request,
        io.grpc.stub.StreamObserver<edu.sjsu.cs249.adb.Read1Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRead1Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void read2(edu.sjsu.cs249.adb.Read2Request request,
        io.grpc.stub.StreamObserver<edu.sjsu.cs249.adb.AckResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRead2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void write(edu.sjsu.cs249.adb.WriteRequest request,
        io.grpc.stub.StreamObserver<edu.sjsu.cs249.adb.AckResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWriteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ABDServiceBlockingStub extends io.grpc.stub.AbstractStub<ABDServiceBlockingStub> {
    private ABDServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ABDServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ABDServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ABDServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public edu.sjsu.cs249.adb.NameResponse name(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public edu.sjsu.cs249.adb.Read1Response read1(edu.sjsu.cs249.adb.Read1Request request) {
      return blockingUnaryCall(
          getChannel(), getRead1Method(), getCallOptions(), request);
    }

    /**
     */
    public edu.sjsu.cs249.adb.AckResponse read2(edu.sjsu.cs249.adb.Read2Request request) {
      return blockingUnaryCall(
          getChannel(), getRead2Method(), getCallOptions(), request);
    }

    /**
     */
    public edu.sjsu.cs249.adb.AckResponse write(edu.sjsu.cs249.adb.WriteRequest request) {
      return blockingUnaryCall(
          getChannel(), getWriteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ABDServiceFutureStub extends io.grpc.stub.AbstractStub<ABDServiceFutureStub> {
    private ABDServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ABDServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ABDServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ABDServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<edu.sjsu.cs249.adb.NameResponse> name(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<edu.sjsu.cs249.adb.Read1Response> read1(
        edu.sjsu.cs249.adb.Read1Request request) {
      return futureUnaryCall(
          getChannel().newCall(getRead1Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<edu.sjsu.cs249.adb.AckResponse> read2(
        edu.sjsu.cs249.adb.Read2Request request) {
      return futureUnaryCall(
          getChannel().newCall(getRead2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<edu.sjsu.cs249.adb.AckResponse> write(
        edu.sjsu.cs249.adb.WriteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getWriteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_NAME = 0;
  private static final int METHODID_READ1 = 1;
  private static final int METHODID_READ2 = 2;
  private static final int METHODID_WRITE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ABDServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ABDServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_NAME:
          serviceImpl.name((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<edu.sjsu.cs249.adb.NameResponse>) responseObserver);
          break;
        case METHODID_READ1:
          serviceImpl.read1((edu.sjsu.cs249.adb.Read1Request) request,
              (io.grpc.stub.StreamObserver<edu.sjsu.cs249.adb.Read1Response>) responseObserver);
          break;
        case METHODID_READ2:
          serviceImpl.read2((edu.sjsu.cs249.adb.Read2Request) request,
              (io.grpc.stub.StreamObserver<edu.sjsu.cs249.adb.AckResponse>) responseObserver);
          break;
        case METHODID_WRITE:
          serviceImpl.write((edu.sjsu.cs249.adb.WriteRequest) request,
              (io.grpc.stub.StreamObserver<edu.sjsu.cs249.adb.AckResponse>) responseObserver);
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

  private static abstract class ABDServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ABDServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return edu.sjsu.cs249.adb.Abd.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ABDService");
    }
  }

  private static final class ABDServiceFileDescriptorSupplier
      extends ABDServiceBaseDescriptorSupplier {
    ABDServiceFileDescriptorSupplier() {}
  }

  private static final class ABDServiceMethodDescriptorSupplier
      extends ABDServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ABDServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ABDServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ABDServiceFileDescriptorSupplier())
              .addMethod(getNameMethod())
              .addMethod(getRead1Method())
              .addMethod(getRead2Method())
              .addMethod(getWriteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
