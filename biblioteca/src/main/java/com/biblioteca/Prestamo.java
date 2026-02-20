package com.biblioteca;

public class Prestamo {
    private Usuario usuario;
    private Libro libro;
    private boolean activo;

    //Constructor para prestamos
    public Prestamo(Usuario usuario, Libro libro){
        this.usuario = usuario;
        this.libro = libro;
        this.activo = true; 
    }

    //Setters y Getters
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


    public void setLibro(Libro libro) {
        this.libro = libro;
    }


    public Usuario getUsuario() {
        return usuario;
    }


    public Libro getLibro() {
        return libro;
    }

    public boolean isActivo(){
        return activo;
    }
    
    public void devolver(){
        this.activo = false;
    }
}
