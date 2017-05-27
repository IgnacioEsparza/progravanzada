/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VID27.app;

import java.awt.HeadlessException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import javax.swing.JOptionPane;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

/**
 *
 * @author Ignacio
 */
public class AppStatement {

    private Connection con = null;

    public void conectar() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = null;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbtest", "root", "");
            JOptionPane.showMessageDialog(null, "Conexión Exitosa");
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            System.out.println("Error" + e);
        }
    }

    public void desconectar() throws SQLException {
        if (con != null) {
            con.close();
        }
    }

//    public boolean leerStatement(Persona per) throws SQLException {
//        boolean rpta = false;
//        try {
//            Statement st = con.createStatement();
//            String sql = "SELECT * FROM test WHERE nombre = '" + per.getNombre()+"'and pass = '"+per.getPass()+"'";
//            System.out.println("Query => " + sql);
//            ResultSet rs = st.executeQuery(sql);
//
//            if (rs.next()) {
//                System.out.println("Existen Datos");
//                rpta = true;
//            }else{
//                System.out.println("No existen Datos");
//            } 
//            
//            System.out.println("Consulta Existosa");
//        } catch (Exception e) {
//        }
//        return rpta;
//    }
    public boolean leerPreparedStatement(Persona per) throws SQLException {
        boolean rpta = false;
        PreparedStatement ps = null;
        try {
            String sql = "SELECT * FROM test WHERE nombre = ? AND pass = ?";
            System.out.println("Query => " + sql);

            ps = con.prepareStatement(sql);
            ps.setString(1, per.getNombre());
            ps.setString(2, per.getPass());

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("Existen Datos");
                rpta = true;
            } else {
                System.out.println("No Existen Datos");
            }
            System.out.println("Consulta Existosa");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            ps.close();
        }
        return rpta;
    }

//   
    public void modificarBatchStatement(Persona per) throws SQLException {
        long ini = System.currentTimeMillis();
        try {
            con.setAutoCommit(false);

            Statement st = con.createStatement();
            String sql = "UPDATE test SET nombre = '" + per.getNombre() + "'pass =" + per.getPass() + "'";
            System.out.println("Query => " + sql);
            int numeroFilas = st.executeUpdate(sql);
            System.out.println("#Filas Afectadas - Statement" + numeroFilas);

            con.commit();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            con.rollback();
        }

        long fin = System.currentTimeMillis();

        System.out.println("Statement" + (fin - ini));

    }

    public void modificarBatchPreparedStatement(Persona per) throws SQLException {
        long ini = System.currentTimeMillis();
        PreparedStatement ps = null;

        try {
            con.setAutoCommit(false);

            //ejemplo si uno actualiza varias cosas
            for (int i = 0; i < 10; i++) {
                String sql = "UPDATE test SET nombre = ? , pass = ?";
                ps = con.prepareStatement(sql);
                ps.setString(1, per.getNombre());
                ps.setString(2, per.getPass());
                ps.addBatch();
            }
            ps.executeBatch();
            //System.out.println("Query => " + sql);
            //int numeroFilas = ps.executeUpdate();
            //System.out.println("#Filas Afectadas - PreparedStatement " + numeroFilas);

            con.commit();

        } catch (Exception e) {
            con.rollback();
            System.out.println(e.getMessage());
        }
        long fin = System.currentTimeMillis();

        System.out.println("Statement" + (fin - ini));
    }

    public void registrarCallablesStatement(Persona per) {
        try {
            String sql = "{call spTest(?,?)}";
            CallableStatement cs = con.prepareCall(sql);
            cs.setString(1, per.getNombre());
            cs.setString(1, per.getPass());
            cs.execute();
            cs.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void listarCallablesStatement() {
        try {
            String sql = "{call spListar()}";
            CallableStatement cs = con.prepareCall(sql);
            cs.execute();
            ResultSet rs = cs.getResultSet();

            while (rs.next()) {
                System.out.print(rs.getInt("id"));
                System.out.print(rs.getString("nombre"));
                System.out.println(rs.getString("pass"));
            }
            cs.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void listarOutCallablesStatement(Persona per) {
        try {
            String sql = "{call spSalidaID(?,?)}";
            CallableStatement cs = con.prepareCall(sql);
            cs.setString(1, per.getNombre());
            cs.registerOutParameter(2, Types.INTEGER);
            cs.execute();

            int idSalida = cs.getInt(2);

            System.out.println("El código en salida es " + idSalida);
            cs.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
