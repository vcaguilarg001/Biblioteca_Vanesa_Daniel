package com.biblioteca;

public class Usuario {

    //Atributos
    private String nombre;
    private String contrasena;
    private boolean admin; //true admin false usuario

    //Constructor
    public Usuario(String nombre, String contrasena, boolean admin){
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.admin = admin;
    }

    //Getter de nombre
    public String getNombre(){ 
        return nombre;
    }

    //Setter de nombre
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    //Comprobar contraseña
    public boolean contrasena(String contrasena){
        return this.contrasena == contrasena;
    }
}
