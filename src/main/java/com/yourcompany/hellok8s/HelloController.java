package com.yourcompany.hellok8s;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping("/hello")
    public String helloController(){
        return "Hello from k8s!!";
    }
}
