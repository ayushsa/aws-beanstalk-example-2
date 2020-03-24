package com.techprimers.aws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloController {

    @GetMapping("/hello_ayush")
    public String hello_ayush() {
        return "Hello TechPrimers Ayush";
    }
    
    @GetMapping("hello_ayaz")
    public String hello_ayaz() {
        return "Hello TechPrimers Ayaz";
    }
    
        @GetMapping("hello_om")
    public String hello_om() {
        return "Hello TechPrimers Om";
    }
}
