/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VID24.app;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Ignacio
 */
public class AppExcepciones {

    public void mostrar() {
        try {
            throw new IOException("IOExceptions");
        } catch (FileNotFoundException ffe) {
            System.out.println(ffe.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
