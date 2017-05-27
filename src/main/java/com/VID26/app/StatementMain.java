/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VID26.app;

import java.sql.SQLException;

/**
 *
 * @author Ignacio
 */
public class StatementMain {

    public static void main(String[] args) throws SQLException {
        AppStatement as = new AppStatement();
        as.conectar();
        
        as.modificarBatchStatement(new Persona(1, "Pedro", "pedrocontrasegna"));
        System.out.println("/////////////////////////////////////////////////////////////////////");
        
        //mas rápida
        as.modificarBatchPreparedStatement(new Persona(1, "Pedro", "pedrocontrasegna"));
        
        as.desconectar();

        
    }
}
