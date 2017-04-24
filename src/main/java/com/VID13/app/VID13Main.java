/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VID13.app;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Ignacio
 */
public class VID13Main {

    public static void main(String[] args) {
        /*Set<String> lista = new HashSet();
        lista.add("Juan");
        lista.add("Tan");
        lista.add("Elao");
        lista.add("Juan");
        lista.add("Olga");
        
        System.out.println(lista);*/
        
        Set<PersonaV13> lista = new HashSet<PersonaV13>();
        lista.add(new PersonaV13(1990, "Alberto Casas", 50));
        lista.add(new PersonaV13(1991, "Juan dotche", 60));
        lista.add(new PersonaV13(1992, "Manueh Fischio", 20));
        lista.add(new PersonaV13(1993, "Alberto Casas", 50));
        for (PersonaV13 p :lista) {
            System.out.println(p.getNombre());
        }
    }
}
