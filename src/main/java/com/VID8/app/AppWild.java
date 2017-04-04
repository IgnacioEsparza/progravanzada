/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VID8.app;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ignacio
 */
public class AppWild {

    public static void main(String[] args) {
        AppWild aw = new AppWild();
        PersonaV8 a1 = new AlumnoV8("Manueh Mano");
        PersonaV8 a2 = new AlumnoV8("Giorgio Fischio");
        PersonaV8 a3 = new AlumnoV8("Vincitore Smaltore");
        PersonaV8 a4 = new ProfesorV8("George Whistle");

        List<PersonaV8> l = new ArrayList();
        l.add(a1);
        l.add(a2);
        l.add(a3);
        l.add(a4);

        aw.ListarUpperBounded(l);
        System.out.println("");
        aw.ListarLowerBounded(l);
        System.out.println("");
        aw.ListarUpBounded(l);

    }

    public void ListarUpperBounded(List<? extends PersonaV8> lista) {
        for (PersonaV8 p : lista) {
                System.out.println(p.getNombre());
        }
    }
    public void ListarLowerBounded(List<? super AlumnoV8> lista) {
        for (Object o : lista) {
                System.out.println(((PersonaV8)o).getNombre());
        }
    }
    public void ListarUpBounded(List<?> lista) {
        for (Object o : lista) {
                System.out.println(((PersonaV8)o).getNombre());
        }
    }

}
