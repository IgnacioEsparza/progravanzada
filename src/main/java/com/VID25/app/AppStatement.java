/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VID25.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Ignacio
 */
public class AppStatement {

    private Connection con = null;

    public void conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = null;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbtest", "root", "");
            JOptionPane.showMessageDialog(null, "Conexión Exitosa");
        } catch (Exception e) {
            System.out.println("Error"+ e);
        }
    }

    public void desconectar() throws SQLException {
        if (con != null) {
            con.close();
        }
    }

    public boolean leerStatement(Persona per) throws SQLException {
        boolean rpta = false;
        try {
            Statement st = con.createStatement();
            String sql = "SELECT * FROM test WHERE nombre = '" + per.getNombre()+"'and pass = '"+per.getPass()+"'";
            System.out.println("Query => " + sql);
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                System.out.println("Existen Datos");
                rpta = true;
            }else{
                System.out.println("No existen Datos");
            } 
            
            System.out.println("Consulta Existosa");
        } catch (Exception e) {
        }
        return rpta;
    }
}
