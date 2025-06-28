package com.example.demo.models.service;

import java.util.List;

import com.example.demo.models.entity.Usuario;

public interface IUsuarioService {
    public String guardarUsuario(Usuario usuario);
    public List<Usuario> cargarUsuarios();
    public Usuario buscarUsuario(Long id);
    public String eliminarUsuario(Long id);
}