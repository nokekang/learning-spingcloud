package com.example.eurekaclientuserservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springclouldDemo
 * @description: userController
 * @author: sjk
 * @create: 2019-12-09 19:39
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Value("${server.port}")
    private String port;

    @GetMapping("hello")
    public String hello(){
        return "hello:eureka-client-user" + "userPort1:" + port;
    }

}