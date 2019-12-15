package com.beyondcoding.uppercaseclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class UppercaseClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(UppercaseClientApplication.class, args);
    }

}
