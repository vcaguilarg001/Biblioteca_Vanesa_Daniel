package com.biblioteca;

public class Usuario {

    //Atributos
    private String nombre;
    private String contrasena;
    private String nick;
    private String dni;
    private boolean admin; //true admin false usuario

    //Constructor
    public Usuario(String nombre, String nick, String contrasena, String dni, boolean admin){
        this.nombre = nombre;
        this.nick = nick;
        this.contrasena = contrasena;
        this.dni = dni;
        this.admin = admin;
    }

    //Getters y Setters
    public String getNombre(){ 
        return nombre;
    }

    public String getNick(){
        return nick;
    }

    public String getDni(){
        return dni;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setNick(String nick){
        this.nick = nick;
    }

    //Comprobar contraseña
    public boolean contrasena(String contrasena){
        return this.contrasena.equals(contrasena);
    }   

    @Override
    public String toString(){
        return "Usuario: " + this.nombre + " | Nick: " + nick + " | DNI: " + dni;
    }
}
