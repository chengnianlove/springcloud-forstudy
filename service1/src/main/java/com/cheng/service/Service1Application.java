package com.cheng.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author create by Niancheng On 14:18 2021/2/17
 */
@SpringBootApplication
@RestController
public class Service1Application {
    public static void main(String[] args) {
        SpringApplication.run(Service1Application.class, args);
    }
//    @Value("${common.name}")
//    public String name;

    @Autowired
    private ConfigurableApplicationContext context;

    @GetMapping("/getName")
    public String getName(){

        // 动态获取common.name属性
        String property = context.getEnvironment().getProperty("common.name");

        return property;
//        System.out.println("getName。。。");
//        System.out.println(name);
    }
}