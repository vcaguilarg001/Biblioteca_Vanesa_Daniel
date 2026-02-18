package com.biblioteca;

public class Libro {
    
    private String titulo;
    private String autor;
    private String categoria;

    public Libro(String titulo, String autor, String categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
    }

    // Getters

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public String getCategoria() {
        return this.categoria;
    }

    // Funciones

    @Override
    public String toString() {
        return "Titulo: " + this.titulo + " | Autor: " + this.autor + " | Categoria: " + this.categoria;
    }
}
