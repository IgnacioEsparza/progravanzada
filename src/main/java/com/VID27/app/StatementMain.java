/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VID27.app;
import java.sql.SQLException;

/**
 *
 * @author Ignacio
 */
public class StatementMain {

    public static void main(String[] args) throws SQLException {
        AppStatement as = new AppStatement();
        as.conectar();
        
        //as.registrarCallablesStatement(new Persona(1, "Juan", "158juan"));
        as.listarOutCallablesStatement(new Persona(1, "Juan", "158juan"));
        
        as.desconectar();

        
    }
}
