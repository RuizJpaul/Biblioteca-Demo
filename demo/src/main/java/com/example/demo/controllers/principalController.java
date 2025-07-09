package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.service.LibroService;


@Controller
@RequestMapping("/principal")
public class principalController {

    @Autowired
    private LibroService libroService;

    @GetMapping("/")
    public String inicio(Model model) {
        long totalLibros = libroService.contarLibros();
        model.addAttribute("totalLibros", totalLibros);
        return "Principal/index";
    }
    
}