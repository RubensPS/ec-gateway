package com.letscode.ecgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EcGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcGatewayApplication.class, args);
    }

}
