package com.example.demo.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.entity.Libro;

public interface ILibroRepository extends JpaRepository<Libro, Long>{

}
