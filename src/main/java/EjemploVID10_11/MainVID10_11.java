/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploVID10_11;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
/**
 *
 * @author Ignacio
 */
public class MainVID10_11 {
    public static void main(String[] args) {
        ArrayList<Puntaje10_11> RegPun= new ArrayList();
        RegPun.add(new Puntaje10_11("Pablo Friesnsoux", 7899, fecha()));
        RegPun.add(new Puntaje10_11("Juan Marcchietore", 9755, fecha()));
        RegPun.add(new Puntaje10_11("Raul Schnerdarmann", 4555, fecha()));
        RegPun.add(new Puntaje10_11("Jonathan Ñamcunahuelef", 4769, fecha()));
        
        Collections.sort(RegPun, new PuntajeComparador());
        
        for (Puntaje10_11 p: RegPun){
            System.out.println(p);
        }
    }
    
   public static String fecha() {
        Calendar c = Calendar.getInstance();
        String dia = String.valueOf(c.get(Calendar.DATE));
        String mes = String.valueOf((c.get(Calendar.MONTH)) + 1);
        String agno = String.valueOf(c.get(Calendar.YEAR));
        String fecha = dia + "/" + mes + "/" + agno;
        return fecha;
    }
}
