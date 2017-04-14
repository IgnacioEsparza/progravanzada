/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploVID12;

/**
 *
 * @author Ignacio
 */
public class Puntaje12 implements Comparable<Puntaje12>{
    
    private String fecha;
    private String nombre;
    private double puntaje;
    
    public Puntaje12() {
    }
    
    public Puntaje12(String nombre, double puntaje, String fecha) {
        this.fecha = fecha;
        this.nombre = nombre;
        this.puntaje = puntaje;
    }

    public String getFecha() {
        return this.fecha;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getPuntaje() {
        return this.puntaje;
    }
    
    public String getPuntajeS(){
        return String.valueOf(this.puntaje);
    }
    
    @Override
    public int compareTo(Puntaje12 p) {
        //ordenados de mayor a menor
         if (this.puntaje<p.puntaje){
            return 1;
        }
        if (this.puntaje>p.puntaje){
            return  -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Puntaje : "+puntaje +" por : "+nombre+ " en : " + fecha;
    }
    
    
    
}
