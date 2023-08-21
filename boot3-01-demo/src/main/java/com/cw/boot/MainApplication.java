package com.cw.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: springboot3-learning
 * @description 启动springboot项目的主入口程序
 * @author: c28023
 * @create: 2023/8/21 - 16:41
 **/
@SpringBootApplication // 标明这是一个SpringBoot应用
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
