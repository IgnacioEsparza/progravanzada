/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VID4.app;

import java.util.ArrayList;
import java.util.List;



public class MainInstanceof {
    
    List Canasta = new ArrayList();
    
    public static void main(String[] args) {
        /*String text = new String ("VID4");
        if (text instanceof String){
            System.out.println("Es String");
        }*/
        
        /*AlumnoIns a = new AlumnoIns();
        if (a instanceof PersonaIns){
            System.out.println("Es una PErsona");
        }*/
        
        
        
        //hay una canasta donde solo se premite ingrasar frutas, otra cosa será rechazado
        
        System.out.println("Canasta Abierta, mete sólo frutas");
        Manzana m1 = new Manzana("Roja");
        Manzana m2 = new Manzana("Verde");
        Naranja n1= new Naranja("Valenciana");
        Galleta g1 = new Galleta("Toddy");
        
        MainInstanceof mi = new MainInstanceof();
        mi.verificar(m1);
        mi.verificar(m2);
        mi.verificar(n1);
        mi.verificar(g1);
    }
    
    private void verificar(Object o){
        if (o instanceof Fruta){
            Canasta.add(o);
            System.out.println("Metiste una "+o);
        }else{
            System.out.println(o+" no es fruta");
        }
    
    }
}
