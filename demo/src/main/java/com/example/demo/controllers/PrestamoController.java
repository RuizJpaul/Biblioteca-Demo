package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.models.entity.Prestamo;
import com.example.demo.models.service.IPrestamoService;

@Controller
@RequestMapping("/prestamo")
public class PrestamoController {

    @Autowired 
    private IPrestamoService prestamoService;

    @GetMapping("/")
    public String inicio(Model model){
        model.addAttribute("prestamo", new Prestamo());
        model.addAttribute("listaPrestamos", prestamoService.cargarPrestamos());
        return "Prestamos/index";
    }

    @GetMapping("/agregar")
    public String mostrarFormulario(Model model){
        model.addAttribute("prestamo", new Prestamo());
        return "Prestamos/formularioPrestamos";
    }

    @PostMapping("/formulario")
    public String guardar(Prestamo prestamo, RedirectAttributes flash){
        String rpta = prestamoService.guardarPrestamo(prestamo);
        flash.addFlashAttribute("rpta", rpta);
        return "redirect:/prestamo/"; 
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model){
        Prestamo prestamo = prestamoService.buscarPrestamo(id);
        model.addAttribute("prestamo", prestamo);
        model.addAttribute("listaPrestamos", prestamoService.cargarPrestamos());
        return "Prestamos/editarPrestamos";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id, RedirectAttributes flash) {
        String rpta = prestamoService.eliminarPrestamo(id);
        flash.addFlashAttribute("rpta", rpta);
        return "redirect:/prestamo/";
    }
}
