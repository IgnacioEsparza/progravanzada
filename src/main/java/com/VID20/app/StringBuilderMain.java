/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VID20.app;

/**
 *
 * @author Ignacio
 */
public class StringBuilderMain {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Juan");
//        sb.append("Juan").append("Alberto");
//        System.out.println(sb.toString());
       // System.out.println(sb.capacity());
        //System.out.println(sb.length());
        System.out.println(sb.reverse());
        sb.setLength(0);
        System.out.println(sb.toString());
        
    }
}
