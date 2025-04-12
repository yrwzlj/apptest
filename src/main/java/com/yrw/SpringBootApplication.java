package com.yrw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;

/**
 * @Author: rw.yang
 * @DateTime: 2025/4/12
 **/
@org.springframework.boot.autoconfigure.SpringBootApplication
@MapperScan("com.yrw")
public class SpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication.class, args);
    }
}
