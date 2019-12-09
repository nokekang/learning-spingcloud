package com.example.eurekaclientartcleservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program: springclouldDemo
 * @description: articleController
 * @author: sjk
 * @create: 2019-12-09 20:00
 */
@RestController
@RequestMapping("article")
public class ArticleController {

    @Autowired
    private RestTemplate restTemplate;

    /*@GetMapping("callHello")
    public String callHello(){
        String forObject = restTemplate.getForObject("http://localhost:8081/user/hello", String.class);
        return forObject;
    }*/
    @GetMapping("callHello")
    public String callHello(){
        String forObject = restTemplate.getForObject("http://eureka-client-user-service/user/hello", String.class);
        return forObject;
    }

}