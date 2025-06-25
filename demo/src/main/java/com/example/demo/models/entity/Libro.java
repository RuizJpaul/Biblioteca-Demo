package com.example.demo.models.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="libro")
public class Libro implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idLibro")
    private Long id;
    @Column(name="isbnLibro")
    private String isbn;
    @Column(name="tituloLibro")
    private String titulo;
    @Column(name="anioLibro")
    private String anio;
    @Column(name="descLibro")
    private String desc;
    @Column(name="editorialLibro")
    private String editorial;
    @Column(name="autorLibro")
    private String autor;
    @Column(name="imgLibro")
    private String img;

    public Long getIdLibro(){
        return id;
    }
    public void setIdLibro(Long id){
        this.id = id;
    }
    public String getIsbnLibro(){
        return isbn;
    }
    public void setIsbnLibro(String isbn){
        this.isbn = isbn;
    }
    public String getTituloLibro(){
        return titulo;
    }    
    public void setTituloLibro(String titulo){
        this.titulo = titulo;
    }
    public String getAnioLibro(){
        return anio;
    }
    public void setAnioLibro(String anio){
        this.anio = anio;
    }
    public String getDescLibro(){
        return desc;
    }
    public void setDescLibro(String desc){
        this.desc = desc;
    }
    public String getAutorLibro(){
        return autor;
    }
    public void setAutorLibro(String autor){
        this.autor = autor;
    }
    public String getImgLibro(){
        return img;
    }
    public void setImgLibro(String img){
        this.img = img;
    }
}
