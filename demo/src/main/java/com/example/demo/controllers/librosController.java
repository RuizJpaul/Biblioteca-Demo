package com.example.demo.controllers;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model){
        Libro libro = LibroService.busLibro(id);
        model.addAttribute("libro", libro);
        return "Libros/adminLibros";
    }


    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id, RedirectAttributes flash) {
        String rpta = LibroService.eliminarLibro(id);
        flash.addFlashAttribute("rpta", rpta);
        return "redirect:/libros/";
    }

    @GetMapping("/genero")
    @ResponseBody
    public Map<String, Long> obtenerDatosPorGenero() {
        List<Object[]> datos = LibroService.contarLibrosPorGenero(); // método que llama al repo
        Map<String, Long> resultado = new LinkedHashMap<>();

        for (Object[] fila : datos) {
            String genero = (String) fila[0];
            Long cantidad = (Long) fila[1];
            resultado.put(genero, cantidad);
        }

        return resultado;
    }
    
    
}
