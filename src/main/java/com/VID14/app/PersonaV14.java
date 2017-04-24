/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VID14.app;

/**
 *
 * @author Ignacio
 */
public class PersonaV14 implements Comparable<PersonaV14>{
    private int id;
    private String nombre;
    private int edad;

    public PersonaV14(int id, String nombre, int edad) {
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + (this.nombre != null ? this.nombre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PersonaV14 other = (PersonaV14) obj;
        if ((this.nombre == null) ? (other.nombre != null) : !this.nombre.equals(other.nombre)) {
            return false;
        }
        return true;
    }
    
    

    @Override
    public String toString() {
        return "\nRut :" + id + "\nNombre : " + nombre + "\nEdad :" + edad;
    }
    
    public int compareTo(PersonaV14 p) {
        //return this.edad - p.getEdad();4
        return this.nombre.compareTo(p.getNombre());
                
    }
    
    
    
}
