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
        AlumnoV8 a1 = new AlumnoV8("Manueh Mano");
        AlumnoV8 a2 = new AlumnoV8("Giorgio Fischio");
        AlumnoV8 a3 = new AlumnoV8("Vincitore Smaltore");
        
        List <AlumnoV8> l = new ArrayList();
        l.add(a1);
        l.add(a2);
        l.add(a3);
        
        aw.Listar(l);
        
    }

    public void Listar(List<AlumnoV8> lista) {
        for (AlumnoV8 a : lista) {
            System.out.println(a.getNombre());
        }
    }

}
