package com.yourcompany.hellok8s;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {


    @GetMapping
    public String helloController(){
        return "Hello from k8s!!";
    }
}
