package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/principal")
public class principalController {

    @GetMapping("/")
    public String inicio() {
        return "Principal/index";
    }
    
}