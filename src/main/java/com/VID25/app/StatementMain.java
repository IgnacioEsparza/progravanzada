/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VID25.app;

import java.sql.SQLException;

/**
 *
 * @author Ignacio
 */
public class StatementMain {

    public static void main(String[] args) throws SQLException {
        AppStatement as = new AppStatement();
        as.conectar();
        boolean rpta = as.leerStatement(new Persona(1, "Pedro", "pedrocontrasegna' OR ' 'M' = 'M'"));
        as.desconectar();

        if (rpta) {
            System.out.println("Verificación Correcta, Ingresando al Sistema...");
        } else {
            System.out.println("Credenciales Incorrectas, Acceso Denegado");
        }
    }
}
