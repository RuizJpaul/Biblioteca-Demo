package com.example.demo.models.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.entity.Prestamo;

@Repository
public interface IPrestamoRepository extends JpaRepository<Prestamo, Long>{
    List<Prestamo> findByIdLib(Long idLibro);
} 
