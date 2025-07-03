package com.example.demo.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.entity.Prestamo;
import com.example.demo.models.repository.IPrestamoRepository;

@Service
public class PrestamoService implements IPrestamoService{
    @Autowired
    private IPrestamoRepository prestamoRepository;

    @Override
    public String guardarPrestamo(Prestamo prestamo) {
        String rpta;
        if (prestamo.getId() == null) {
            rpta = "Se registró el usuario correctamente";
        } else {
            rpta = "Se actualizó el usuario";
        }
        prestamoRepository.saveAndFlush(prestamo);
        return rpta;
    }

    @Override
    public List<Prestamo> cargarPrestamos() {
        return (List<Prestamo>) prestamoRepository.findAll();
    }

    @Override
    public Prestamo buscarPrestamo(Long id) {
        return prestamoRepository.findById(id).orElse(null);
    }

    @Override
    public String eliminarPrestamo(Long id) {
        prestamoRepository.deleteById(id);
        return "Se eliminó el usuario correctamente";
    }

}
