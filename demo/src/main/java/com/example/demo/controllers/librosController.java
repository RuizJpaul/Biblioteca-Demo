package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/libros")
public class librosController {

    @GetMapping("/")
    public String inicio() {
        return "Libros/index";
    }
}
