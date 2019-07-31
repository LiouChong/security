package com.antiy.securitydemo.controller;
/**
 *
 */

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: LiuChong
 * description:
 * date: 2019/7/29 15:17
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @RequestMapping("/info")
    public String productInfo() {
        String currentUser = "";
        Object principl = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principl instanceof UserDetails) {
            currentUser = ((UserDetails) principl).getUsername();
        } else {
            currentUser = principl.toString();
        }
        return "some product info, currentUser is: " + currentUser;
    }
}
