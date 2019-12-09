package com.example.eurekaclientuserservice.controller;

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

    @GetMapping("hello")
    public String hello(){
        return "hello:eureka-client-user";
    }

}