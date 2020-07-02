package com.wk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoController {

    @GetMapping(value = "getuser.do")
    public String getUser(){

        return "zhangsan";
    }
}
