package com.example.UserDetails.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserDetailsController {
    @GetMapping("/user")
    public String getMsg(){
        return "hello world";
    }
}
