package com.tech.grpcDemo.config;


import com.tech.grpcDemo.service.HelloServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
public class GrpcServer {

    @Bean("grpcServerConfig")
    public void grpcServerConfig() throws IOException, InterruptedException {
        System.out.println("starting GRPC Server");
        Server server = ServerBuilder.forPort(9097).addService(

                new HelloServiceImpl()).build();

        server.start();
        System.out.println("server started at "+ server.getPort());
        server.awaitTermination();
    }
}
