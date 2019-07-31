package com.antiy.securitydemo.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: LiuChong
 * description:
 * date: 2019/7/29 15:17
 */
@RestController
@RequestMapping("/admin")
public class AdminController {

    @RequestMapping("/home")
    public String productInfo() {
        return "admin home page";
    }
}
