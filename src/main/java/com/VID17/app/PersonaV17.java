/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VID17.app;

import com.VID15.app.*;

/**
 *
 * @author Ignacio
 */
public class PersonaV17 /*implements Comparable<PersonaV15>*/ {

    private int id;
    private String nombre;
    private int edad;

    public PersonaV17(int id, String nombre, int edad) {
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
        hash = 19 * hash + this.id;
        hash = 19 * hash + (this.nombre != null ? this.nombre.hashCode() : 0);
        hash = 19 * hash + this.edad;
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
        final PersonaV17 other = (PersonaV17) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.edad != other.edad) {
            return false;
        }
        if ((this.nombre == null) ? (other.nombre != null) : !this.nombre.equals(other.nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "\nRut : " + id + "\nNombre : " + nombre + "\nEdad :" + edad;
    }

   /* public int compareTo(PersonaV15 p) {
        return this.edad - p.getEdad();
        // this.nombre.compareTo(p.getNombre());     
    }*/

}
