package com.biit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SubtractApp {
    public static void main(String[] args) {
        SpringApplication.run(SubtractApp.class, args);
    }
}
