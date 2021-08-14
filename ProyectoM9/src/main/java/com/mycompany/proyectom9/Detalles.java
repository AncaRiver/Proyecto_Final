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
public class Detalles extends Principales {
    
    private double edad;
    private double cantidad;
    private double tasa;
    private double plazo;
    private double total;
    
    public Detalles(){
        
    }
    public Detalles(double _edad, double _cantidad, double _tasa, double _plazo, double _total){
       this.setedad(_edad);
       this.setcantidad(_cantidad);
       this.settasa(_tasa);
       this.setplazo(_plazo);
       this.settotal(_total);
    }
    
    public void setedad(double _edad){
        this.edad = _edad;
    }
    public void setcantidad(double _cantidad){
        this.cantidad = _cantidad;
    }
    public void settasa(double _tasa){
        this.tasa = _tasa;
    }
    public void setplazo(double _plazo){
        this.plazo = _plazo;
    }
    public void settotal(double _total){
        this.edad = _total;
    }
    public double getedad(){
        return this.edad;
    }
    public double getcantidad(){
        return this.cantidad;
    }
    public double gettasa(){
        return this.tasa;
    }
    public double getplazo(){
        return this.plazo;
    }
    public double gettotal(){
        return this.total;
    }
}
