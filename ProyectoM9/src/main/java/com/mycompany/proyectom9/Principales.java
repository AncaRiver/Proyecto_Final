/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectom9;

/**
 *
 * @author noec
 */
public class Principales {
    
    private String Nombre;
    private String Apellido;
    
    public Principales(){
    }
    public Principales(String _nombre, String _apellido){
        this.setNombre(_nombre);
        this.setapellido(_apellido);
    }
    public void setNombre(String _nombre){
        this.Nombre = _nombre;
    }
    public void setapellido(String _apellido){
        this.Apellido = _apellido;
    }
    public String getNombre(){
        return this.Nombre;
    }
    public String getApellido(){
        return this.Apellido;
    }
}
