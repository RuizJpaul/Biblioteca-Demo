package com.example.demo.models.service;

import java.util.List;

import com.example.demo.models.entity.Libro;

public interface ILibroService {
    public String guardarLibro(Libro libro);
    public List<Libro> cargarLibros();
    public Libro busLibro(Long id);
    public String eliminarLibro(Long id);
    public List<Object[]> contarLibrosPorGenero();
}
