package com.example.demo.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario { 
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUsuario")
    private Long idUsuario;
    
    @Column(name = "nomUsuario")
    private String nomUsuario;
    
    @Column(name = "apeUsuario")
    private String apeUsuario;
    
    @Column(name = "emailUsuario")
    private String emailUsuario;
    
    @Column(name = "userUsuario")
    private String userUsuario;
    
    @Column(name = "dirUsuario")
    private String dirUsuario;
    
    @Column(name = "telUsuario")
    private String telUsuario;
    
    @Column(name = "tipoUsuario")
    private String tipoUsuario;
    
    @Column(name = "passUsuario")
    private String passUsuario;
    

    
    // Getters y Setters
    public Long getIdUsuario() {
        return idUsuario;
    }
    
    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    public String getNomUsuario() {
        return nomUsuario;
    }
    
    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }
    
    public String getApeUsuario() {
        return apeUsuario;
    }
    
    public void setApeUsuario(String apeUsuario) {
        this.apeUsuario = apeUsuario;
    }
    
    public String getEmailUsuario() {
        return emailUsuario;
    }
    
    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }
    
    public String getUserUsuario() {
        return userUsuario;
    }
    
    public void setUserUsuario(String userUsuario) {
        this.userUsuario = userUsuario;
    }
    
    public String getDirUsuario() {
        return dirUsuario;
    }
    
    public void setDirUsuario(String dirUsuario) {
        this.dirUsuario = dirUsuario;
    }
    
    public String getTelUsuario() {
        return telUsuario;
    }
    
    public void setTelUsuario(String telUsuario) {
        this.telUsuario = telUsuario;
    }
    
    public String getTipoUsuario() {
        return tipoUsuario;
    }
    
    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
    public String getPassUsuario() {
        return passUsuario;
    }
    
    public void setPassUsuario(String passUsuario) {
        this.passUsuario = passUsuario;
    }
}