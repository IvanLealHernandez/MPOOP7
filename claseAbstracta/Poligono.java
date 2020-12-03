/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseAbstracta;

/**
 * Clase Abstracta que modela un Poligono
 * @author Leal Hernandez Haziel Ivan
 */
public abstract class Poligono {
    
    
    /**
    * Constructor vacio
    */
     public Poligono() {
    }

    /**
    * Metodo toString
    */
    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
    
    /**
    * Metdo para calcular el area de un poligono que herada de Poligono
    */
    public void area(){
        
    }
 
    /**
    * Metdo para calcular el perimetro de un poligono que herada de Poligono
    */
    public void perimetro(){
        
    }
    
}
