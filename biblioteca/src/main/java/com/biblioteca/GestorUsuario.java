package com.biblioteca;

public class GestorUsuario {

    //Array de usuario
    private Usuario [] usuarios = new Usuario [0];

    //Función para agregar el usuario (en los parámetros añadimos el nombre del usuario que queremos agregar)
    public void agregarUsuario(Usuario usuario){

        //Array que aumenta el array original de usuario y agregar el nuevo
        Usuario [] agregar = new Usuario[usuarios.length + 1];

        //Bucle para añadir el usuario nuevo
        for(int i = 0; i < usuarios.length; i++){
            agregar[i] = usuarios[i];
        }
        agregar[usuarios.length] = usuario; //Y se mete al Array

        usuarios = agregar;
    }

    public boolean eliminarUsuario(String nombre){
        int indice = -1; //Si sigue siendo -1, no se ha encontrado usuario

        for(int i = 0; i < usuarios.length; i++){
            if(usuarios[i].getNombre().equalsIgnoreCase(nombre)){ //Comprobamos si el nombre introducido coincide con algún usuario
                indice = i; //Se mete el usuario al indice
                break;
            }
        }
        if(indice == -1){
            return false; //No se encontró
        }

        Usuario [] arrayAct = new Usuario[usuarios.length - 1]; //Creamos otro array 

            for(int i = 0, j = 0; i < usuarios.length; i++){ //La i recorre el viejo array, y la j controla la posición del actual
                if (i !=indice){ //Solo copia los que no se quieren eliminar
                    arrayAct[j++] = usuarios[i];
                }
            }
            usuarios = arrayAct; //usuarios apunta al array actualizado
            return true;
    }

    public Usuario buscarUsuario(String nick){
        for(Usuario usuario : usuarios){
            if(usuario.getNick().equalsIgnoreCase(nick)){
                return usuario;
            }
        }
        return null;
    }

    //Getter del array para recorrerlo desde fuera
    public Usuario [] getUsuarios(){
        return usuarios;
    }

    public void mostrarUsuarios(){
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }

    //Función de login (se puede cambiar a la clase Biblioteca)
    public Usuario login (String nick, String contrasena){
        Usuario usuario = buscarUsuario(nick);

        if(usuario !=null && usuario.contrasena(contrasena)){ //Comprueba que el nick y contrasena sean validos
            return usuario;
        }
        return null;
    }
}
            