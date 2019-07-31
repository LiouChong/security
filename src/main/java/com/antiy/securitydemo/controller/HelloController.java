package com.antiy.securitydemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: LiuChong
 * description:
 * date: 2019/7/29 14:52
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String home() {
        return "Hello, Spring Sucurity!";
    }
}
