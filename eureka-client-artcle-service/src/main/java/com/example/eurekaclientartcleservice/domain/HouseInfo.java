package com.example.eurekaclientartcleservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: springclouldDemo
 * @description: HouseInfo
 * @author: sjk
 * @create: 2019-12-17 19:07
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HouseInfo {

    private Long id;

    private String city;

    private String region;

    private String name;

    private String port;
}