package com.example.demo.models.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.models.entity.Libro;

public interface ILibroRepository extends JpaRepository<Libro, Long>{
    
    @Query("SELECT l.gen, COUNT(l) FROM Libro l GROUP BY l.gen")
    List<Object[]> contarLibrosPorGenero();
}
