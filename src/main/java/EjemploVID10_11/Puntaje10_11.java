/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploVID10_11;

/**
 *
 * @author Ignacio
 */
public class Puntaje10_11{
    
    private String fecha;
    private String nombre;
    private double puntaje;
    
    public Puntaje10_11() {
    }
    
    public Puntaje10_11(String nombre, double puntaje, String fecha) {
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
    public String toString() {
        return "Puntaje : "+puntaje +" por : "+nombre+ " en : " + fecha;
    }
}
