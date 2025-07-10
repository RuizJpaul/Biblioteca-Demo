package com.example.demo.models.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@Entity
@Table(name = "prestamo")
public class Prestamo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pre_id")
    private Long id;
    @Column(name = "pre_fechaPrestamo")
    private LocalDateTime fechaPrestamo;
    @Column(name = "pre_fechaRetorno")
    private LocalDate fechaRetorno;
    @Column(name = "pre_fechaDevolucion")
    private LocalDate fechaDevolucion;
    @Column(name = "pre_estado")
    private String estado;
    @Lob
    @Column(columnDefinition="TEXT", name = "pre_observacion")
    private String observacion;
    @Column(name = "idUsuario")
    private Long idUser;
    @Column(name = "idLibro")
    private Long idLib;
    
    @PrePersist //Asignar por defecto *presistirlo
    public void asignarFechaPrestamo(){
        if (this.fechaPrestamo == null) {
            this.fechaPrestamo = LocalDateTime.now(); 
        }
    }
    
    public Prestamo() {}
    public Prestamo(Long id, LocalDateTime fechaPrestamo, LocalDate fechaRetorno, LocalDate fechaDevolucion,
            String estado, String observacion, Long idUser, Long idLib) {
        this.id = id;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaRetorno = fechaRetorno;
        this.fechaDevolucion = fechaDevolucion;
        this.estado = estado;
        this.observacion = observacion;
        this.idUser = idUser;
        this.idLib = idLib;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public LocalDateTime getFechaPrestamo() {
        return fechaPrestamo;
    }
    public void setFechaPrestamo(LocalDateTime fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }
    public LocalDate getFechaRetorno() {
        return fechaRetorno;
    }
    public void setFechaRetorno(LocalDate fechaRetorno) {
        this.fechaRetorno = fechaRetorno;
    }
    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }
    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getObservacion() {
        return observacion;
    }
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    public Long getIdUser() {
        return idUser;
    }
    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }
    public Long getIdLib() {
        return idLib;
    }
    public void setIdLib(Long idLib) {
        this.idLib = idLib;
    }
}
