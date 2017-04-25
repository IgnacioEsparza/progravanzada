/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VID15.app;

import com.VID14.app.*;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author Ignacio
 */
public class VID15LinkedHashSetMain {
    public static void main(String[] args) {
        
        Set<PersonaV14> lista = new LinkedHashSet<PersonaV14>();
        lista.add(new PersonaV14(16, "Alberto Jeria", 22));
        lista.add(new PersonaV14(17, "Manueh Albornoz", 23));
        lista.add(new PersonaV14(18, "Edealberto Heinz", 24));
        lista.add(new PersonaV14(19, "Asticio Lopez", 25));
        lista.add(new PersonaV14(14, "Alberto Jeria", 26));
        lista.add(new PersonaV14(13, "Asticio Lopez", 27));
        
        for (PersonaV14 p : lista) {
            System.out.println("\n"+p.getNombre()+"\nEdad : "+p.getEdad());
        }
    }
}
