/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;


/**
 *
 * @author Kevin.PC
 */
public class Usuario {
    private String nombreUsuario;
    private int dineroUsuario;
    private BD baseDeDatos;
    
    public Usuario(){
        this.baseDeDatos = new BD();
    }
    
    private boolean validarUsuario(String nombre, ArrayList<String> usuarios){
        return usuarios.contains(nombre);
    }
    
    
    public int obtenerDinero(String nombre){
        ArrayList<String> usuarios = this.baseDeDatos.getUsuarios();
        if (this.validarUsuario(nombre, usuarios)){
            ArrayList<Integer> dineros = this.baseDeDatos.getDineros();
            return dineros.get(usuarios.indexOf(nombre));
        }else{
            return -1;
        }
    }
    
    
    
    public int darDinero(int nuevoDinero, String nombre){
        //validar si el nombre existe
        ArrayList<Integer> valores = this.baseDeDatos.getDineros();
        ArrayList<String> usuarios = this.baseDeDatos.getUsuarios();
        valores.set(usuarios.indexOf(nombre), nuevoDinero);
        this.baseDeDatos.setDineros(valores);
        return nuevoDinero;     
        //si no existe, devolver codigo de error
    }
    
    
    
    
    
    
    
    
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getDineroUsuario() {
        return dineroUsuario;
    }

    public void setDineroUsuario(int dineroUsuario) {
        this.dineroUsuario = dineroUsuario;
    }

    public BD getBaseDeDatos() {
        return baseDeDatos;
    }

    public void setBaseDeDatos(BD baseDeDatos) {
        this.baseDeDatos = baseDeDatos;
    }
    
    
    
}
