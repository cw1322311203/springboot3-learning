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
        // var为Java 10特性： 局部变量类型的自动推断
        var ioc = SpringApplication.run(MainApplication.class, args);

        // 1.获取容器中所有组件的名称
        String[] names = ioc.getBeanDefinitionNames();

        // dispatcherServlet、beanNameViewResolver、characterEncodingFilter、multipartResolver
        // SpringBoot把以前配置的核心组件现在都给我们自动配置好了。
        for (String name : names) {
            System.out.println("name = " + name);
        }
    }
}
