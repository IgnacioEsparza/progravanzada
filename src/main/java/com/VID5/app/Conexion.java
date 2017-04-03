/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VID5.app;

/**
 *
 * @author Ignacio
 */
public class Conexion {
    
    private static Conexion instancia;
    
    public static Conexion getInstancia(){
        if(instancia == null){
            instancia = new Conexion();
        }
        return instancia;
    }
    
    private Conexion(){
        
    }
}
