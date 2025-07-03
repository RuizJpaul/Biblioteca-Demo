package com.example.demo.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.entity.Prestamo;

@Repository
public interface IPrestamoRepository extends JpaRepository<Prestamo, Long>{

    
} 
