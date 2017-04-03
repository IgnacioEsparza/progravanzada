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
public class MainInstanceof {
    public static void main(String[] args) {
        /*String text = new String ("VID4");
        if (text instanceof String){
            System.out.println("Es String");
        }*/
        
        AlumnoIns a = new AlumnoIns();
        if (a instanceof PersonaIns){
            System.out.println("Es una PErsona");
        }
    }
}
