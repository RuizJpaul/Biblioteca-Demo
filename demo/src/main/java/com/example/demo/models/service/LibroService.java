package com.example.demo.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.entity.Libro;
import com.example.demo.models.repository.ILibroRepository;

@Service
public class LibroService implements ILibroService{

    @Autowired
    private ILibroRepository libroRepository;

    @Override
    public String guardarLibro(Libro libro){
        String ans;
        if(libro.getId()==null){
            ans = "Se registro el libro correctamente";
        }
        else{
            ans="Se actualizo el libro";
        }
        libroRepository.saveAndFlush(libro); 
        return ans;
    }

    @Override
    public List<Libro> cargarLibros(){
        return (List<Libro>)libroRepository.findAll();
    }

    @Override
    public Libro busLibro(Long id){
        return libroRepository.findById(id).get();
    }

    @Override
    public String eliminarLibro(Long id){
        libroRepository.deleteById(id);
        return "Se elimino la carrera";
    }

    public long contarLibros() {
        return libroRepository.count();
    }

    @Override
    public List<Object[]> contarLibrosPorGenero() {
        return libroRepository.contarLibrosPorGenero();
    }
    
}
