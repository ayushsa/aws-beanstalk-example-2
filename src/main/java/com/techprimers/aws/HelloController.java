package com.techprimers.aws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloController {

    @GetMapping("/target_one")
    public String hello_tone() {
        return "Hello Target One";
    }
    
    @GetMapping("target_two")
    public String hello_ttwo() {
        return "Hello Target Two";
    }
    
        @GetMapping("target_three")
    public String hello_tthree() {
        return "Hello Target Three";
    }
}
