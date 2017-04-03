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
public class GenericoI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Laclase<String> lc = new Laclase<String>("Juan");
        lc.MostrarTipo();
    }
    
}
