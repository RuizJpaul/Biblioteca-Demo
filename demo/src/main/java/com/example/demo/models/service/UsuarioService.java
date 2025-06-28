package com.example.demo.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.entity.Usuario;
import com.example.demo.models.repository.IUsuarioRepository;

@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    private IUsuarioRepository usuarioRepository;

    @Override
    public String guardarUsuario(Usuario usuario) {
        String rpta;
        if (usuario.getIdUsuario() == null) {
            rpta = "Se registró el usuario correctamente";
        } else {
            rpta = "Se actualizó el usuario";
        }
        usuarioRepository.saveAndFlush(usuario);
        return rpta;
    }

    @Override
    public List<Usuario> cargarUsuarios() {
        return (List<Usuario>) usuarioRepository.findAll();
    }

    @Override
    public Usuario buscarUsuario(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    @Override
    public String eliminarUsuario(Long id) {
        usuarioRepository.deleteById(id);
        return "Se eliminó el usuario correctamente";
    }
}