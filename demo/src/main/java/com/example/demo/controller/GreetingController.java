package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingController {

    @RequestMapping("/hello")
    public String test(){
        return "/greeting";
    }

    @RequestMapping("/shit")
    public String shit(){
        return "/shit";
    }

    @RequestMapping("/mother")
    public String mother(){
        return "views/motherFucker";
    }
}
