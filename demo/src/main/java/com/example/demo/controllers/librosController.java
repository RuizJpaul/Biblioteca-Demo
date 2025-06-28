package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.models.entity.Libro;
import com.example.demo.models.service.ILibroService;


@Controller
@RequestMapping("/libros")
public class librosController {

    @Autowired
    private ILibroService LibroService;

    @GetMapping("/")
    public String inicio(Model model) {
        Libro libro = new Libro();
        model.addAttribute("libro", libro);
        model.addAttribute("listalibros", LibroService.cargarLibros());
        return "Libros/index"; 
    }

    @GetMapping("/agregar")
    public String mostrarAdministrar(Model model) {
        model.addAttribute("libro", new Libro());
        return "Libros/agregarLibros";
    }

    @PostMapping("/formulario")
    public String guardar(Libro libro, RedirectAttributes flash) {
        String ans = LibroService.guardarLibro(libro);
        flash.addFlashAttribute("ans", ans);
        return "redirect:/libros/";
    }
    
    
}
