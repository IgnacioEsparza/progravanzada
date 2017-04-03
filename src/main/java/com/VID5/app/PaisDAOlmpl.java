/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VID5.app;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ignacio
 */
public class PaisDAOlmpl {
    
    public static PaisDAOlmpl instancia = null;
    
    private PaisDAOlmpl(){
        
    }
    
    public static PaisDAOlmpl getInstancia(){
        if(instancia==null){
            instancia = new PaisDAOlmpl();
        }
        return instancia;
    }
    
    private List paises=null;
    
    public List getPaises(){
        if (paises==null){
            
        paises = new ArrayList();
        
        Pais p1 = new Pais("Chile");
        Pais p2 = new Pais("México");
        Pais p3 = new Pais("Argentina");
        
        paises.add(p1);
        paises.add(p2);
        paises.add(p3);
        }
        return paises;
    }
}
