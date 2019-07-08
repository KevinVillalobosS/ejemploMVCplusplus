/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Usuario;
import Vista.VistaUsuario;

/**
 *
 * @author Kevin.PC
 */
public class ControladorUsuario {
    private Usuario usuario;
    private VistaUsuario vista;

    public ControladorUsuario(){
        this.usuario = new Usuario();
        this.vista = new VistaUsuario(this);
    }
    
    public void iniciar(){
        this.vista.mostrarVista();
    }
    
    public int darDinero(String nombre){
        int dinero = this.usuario.obtenerDinero(nombre);
        //agregar dinero bajo cierta logica
        int nuevoDinero = dinero + 10;
        return this.usuario.darDinero(nuevoDinero, nombre);
    }
    
    public int traerDinero(String nombre){
        //
        return this.usuario.obtenerDinero(nombre);
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public VistaUsuario getVista() {
        return vista;
    }

    public void setVista(VistaUsuario vista) {
        this.vista = vista;
    }

    
    
    
  
    
    
}
