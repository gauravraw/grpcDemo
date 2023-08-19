package com.tech.grpcDemo.service;

import com.tech.rpc.HelloServiceGrpc;
import com.tech.rpc.HelloServiceOuterClass;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class HelloServiceImpl extends HelloServiceGrpc.HelloServiceImplBase {

    @Override
    public void getHelloMessage(HelloServiceOuterClass.HelloRequest helloRequest, StreamObserver<HelloServiceOuterClass.HelloResponse> helloGrpcResponse){
        log.info("Received hello service request");
        String name = helloRequest.getName();

        HelloServiceOuterClass.HelloResponse helloResponse = HelloServiceOuterClass.HelloResponse.newBuilder()
                .setGreetings("Hi" + name + "!")
                .build();

        helloGrpcResponse.onNext(helloResponse);

        helloGrpcResponse.onCompleted();
    }
}
