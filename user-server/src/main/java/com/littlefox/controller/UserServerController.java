package com.littlefox.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserServerController {

    @GetMapping("/add")
    public String add(){
        return null;
    }

    @GetMapping("/get")
    public String get(@PathVariable String id){
        return null;
    }
}
