package com.bridgelabz.firstspringapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(value = "/hello")
    public String usingGetMethod(){
        return "Hello from Bridgelabz";
    }
}
