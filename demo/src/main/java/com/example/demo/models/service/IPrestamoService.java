package com.example.demo.models.service;
import java.util.List;

import com.example.demo.models.entity.Prestamo;

public interface IPrestamoService {
    public String guardarPrestamo(Prestamo prestamo);
    public List<Prestamo> cargarPrestamos();
    public Prestamo buscarPrestamo(Long id);
    public String eliminarPrestamo(Long id);
}
