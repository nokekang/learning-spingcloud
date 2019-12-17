package com.example.eurekaclientartcleservice.controller;

import com.example.eurekaclientartcleservice.domain.HouseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.websocket.server.PathParam;
import java.util.HashMap;

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

    @GetMapping("call/data")
    public HouseInfo getData(String name){
        return restTemplate.getForObject("http://eureka-client-user-service/house/data?name=" + name, HouseInfo.class);
    }

    @GetMapping("call/data1/{name}")
    public String getData1(@PathVariable("name")String name){
        return restTemplate.getForObject("http://eureka-client-user-service/house/data/name=", String.class,"张三");
    }
    @GetMapping("call/data2/{name}")
    public String getData2(@PathVariable("name")String name){
        return restTemplate.getForObject("http://eureka-client-user-service/house/data/{name}", String.class,"张三");
    }

    @GetMapping("call/data3/{name}")
    public String getData3(@PathVariable("name")String name){
        return restTemplate.getForObject("http://eureka-client-user-service/house/data/{name}/{name2}", String.class,"张三","李四");
    }

    @GetMapping("call/data4/{name}")
    public String getData4(@PathVariable("name")String name){
        HashMap<String, Object> map = new HashMap<>();
        map.put("name","张三");
        map.put("name2","李四");
        return restTemplate.getForObject("http://eureka-client-user-service/house/data/{name}/{name2}", String.class,map);
    }
}