package com.example.eurekaclientartcleservice.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: springclouldDemo
 * @description: bean注入配置
 * @author: sjk
 * @create: 2019-12-09 19:55
 */
@Configuration
public class BeanConfiguration {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}