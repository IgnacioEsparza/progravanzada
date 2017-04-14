/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploVID10_11;

import java.util.Comparator;

/**
 *
 * @author Ignacio
 */
public class PuntajeComparador implements Comparator<Puntaje10_11>{

    @Override
    public int compare(Puntaje10_11 p1, Puntaje10_11 p2) {
        //ordenando de mayor a menor
        int rt=0;
        if (p1.getPuntaje()<p2.getPuntaje()){
            rt = 1;
        }
        if (p1.getPuntaje()>p2.getPuntaje()){
            rt = -1;
        }else{
            rt=0;
        }
        return rt;
    }
    
}
