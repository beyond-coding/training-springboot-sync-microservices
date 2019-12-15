package com.beyondcoding.uppercaseserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class UppercaseServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(UppercaseServerApplication.class, args);
    }

}
