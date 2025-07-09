package com.example.demo.models.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name="libro")
public class Libro implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idLibro")
    private Long id;
    @Column(name="genLibro")
    private String gen;
    @Column(name="tituloLibro")
    private String titulo;
    @Column(name="anioLibro")
    private String anio;
    @Lob
    @Column(columnDefinition="TEXT" ,name="descLibro")
    private String desc;
    @Column(name="editorialLibro")
    private String editorial;
    @Column(name="autorLibro")
    private String autor;
    @Column(name="imgLibro")
    private String img;

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getGen(){
        return gen;
    }
    public void setGen(String gen){
        this.gen = gen;
    }
    public String getTitulo(){
        return titulo;
    }    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getAnio(){
        return anio;
    }
    public void setAnio(String anio){
        this.anio = anio;
    }
    public String getDesc(){
        return desc;
    }
    public void setDesc(String desc){
        this.desc = desc;
    }
    public String getEditorial(){
        return editorial;
    }
    public void setEditorial(String editorial){
        this.editorial = editorial;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getImg(){
        return img;
    }
    public void setImg(String img){
        this.img = img;
    }
}
