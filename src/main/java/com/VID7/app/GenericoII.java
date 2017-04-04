/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VID7.app;

import java.util.ArrayList;
import java.util.List;

public class GenericoII {
     public static void main(String[] args) {
         /*List l = new ArrayList(); //Sin TypeSafety
         //List <String> l = new ArrayList<String>();
         l.add("NachoMan");
         l.add(66);
         
         String Texto = (String)l.get(0);
         
         System.out.println("Manuel ama a : " + Texto);
         
         /*String [] as = new String[5];
         as[0]="Juan";*/
         //as[1]=99; no se puede porque un Array String ya tiene por defecto TypeSafety*/
         
         Clase <String,Integer,String,Double> c = new Clase("NachoMan",99,"HelaoJuan",9.6);
         //c.mostrarTipo();
         
         List<Clase<String,Integer,String,String>> list= new ArrayList ();
         list.add(new Clase("yeeei", 9999, "Clitro", "juan"));
         
         for (Clase cl : list) {
             cl.mostrarTipo();
         }
    }
}
