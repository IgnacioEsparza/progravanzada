/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VID18.app;

import com.VID17.app.*;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author Ignacio
 */
public class VID18QueueMain {

    public static void main(String[] args) throws InterruptedException {
        /*Queue<String> cola = new PriorityQueue<String>();
        cola.offer("1 - Nacho");
        cola.offer("2 - Juan");
        cola.offer("3 - Pedro");
        cola.offer("4 - Alberto");
        cola.offer("5 - Pedro Junior");
        
        
        
        while(!cola.isEmpty()){
            System.out.println("Atendudo "+cola.peek());
            System.out.println("Atendiando "+cola.poll());
            Thread.sleep(100);
        }*/

       Queue<PersonaV18> cola = new PriorityQueue<PersonaV18>();
        cola.offer(new PersonaV18(19, "Alberto", 22));
        cola.offer(new PersonaV18(19, "Juan", 22));
        cola.offer(new PersonaV18(19, "Pedro", 22));
        cola.offer(new PersonaV18(19, "Matias", 22));
        
        
        
        while(!cola.isEmpty()){
            System.out.println("Atendiando a : "+cola.poll());
            Thread.sleep(10000);
        }
    }
}
