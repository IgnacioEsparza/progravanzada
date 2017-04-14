/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VID12.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Ignacio
 */
public class VID12Comparable {
    public static void main(String[] args) {
          List<PersonaV12> lista = new ArrayList();
        lista.add(new PersonaV12(1, "Giuseppe", 66));
        lista.add(new PersonaV12(2, "Fischio", 22));
        lista.add(new PersonaV12(3, "Victorine", 21));
        lista.add(new PersonaV12(9, "Salvatore", 52));
        lista.add(new PersonaV12(6, "Juan", 23));
        
        Collections.sort(lista);
        
        for (PersonaV12 p:lista) {
            System.out.println(p.getNombre());
        }
    }
    
}
