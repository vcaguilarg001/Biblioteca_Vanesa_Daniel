package com.biblioteca;

public class Prestamo {
    private Usuario usuario;
    private String libro;

    public Prestamo(Usuario usuario, String libro){
        this.usuario = usuario;
        this.libro = libro;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getLibro() {
        return libro;
    }
}
