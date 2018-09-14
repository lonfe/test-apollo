package com.example.demo1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Value("${hello.msg}")
    private String msg;

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello, " + msg;
    }
}
