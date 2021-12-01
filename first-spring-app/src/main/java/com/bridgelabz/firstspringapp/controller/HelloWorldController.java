package com.bridgelabz.firstspringapp.controller;

import com.bridgelabz.firstspringapp.dto.User;
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

    @GetMapping("/param/{name}")
    public String sayHello1(@PathVariable String name){
        return "Hello " + name + "!";
    }

    @PostMapping(value = "/hello2")
    public String byUsingDto(@RequestBody User user){
        return user.toString();
    }
}
