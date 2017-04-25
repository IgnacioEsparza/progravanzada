/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VID16.app;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Map.Entry;
//import java.util.LinkedHashMap;

/**
 *
 * @author Ignacio
 */
public class VID16MapMain {

    public static void main(String[] args) {

        Map<PersonaV16, String> mapa = new HashMap<PersonaV16, String>();
        mapa.put(new PersonaV16(19, "Alberto", 22), "Alberto");
        mapa.put(new PersonaV16(19, "Juan", 22), "Juan");
        mapa.put(new PersonaV16(19, "Pedro", 22), "Pedro");
        mapa.put(new PersonaV16(19, "Matias", 22), "Matias");
        mapa.put(new PersonaV16(19, "NUll", 22), null);

        /* Map<String,String> mapa = new TreeMap();
        mapa.put("3", "Alberto");
        mapa.put("4", "Juan");
        mapa.put("1", "Pedro");
        mapa.put("2", "Matias");
        mapa.put("5", null);*/
        
        /*Map<PersonaV16, String> mapa = new LinkedHashMap<PersonaV16, String>();
        mapa.put(new PersonaV16(19, "Alberto", 22), "Alberto");
        mapa.put(new PersonaV16(19, "Juan", 22), "Juan");
        mapa.put(new PersonaV16(19, "Pedro", 22), "Pedro");
        mapa.put(new PersonaV16(19, "Matias", 22), "Matias");
        mapa.put(new PersonaV16(19, "NUll", 22), null);*/
        
        /*Iterator it = mapa.keySet().iterator();
        while (it.hasNext()) {
            PersonaV16 key = (PersonaV16) it.next();
            System.out.println("Clave : " + key + " -> "
                    + "Valor : " + mapa.get(key));
        }*/
        
        for (Entry<PersonaV16,String> e : mapa.entrySet()) {
            System.out.println("Clave : " + e.getKey() + " -> "
                    + "Valor : " + e.getValue());
        }
    }

}
