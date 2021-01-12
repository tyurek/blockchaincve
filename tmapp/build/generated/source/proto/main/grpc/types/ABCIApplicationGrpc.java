package types;

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
    value = "by gRPC proto compiler (version 1.22.1)",
    comments = "Source: github.com/tendermint/tendermint/abci/types/types.proto")
public final class ABCIApplicationGrpc {

  private ABCIApplicationGrpc() {}

  public static final String SERVICE_NAME = "types.ABCIApplication";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<types.Types.RequestEcho,
      types.Types.ResponseEcho> getEchoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Echo",
      requestType = types.Types.RequestEcho.class,
      responseType = types.Types.ResponseEcho.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<types.Types.RequestEcho,
      types.Types.ResponseEcho> getEchoMethod() {
    io.grpc.MethodDescriptor<types.Types.RequestEcho, types.Types.ResponseEcho> getEchoMethod;
    if ((getEchoMethod = ABCIApplicationGrpc.getEchoMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getEchoMethod = ABCIApplicationGrpc.getEchoMethod) == null) {
          ABCIApplicationGrpc.getEchoMethod = getEchoMethod = 
              io.grpc.MethodDescriptor.<types.Types.RequestEcho, types.Types.ResponseEcho>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "types.ABCIApplication", "Echo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  types.Types.RequestEcho.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  types.Types.ResponseEcho.getDefaultInstance()))
                  .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("Echo"))
                  .build();
          }
        }
     }
     return getEchoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<types.Types.RequestFlush,
      types.Types.ResponseFlush> getFlushMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Flush",
      requestType = types.Types.RequestFlush.class,
      responseType = types.Types.ResponseFlush.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<types.Types.RequestFlush,
      types.Types.ResponseFlush> getFlushMethod() {
    io.grpc.MethodDescriptor<types.Types.RequestFlush, types.Types.ResponseFlush> getFlushMethod;
    if ((getFlushMethod = ABCIApplicationGrpc.getFlushMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getFlushMethod = ABCIApplicationGrpc.getFlushMethod) == null) {
          ABCIApplicationGrpc.getFlushMethod = getFlushMethod = 
              io.grpc.MethodDescriptor.<types.Types.RequestFlush, types.Types.ResponseFlush>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "types.ABCIApplication", "Flush"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  types.Types.RequestFlush.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  types.Types.ResponseFlush.getDefaultInstance()))
                  .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("Flush"))
                  .build();
          }
        }
     }
     return getFlushMethod;
  }

  private static volatile io.grpc.MethodDescriptor<types.Types.RequestInfo,
      types.Types.ResponseInfo> getInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Info",
      requestType = types.Types.RequestInfo.class,
      responseType = types.Types.ResponseInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<types.Types.RequestInfo,
      types.Types.ResponseInfo> getInfoMethod() {
    io.grpc.MethodDescriptor<types.Types.RequestInfo, types.Types.ResponseInfo> getInfoMethod;
    if ((getInfoMethod = ABCIApplicationGrpc.getInfoMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getInfoMethod = ABCIApplicationGrpc.getInfoMethod) == null) {
          ABCIApplicationGrpc.getInfoMethod = getInfoMethod = 
              io.grpc.MethodDescriptor.<types.Types.RequestInfo, types.Types.ResponseInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "types.ABCIApplication", "Info"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  types.Types.RequestInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  types.Types.ResponseInfo.getDefaultInstance()))
                  .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("Info"))
                  .build();
          }
        }
     }
     return getInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<types.Types.RequestSetOption,
      types.Types.ResponseSetOption> getSetOptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetOption",
      requestType = types.Types.RequestSetOption.class,
      responseType = types.Types.ResponseSetOption.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<types.Types.RequestSetOption,
      types.Types.ResponseSetOption> getSetOptionMethod() {
    io.grpc.MethodDescriptor<types.Types.RequestSetOption, types.Types.ResponseSetOption> getSetOptionMethod;
    if ((getSetOptionMethod = ABCIApplicationGrpc.getSetOptionMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getSetOptionMethod = ABCIApplicationGrpc.getSetOptionMethod) == null) {
          ABCIApplicationGrpc.getSetOptionMethod = getSetOptionMethod = 
              io.grpc.MethodDescriptor.<types.Types.RequestSetOption, types.Types.ResponseSetOption>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "types.ABCIApplication", "SetOption"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  types.Types.RequestSetOption.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  types.Types.ResponseSetOption.getDefaultInstance()))
                  .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("SetOption"))
                  .build();
          }
        }
     }
     return getSetOptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<types.Types.RequestDeliverTx,
      types.Types.ResponseDeliverTx> getDeliverTxMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeliverTx",
      requestType = types.Types.RequestDeliverTx.class,
      responseType = types.Types.ResponseDeliverTx.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<types.Types.RequestDeliverTx,
      types.Types.ResponseDeliverTx> getDeliverTxMethod() {
    io.grpc.MethodDescriptor<types.Types.RequestDeliverTx, types.Types.ResponseDeliverTx> getDeliverTxMethod;
    if ((getDeliverTxMethod = ABCIApplicationGrpc.getDeliverTxMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getDeliverTxMethod = ABCIApplicationGrpc.getDeliverTxMethod) == null) {
          ABCIApplicationGrpc.getDeliverTxMethod = getDeliverTxMethod = 
              io.grpc.MethodDescriptor.<types.Types.RequestDeliverTx, types.Types.ResponseDeliverTx>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "types.ABCIApplication", "DeliverTx"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  types.Types.RequestDeliverTx.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  types.Types.ResponseDeliverTx.getDefaultInstance()))
                  .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("DeliverTx"))
                  .build();
          }
        }
     }
     return getDeliverTxMethod;
  }

  private static volatile io.grpc.MethodDescriptor<types.Types.RequestCheckTx,
      types.Types.ResponseCheckTx> getCheckTxMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckTx",
      requestType = types.Types.RequestCheckTx.class,
      responseType = types.Types.ResponseCheckTx.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<types.Types.RequestCheckTx,
      types.Types.ResponseCheckTx> getCheckTxMethod() {
    io.grpc.MethodDescriptor<types.Types.RequestCheckTx, types.Types.ResponseCheckTx> getCheckTxMethod;
    if ((getCheckTxMethod = ABCIApplicationGrpc.getCheckTxMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getCheckTxMethod = ABCIApplicationGrpc.getCheckTxMethod) == null) {
          ABCIApplicationGrpc.getCheckTxMethod = getCheckTxMethod = 
              io.grpc.MethodDescriptor.<types.Types.RequestCheckTx, types.Types.ResponseCheckTx>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "types.ABCIApplication", "CheckTx"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  types.Types.RequestCheckTx.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  types.Types.ResponseCheckTx.getDefaultInstance()))
                  .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("CheckTx"))
                  .build();
          }
        }
     }
     return getCheckTxMethod;
  }

  private static volatile io.grpc.MethodDescriptor<types.Types.RequestQuery,
      types.Types.ResponseQuery> getQueryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Query",
      requestType = types.Types.RequestQuery.class,
      responseType = types.Types.ResponseQuery.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<types.Types.RequestQuery,
      types.Types.ResponseQuery> getQueryMethod() {
    io.grpc.MethodDescriptor<types.Types.RequestQuery, types.Types.ResponseQuery> getQueryMethod;
    if ((getQueryMethod = ABCIApplicationGrpc.getQueryMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getQueryMethod = ABCIApplicationGrpc.getQueryMethod) == null) {
          ABCIApplicationGrpc.getQueryMethod = getQueryMethod = 
              io.grpc.MethodDescriptor.<types.Types.RequestQuery, types.Types.ResponseQuery>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "types.ABCIApplication", "Query"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  types.Types.RequestQuery.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  types.Types.ResponseQuery.getDefaultInstance()))
                  .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("Query"))
                  .build();
          }
        }
     }
     return getQueryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<types.Types.RequestCommit,
      types.Types.ResponseCommit> getCommitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Commit",
      requestType = types.Types.RequestCommit.class,
      responseType = types.Types.ResponseCommit.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<types.Types.RequestCommit,
      types.Types.ResponseCommit> getCommitMethod() {
    io.grpc.MethodDescriptor<types.Types.RequestCommit, types.Types.ResponseCommit> getCommitMethod;
    if ((getCommitMethod = ABCIApplicationGrpc.getCommitMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getCommitMethod = ABCIApplicationGrpc.getCommitMethod) == null) {
          ABCIApplicationGrpc.getCommitMethod = getCommitMethod = 
              io.grpc.MethodDescriptor.<types.Types.RequestCommit, types.Types.ResponseCommit>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "types.ABCIApplication", "Commit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  types.Types.RequestCommit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  types.Types.ResponseCommit.getDefaultInstance()))
                  .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("Commit"))
                  .build();
          }
        }
     }
     return getCommitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<types.Types.RequestInitChain,
      types.Types.ResponseInitChain> getInitChainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InitChain",
      requestType = types.Types.RequestInitChain.class,
      responseType = types.Types.ResponseInitChain.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<types.Types.RequestInitChain,
      types.Types.ResponseInitChain> getInitChainMethod() {
    io.grpc.MethodDescriptor<types.Types.RequestInitChain, types.Types.ResponseInitChain> getInitChainMethod;
    if ((getInitChainMethod = ABCIApplicationGrpc.getInitChainMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getInitChainMethod = ABCIApplicationGrpc.getInitChainMethod) == null) {
          ABCIApplicationGrpc.getInitChainMethod = getInitChainMethod = 
              io.grpc.MethodDescriptor.<types.Types.RequestInitChain, types.Types.ResponseInitChain>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "types.ABCIApplication", "InitChain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  types.Types.RequestInitChain.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  types.Types.ResponseInitChain.getDefaultInstance()))
                  .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("InitChain"))
                  .build();
          }
        }
     }
     return getInitChainMethod;
  }

  private static volatile io.grpc.MethodDescriptor<types.Types.RequestBeginBlock,
      types.Types.ResponseBeginBlock> getBeginBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BeginBlock",
      requestType = types.Types.RequestBeginBlock.class,
      responseType = types.Types.ResponseBeginBlock.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<types.Types.RequestBeginBlock,
      types.Types.ResponseBeginBlock> getBeginBlockMethod() {
    io.grpc.MethodDescriptor<types.Types.RequestBeginBlock, types.Types.ResponseBeginBlock> getBeginBlockMethod;
    if ((getBeginBlockMethod = ABCIApplicationGrpc.getBeginBlockMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getBeginBlockMethod = ABCIApplicationGrpc.getBeginBlockMethod) == null) {
          ABCIApplicationGrpc.getBeginBlockMethod = getBeginBlockMethod = 
              io.grpc.MethodDescriptor.<types.Types.RequestBeginBlock, types.Types.ResponseBeginBlock>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "types.ABCIApplication", "BeginBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  types.Types.RequestBeginBlock.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  types.Types.ResponseBeginBlock.getDefaultInstance()))
                  .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("BeginBlock"))
                  .build();
          }
        }
     }
     return getBeginBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<types.Types.RequestEndBlock,
      types.Types.ResponseEndBlock> getEndBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EndBlock",
      requestType = types.Types.RequestEndBlock.class,
      responseType = types.Types.ResponseEndBlock.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<types.Types.RequestEndBlock,
      types.Types.ResponseEndBlock> getEndBlockMethod() {
    io.grpc.MethodDescriptor<types.Types.RequestEndBlock, types.Types.ResponseEndBlock> getEndBlockMethod;
    if ((getEndBlockMethod = ABCIApplicationGrpc.getEndBlockMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getEndBlockMethod = ABCIApplicationGrpc.getEndBlockMethod) == null) {
          ABCIApplicationGrpc.getEndBlockMethod = getEndBlockMethod = 
              io.grpc.MethodDescriptor.<types.Types.RequestEndBlock, types.Types.ResponseEndBlock>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "types.ABCIApplication", "EndBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  types.Types.RequestEndBlock.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  types.Types.ResponseEndBlock.getDefaultInstance()))
                  .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("EndBlock"))
                  .build();
          }
        }
     }
     return getEndBlockMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ABCIApplicationStub newStub(io.grpc.Channel channel) {
    return new ABCIApplicationStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ABCIApplicationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ABCIApplicationBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ABCIApplicationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ABCIApplicationFutureStub(channel);
  }

  /**
   */
  public static abstract class ABCIApplicationImplBase implements io.grpc.BindableService {

    /**
     */
    public void echo(types.Types.RequestEcho request,
        io.grpc.stub.StreamObserver<types.Types.ResponseEcho> responseObserver) {
      asyncUnimplementedUnaryCall(getEchoMethod(), responseObserver);
    }

    /**
     */
    public void flush(types.Types.RequestFlush request,
        io.grpc.stub.StreamObserver<types.Types.ResponseFlush> responseObserver) {
      asyncUnimplementedUnaryCall(getFlushMethod(), responseObserver);
    }

    /**
     */
    public void info(types.Types.RequestInfo request,
        io.grpc.stub.StreamObserver<types.Types.ResponseInfo> responseObserver) {
      asyncUnimplementedUnaryCall(getInfoMethod(), responseObserver);
    }

    /**
     */
    public void setOption(types.Types.RequestSetOption request,
        io.grpc.stub.StreamObserver<types.Types.ResponseSetOption> responseObserver) {
      asyncUnimplementedUnaryCall(getSetOptionMethod(), responseObserver);
    }

    /**
     */
    public void deliverTx(types.Types.RequestDeliverTx request,
        io.grpc.stub.StreamObserver<types.Types.ResponseDeliverTx> responseObserver) {
      asyncUnimplementedUnaryCall(getDeliverTxMethod(), responseObserver);
    }

    /**
     */
    public void checkTx(types.Types.RequestCheckTx request,
        io.grpc.stub.StreamObserver<types.Types.ResponseCheckTx> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckTxMethod(), responseObserver);
    }

    /**
     */
    public void query(types.Types.RequestQuery request,
        io.grpc.stub.StreamObserver<types.Types.ResponseQuery> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryMethod(), responseObserver);
    }

    /**
     */
    public void commit(types.Types.RequestCommit request,
        io.grpc.stub.StreamObserver<types.Types.ResponseCommit> responseObserver) {
      asyncUnimplementedUnaryCall(getCommitMethod(), responseObserver);
    }

    /**
     */
    public void initChain(types.Types.RequestInitChain request,
        io.grpc.stub.StreamObserver<types.Types.ResponseInitChain> responseObserver) {
      asyncUnimplementedUnaryCall(getInitChainMethod(), responseObserver);
    }

    /**
     */
    public void beginBlock(types.Types.RequestBeginBlock request,
        io.grpc.stub.StreamObserver<types.Types.ResponseBeginBlock> responseObserver) {
      asyncUnimplementedUnaryCall(getBeginBlockMethod(), responseObserver);
    }

    /**
     */
    public void endBlock(types.Types.RequestEndBlock request,
        io.grpc.stub.StreamObserver<types.Types.ResponseEndBlock> responseObserver) {
      asyncUnimplementedUnaryCall(getEndBlockMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getEchoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                types.Types.RequestEcho,
                types.Types.ResponseEcho>(
                  this, METHODID_ECHO)))
          .addMethod(
            getFlushMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                types.Types.RequestFlush,
                types.Types.ResponseFlush>(
                  this, METHODID_FLUSH)))
          .addMethod(
            getInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                types.Types.RequestInfo,
                types.Types.ResponseInfo>(
                  this, METHODID_INFO)))
          .addMethod(
            getSetOptionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                types.Types.RequestSetOption,
                types.Types.ResponseSetOption>(
                  this, METHODID_SET_OPTION)))
          .addMethod(
            getDeliverTxMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                types.Types.RequestDeliverTx,
                types.Types.ResponseDeliverTx>(
                  this, METHODID_DELIVER_TX)))
          .addMethod(
            getCheckTxMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                types.Types.RequestCheckTx,
                types.Types.ResponseCheckTx>(
                  this, METHODID_CHECK_TX)))
          .addMethod(
            getQueryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                types.Types.RequestQuery,
                types.Types.ResponseQuery>(
                  this, METHODID_QUERY)))
          .addMethod(
            getCommitMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                types.Types.RequestCommit,
                types.Types.ResponseCommit>(
                  this, METHODID_COMMIT)))
          .addMethod(
            getInitChainMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                types.Types.RequestInitChain,
                types.Types.ResponseInitChain>(
                  this, METHODID_INIT_CHAIN)))
          .addMethod(
            getBeginBlockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                types.Types.RequestBeginBlock,
                types.Types.ResponseBeginBlock>(
                  this, METHODID_BEGIN_BLOCK)))
          .addMethod(
            getEndBlockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                types.Types.RequestEndBlock,
                types.Types.ResponseEndBlock>(
                  this, METHODID_END_BLOCK)))
          .build();
    }
  }

  /**
   */
  public static final class ABCIApplicationStub extends io.grpc.stub.AbstractStub<ABCIApplicationStub> {
    private ABCIApplicationStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ABCIApplicationStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ABCIApplicationStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ABCIApplicationStub(channel, callOptions);
    }

    /**
     */
    public void echo(types.Types.RequestEcho request,
        io.grpc.stub.StreamObserver<types.Types.ResponseEcho> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEchoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void flush(types.Types.RequestFlush request,
        io.grpc.stub.StreamObserver<types.Types.ResponseFlush> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFlushMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void info(types.Types.RequestInfo request,
        io.grpc.stub.StreamObserver<types.Types.ResponseInfo> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setOption(types.Types.RequestSetOption request,
        io.grpc.stub.StreamObserver<types.Types.ResponseSetOption> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetOptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deliverTx(types.Types.RequestDeliverTx request,
        io.grpc.stub.StreamObserver<types.Types.ResponseDeliverTx> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeliverTxMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkTx(types.Types.RequestCheckTx request,
        io.grpc.stub.StreamObserver<types.Types.ResponseCheckTx> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckTxMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void query(types.Types.RequestQuery request,
        io.grpc.stub.StreamObserver<types.Types.ResponseQuery> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void commit(types.Types.RequestCommit request,
        io.grpc.stub.StreamObserver<types.Types.ResponseCommit> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCommitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void initChain(types.Types.RequestInitChain request,
        io.grpc.stub.StreamObserver<types.Types.ResponseInitChain> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInitChainMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void beginBlock(types.Types.RequestBeginBlock request,
        io.grpc.stub.StreamObserver<types.Types.ResponseBeginBlock> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBeginBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void endBlock(types.Types.RequestEndBlock request,
        io.grpc.stub.StreamObserver<types.Types.ResponseEndBlock> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEndBlockMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ABCIApplicationBlockingStub extends io.grpc.stub.AbstractStub<ABCIApplicationBlockingStub> {
    private ABCIApplicationBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ABCIApplicationBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ABCIApplicationBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ABCIApplicationBlockingStub(channel, callOptions);
    }

    /**
     */
    public types.Types.ResponseEcho echo(types.Types.RequestEcho request) {
      return blockingUnaryCall(
          getChannel(), getEchoMethod(), getCallOptions(), request);
    }

    /**
     */
    public types.Types.ResponseFlush flush(types.Types.RequestFlush request) {
      return blockingUnaryCall(
          getChannel(), getFlushMethod(), getCallOptions(), request);
    }

    /**
     */
    public types.Types.ResponseInfo info(types.Types.RequestInfo request) {
      return blockingUnaryCall(
          getChannel(), getInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public types.Types.ResponseSetOption setOption(types.Types.RequestSetOption request) {
      return blockingUnaryCall(
          getChannel(), getSetOptionMethod(), getCallOptions(), request);
    }

    /**
     */
    public types.Types.ResponseDeliverTx deliverTx(types.Types.RequestDeliverTx request) {
      return blockingUnaryCall(
          getChannel(), getDeliverTxMethod(), getCallOptions(), request);
    }

    /**
     */
    public types.Types.ResponseCheckTx checkTx(types.Types.RequestCheckTx request) {
      return blockingUnaryCall(
          getChannel(), getCheckTxMethod(), getCallOptions(), request);
    }

    /**
     */
    public types.Types.ResponseQuery query(types.Types.RequestQuery request) {
      return blockingUnaryCall(
          getChannel(), getQueryMethod(), getCallOptions(), request);
    }

    /**
     */
    public types.Types.ResponseCommit commit(types.Types.RequestCommit request) {
      return blockingUnaryCall(
          getChannel(), getCommitMethod(), getCallOptions(), request);
    }

    /**
     */
    public types.Types.ResponseInitChain initChain(types.Types.RequestInitChain request) {
      return blockingUnaryCall(
          getChannel(), getInitChainMethod(), getCallOptions(), request);
    }

    /**
     */
    public types.Types.ResponseBeginBlock beginBlock(types.Types.RequestBeginBlock request) {
      return blockingUnaryCall(
          getChannel(), getBeginBlockMethod(), getCallOptions(), request);
    }

    /**
     */
    public types.Types.ResponseEndBlock endBlock(types.Types.RequestEndBlock request) {
      return blockingUnaryCall(
          getChannel(), getEndBlockMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ABCIApplicationFutureStub extends io.grpc.stub.AbstractStub<ABCIApplicationFutureStub> {
    private ABCIApplicationFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ABCIApplicationFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ABCIApplicationFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ABCIApplicationFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<types.Types.ResponseEcho> echo(
        types.Types.RequestEcho request) {
      return futureUnaryCall(
          getChannel().newCall(getEchoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<types.Types.ResponseFlush> flush(
        types.Types.RequestFlush request) {
      return futureUnaryCall(
          getChannel().newCall(getFlushMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<types.Types.ResponseInfo> info(
        types.Types.RequestInfo request) {
      return futureUnaryCall(
          getChannel().newCall(getInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<types.Types.ResponseSetOption> setOption(
        types.Types.RequestSetOption request) {
      return futureUnaryCall(
          getChannel().newCall(getSetOptionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<types.Types.ResponseDeliverTx> deliverTx(
        types.Types.RequestDeliverTx request) {
      return futureUnaryCall(
          getChannel().newCall(getDeliverTxMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<types.Types.ResponseCheckTx> checkTx(
        types.Types.RequestCheckTx request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckTxMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<types.Types.ResponseQuery> query(
        types.Types.RequestQuery request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<types.Types.ResponseCommit> commit(
        types.Types.RequestCommit request) {
      return futureUnaryCall(
          getChannel().newCall(getCommitMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<types.Types.ResponseInitChain> initChain(
        types.Types.RequestInitChain request) {
      return futureUnaryCall(
          getChannel().newCall(getInitChainMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<types.Types.ResponseBeginBlock> beginBlock(
        types.Types.RequestBeginBlock request) {
      return futureUnaryCall(
          getChannel().newCall(getBeginBlockMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<types.Types.ResponseEndBlock> endBlock(
        types.Types.RequestEndBlock request) {
      return futureUnaryCall(
          getChannel().newCall(getEndBlockMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ECHO = 0;
  private static final int METHODID_FLUSH = 1;
  private static final int METHODID_INFO = 2;
  private static final int METHODID_SET_OPTION = 3;
  private static final int METHODID_DELIVER_TX = 4;
  private static final int METHODID_CHECK_TX = 5;
  private static final int METHODID_QUERY = 6;
  private static final int METHODID_COMMIT = 7;
  private static final int METHODID_INIT_CHAIN = 8;
  private static final int METHODID_BEGIN_BLOCK = 9;
  private static final int METHODID_END_BLOCK = 10;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ABCIApplicationImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ABCIApplicationImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ECHO:
          serviceImpl.echo((types.Types.RequestEcho) request,
              (io.grpc.stub.StreamObserver<types.Types.ResponseEcho>) responseObserver);
          break;
        case METHODID_FLUSH:
          serviceImpl.flush((types.Types.RequestFlush) request,
              (io.grpc.stub.StreamObserver<types.Types.ResponseFlush>) responseObserver);
          break;
        case METHODID_INFO:
          serviceImpl.info((types.Types.RequestInfo) request,
              (io.grpc.stub.StreamObserver<types.Types.ResponseInfo>) responseObserver);
          break;
        case METHODID_SET_OPTION:
          serviceImpl.setOption((types.Types.RequestSetOption) request,
              (io.grpc.stub.StreamObserver<types.Types.ResponseSetOption>) responseObserver);
          break;
        case METHODID_DELIVER_TX:
          serviceImpl.deliverTx((types.Types.RequestDeliverTx) request,
              (io.grpc.stub.StreamObserver<types.Types.ResponseDeliverTx>) responseObserver);
          break;
        case METHODID_CHECK_TX:
          serviceImpl.checkTx((types.Types.RequestCheckTx) request,
              (io.grpc.stub.StreamObserver<types.Types.ResponseCheckTx>) responseObserver);
          break;
        case METHODID_QUERY:
          serviceImpl.query((types.Types.RequestQuery) request,
              (io.grpc.stub.StreamObserver<types.Types.ResponseQuery>) responseObserver);
          break;
        case METHODID_COMMIT:
          serviceImpl.commit((types.Types.RequestCommit) request,
              (io.grpc.stub.StreamObserver<types.Types.ResponseCommit>) responseObserver);
          break;
        case METHODID_INIT_CHAIN:
          serviceImpl.initChain((types.Types.RequestInitChain) request,
              (io.grpc.stub.StreamObserver<types.Types.ResponseInitChain>) responseObserver);
          break;
        case METHODID_BEGIN_BLOCK:
          serviceImpl.beginBlock((types.Types.RequestBeginBlock) request,
              (io.grpc.stub.StreamObserver<types.Types.ResponseBeginBlock>) responseObserver);
          break;
        case METHODID_END_BLOCK:
          serviceImpl.endBlock((types.Types.RequestEndBlock) request,
              (io.grpc.stub.StreamObserver<types.Types.ResponseEndBlock>) responseObserver);
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

  private static abstract class ABCIApplicationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ABCIApplicationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return types.Types.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ABCIApplication");
    }
  }

  private static final class ABCIApplicationFileDescriptorSupplier
      extends ABCIApplicationBaseDescriptorSupplier {
    ABCIApplicationFileDescriptorSupplier() {}
  }

  private static final class ABCIApplicationMethodDescriptorSupplier
      extends ABCIApplicationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ABCIApplicationMethodDescriptorSupplier(String methodName) {
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
      synchronized (ABCIApplicationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ABCIApplicationFileDescriptorSupplier())
              .addMethod(getEchoMethod())
              .addMethod(getFlushMethod())
              .addMethod(getInfoMethod())
              .addMethod(getSetOptionMethod())
              .addMethod(getDeliverTxMethod())
              .addMethod(getCheckTxMethod())
              .addMethod(getQueryMethod())
              .addMethod(getCommitMethod())
              .addMethod(getInitChainMethod())
              .addMethod(getBeginBlockMethod())
              .addMethod(getEndBlockMethod())
              .build();
        }
      }
    }
    return result;
  }
}
