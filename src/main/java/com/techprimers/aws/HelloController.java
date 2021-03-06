package com.techprimers.aws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloController {

    @GetMapping("/one")
    public String hello_one() {
        return "Hello Target One";
    }
    
    @GetMapping("/two")
    public String hello_two() {
        return "Hello Target Two";
    }
      
}
