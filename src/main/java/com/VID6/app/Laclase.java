/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VID6.app;

/**
 *
 * @author Ignacio
 */
public class Laclase <T>{
    
    private T objeto;
    
    public Laclase (T objeto){
        this.objeto= objeto;
    }
    
    public void MostrarTipo (){
        System.out.println("T es un: "+objeto.getClass().getName());
    }
    
}
