package com.example.eurekaclientartcleservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@EnableEurekaClient
public class EurekaClientArtcleServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientArtcleServiceApplication.class, args);
    }

}
