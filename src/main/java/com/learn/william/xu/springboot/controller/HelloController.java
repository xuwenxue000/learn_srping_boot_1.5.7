package com.learn.william.xu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HelloController {

    @RequestMapping("hello")
    @ResponseBody
    String home() {
        return "Hello World!";
    }




}
