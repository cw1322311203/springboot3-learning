package com.cw.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springboot3-learning
 * @description
 * @author: c28023
 * @create: 2023/8/21 - 16:55
 **/
@RestController // 等同于@ResponseBody + @Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello,Spring Boot 3!";
    }
}
