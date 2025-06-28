package com.example.demo.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
    
    @Column(name = "nomUsuario", nullable = false, length = 45)
    private String nomUsuario;
    
    @Column(name = "apeUsuario", nullable = false, length = 45)
    private String apeUsuario;
    
    @Column(name = "emailUsuario", nullable = false, length = 45)
    private String emailUsuario;
    
    @Column(name = "userUsuario", nullable = false, length = 45)
    private String userUsuario;
    
    @Column(name = "dirUsuario", nullable = false, length = 45)
    private String dirUsuario;
    
    @Column(name = "telUsuario", nullable = false, length = 45)
    private String telUsuario;
    
    @Column(name = "tipoUsuario", nullable = false, length = 45)
    private String tipoUsuario;
    
    @JsonIgnore
    @Column(name = "passUsuario", nullable = false, length = 45)
    private String passUsuario;
    
    // Constructor vacío
    public Usuario() {}
    
    // Constructor con parámetros
    public Usuario(String nomUsuario, String apeUsuario, String emailUsuario, 
                   String userUsuario, String dirUsuario, String telUsuario, 
                   String tipoUsuario, String passUsuario) {
        this.nomUsuario = nomUsuario;
        this.apeUsuario = apeUsuario;
        this.emailUsuario = emailUsuario;
        this.userUsuario = userUsuario;
        this.dirUsuario = dirUsuario;
        this.telUsuario = telUsuario;
        this.tipoUsuario = tipoUsuario;
        this.passUsuario = passUsuario;
    }
    
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
    
    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario=" + idUsuario +
                ", nomUsuario='" + nomUsuario + '\'' +
                ", apeUsuario='" + apeUsuario + '\'' +
                ", emailUsuario='" + emailUsuario + '\'' +
                ", userUsuario='" + userUsuario + '\'' +
                ", dirUsuario='" + dirUsuario + '\'' +
                ", telUsuario='" + telUsuario + '\'' +
                ", tipoUsuario='" + tipoUsuario + '\'' +
                '}';
    }
}