package com.example.demoweb2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Demoweb2Application {

    public static void main(String[] args) {
        SpringApplication.run(Demoweb2Application.class, args);
    }

}
