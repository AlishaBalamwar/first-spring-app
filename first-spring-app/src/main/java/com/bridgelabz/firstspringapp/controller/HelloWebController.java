package com.bridgelabz.firstspringapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWebController {
    @GetMapping("/Web")
    public String Hello(){
        return "hello";
    }

    @GetMapping("/web/message")
    public String message(Model model){
        model.addAttribute("message", "This is a custom message. Hello from Bridgelabz ");
        return "message";
    }
}

