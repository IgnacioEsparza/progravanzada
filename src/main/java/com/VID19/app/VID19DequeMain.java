/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VID19.app;

import java.util.ArrayDeque;
import java.util.Deque;


/**
 *
 * @author Ignacio
 */
public class VID19DequeMain {

    public static void main(String[] args) throws InterruptedException {
        Deque<String> dq =new ArrayDeque();
        dq.add("1.- Jaime");
        dq.add("2.- Alberto");
        dq.add("3.- Juan");
        
        String x = dq.peek();
        System.out.println("Peek "+x);
        
        x=dq.poll();
        System.out.println("Poll "+x);
        
        x=dq.pop();
        System.out.println("Pop "+x);
        
        dq.addFirst("0.- MacDaniels");
        dq.addLast("4.- Carlos");
        
        for (String s:dq) {
            System.out.println(s);
        }
    }
}
