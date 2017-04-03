/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VID4.app;

/**
 *
 * @author Ignacio
 */
public class Fruta {
    
    private String nombre;

    public Fruta(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Fruta "+ nombre;
    }
    
    
    
}
