package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Seccion {

    @Id
    private String id;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String resumen;

    @Column(length = 2000, nullable = false)
    private String contenido;

    public Seccion() {
    }

    public Seccion(String id, String titulo, String resumen, String contenido) {
        this.id = id;
        this.titulo = titulo;
        this.resumen = resumen;
        this.contenido = contenido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}