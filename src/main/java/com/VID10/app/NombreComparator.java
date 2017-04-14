
package com.VID10.app;
import java.util.Comparator;
/**
 *
 * @author Ignacio
 */
public class NombreComparator implements Comparator<PersonaV10>{

    public int compare(PersonaV10 p1, PersonaV10 p2) {
        //PersonaV10 p1 = (PersonaV10)ob1;
        //PersonaV10 p2 = (PersonaV10)ob2;
        return p1.getNombre().compareTo(p2.getNombre());
    }
}
