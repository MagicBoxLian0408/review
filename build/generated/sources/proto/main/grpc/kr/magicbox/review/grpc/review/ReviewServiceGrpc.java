package kr.magicbox.review.grpc.review;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class ReviewServiceGrpc {

  private ReviewServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "magicbox.review.v1.ReviewService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<kr.magicbox.review.grpc.review.GetReviewRatingRequest,
      kr.magicbox.review.grpc.review.GetReviewRatingResponse> getGetReviewRatingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetReviewRating",
      requestType = kr.magicbox.review.grpc.review.GetReviewRatingRequest.class,
      responseType = kr.magicbox.review.grpc.review.GetReviewRatingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kr.magicbox.review.grpc.review.GetReviewRatingRequest,
      kr.magicbox.review.grpc.review.GetReviewRatingResponse> getGetReviewRatingMethod() {
    io.grpc.MethodDescriptor<kr.magicbox.review.grpc.review.GetReviewRatingRequest, kr.magicbox.review.grpc.review.GetReviewRatingResponse> getGetReviewRatingMethod;
    if ((getGetReviewRatingMethod = ReviewServiceGrpc.getGetReviewRatingMethod) == null) {
      synchronized (ReviewServiceGrpc.class) {
        if ((getGetReviewRatingMethod = ReviewServiceGrpc.getGetReviewRatingMethod) == null) {
          ReviewServiceGrpc.getGetReviewRatingMethod = getGetReviewRatingMethod =
              io.grpc.MethodDescriptor.<kr.magicbox.review.grpc.review.GetReviewRatingRequest, kr.magicbox.review.grpc.review.GetReviewRatingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetReviewRating"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kr.magicbox.review.grpc.review.GetReviewRatingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kr.magicbox.review.grpc.review.GetReviewRatingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReviewServiceMethodDescriptorSupplier("GetReviewRating"))
              .build();
        }
      }
    }
    return getGetReviewRatingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<kr.magicbox.review.grpc.review.GetAllReviewsByUserIdRequest,
      kr.magicbox.review.grpc.review.GetAllReviewsByUserIdResponse> getGetAllReviewsByUserIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllReviewsByUserId",
      requestType = kr.magicbox.review.grpc.review.GetAllReviewsByUserIdRequest.class,
      responseType = kr.magicbox.review.grpc.review.GetAllReviewsByUserIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<kr.magicbox.review.grpc.review.GetAllReviewsByUserIdRequest,
      kr.magicbox.review.grpc.review.GetAllReviewsByUserIdResponse> getGetAllReviewsByUserIdMethod() {
    io.grpc.MethodDescriptor<kr.magicbox.review.grpc.review.GetAllReviewsByUserIdRequest, kr.magicbox.review.grpc.review.GetAllReviewsByUserIdResponse> getGetAllReviewsByUserIdMethod;
    if ((getGetAllReviewsByUserIdMethod = ReviewServiceGrpc.getGetAllReviewsByUserIdMethod) == null) {
      synchronized (ReviewServiceGrpc.class) {
        if ((getGetAllReviewsByUserIdMethod = ReviewServiceGrpc.getGetAllReviewsByUserIdMethod) == null) {
          ReviewServiceGrpc.getGetAllReviewsByUserIdMethod = getGetAllReviewsByUserIdMethod =
              io.grpc.MethodDescriptor.<kr.magicbox.review.grpc.review.GetAllReviewsByUserIdRequest, kr.magicbox.review.grpc.review.GetAllReviewsByUserIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllReviewsByUserId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kr.magicbox.review.grpc.review.GetAllReviewsByUserIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  kr.magicbox.review.grpc.review.GetAllReviewsByUserIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReviewServiceMethodDescriptorSupplier("GetAllReviewsByUserId"))
              .build();
        }
      }
    }
    return getGetAllReviewsByUserIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ReviewServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReviewServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReviewServiceStub>() {
        @java.lang.Override
        public ReviewServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReviewServiceStub(channel, callOptions);
        }
      };
    return ReviewServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static ReviewServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReviewServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReviewServiceBlockingV2Stub>() {
        @java.lang.Override
        public ReviewServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReviewServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return ReviewServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ReviewServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReviewServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReviewServiceBlockingStub>() {
        @java.lang.Override
        public ReviewServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReviewServiceBlockingStub(channel, callOptions);
        }
      };
    return ReviewServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ReviewServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReviewServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReviewServiceFutureStub>() {
        @java.lang.Override
        public ReviewServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReviewServiceFutureStub(channel, callOptions);
        }
      };
    return ReviewServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getReviewRating(kr.magicbox.review.grpc.review.GetReviewRatingRequest request,
        io.grpc.stub.StreamObserver<kr.magicbox.review.grpc.review.GetReviewRatingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetReviewRatingMethod(), responseObserver);
    }

    /**
     */
    default void getAllReviewsByUserId(kr.magicbox.review.grpc.review.GetAllReviewsByUserIdRequest request,
        io.grpc.stub.StreamObserver<kr.magicbox.review.grpc.review.GetAllReviewsByUserIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllReviewsByUserIdMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ReviewService.
   */
  public static abstract class ReviewServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ReviewServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ReviewService.
   */
  public static final class ReviewServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ReviewServiceStub> {
    private ReviewServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReviewServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReviewServiceStub(channel, callOptions);
    }

    /**
     */
    public void getReviewRating(kr.magicbox.review.grpc.review.GetReviewRatingRequest request,
        io.grpc.stub.StreamObserver<kr.magicbox.review.grpc.review.GetReviewRatingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetReviewRatingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllReviewsByUserId(kr.magicbox.review.grpc.review.GetAllReviewsByUserIdRequest request,
        io.grpc.stub.StreamObserver<kr.magicbox.review.grpc.review.GetAllReviewsByUserIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllReviewsByUserIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ReviewService.
   */
  public static final class ReviewServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<ReviewServiceBlockingV2Stub> {
    private ReviewServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReviewServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReviewServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public kr.magicbox.review.grpc.review.GetReviewRatingResponse getReviewRating(kr.magicbox.review.grpc.review.GetReviewRatingRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetReviewRatingMethod(), getCallOptions(), request);
    }

    /**
     */
    public kr.magicbox.review.grpc.review.GetAllReviewsByUserIdResponse getAllReviewsByUserId(kr.magicbox.review.grpc.review.GetAllReviewsByUserIdRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetAllReviewsByUserIdMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service ReviewService.
   */
  public static final class ReviewServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ReviewServiceBlockingStub> {
    private ReviewServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReviewServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReviewServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public kr.magicbox.review.grpc.review.GetReviewRatingResponse getReviewRating(kr.magicbox.review.grpc.review.GetReviewRatingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetReviewRatingMethod(), getCallOptions(), request);
    }

    /**
     */
    public kr.magicbox.review.grpc.review.GetAllReviewsByUserIdResponse getAllReviewsByUserId(kr.magicbox.review.grpc.review.GetAllReviewsByUserIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllReviewsByUserIdMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ReviewService.
   */
  public static final class ReviewServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ReviewServiceFutureStub> {
    private ReviewServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReviewServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReviewServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<kr.magicbox.review.grpc.review.GetReviewRatingResponse> getReviewRating(
        kr.magicbox.review.grpc.review.GetReviewRatingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetReviewRatingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<kr.magicbox.review.grpc.review.GetAllReviewsByUserIdResponse> getAllReviewsByUserId(
        kr.magicbox.review.grpc.review.GetAllReviewsByUserIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllReviewsByUserIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_REVIEW_RATING = 0;
  private static final int METHODID_GET_ALL_REVIEWS_BY_USER_ID = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_REVIEW_RATING:
          serviceImpl.getReviewRating((kr.magicbox.review.grpc.review.GetReviewRatingRequest) request,
              (io.grpc.stub.StreamObserver<kr.magicbox.review.grpc.review.GetReviewRatingResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_REVIEWS_BY_USER_ID:
          serviceImpl.getAllReviewsByUserId((kr.magicbox.review.grpc.review.GetAllReviewsByUserIdRequest) request,
              (io.grpc.stub.StreamObserver<kr.magicbox.review.grpc.review.GetAllReviewsByUserIdResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetReviewRatingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              kr.magicbox.review.grpc.review.GetReviewRatingRequest,
              kr.magicbox.review.grpc.review.GetReviewRatingResponse>(
                service, METHODID_GET_REVIEW_RATING)))
        .addMethod(
          getGetAllReviewsByUserIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              kr.magicbox.review.grpc.review.GetAllReviewsByUserIdRequest,
              kr.magicbox.review.grpc.review.GetAllReviewsByUserIdResponse>(
                service, METHODID_GET_ALL_REVIEWS_BY_USER_ID)))
        .build();
  }

  private static abstract class ReviewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ReviewServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return kr.magicbox.review.grpc.review.ReviewOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ReviewService");
    }
  }

  private static final class ReviewServiceFileDescriptorSupplier
      extends ReviewServiceBaseDescriptorSupplier {
    ReviewServiceFileDescriptorSupplier() {}
  }

  private static final class ReviewServiceMethodDescriptorSupplier
      extends ReviewServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ReviewServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ReviewServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ReviewServiceFileDescriptorSupplier())
              .addMethod(getGetReviewRatingMethod())
              .addMethod(getGetAllReviewsByUserIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
