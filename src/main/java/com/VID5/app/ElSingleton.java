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
public class ElSingleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* PaisDAOlmpl dao = new PaisDAOlmpl();
        
        for (Object o: dao.getPaises()){
            System.out.println(((Pais)o).getNombre());
        }*/
       
       PaisDAOlmpl dao = PaisDAOlmpl.getInstancia();
        
        for (Object o: dao.getPaises()){
            System.out.println(((Pais)o).getNombre());
        }
    }
    
}
