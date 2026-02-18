package com.biblioteca;

public class Prestamo {
    private Usuario usuario;
    private String libro;

    //Constructor para prestamos
    public Prestamo(Usuario usuario, String libro){
        this.usuario = usuario;
        this.libro = libro;
    }

    //Setter de usuario
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    //Setter de libro
    public void setLibro(String libro) {
        this.libro = libro;
    }

    //Getter de usuario
    public Usuario getUsuario() {
        return usuario;
    }

    //Getter de libro
    public String getLibro() {
        return libro;
    }
}
