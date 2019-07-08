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
public class BD {
    private ArrayList<String> usuarios;
    private ArrayList<Integer> dineros;
    
    
    public BD(){
        this.usuarios = new ArrayList<>();
        this.usuarios.add("Esteban");
        this.usuarios.add("Raul");
        this.usuarios.add("Rodrigo");
        this.dineros = new ArrayList<>();
        this.dineros.add(10);
        this.dineros.add(100);
        this.dineros.add(0);
    }
    
    
    
    

    public ArrayList<String> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<String> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<Integer> getDineros() {
        return dineros;
    }

    public void setDineros(ArrayList<Integer> dineros) {
        this.dineros = dineros;
    }
    
    
    
    
}
