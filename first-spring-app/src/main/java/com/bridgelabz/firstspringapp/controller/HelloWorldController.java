package com.bridgelabz.firstspringapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping(value = "/hello")
    public String usingGetMethod(){
        return "Hello from Bridgelabz";
    }

    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name){
        return "Hello " + name + "!";
    }
}
