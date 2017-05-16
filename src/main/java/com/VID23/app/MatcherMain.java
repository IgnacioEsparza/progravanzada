/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VID23.app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Ignacio
 */
public class MatcherMain {

    public static void main(String[] args) {
        String texto = "Tan hela'o que estay mitocode";
        Pattern p = Pattern.compile(".*mitocode.*", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(texto);

        System.out.println("Matches " + m.matches());

        System.out.println("LookingAt " + m.lookingAt());
        int cont = 0;
        while (m.find()) {
            cont++;
            System.out.println("Coincidencia N° " + cont + " Start " + m.start() + " End " + m.end());
        }
    }
}
