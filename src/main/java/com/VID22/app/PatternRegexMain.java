/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VID22.app;

//import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Ignacio
 */
public class PatternRegexMain {

    public static void main(String[] args) {
//        Pattern p = Pattern.compile("..Z");
//        Matcher m = p.matcher("XYZ");

// ve si el matcher está en el pattern
//        Pattern p = Pattern.compile("[abc]");
//        Matcher m = p.matcher("a");
//        
//lo contrario de lo anterior
//        Pattern p = Pattern.compile("[^abc]");
//        Matcher m = p.matcher("e");
//
//        System.out.println(m.matches());
        long ini = System.currentTimeMillis();
        Pattern p = Pattern.compile(";");
        for (int i = 0; i < 1000; i++) {
            String[] arreglo = p.split("Juan;Pedro;Hermes");
        }
        long fin = System.currentTimeMillis();
        System.out.println("Tiempo " + (fin - ini));

        //////////////////////////////////////////////////
        long iniSplit = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            String[] arreglo = "Juan;Pedro;Hermes;Dagoberto".split("patron");
        }
        long finSplit = System.currentTimeMillis();
        System.out.println("Tiempo " + (finSplit - iniSplit));

        //////////////////////////////////////////////////
    }
}
