/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VID10.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Ignacio
 */
public class ColeccionesMain {
    public static void main(String[] args) {
        
        int[] arreglo= new int[3];
        List<Integer> lista = new ArrayList();
        lista.add(99);
        lista.add(10000);
        lista.add(1);
        
        //Collections.sort(lista);
        Collections.reverse(lista);
        
        System.out.println(lista);
    }
}
