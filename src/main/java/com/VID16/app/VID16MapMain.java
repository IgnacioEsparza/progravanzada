/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VID16.app;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/**
 *
 * @author Ignacio
 */
public class VID16MapMain {
    public static void main(String[] args) {
        
       /* Map<Integer,String> mapa = new HashMap<Integer, String>();
        mapa.put(3, "Alberto");
        mapa.put(4, "Juan");
        mapa.put(1, "Pedro");
        mapa.put(2, "Matias");
        mapa.put(5, null);
        mapa.put(null, "Edealberto");*/
       
       /* Map<String,String> mapa = new TreeMap();
        mapa.put("3", "Alberto");
        mapa.put("4", "Juan");
        mapa.put("1", "Pedro");
        mapa.put("2", "Matias");
        mapa.put("5", null);*/
        
        Map<String,String> mapa = new LinkedHashMap<String, String>();
        mapa.put("3", "Alberto");
        mapa.put("4", "Juan");
        mapa.put("1", "Pedro");
        mapa.put("2", "Matias");
        mapa.put("5", null);
        
        Iterator it = mapa.keySet().iterator();
        while (it.hasNext()){
            String key =(String)it.next();
            System.out.println("Clave : "+key+" -> "
            +"Valor : "+mapa.get(key));
        }
    }
    
}
