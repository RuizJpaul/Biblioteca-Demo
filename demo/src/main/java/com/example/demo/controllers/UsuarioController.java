package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.models.entity.Usuario;
import com.example.demo.models.service.IUsuarioService;



@Controller
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private IUsuarioService usuarioService;

    // Muestra el formulario y la lista (todo en usuario/inicio.html)
    @GetMapping("/")
    public String inicio(Model model) {
        model.addAttribute("usuario", new Usuario());
        model.addAttribute("listaUsuarios", usuarioService.cargarUsuarios());
        return "Usuarios/index"; // Asegúrate de tener inicio.html en /templates/usuario/
    }

    //Mostrar formularioUsuarios.html
    @GetMapping("/agregar")
    public String mostrarFormulario(Model model) {
        model.addAttribute("usuario",new Usuario());
        return "Usuarios/formularioUsuarios";
    }

    // Guardar usuario y volver a la vista principal (redirige a index.html)
    @PostMapping("/formulario")
    public String guardar(Usuario usuario, RedirectAttributes flash) {
        String rpta = usuarioService.guardarUsuario(usuario);
        flash.addFlashAttribute("rpta", rpta);
        return "redirect:/usuario/"; // Redirige al principal con tabla actualizada
    }

    // Editar un usuario (carga formulario con valores)
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        Usuario usuario = usuarioService.buscarUsuario(id);
        model.addAttribute("usuario", usuario);
        model.addAttribute("listaUsuarios", usuarioService.cargarUsuarios());
        return "Usuarios/editarUsuarios";
    }

    // Eliminar un usuario y recargar tabla
    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id, RedirectAttributes flash) {
        String rpta = usuarioService.eliminarUsuario(id);
        flash.addFlashAttribute("rpta", rpta);
        return "redirect:/usuario/"; // Redirige a la tabla actualizada
    }
}
