package com.balluunn.startgrowingup.auth.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * AuthService defines public authentication and account-verification flows.
 * Protected RPCs require caller identity from Authorization header or gRPC metadata.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.66.0)",
    comments = "Source: auth/v1/auth.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AuthServiceGrpc {

  private AuthServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "auth.v1.AuthService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.balluunn.startgrowingup.auth.v1.StartRegistrationRequest,
      com.balluunn.startgrowingup.auth.v1.StartRegistrationResponse> getStartRegistrationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartRegistration",
      requestType = com.balluunn.startgrowingup.auth.v1.StartRegistrationRequest.class,
      responseType = com.balluunn.startgrowingup.auth.v1.StartRegistrationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.balluunn.startgrowingup.auth.v1.StartRegistrationRequest,
      com.balluunn.startgrowingup.auth.v1.StartRegistrationResponse> getStartRegistrationMethod() {
    io.grpc.MethodDescriptor<com.balluunn.startgrowingup.auth.v1.StartRegistrationRequest, com.balluunn.startgrowingup.auth.v1.StartRegistrationResponse> getStartRegistrationMethod;
    if ((getStartRegistrationMethod = AuthServiceGrpc.getStartRegistrationMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getStartRegistrationMethod = AuthServiceGrpc.getStartRegistrationMethod) == null) {
          AuthServiceGrpc.getStartRegistrationMethod = getStartRegistrationMethod =
              io.grpc.MethodDescriptor.<com.balluunn.startgrowingup.auth.v1.StartRegistrationRequest, com.balluunn.startgrowingup.auth.v1.StartRegistrationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartRegistration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.balluunn.startgrowingup.auth.v1.StartRegistrationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.balluunn.startgrowingup.auth.v1.StartRegistrationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("StartRegistration"))
              .build();
        }
      }
    }
    return getStartRegistrationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.balluunn.startgrowingup.auth.v1.VerifyRegistrationRequest,
      com.balluunn.startgrowingup.auth.v1.VerifyRegistrationResponse> getVerifyRegistrationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VerifyRegistration",
      requestType = com.balluunn.startgrowingup.auth.v1.VerifyRegistrationRequest.class,
      responseType = com.balluunn.startgrowingup.auth.v1.VerifyRegistrationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.balluunn.startgrowingup.auth.v1.VerifyRegistrationRequest,
      com.balluunn.startgrowingup.auth.v1.VerifyRegistrationResponse> getVerifyRegistrationMethod() {
    io.grpc.MethodDescriptor<com.balluunn.startgrowingup.auth.v1.VerifyRegistrationRequest, com.balluunn.startgrowingup.auth.v1.VerifyRegistrationResponse> getVerifyRegistrationMethod;
    if ((getVerifyRegistrationMethod = AuthServiceGrpc.getVerifyRegistrationMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getVerifyRegistrationMethod = AuthServiceGrpc.getVerifyRegistrationMethod) == null) {
          AuthServiceGrpc.getVerifyRegistrationMethod = getVerifyRegistrationMethod =
              io.grpc.MethodDescriptor.<com.balluunn.startgrowingup.auth.v1.VerifyRegistrationRequest, com.balluunn.startgrowingup.auth.v1.VerifyRegistrationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VerifyRegistration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.balluunn.startgrowingup.auth.v1.VerifyRegistrationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.balluunn.startgrowingup.auth.v1.VerifyRegistrationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("VerifyRegistration"))
              .build();
        }
      }
    }
    return getVerifyRegistrationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.balluunn.startgrowingup.auth.v1.ResendRegistrationCodeRequest,
      com.balluunn.startgrowingup.auth.v1.ResendRegistrationCodeResponse> getResendRegistrationCodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResendRegistrationCode",
      requestType = com.balluunn.startgrowingup.auth.v1.ResendRegistrationCodeRequest.class,
      responseType = com.balluunn.startgrowingup.auth.v1.ResendRegistrationCodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.balluunn.startgrowingup.auth.v1.ResendRegistrationCodeRequest,
      com.balluunn.startgrowingup.auth.v1.ResendRegistrationCodeResponse> getResendRegistrationCodeMethod() {
    io.grpc.MethodDescriptor<com.balluunn.startgrowingup.auth.v1.ResendRegistrationCodeRequest, com.balluunn.startgrowingup.auth.v1.ResendRegistrationCodeResponse> getResendRegistrationCodeMethod;
    if ((getResendRegistrationCodeMethod = AuthServiceGrpc.getResendRegistrationCodeMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getResendRegistrationCodeMethod = AuthServiceGrpc.getResendRegistrationCodeMethod) == null) {
          AuthServiceGrpc.getResendRegistrationCodeMethod = getResendRegistrationCodeMethod =
              io.grpc.MethodDescriptor.<com.balluunn.startgrowingup.auth.v1.ResendRegistrationCodeRequest, com.balluunn.startgrowingup.auth.v1.ResendRegistrationCodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResendRegistrationCode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.balluunn.startgrowingup.auth.v1.ResendRegistrationCodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.balluunn.startgrowingup.auth.v1.ResendRegistrationCodeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("ResendRegistrationCode"))
              .build();
        }
      }
    }
    return getResendRegistrationCodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.balluunn.startgrowingup.auth.v1.StartLoginRequest,
      com.balluunn.startgrowingup.auth.v1.StartLoginResponse> getStartLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartLogin",
      requestType = com.balluunn.startgrowingup.auth.v1.StartLoginRequest.class,
      responseType = com.balluunn.startgrowingup.auth.v1.StartLoginResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.balluunn.startgrowingup.auth.v1.StartLoginRequest,
      com.balluunn.startgrowingup.auth.v1.StartLoginResponse> getStartLoginMethod() {
    io.grpc.MethodDescriptor<com.balluunn.startgrowingup.auth.v1.StartLoginRequest, com.balluunn.startgrowingup.auth.v1.StartLoginResponse> getStartLoginMethod;
    if ((getStartLoginMethod = AuthServiceGrpc.getStartLoginMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getStartLoginMethod = AuthServiceGrpc.getStartLoginMethod) == null) {
          AuthServiceGrpc.getStartLoginMethod = getStartLoginMethod =
              io.grpc.MethodDescriptor.<com.balluunn.startgrowingup.auth.v1.StartLoginRequest, com.balluunn.startgrowingup.auth.v1.StartLoginResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartLogin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.balluunn.startgrowingup.auth.v1.StartLoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.balluunn.startgrowingup.auth.v1.StartLoginResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("StartLogin"))
              .build();
        }
      }
    }
    return getStartLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.balluunn.startgrowingup.auth.v1.VerifyLoginRequest,
      com.balluunn.startgrowingup.auth.v1.VerifyLoginResponse> getVerifyLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VerifyLogin",
      requestType = com.balluunn.startgrowingup.auth.v1.VerifyLoginRequest.class,
      responseType = com.balluunn.startgrowingup.auth.v1.VerifyLoginResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.balluunn.startgrowingup.auth.v1.VerifyLoginRequest,
      com.balluunn.startgrowingup.auth.v1.VerifyLoginResponse> getVerifyLoginMethod() {
    io.grpc.MethodDescriptor<com.balluunn.startgrowingup.auth.v1.VerifyLoginRequest, com.balluunn.startgrowingup.auth.v1.VerifyLoginResponse> getVerifyLoginMethod;
    if ((getVerifyLoginMethod = AuthServiceGrpc.getVerifyLoginMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getVerifyLoginMethod = AuthServiceGrpc.getVerifyLoginMethod) == null) {
          AuthServiceGrpc.getVerifyLoginMethod = getVerifyLoginMethod =
              io.grpc.MethodDescriptor.<com.balluunn.startgrowingup.auth.v1.VerifyLoginRequest, com.balluunn.startgrowingup.auth.v1.VerifyLoginResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VerifyLogin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.balluunn.startgrowingup.auth.v1.VerifyLoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.balluunn.startgrowingup.auth.v1.VerifyLoginResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("VerifyLogin"))
              .build();
        }
      }
    }
    return getVerifyLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.balluunn.startgrowingup.auth.v1.ResendLoginCodeRequest,
      com.balluunn.startgrowingup.auth.v1.ResendLoginCodeResponse> getResendLoginCodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResendLoginCode",
      requestType = com.balluunn.startgrowingup.auth.v1.ResendLoginCodeRequest.class,
      responseType = com.balluunn.startgrowingup.auth.v1.ResendLoginCodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.balluunn.startgrowingup.auth.v1.ResendLoginCodeRequest,
      com.balluunn.startgrowingup.auth.v1.ResendLoginCodeResponse> getResendLoginCodeMethod() {
    io.grpc.MethodDescriptor<com.balluunn.startgrowingup.auth.v1.ResendLoginCodeRequest, com.balluunn.startgrowingup.auth.v1.ResendLoginCodeResponse> getResendLoginCodeMethod;
    if ((getResendLoginCodeMethod = AuthServiceGrpc.getResendLoginCodeMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getResendLoginCodeMethod = AuthServiceGrpc.getResendLoginCodeMethod) == null) {
          AuthServiceGrpc.getResendLoginCodeMethod = getResendLoginCodeMethod =
              io.grpc.MethodDescriptor.<com.balluunn.startgrowingup.auth.v1.ResendLoginCodeRequest, com.balluunn.startgrowingup.auth.v1.ResendLoginCodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResendLoginCode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.balluunn.startgrowingup.auth.v1.ResendLoginCodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.balluunn.startgrowingup.auth.v1.ResendLoginCodeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("ResendLoginCode"))
              .build();
        }
      }
    }
    return getResendLoginCodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.balluunn.startgrowingup.auth.v1.StartEmailVerificationRequest,
      com.balluunn.startgrowingup.auth.v1.StartEmailVerificationResponse> getStartEmailVerificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartEmailVerification",
      requestType = com.balluunn.startgrowingup.auth.v1.StartEmailVerificationRequest.class,
      responseType = com.balluunn.startgrowingup.auth.v1.StartEmailVerificationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.balluunn.startgrowingup.auth.v1.StartEmailVerificationRequest,
      com.balluunn.startgrowingup.auth.v1.StartEmailVerificationResponse> getStartEmailVerificationMethod() {
    io.grpc.MethodDescriptor<com.balluunn.startgrowingup.auth.v1.StartEmailVerificationRequest, com.balluunn.startgrowingup.auth.v1.StartEmailVerificationResponse> getStartEmailVerificationMethod;
    if ((getStartEmailVerificationMethod = AuthServiceGrpc.getStartEmailVerificationMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getStartEmailVerificationMethod = AuthServiceGrpc.getStartEmailVerificationMethod) == null) {
          AuthServiceGrpc.getStartEmailVerificationMethod = getStartEmailVerificationMethod =
              io.grpc.MethodDescriptor.<com.balluunn.startgrowingup.auth.v1.StartEmailVerificationRequest, com.balluunn.startgrowingup.auth.v1.StartEmailVerificationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartEmailVerification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.balluunn.startgrowingup.auth.v1.StartEmailVerificationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.balluunn.startgrowingup.auth.v1.StartEmailVerificationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("StartEmailVerification"))
              .build();
        }
      }
    }
    return getStartEmailVerificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.balluunn.startgrowingup.auth.v1.ConfirmEmailVerificationRequest,
      com.balluunn.startgrowingup.auth.v1.ConfirmEmailVerificationResponse> getConfirmEmailVerificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConfirmEmailVerification",
      requestType = com.balluunn.startgrowingup.auth.v1.ConfirmEmailVerificationRequest.class,
      responseType = com.balluunn.startgrowingup.auth.v1.ConfirmEmailVerificationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.balluunn.startgrowingup.auth.v1.ConfirmEmailVerificationRequest,
      com.balluunn.startgrowingup.auth.v1.ConfirmEmailVerificationResponse> getConfirmEmailVerificationMethod() {
    io.grpc.MethodDescriptor<com.balluunn.startgrowingup.auth.v1.ConfirmEmailVerificationRequest, com.balluunn.startgrowingup.auth.v1.ConfirmEmailVerificationResponse> getConfirmEmailVerificationMethod;
    if ((getConfirmEmailVerificationMethod = AuthServiceGrpc.getConfirmEmailVerificationMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getConfirmEmailVerificationMethod = AuthServiceGrpc.getConfirmEmailVerificationMethod) == null) {
          AuthServiceGrpc.getConfirmEmailVerificationMethod = getConfirmEmailVerificationMethod =
              io.grpc.MethodDescriptor.<com.balluunn.startgrowingup.auth.v1.ConfirmEmailVerificationRequest, com.balluunn.startgrowingup.auth.v1.ConfirmEmailVerificationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConfirmEmailVerification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.balluunn.startgrowingup.auth.v1.ConfirmEmailVerificationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.balluunn.startgrowingup.auth.v1.ConfirmEmailVerificationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("ConfirmEmailVerification"))
              .build();
        }
      }
    }
    return getConfirmEmailVerificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.balluunn.startgrowingup.auth.v1.ResendEmailVerificationCodeRequest,
      com.balluunn.startgrowingup.auth.v1.ResendEmailVerificationCodeResponse> getResendEmailVerificationCodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResendEmailVerificationCode",
      requestType = com.balluunn.startgrowingup.auth.v1.ResendEmailVerificationCodeRequest.class,
      responseType = com.balluunn.startgrowingup.auth.v1.ResendEmailVerificationCodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.balluunn.startgrowingup.auth.v1.ResendEmailVerificationCodeRequest,
      com.balluunn.startgrowingup.auth.v1.ResendEmailVerificationCodeResponse> getResendEmailVerificationCodeMethod() {
    io.grpc.MethodDescriptor<com.balluunn.startgrowingup.auth.v1.ResendEmailVerificationCodeRequest, com.balluunn.startgrowingup.auth.v1.ResendEmailVerificationCodeResponse> getResendEmailVerificationCodeMethod;
    if ((getResendEmailVerificationCodeMethod = AuthServiceGrpc.getResendEmailVerificationCodeMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getResendEmailVerificationCodeMethod = AuthServiceGrpc.getResendEmailVerificationCodeMethod) == null) {
          AuthServiceGrpc.getResendEmailVerificationCodeMethod = getResendEmailVerificationCodeMethod =
              io.grpc.MethodDescriptor.<com.balluunn.startgrowingup.auth.v1.ResendEmailVerificationCodeRequest, com.balluunn.startgrowingup.auth.v1.ResendEmailVerificationCodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResendEmailVerificationCode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.balluunn.startgrowingup.auth.v1.ResendEmailVerificationCodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.balluunn.startgrowingup.auth.v1.ResendEmailVerificationCodeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("ResendEmailVerificationCode"))
              .build();
        }
      }
    }
    return getResendEmailVerificationCodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.balluunn.startgrowingup.auth.v1.StartPhoneChangeRequest,
      com.balluunn.startgrowingup.auth.v1.StartPhoneChangeResponse> getStartPhoneChangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartPhoneChange",
      requestType = com.balluunn.startgrowingup.auth.v1.StartPhoneChangeRequest.class,
      responseType = com.balluunn.startgrowingup.auth.v1.StartPhoneChangeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.balluunn.startgrowingup.auth.v1.StartPhoneChangeRequest,
      com.balluunn.startgrowingup.auth.v1.StartPhoneChangeResponse> getStartPhoneChangeMethod() {
    io.grpc.MethodDescriptor<com.balluunn.startgrowingup.auth.v1.StartPhoneChangeRequest, com.balluunn.startgrowingup.auth.v1.StartPhoneChangeResponse> getStartPhoneChangeMethod;
    if ((getStartPhoneChangeMethod = AuthServiceGrpc.getStartPhoneChangeMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getStartPhoneChangeMethod = AuthServiceGrpc.getStartPhoneChangeMethod) == null) {
          AuthServiceGrpc.getStartPhoneChangeMethod = getStartPhoneChangeMethod =
              io.grpc.MethodDescriptor.<com.balluunn.startgrowingup.auth.v1.StartPhoneChangeRequest, com.balluunn.startgrowingup.auth.v1.StartPhoneChangeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartPhoneChange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.balluunn.startgrowingup.auth.v1.StartPhoneChangeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.balluunn.startgrowingup.auth.v1.StartPhoneChangeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("StartPhoneChange"))
              .build();
        }
      }
    }
    return getStartPhoneChangeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.balluunn.startgrowingup.auth.v1.ConfirmPhoneChangeRequest,
      com.balluunn.startgrowingup.auth.v1.ConfirmPhoneChangeResponse> getConfirmPhoneChangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConfirmPhoneChange",
      requestType = com.balluunn.startgrowingup.auth.v1.ConfirmPhoneChangeRequest.class,
      responseType = com.balluunn.startgrowingup.auth.v1.ConfirmPhoneChangeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.balluunn.startgrowingup.auth.v1.ConfirmPhoneChangeRequest,
      com.balluunn.startgrowingup.auth.v1.ConfirmPhoneChangeResponse> getConfirmPhoneChangeMethod() {
    io.grpc.MethodDescriptor<com.balluunn.startgrowingup.auth.v1.ConfirmPhoneChangeRequest, com.balluunn.startgrowingup.auth.v1.ConfirmPhoneChangeResponse> getConfirmPhoneChangeMethod;
    if ((getConfirmPhoneChangeMethod = AuthServiceGrpc.getConfirmPhoneChangeMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getConfirmPhoneChangeMethod = AuthServiceGrpc.getConfirmPhoneChangeMethod) == null) {
          AuthServiceGrpc.getConfirmPhoneChangeMethod = getConfirmPhoneChangeMethod =
              io.grpc.MethodDescriptor.<com.balluunn.startgrowingup.auth.v1.ConfirmPhoneChangeRequest, com.balluunn.startgrowingup.auth.v1.ConfirmPhoneChangeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConfirmPhoneChange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.balluunn.startgrowingup.auth.v1.ConfirmPhoneChangeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.balluunn.startgrowingup.auth.v1.ConfirmPhoneChangeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("ConfirmPhoneChange"))
              .build();
        }
      }
    }
    return getConfirmPhoneChangeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.balluunn.startgrowingup.auth.v1.ResendPhoneChangeCodeRequest,
      com.balluunn.startgrowingup.auth.v1.ResendPhoneChangeCodeResponse> getResendPhoneChangeCodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResendPhoneChangeCode",
      requestType = com.balluunn.startgrowingup.auth.v1.ResendPhoneChangeCodeRequest.class,
      responseType = com.balluunn.startgrowingup.auth.v1.ResendPhoneChangeCodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.balluunn.startgrowingup.auth.v1.ResendPhoneChangeCodeRequest,
      com.balluunn.startgrowingup.auth.v1.ResendPhoneChangeCodeResponse> getResendPhoneChangeCodeMethod() {
    io.grpc.MethodDescriptor<com.balluunn.startgrowingup.auth.v1.ResendPhoneChangeCodeRequest, com.balluunn.startgrowingup.auth.v1.ResendPhoneChangeCodeResponse> getResendPhoneChangeCodeMethod;
    if ((getResendPhoneChangeCodeMethod = AuthServiceGrpc.getResendPhoneChangeCodeMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getResendPhoneChangeCodeMethod = AuthServiceGrpc.getResendPhoneChangeCodeMethod) == null) {
          AuthServiceGrpc.getResendPhoneChangeCodeMethod = getResendPhoneChangeCodeMethod =
              io.grpc.MethodDescriptor.<com.balluunn.startgrowingup.auth.v1.ResendPhoneChangeCodeRequest, com.balluunn.startgrowingup.auth.v1.ResendPhoneChangeCodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResendPhoneChangeCode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.balluunn.startgrowingup.auth.v1.ResendPhoneChangeCodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.balluunn.startgrowingup.auth.v1.ResendPhoneChangeCodeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("ResendPhoneChangeCode"))
              .build();
        }
      }
    }
    return getResendPhoneChangeCodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.balluunn.startgrowingup.auth.v1.RefreshSessionRequest,
      com.balluunn.startgrowingup.auth.v1.RefreshSessionResponse> getRefreshSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RefreshSession",
      requestType = com.balluunn.startgrowingup.auth.v1.RefreshSessionRequest.class,
      responseType = com.balluunn.startgrowingup.auth.v1.RefreshSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.balluunn.startgrowingup.auth.v1.RefreshSessionRequest,
      com.balluunn.startgrowingup.auth.v1.RefreshSessionResponse> getRefreshSessionMethod() {
    io.grpc.MethodDescriptor<com.balluunn.startgrowingup.auth.v1.RefreshSessionRequest, com.balluunn.startgrowingup.auth.v1.RefreshSessionResponse> getRefreshSessionMethod;
    if ((getRefreshSessionMethod = AuthServiceGrpc.getRefreshSessionMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getRefreshSessionMethod = AuthServiceGrpc.getRefreshSessionMethod) == null) {
          AuthServiceGrpc.getRefreshSessionMethod = getRefreshSessionMethod =
              io.grpc.MethodDescriptor.<com.balluunn.startgrowingup.auth.v1.RefreshSessionRequest, com.balluunn.startgrowingup.auth.v1.RefreshSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RefreshSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.balluunn.startgrowingup.auth.v1.RefreshSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.balluunn.startgrowingup.auth.v1.RefreshSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("RefreshSession"))
              .build();
        }
      }
    }
    return getRefreshSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.balluunn.startgrowingup.auth.v1.LogoutRequest,
      com.balluunn.startgrowingup.auth.v1.LogoutResponse> getLogoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Logout",
      requestType = com.balluunn.startgrowingup.auth.v1.LogoutRequest.class,
      responseType = com.balluunn.startgrowingup.auth.v1.LogoutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.balluunn.startgrowingup.auth.v1.LogoutRequest,
      com.balluunn.startgrowingup.auth.v1.LogoutResponse> getLogoutMethod() {
    io.grpc.MethodDescriptor<com.balluunn.startgrowingup.auth.v1.LogoutRequest, com.balluunn.startgrowingup.auth.v1.LogoutResponse> getLogoutMethod;
    if ((getLogoutMethod = AuthServiceGrpc.getLogoutMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getLogoutMethod = AuthServiceGrpc.getLogoutMethod) == null) {
          AuthServiceGrpc.getLogoutMethod = getLogoutMethod =
              io.grpc.MethodDescriptor.<com.balluunn.startgrowingup.auth.v1.LogoutRequest, com.balluunn.startgrowingup.auth.v1.LogoutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Logout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.balluunn.startgrowingup.auth.v1.LogoutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.balluunn.startgrowingup.auth.v1.LogoutResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("Logout"))
              .build();
        }
      }
    }
    return getLogoutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.balluunn.startgrowingup.auth.v1.StartPasswordResetRequest,
      com.balluunn.startgrowingup.auth.v1.StartPasswordResetResponse> getStartPasswordResetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartPasswordReset",
      requestType = com.balluunn.startgrowingup.auth.v1.StartPasswordResetRequest.class,
      responseType = com.balluunn.startgrowingup.auth.v1.StartPasswordResetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.balluunn.startgrowingup.auth.v1.StartPasswordResetRequest,
      com.balluunn.startgrowingup.auth.v1.StartPasswordResetResponse> getStartPasswordResetMethod() {
    io.grpc.MethodDescriptor<com.balluunn.startgrowingup.auth.v1.StartPasswordResetRequest, com.balluunn.startgrowingup.auth.v1.StartPasswordResetResponse> getStartPasswordResetMethod;
    if ((getStartPasswordResetMethod = AuthServiceGrpc.getStartPasswordResetMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getStartPasswordResetMethod = AuthServiceGrpc.getStartPasswordResetMethod) == null) {
          AuthServiceGrpc.getStartPasswordResetMethod = getStartPasswordResetMethod =
              io.grpc.MethodDescriptor.<com.balluunn.startgrowingup.auth.v1.StartPasswordResetRequest, com.balluunn.startgrowingup.auth.v1.StartPasswordResetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartPasswordReset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.balluunn.startgrowingup.auth.v1.StartPasswordResetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.balluunn.startgrowingup.auth.v1.StartPasswordResetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("StartPasswordReset"))
              .build();
        }
      }
    }
    return getStartPasswordResetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.balluunn.startgrowingup.auth.v1.ConfirmPasswordResetRequest,
      com.balluunn.startgrowingup.auth.v1.ConfirmPasswordResetResponse> getConfirmPasswordResetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConfirmPasswordReset",
      requestType = com.balluunn.startgrowingup.auth.v1.ConfirmPasswordResetRequest.class,
      responseType = com.balluunn.startgrowingup.auth.v1.ConfirmPasswordResetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.balluunn.startgrowingup.auth.v1.ConfirmPasswordResetRequest,
      com.balluunn.startgrowingup.auth.v1.ConfirmPasswordResetResponse> getConfirmPasswordResetMethod() {
    io.grpc.MethodDescriptor<com.balluunn.startgrowingup.auth.v1.ConfirmPasswordResetRequest, com.balluunn.startgrowingup.auth.v1.ConfirmPasswordResetResponse> getConfirmPasswordResetMethod;
    if ((getConfirmPasswordResetMethod = AuthServiceGrpc.getConfirmPasswordResetMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getConfirmPasswordResetMethod = AuthServiceGrpc.getConfirmPasswordResetMethod) == null) {
          AuthServiceGrpc.getConfirmPasswordResetMethod = getConfirmPasswordResetMethod =
              io.grpc.MethodDescriptor.<com.balluunn.startgrowingup.auth.v1.ConfirmPasswordResetRequest, com.balluunn.startgrowingup.auth.v1.ConfirmPasswordResetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConfirmPasswordReset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.balluunn.startgrowingup.auth.v1.ConfirmPasswordResetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.balluunn.startgrowingup.auth.v1.ConfirmPasswordResetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("ConfirmPasswordReset"))
              .build();
        }
      }
    }
    return getConfirmPasswordResetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.balluunn.startgrowingup.auth.v1.ResendPasswordResetCodeRequest,
      com.balluunn.startgrowingup.auth.v1.ResendPasswordResetCodeResponse> getResendPasswordResetCodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResendPasswordResetCode",
      requestType = com.balluunn.startgrowingup.auth.v1.ResendPasswordResetCodeRequest.class,
      responseType = com.balluunn.startgrowingup.auth.v1.ResendPasswordResetCodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.balluunn.startgrowingup.auth.v1.ResendPasswordResetCodeRequest,
      com.balluunn.startgrowingup.auth.v1.ResendPasswordResetCodeResponse> getResendPasswordResetCodeMethod() {
    io.grpc.MethodDescriptor<com.balluunn.startgrowingup.auth.v1.ResendPasswordResetCodeRequest, com.balluunn.startgrowingup.auth.v1.ResendPasswordResetCodeResponse> getResendPasswordResetCodeMethod;
    if ((getResendPasswordResetCodeMethod = AuthServiceGrpc.getResendPasswordResetCodeMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getResendPasswordResetCodeMethod = AuthServiceGrpc.getResendPasswordResetCodeMethod) == null) {
          AuthServiceGrpc.getResendPasswordResetCodeMethod = getResendPasswordResetCodeMethod =
              io.grpc.MethodDescriptor.<com.balluunn.startgrowingup.auth.v1.ResendPasswordResetCodeRequest, com.balluunn.startgrowingup.auth.v1.ResendPasswordResetCodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResendPasswordResetCode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.balluunn.startgrowingup.auth.v1.ResendPasswordResetCodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.balluunn.startgrowingup.auth.v1.ResendPasswordResetCodeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("ResendPasswordResetCode"))
              .build();
        }
      }
    }
    return getResendPasswordResetCodeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthServiceStub>() {
        @java.lang.Override
        public AuthServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthServiceStub(channel, callOptions);
        }
      };
    return AuthServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthServiceBlockingStub>() {
        @java.lang.Override
        public AuthServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthServiceBlockingStub(channel, callOptions);
        }
      };
    return AuthServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthServiceFutureStub>() {
        @java.lang.Override
        public AuthServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthServiceFutureStub(channel, callOptions);
        }
      };
    return AuthServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * AuthService defines public authentication and account-verification flows.
   * Protected RPCs require caller identity from Authorization header or gRPC metadata.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Starts the registration flow and sends a verification code to the phone number.
     * Validation failures should be returned via INVALID_ARGUMENT.
     * Duplicate principals should be returned via ALREADY_EXISTS.
     * </pre>
     */
    default void startRegistration(com.balluunn.startgrowingup.auth.v1.StartRegistrationRequest request,
        io.grpc.stub.StreamObserver<com.balluunn.startgrowingup.auth.v1.StartRegistrationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartRegistrationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Confirms the registration code and creates a new authenticated session.
     * Invalid or expired codes should be returned via FAILED_PRECONDITION or UNAUTHENTICATED.
     * </pre>
     */
    default void verifyRegistration(com.balluunn.startgrowingup.auth.v1.VerifyRegistrationRequest request,
        io.grpc.stub.StreamObserver<com.balluunn.startgrowingup.auth.v1.VerifyRegistrationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVerifyRegistrationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Resends the registration verification code for an active challenge.
     * Rate limiting should be returned via RESOURCE_EXHAUSTED.
     * </pre>
     */
    default void resendRegistrationCode(com.balluunn.startgrowingup.auth.v1.ResendRegistrationCodeRequest request,
        io.grpc.stub.StreamObserver<com.balluunn.startgrowingup.auth.v1.ResendRegistrationCodeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResendRegistrationCodeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Starts the login flow and sends a second-factor verification code.
     * Invalid credentials should be returned via UNAUTHENTICATED.
     * </pre>
     */
    default void startLogin(com.balluunn.startgrowingup.auth.v1.StartLoginRequest request,
        io.grpc.stub.StreamObserver<com.balluunn.startgrowingup.auth.v1.StartLoginResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartLoginMethod(), responseObserver);
    }

    /**
     * <pre>
     * Confirms the login code and issues a new authenticated session.
     * </pre>
     */
    default void verifyLogin(com.balluunn.startgrowingup.auth.v1.VerifyLoginRequest request,
        io.grpc.stub.StreamObserver<com.balluunn.startgrowingup.auth.v1.VerifyLoginResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVerifyLoginMethod(), responseObserver);
    }

    /**
     * <pre>
     * Resends the second-factor login code for an active challenge.
     * </pre>
     */
    default void resendLoginCode(com.balluunn.startgrowingup.auth.v1.ResendLoginCodeRequest request,
        io.grpc.stub.StreamObserver<com.balluunn.startgrowingup.auth.v1.ResendLoginCodeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResendLoginCodeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Starts email verification for the authenticated principal.
     * The caller must authenticate via Authorization header or gRPC metadata.
     * </pre>
     */
    default void startEmailVerification(com.balluunn.startgrowingup.auth.v1.StartEmailVerificationRequest request,
        io.grpc.stub.StreamObserver<com.balluunn.startgrowingup.auth.v1.StartEmailVerificationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartEmailVerificationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Confirms email verification for the authenticated principal.
     * The caller must authenticate via Authorization header or gRPC metadata.
     * </pre>
     */
    default void confirmEmailVerification(com.balluunn.startgrowingup.auth.v1.ConfirmEmailVerificationRequest request,
        io.grpc.stub.StreamObserver<com.balluunn.startgrowingup.auth.v1.ConfirmEmailVerificationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConfirmEmailVerificationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Resends a new email verification code for an active challenge.
     * The caller must authenticate via Authorization header or gRPC metadata.
     * </pre>
     */
    default void resendEmailVerificationCode(com.balluunn.startgrowingup.auth.v1.ResendEmailVerificationCodeRequest request,
        io.grpc.stub.StreamObserver<com.balluunn.startgrowingup.auth.v1.ResendEmailVerificationCodeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResendEmailVerificationCodeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Starts a phone number change flow for the authenticated principal.
     * The caller must authenticate via Authorization header or gRPC metadata.
     * </pre>
     */
    default void startPhoneChange(com.balluunn.startgrowingup.auth.v1.StartPhoneChangeRequest request,
        io.grpc.stub.StreamObserver<com.balluunn.startgrowingup.auth.v1.StartPhoneChangeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartPhoneChangeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Confirms the phone number change for the authenticated principal.
     * The caller must authenticate via Authorization header or gRPC metadata.
     * </pre>
     */
    default void confirmPhoneChange(com.balluunn.startgrowingup.auth.v1.ConfirmPhoneChangeRequest request,
        io.grpc.stub.StreamObserver<com.balluunn.startgrowingup.auth.v1.ConfirmPhoneChangeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConfirmPhoneChangeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Resends the phone change verification code for an active challenge.
     * The caller must authenticate via Authorization header or gRPC metadata.
     * </pre>
     */
    default void resendPhoneChangeCode(com.balluunn.startgrowingup.auth.v1.ResendPhoneChangeCodeRequest request,
        io.grpc.stub.StreamObserver<com.balluunn.startgrowingup.auth.v1.ResendPhoneChangeCodeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResendPhoneChangeCodeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Rotates session credentials using a valid refresh token.
     * Invalid or revoked tokens should be returned via UNAUTHENTICATED.
     * </pre>
     */
    default void refreshSession(com.balluunn.startgrowingup.auth.v1.RefreshSessionRequest request,
        io.grpc.stub.StreamObserver<com.balluunn.startgrowingup.auth.v1.RefreshSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRefreshSessionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Terminates the caller's currently authenticated session.
     * The caller must authenticate via Authorization header or gRPC metadata.
     * </pre>
     */
    default void logout(com.balluunn.startgrowingup.auth.v1.LogoutRequest request,
        io.grpc.stub.StreamObserver<com.balluunn.startgrowingup.auth.v1.LogoutResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLogoutMethod(), responseObserver);
    }

    /**
     * <pre>
     * Starts a password reset flow and sends a recovery code to the phone number.
     * For privacy, the server should avoid disclosing whether the account exists.
     * </pre>
     */
    default void startPasswordReset(com.balluunn.startgrowingup.auth.v1.StartPasswordResetRequest request,
        io.grpc.stub.StreamObserver<com.balluunn.startgrowingup.auth.v1.StartPasswordResetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartPasswordResetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Confirms a password reset using the recovery code and creates a fresh session.
     * </pre>
     */
    default void confirmPasswordReset(com.balluunn.startgrowingup.auth.v1.ConfirmPasswordResetRequest request,
        io.grpc.stub.StreamObserver<com.balluunn.startgrowingup.auth.v1.ConfirmPasswordResetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConfirmPasswordResetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Resends a password recovery code for an active challenge.
     * </pre>
     */
    default void resendPasswordResetCode(com.balluunn.startgrowingup.auth.v1.ResendPasswordResetCodeRequest request,
        io.grpc.stub.StreamObserver<com.balluunn.startgrowingup.auth.v1.ResendPasswordResetCodeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResendPasswordResetCodeMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AuthService.
   * <pre>
   * AuthService defines public authentication and account-verification flows.
   * Protected RPCs require caller identity from Authorization header or gRPC metadata.
   * </pre>
   */
  public static abstract class AuthServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AuthServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AuthService.
   * <pre>
   * AuthService defines public authentication and account-verification flows.
   * Protected RPCs require caller identity from Authorization header or gRPC metadata.
   * </pre>
   */
  public static final class AuthServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AuthServiceStub> {
    private AuthServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Starts the registration flow and sends a verification code to the phone number.
     * Validation failures should be returned via INVALID_ARGUMENT.
     * Duplicate principals should be returned via ALREADY_EXISTS.
     * </pre>
     */
    public void startRegistration(com.balluunn.startgrowingup.auth.v1.StartRegistrationRequest request,
        io.grpc.stub.StreamObserver<com.balluunn.startgrowingup.auth.v1.StartRegistrationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartRegistrationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Confirms the registration code and creates a new authenticated session.
     * Invalid or expired codes should be returned via FAILED_PRECONDITION or UNAUTHENTICATED.
     * </pre>
     */
    public void verifyRegistration(com.balluunn.startgrowingup.auth.v1.VerifyRegistrationRequest request,
        io.grpc.stub.StreamObserver<com.balluunn.startgrowingup.auth.v1.VerifyRegistrationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVerifyRegistrationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Resends the registration verification code for an active challenge.
     * Rate limiting should be returned via RESOURCE_EXHAUSTED.
     * </pre>
     */
    public void resendRegistrationCode(com.balluunn.startgrowingup.auth.v1.ResendRegistrationCodeRequest request,
        io.grpc.stub.StreamObserver<com.balluunn.startgrowingup.auth.v1.ResendRegistrationCodeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResendRegistrationCodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Starts the login flow and sends a second-factor verification code.
     * Invalid credentials should be returned via UNAUTHENTICATED.
     * </pre>
     */
    public void startLogin(com.balluunn.startgrowingup.auth.v1.StartLoginRequest request,
        io.grpc.stub.StreamObserver<com.balluunn.startgrowingup.auth.v1.StartLoginResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Confirms the login code and issues a new authenticated session.
     * </pre>
     */
    public void verifyLogin(com.balluunn.startgrowingup.auth.v1.VerifyLoginRequest request,
        io.grpc.stub.StreamObserver<com.balluunn.startgrowingup.auth.v1.VerifyLoginResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVerifyLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Resends the second-factor login code for an active challenge.
     * </pre>
     */
    public void resendLoginCode(com.balluunn.startgrowingup.auth.v1.ResendLoginCodeRequest request,
        io.grpc.stub.StreamObserver<com.balluunn.startgrowingup.auth.v1.ResendLoginCodeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResendLoginCodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Starts email verification for the authenticated principal.
     * The caller must authenticate via Authorization header or gRPC metadata.
     * </pre>
     */
    public void startEmailVerification(com.balluunn.startgrowingup.auth.v1.StartEmailVerificationRequest request,
        io.grpc.stub.StreamObserver<com.balluunn.startgrowingup.auth.v1.StartEmailVerificationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartEmailVerificationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Confirms email verification for the authenticated principal.
     * The caller must authenticate via Authorization header or gRPC metadata.
     * </pre>
     */
    public void confirmEmailVerification(com.balluunn.startgrowingup.auth.v1.ConfirmEmailVerificationRequest request,
        io.grpc.stub.StreamObserver<com.balluunn.startgrowingup.auth.v1.ConfirmEmailVerificationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConfirmEmailVerificationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Resends a new email verification code for an active challenge.
     * The caller must authenticate via Authorization header or gRPC metadata.
     * </pre>
     */
    public void resendEmailVerificationCode(com.balluunn.startgrowingup.auth.v1.ResendEmailVerificationCodeRequest request,
        io.grpc.stub.StreamObserver<com.balluunn.startgrowingup.auth.v1.ResendEmailVerificationCodeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResendEmailVerificationCodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Starts a phone number change flow for the authenticated principal.
     * The caller must authenticate via Authorization header or gRPC metadata.
     * </pre>
     */
    public void startPhoneChange(com.balluunn.startgrowingup.auth.v1.StartPhoneChangeRequest request,
        io.grpc.stub.StreamObserver<com.balluunn.startgrowingup.auth.v1.StartPhoneChangeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartPhoneChangeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Confirms the phone number change for the authenticated principal.
     * The caller must authenticate via Authorization header or gRPC metadata.
     * </pre>
     */
    public void confirmPhoneChange(com.balluunn.startgrowingup.auth.v1.ConfirmPhoneChangeRequest request,
        io.grpc.stub.StreamObserver<com.balluunn.startgrowingup.auth.v1.ConfirmPhoneChangeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConfirmPhoneChangeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Resends the phone change verification code for an active challenge.
     * The caller must authenticate via Authorization header or gRPC metadata.
     * </pre>
     */
    public void resendPhoneChangeCode(com.balluunn.startgrowingup.auth.v1.ResendPhoneChangeCodeRequest request,
        io.grpc.stub.StreamObserver<com.balluunn.startgrowingup.auth.v1.ResendPhoneChangeCodeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResendPhoneChangeCodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Rotates session credentials using a valid refresh token.
     * Invalid or revoked tokens should be returned via UNAUTHENTICATED.
     * </pre>
     */
    public void refreshSession(com.balluunn.startgrowingup.auth.v1.RefreshSessionRequest request,
        io.grpc.stub.StreamObserver<com.balluunn.startgrowingup.auth.v1.RefreshSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRefreshSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Terminates the caller's currently authenticated session.
     * The caller must authenticate via Authorization header or gRPC metadata.
     * </pre>
     */
    public void logout(com.balluunn.startgrowingup.auth.v1.LogoutRequest request,
        io.grpc.stub.StreamObserver<com.balluunn.startgrowingup.auth.v1.LogoutResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Starts a password reset flow and sends a recovery code to the phone number.
     * For privacy, the server should avoid disclosing whether the account exists.
     * </pre>
     */
    public void startPasswordReset(com.balluunn.startgrowingup.auth.v1.StartPasswordResetRequest request,
        io.grpc.stub.StreamObserver<com.balluunn.startgrowingup.auth.v1.StartPasswordResetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartPasswordResetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Confirms a password reset using the recovery code and creates a fresh session.
     * </pre>
     */
    public void confirmPasswordReset(com.balluunn.startgrowingup.auth.v1.ConfirmPasswordResetRequest request,
        io.grpc.stub.StreamObserver<com.balluunn.startgrowingup.auth.v1.ConfirmPasswordResetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConfirmPasswordResetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Resends a password recovery code for an active challenge.
     * </pre>
     */
    public void resendPasswordResetCode(com.balluunn.startgrowingup.auth.v1.ResendPasswordResetCodeRequest request,
        io.grpc.stub.StreamObserver<com.balluunn.startgrowingup.auth.v1.ResendPasswordResetCodeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResendPasswordResetCodeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AuthService.
   * <pre>
   * AuthService defines public authentication and account-verification flows.
   * Protected RPCs require caller identity from Authorization header or gRPC metadata.
   * </pre>
   */
  public static final class AuthServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AuthServiceBlockingStub> {
    private AuthServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Starts the registration flow and sends a verification code to the phone number.
     * Validation failures should be returned via INVALID_ARGUMENT.
     * Duplicate principals should be returned via ALREADY_EXISTS.
     * </pre>
     */
    public com.balluunn.startgrowingup.auth.v1.StartRegistrationResponse startRegistration(com.balluunn.startgrowingup.auth.v1.StartRegistrationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartRegistrationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Confirms the registration code and creates a new authenticated session.
     * Invalid or expired codes should be returned via FAILED_PRECONDITION or UNAUTHENTICATED.
     * </pre>
     */
    public com.balluunn.startgrowingup.auth.v1.VerifyRegistrationResponse verifyRegistration(com.balluunn.startgrowingup.auth.v1.VerifyRegistrationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVerifyRegistrationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Resends the registration verification code for an active challenge.
     * Rate limiting should be returned via RESOURCE_EXHAUSTED.
     * </pre>
     */
    public com.balluunn.startgrowingup.auth.v1.ResendRegistrationCodeResponse resendRegistrationCode(com.balluunn.startgrowingup.auth.v1.ResendRegistrationCodeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResendRegistrationCodeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Starts the login flow and sends a second-factor verification code.
     * Invalid credentials should be returned via UNAUTHENTICATED.
     * </pre>
     */
    public com.balluunn.startgrowingup.auth.v1.StartLoginResponse startLogin(com.balluunn.startgrowingup.auth.v1.StartLoginRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartLoginMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Confirms the login code and issues a new authenticated session.
     * </pre>
     */
    public com.balluunn.startgrowingup.auth.v1.VerifyLoginResponse verifyLogin(com.balluunn.startgrowingup.auth.v1.VerifyLoginRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVerifyLoginMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Resends the second-factor login code for an active challenge.
     * </pre>
     */
    public com.balluunn.startgrowingup.auth.v1.ResendLoginCodeResponse resendLoginCode(com.balluunn.startgrowingup.auth.v1.ResendLoginCodeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResendLoginCodeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Starts email verification for the authenticated principal.
     * The caller must authenticate via Authorization header or gRPC metadata.
     * </pre>
     */
    public com.balluunn.startgrowingup.auth.v1.StartEmailVerificationResponse startEmailVerification(com.balluunn.startgrowingup.auth.v1.StartEmailVerificationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartEmailVerificationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Confirms email verification for the authenticated principal.
     * The caller must authenticate via Authorization header or gRPC metadata.
     * </pre>
     */
    public com.balluunn.startgrowingup.auth.v1.ConfirmEmailVerificationResponse confirmEmailVerification(com.balluunn.startgrowingup.auth.v1.ConfirmEmailVerificationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfirmEmailVerificationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Resends a new email verification code for an active challenge.
     * The caller must authenticate via Authorization header or gRPC metadata.
     * </pre>
     */
    public com.balluunn.startgrowingup.auth.v1.ResendEmailVerificationCodeResponse resendEmailVerificationCode(com.balluunn.startgrowingup.auth.v1.ResendEmailVerificationCodeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResendEmailVerificationCodeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Starts a phone number change flow for the authenticated principal.
     * The caller must authenticate via Authorization header or gRPC metadata.
     * </pre>
     */
    public com.balluunn.startgrowingup.auth.v1.StartPhoneChangeResponse startPhoneChange(com.balluunn.startgrowingup.auth.v1.StartPhoneChangeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartPhoneChangeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Confirms the phone number change for the authenticated principal.
     * The caller must authenticate via Authorization header or gRPC metadata.
     * </pre>
     */
    public com.balluunn.startgrowingup.auth.v1.ConfirmPhoneChangeResponse confirmPhoneChange(com.balluunn.startgrowingup.auth.v1.ConfirmPhoneChangeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfirmPhoneChangeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Resends the phone change verification code for an active challenge.
     * The caller must authenticate via Authorization header or gRPC metadata.
     * </pre>
     */
    public com.balluunn.startgrowingup.auth.v1.ResendPhoneChangeCodeResponse resendPhoneChangeCode(com.balluunn.startgrowingup.auth.v1.ResendPhoneChangeCodeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResendPhoneChangeCodeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Rotates session credentials using a valid refresh token.
     * Invalid or revoked tokens should be returned via UNAUTHENTICATED.
     * </pre>
     */
    public com.balluunn.startgrowingup.auth.v1.RefreshSessionResponse refreshSession(com.balluunn.startgrowingup.auth.v1.RefreshSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRefreshSessionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Terminates the caller's currently authenticated session.
     * The caller must authenticate via Authorization header or gRPC metadata.
     * </pre>
     */
    public com.balluunn.startgrowingup.auth.v1.LogoutResponse logout(com.balluunn.startgrowingup.auth.v1.LogoutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLogoutMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Starts a password reset flow and sends a recovery code to the phone number.
     * For privacy, the server should avoid disclosing whether the account exists.
     * </pre>
     */
    public com.balluunn.startgrowingup.auth.v1.StartPasswordResetResponse startPasswordReset(com.balluunn.startgrowingup.auth.v1.StartPasswordResetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartPasswordResetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Confirms a password reset using the recovery code and creates a fresh session.
     * </pre>
     */
    public com.balluunn.startgrowingup.auth.v1.ConfirmPasswordResetResponse confirmPasswordReset(com.balluunn.startgrowingup.auth.v1.ConfirmPasswordResetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfirmPasswordResetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Resends a password recovery code for an active challenge.
     * </pre>
     */
    public com.balluunn.startgrowingup.auth.v1.ResendPasswordResetCodeResponse resendPasswordResetCode(com.balluunn.startgrowingup.auth.v1.ResendPasswordResetCodeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResendPasswordResetCodeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AuthService.
   * <pre>
   * AuthService defines public authentication and account-verification flows.
   * Protected RPCs require caller identity from Authorization header or gRPC metadata.
   * </pre>
   */
  public static final class AuthServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AuthServiceFutureStub> {
    private AuthServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Starts the registration flow and sends a verification code to the phone number.
     * Validation failures should be returned via INVALID_ARGUMENT.
     * Duplicate principals should be returned via ALREADY_EXISTS.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.balluunn.startgrowingup.auth.v1.StartRegistrationResponse> startRegistration(
        com.balluunn.startgrowingup.auth.v1.StartRegistrationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartRegistrationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Confirms the registration code and creates a new authenticated session.
     * Invalid or expired codes should be returned via FAILED_PRECONDITION or UNAUTHENTICATED.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.balluunn.startgrowingup.auth.v1.VerifyRegistrationResponse> verifyRegistration(
        com.balluunn.startgrowingup.auth.v1.VerifyRegistrationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVerifyRegistrationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Resends the registration verification code for an active challenge.
     * Rate limiting should be returned via RESOURCE_EXHAUSTED.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.balluunn.startgrowingup.auth.v1.ResendRegistrationCodeResponse> resendRegistrationCode(
        com.balluunn.startgrowingup.auth.v1.ResendRegistrationCodeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResendRegistrationCodeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Starts the login flow and sends a second-factor verification code.
     * Invalid credentials should be returned via UNAUTHENTICATED.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.balluunn.startgrowingup.auth.v1.StartLoginResponse> startLogin(
        com.balluunn.startgrowingup.auth.v1.StartLoginRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartLoginMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Confirms the login code and issues a new authenticated session.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.balluunn.startgrowingup.auth.v1.VerifyLoginResponse> verifyLogin(
        com.balluunn.startgrowingup.auth.v1.VerifyLoginRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVerifyLoginMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Resends the second-factor login code for an active challenge.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.balluunn.startgrowingup.auth.v1.ResendLoginCodeResponse> resendLoginCode(
        com.balluunn.startgrowingup.auth.v1.ResendLoginCodeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResendLoginCodeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Starts email verification for the authenticated principal.
     * The caller must authenticate via Authorization header or gRPC metadata.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.balluunn.startgrowingup.auth.v1.StartEmailVerificationResponse> startEmailVerification(
        com.balluunn.startgrowingup.auth.v1.StartEmailVerificationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartEmailVerificationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Confirms email verification for the authenticated principal.
     * The caller must authenticate via Authorization header or gRPC metadata.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.balluunn.startgrowingup.auth.v1.ConfirmEmailVerificationResponse> confirmEmailVerification(
        com.balluunn.startgrowingup.auth.v1.ConfirmEmailVerificationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConfirmEmailVerificationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Resends a new email verification code for an active challenge.
     * The caller must authenticate via Authorization header or gRPC metadata.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.balluunn.startgrowingup.auth.v1.ResendEmailVerificationCodeResponse> resendEmailVerificationCode(
        com.balluunn.startgrowingup.auth.v1.ResendEmailVerificationCodeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResendEmailVerificationCodeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Starts a phone number change flow for the authenticated principal.
     * The caller must authenticate via Authorization header or gRPC metadata.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.balluunn.startgrowingup.auth.v1.StartPhoneChangeResponse> startPhoneChange(
        com.balluunn.startgrowingup.auth.v1.StartPhoneChangeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartPhoneChangeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Confirms the phone number change for the authenticated principal.
     * The caller must authenticate via Authorization header or gRPC metadata.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.balluunn.startgrowingup.auth.v1.ConfirmPhoneChangeResponse> confirmPhoneChange(
        com.balluunn.startgrowingup.auth.v1.ConfirmPhoneChangeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConfirmPhoneChangeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Resends the phone change verification code for an active challenge.
     * The caller must authenticate via Authorization header or gRPC metadata.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.balluunn.startgrowingup.auth.v1.ResendPhoneChangeCodeResponse> resendPhoneChangeCode(
        com.balluunn.startgrowingup.auth.v1.ResendPhoneChangeCodeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResendPhoneChangeCodeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Rotates session credentials using a valid refresh token.
     * Invalid or revoked tokens should be returned via UNAUTHENTICATED.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.balluunn.startgrowingup.auth.v1.RefreshSessionResponse> refreshSession(
        com.balluunn.startgrowingup.auth.v1.RefreshSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRefreshSessionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Terminates the caller's currently authenticated session.
     * The caller must authenticate via Authorization header or gRPC metadata.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.balluunn.startgrowingup.auth.v1.LogoutResponse> logout(
        com.balluunn.startgrowingup.auth.v1.LogoutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Starts a password reset flow and sends a recovery code to the phone number.
     * For privacy, the server should avoid disclosing whether the account exists.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.balluunn.startgrowingup.auth.v1.StartPasswordResetResponse> startPasswordReset(
        com.balluunn.startgrowingup.auth.v1.StartPasswordResetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartPasswordResetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Confirms a password reset using the recovery code and creates a fresh session.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.balluunn.startgrowingup.auth.v1.ConfirmPasswordResetResponse> confirmPasswordReset(
        com.balluunn.startgrowingup.auth.v1.ConfirmPasswordResetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConfirmPasswordResetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Resends a password recovery code for an active challenge.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.balluunn.startgrowingup.auth.v1.ResendPasswordResetCodeResponse> resendPasswordResetCode(
        com.balluunn.startgrowingup.auth.v1.ResendPasswordResetCodeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResendPasswordResetCodeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_START_REGISTRATION = 0;
  private static final int METHODID_VERIFY_REGISTRATION = 1;
  private static final int METHODID_RESEND_REGISTRATION_CODE = 2;
  private static final int METHODID_START_LOGIN = 3;
  private static final int METHODID_VERIFY_LOGIN = 4;
  private static final int METHODID_RESEND_LOGIN_CODE = 5;
  private static final int METHODID_START_EMAIL_VERIFICATION = 6;
  private static final int METHODID_CONFIRM_EMAIL_VERIFICATION = 7;
  private static final int METHODID_RESEND_EMAIL_VERIFICATION_CODE = 8;
  private static final int METHODID_START_PHONE_CHANGE = 9;
  private static final int METHODID_CONFIRM_PHONE_CHANGE = 10;
  private static final int METHODID_RESEND_PHONE_CHANGE_CODE = 11;
  private static final int METHODID_REFRESH_SESSION = 12;
  private static final int METHODID_LOGOUT = 13;
  private static final int METHODID_START_PASSWORD_RESET = 14;
  private static final int METHODID_CONFIRM_PASSWORD_RESET = 15;
  private static final int METHODID_RESEND_PASSWORD_RESET_CODE = 16;

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
        case METHODID_START_REGISTRATION:
          serviceImpl.startRegistration((com.balluunn.startgrowingup.auth.v1.StartRegistrationRequest) request,
              (io.grpc.stub.StreamObserver<com.balluunn.startgrowingup.auth.v1.StartRegistrationResponse>) responseObserver);
          break;
        case METHODID_VERIFY_REGISTRATION:
          serviceImpl.verifyRegistration((com.balluunn.startgrowingup.auth.v1.VerifyRegistrationRequest) request,
              (io.grpc.stub.StreamObserver<com.balluunn.startgrowingup.auth.v1.VerifyRegistrationResponse>) responseObserver);
          break;
        case METHODID_RESEND_REGISTRATION_CODE:
          serviceImpl.resendRegistrationCode((com.balluunn.startgrowingup.auth.v1.ResendRegistrationCodeRequest) request,
              (io.grpc.stub.StreamObserver<com.balluunn.startgrowingup.auth.v1.ResendRegistrationCodeResponse>) responseObserver);
          break;
        case METHODID_START_LOGIN:
          serviceImpl.startLogin((com.balluunn.startgrowingup.auth.v1.StartLoginRequest) request,
              (io.grpc.stub.StreamObserver<com.balluunn.startgrowingup.auth.v1.StartLoginResponse>) responseObserver);
          break;
        case METHODID_VERIFY_LOGIN:
          serviceImpl.verifyLogin((com.balluunn.startgrowingup.auth.v1.VerifyLoginRequest) request,
              (io.grpc.stub.StreamObserver<com.balluunn.startgrowingup.auth.v1.VerifyLoginResponse>) responseObserver);
          break;
        case METHODID_RESEND_LOGIN_CODE:
          serviceImpl.resendLoginCode((com.balluunn.startgrowingup.auth.v1.ResendLoginCodeRequest) request,
              (io.grpc.stub.StreamObserver<com.balluunn.startgrowingup.auth.v1.ResendLoginCodeResponse>) responseObserver);
          break;
        case METHODID_START_EMAIL_VERIFICATION:
          serviceImpl.startEmailVerification((com.balluunn.startgrowingup.auth.v1.StartEmailVerificationRequest) request,
              (io.grpc.stub.StreamObserver<com.balluunn.startgrowingup.auth.v1.StartEmailVerificationResponse>) responseObserver);
          break;
        case METHODID_CONFIRM_EMAIL_VERIFICATION:
          serviceImpl.confirmEmailVerification((com.balluunn.startgrowingup.auth.v1.ConfirmEmailVerificationRequest) request,
              (io.grpc.stub.StreamObserver<com.balluunn.startgrowingup.auth.v1.ConfirmEmailVerificationResponse>) responseObserver);
          break;
        case METHODID_RESEND_EMAIL_VERIFICATION_CODE:
          serviceImpl.resendEmailVerificationCode((com.balluunn.startgrowingup.auth.v1.ResendEmailVerificationCodeRequest) request,
              (io.grpc.stub.StreamObserver<com.balluunn.startgrowingup.auth.v1.ResendEmailVerificationCodeResponse>) responseObserver);
          break;
        case METHODID_START_PHONE_CHANGE:
          serviceImpl.startPhoneChange((com.balluunn.startgrowingup.auth.v1.StartPhoneChangeRequest) request,
              (io.grpc.stub.StreamObserver<com.balluunn.startgrowingup.auth.v1.StartPhoneChangeResponse>) responseObserver);
          break;
        case METHODID_CONFIRM_PHONE_CHANGE:
          serviceImpl.confirmPhoneChange((com.balluunn.startgrowingup.auth.v1.ConfirmPhoneChangeRequest) request,
              (io.grpc.stub.StreamObserver<com.balluunn.startgrowingup.auth.v1.ConfirmPhoneChangeResponse>) responseObserver);
          break;
        case METHODID_RESEND_PHONE_CHANGE_CODE:
          serviceImpl.resendPhoneChangeCode((com.balluunn.startgrowingup.auth.v1.ResendPhoneChangeCodeRequest) request,
              (io.grpc.stub.StreamObserver<com.balluunn.startgrowingup.auth.v1.ResendPhoneChangeCodeResponse>) responseObserver);
          break;
        case METHODID_REFRESH_SESSION:
          serviceImpl.refreshSession((com.balluunn.startgrowingup.auth.v1.RefreshSessionRequest) request,
              (io.grpc.stub.StreamObserver<com.balluunn.startgrowingup.auth.v1.RefreshSessionResponse>) responseObserver);
          break;
        case METHODID_LOGOUT:
          serviceImpl.logout((com.balluunn.startgrowingup.auth.v1.LogoutRequest) request,
              (io.grpc.stub.StreamObserver<com.balluunn.startgrowingup.auth.v1.LogoutResponse>) responseObserver);
          break;
        case METHODID_START_PASSWORD_RESET:
          serviceImpl.startPasswordReset((com.balluunn.startgrowingup.auth.v1.StartPasswordResetRequest) request,
              (io.grpc.stub.StreamObserver<com.balluunn.startgrowingup.auth.v1.StartPasswordResetResponse>) responseObserver);
          break;
        case METHODID_CONFIRM_PASSWORD_RESET:
          serviceImpl.confirmPasswordReset((com.balluunn.startgrowingup.auth.v1.ConfirmPasswordResetRequest) request,
              (io.grpc.stub.StreamObserver<com.balluunn.startgrowingup.auth.v1.ConfirmPasswordResetResponse>) responseObserver);
          break;
        case METHODID_RESEND_PASSWORD_RESET_CODE:
          serviceImpl.resendPasswordResetCode((com.balluunn.startgrowingup.auth.v1.ResendPasswordResetCodeRequest) request,
              (io.grpc.stub.StreamObserver<com.balluunn.startgrowingup.auth.v1.ResendPasswordResetCodeResponse>) responseObserver);
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
          getStartRegistrationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.balluunn.startgrowingup.auth.v1.StartRegistrationRequest,
              com.balluunn.startgrowingup.auth.v1.StartRegistrationResponse>(
                service, METHODID_START_REGISTRATION)))
        .addMethod(
          getVerifyRegistrationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.balluunn.startgrowingup.auth.v1.VerifyRegistrationRequest,
              com.balluunn.startgrowingup.auth.v1.VerifyRegistrationResponse>(
                service, METHODID_VERIFY_REGISTRATION)))
        .addMethod(
          getResendRegistrationCodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.balluunn.startgrowingup.auth.v1.ResendRegistrationCodeRequest,
              com.balluunn.startgrowingup.auth.v1.ResendRegistrationCodeResponse>(
                service, METHODID_RESEND_REGISTRATION_CODE)))
        .addMethod(
          getStartLoginMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.balluunn.startgrowingup.auth.v1.StartLoginRequest,
              com.balluunn.startgrowingup.auth.v1.StartLoginResponse>(
                service, METHODID_START_LOGIN)))
        .addMethod(
          getVerifyLoginMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.balluunn.startgrowingup.auth.v1.VerifyLoginRequest,
              com.balluunn.startgrowingup.auth.v1.VerifyLoginResponse>(
                service, METHODID_VERIFY_LOGIN)))
        .addMethod(
          getResendLoginCodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.balluunn.startgrowingup.auth.v1.ResendLoginCodeRequest,
              com.balluunn.startgrowingup.auth.v1.ResendLoginCodeResponse>(
                service, METHODID_RESEND_LOGIN_CODE)))
        .addMethod(
          getStartEmailVerificationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.balluunn.startgrowingup.auth.v1.StartEmailVerificationRequest,
              com.balluunn.startgrowingup.auth.v1.StartEmailVerificationResponse>(
                service, METHODID_START_EMAIL_VERIFICATION)))
        .addMethod(
          getConfirmEmailVerificationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.balluunn.startgrowingup.auth.v1.ConfirmEmailVerificationRequest,
              com.balluunn.startgrowingup.auth.v1.ConfirmEmailVerificationResponse>(
                service, METHODID_CONFIRM_EMAIL_VERIFICATION)))
        .addMethod(
          getResendEmailVerificationCodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.balluunn.startgrowingup.auth.v1.ResendEmailVerificationCodeRequest,
              com.balluunn.startgrowingup.auth.v1.ResendEmailVerificationCodeResponse>(
                service, METHODID_RESEND_EMAIL_VERIFICATION_CODE)))
        .addMethod(
          getStartPhoneChangeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.balluunn.startgrowingup.auth.v1.StartPhoneChangeRequest,
              com.balluunn.startgrowingup.auth.v1.StartPhoneChangeResponse>(
                service, METHODID_START_PHONE_CHANGE)))
        .addMethod(
          getConfirmPhoneChangeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.balluunn.startgrowingup.auth.v1.ConfirmPhoneChangeRequest,
              com.balluunn.startgrowingup.auth.v1.ConfirmPhoneChangeResponse>(
                service, METHODID_CONFIRM_PHONE_CHANGE)))
        .addMethod(
          getResendPhoneChangeCodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.balluunn.startgrowingup.auth.v1.ResendPhoneChangeCodeRequest,
              com.balluunn.startgrowingup.auth.v1.ResendPhoneChangeCodeResponse>(
                service, METHODID_RESEND_PHONE_CHANGE_CODE)))
        .addMethod(
          getRefreshSessionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.balluunn.startgrowingup.auth.v1.RefreshSessionRequest,
              com.balluunn.startgrowingup.auth.v1.RefreshSessionResponse>(
                service, METHODID_REFRESH_SESSION)))
        .addMethod(
          getLogoutMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.balluunn.startgrowingup.auth.v1.LogoutRequest,
              com.balluunn.startgrowingup.auth.v1.LogoutResponse>(
                service, METHODID_LOGOUT)))
        .addMethod(
          getStartPasswordResetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.balluunn.startgrowingup.auth.v1.StartPasswordResetRequest,
              com.balluunn.startgrowingup.auth.v1.StartPasswordResetResponse>(
                service, METHODID_START_PASSWORD_RESET)))
        .addMethod(
          getConfirmPasswordResetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.balluunn.startgrowingup.auth.v1.ConfirmPasswordResetRequest,
              com.balluunn.startgrowingup.auth.v1.ConfirmPasswordResetResponse>(
                service, METHODID_CONFIRM_PASSWORD_RESET)))
        .addMethod(
          getResendPasswordResetCodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.balluunn.startgrowingup.auth.v1.ResendPasswordResetCodeRequest,
              com.balluunn.startgrowingup.auth.v1.ResendPasswordResetCodeResponse>(
                service, METHODID_RESEND_PASSWORD_RESET_CODE)))
        .build();
  }

  private static abstract class AuthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.balluunn.startgrowingup.auth.v1.Auth.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AuthService");
    }
  }

  private static final class AuthServiceFileDescriptorSupplier
      extends AuthServiceBaseDescriptorSupplier {
    AuthServiceFileDescriptorSupplier() {}
  }

  private static final class AuthServiceMethodDescriptorSupplier
      extends AuthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AuthServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AuthServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthServiceFileDescriptorSupplier())
              .addMethod(getStartRegistrationMethod())
              .addMethod(getVerifyRegistrationMethod())
              .addMethod(getResendRegistrationCodeMethod())
              .addMethod(getStartLoginMethod())
              .addMethod(getVerifyLoginMethod())
              .addMethod(getResendLoginCodeMethod())
              .addMethod(getStartEmailVerificationMethod())
              .addMethod(getConfirmEmailVerificationMethod())
              .addMethod(getResendEmailVerificationCodeMethod())
              .addMethod(getStartPhoneChangeMethod())
              .addMethod(getConfirmPhoneChangeMethod())
              .addMethod(getResendPhoneChangeCodeMethod())
              .addMethod(getRefreshSessionMethod())
              .addMethod(getLogoutMethod())
              .addMethod(getStartPasswordResetMethod())
              .addMethod(getConfirmPasswordResetMethod())
              .addMethod(getResendPasswordResetCodeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
