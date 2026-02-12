package com.biblioteca;
import java.util.Scanner;

public class Usuario {

    static Scanner sc = new Scanner(System.in);

    //Atributos
    private String nombre;
    private String contraseña;
    private int prestamosActivos;
    enum Rol {Usuario, Admin}

    //Constructor usuario (todo está en construcción, es igual de desastre que mi vida)
    public void crearUsuario(String nombre, String contraseña, Rol Usuario){
        this.nombre = nombre;
        this.contraseña = contraseña;
    }
    //Constructor admin
    public void crearAdmin(String nombre, String contraseña, Rol Admin){
        this.nombre = nombre;
        this.contraseña = contraseña;
    }
    public String getNombre(){
        return nombre;
    }

    public int getPrestamosActivos(){
        return prestamosActivos;
    }
    public void mostrarInfoUser(){
        getNombre();
        getPrestamosActivos();
    }
}
