/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VID12.app;

/**
 *
 * @author Ignacio
 */
public class PersonaV12 implements Comparable<PersonaV12>{
    private int id;
    private String nombre;
    private int edad;

    public PersonaV12(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int compareTo(PersonaV12 p) {
        //return this.edad - p.getEdad();4
        return this.nombre.compareTo(p.getNombre());
                
    }
    
}
