/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VID10.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Ignacio
 */
public class ColeccionesMain {

    public static void main(String[] args) {

        //int[] arreglo= new int[3];
        List<PersonaV10> lista = new ArrayList();
        lista.add(new PersonaV10(1, "Giuseppe", 66));
        lista.add(new PersonaV10(2, "Fischio", 22));
        lista.add(new PersonaV10(3, "Victorine", 21));

        //Collections.sort(lista,new NombreComparator());
        Collections.sort(lista, new Comparator<PersonaV10>() {
            public int compare(PersonaV10 p1, PersonaV10 p2) {
                int rt = 0;
                if (p1.getEdad() > p2.getEdad()) {
                    rt = 1;
                } else if (p1.getEdad() < p2.getEdad()) {
                    rt = -1;
                } else {
                    rt = 0;
                }
                return rt; //To change body of generated methods, choose Tools | Templates.
            }
        });
        //Collections.reverse(lista);
        for (PersonaV10 p : lista) {
            System.out.println(p.getNombre());
        }
        System.out.println(lista);
    }
}
