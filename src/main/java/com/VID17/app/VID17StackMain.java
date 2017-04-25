/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VID17.app;

import java.util.Stack;

/**
 *
 * @author Ignacio
 */
public class VID17StackMain {

    public static void main(String[] args) throws InterruptedException {
        /* Stack<String> pila = new Stack();
        pila.push("1 - Nacho");
        pila.push("2 - Juan");
        pila.push("3 - Pedro");
        pila.push("4 - Alberto");
        pila.push("5 - Pedro Junior");

        for (String s : pila) {
            System.out.println(s);
        }
        
        System.out.println("Tope "+pila.peek());
        System.out.println("Buscando "+pila.search("3 - Pedro"));
        
        System.out.println("LIFO");
        while(!pila.isEmpty()){
            System.out.println("Atendiando a : "+pila.pop());
            Thread.sleep(10000);
        }*/

        Stack<PersonaV17> pila = new Stack<PersonaV17>();
        pila.push(new PersonaV17(19, "Alberto", 22));
        pila.push(new PersonaV17(19, "Juan", 22));
        pila.push(new PersonaV17(19, "Pedro", 22));
        pila.push(new PersonaV17(19, "Matias", 22));
        
        for (PersonaV17 p : pila) {
            System.out.println(p.getNombre());
        }
        
        System.out.println("Tope "+pila.peek());
        System.out.println("Buscando "+pila.search("3 - Pedro"));
        
        System.out.println("LIFO");
        while(!pila.isEmpty()){
            System.out.println("Atendiando a : "+pila.pop());
            Thread.sleep(10000);
        }
    }
}
