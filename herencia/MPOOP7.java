/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Leal Hernandez Haziel Ivan
 */
public class MPOOP7 {
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("**************************************");
        System.out.println("Actividad 1");
        //Las clases base pueden comportarse como sus subclases
        
        Poligono poligono = new Poligono();
        System.out.println(poligono);
        
        Object objeto = new Object();
        System.out.println("Objeto " + objeto);
        objeto = poligono;
        System.out.println("Objeto como poligono "+objeto);
        objeto = new Poligono();
        System.out.println("Objeto como poligono "+objeto);
        
        System.out.println("**************************************");
        System.out.println("Actividad 2");
        //Uso de instanceof
        poligono = new Poligono();
        System.out.println(poligono);
        selectorPoligono(poligono);
        poligono = new Triangulo();
        System.out.println(poligono);
        selectorPoligono(poligono);
        poligono = new Poligono();
        System.out.println(poligono);
        selectorPoligono(poligono);
    }
    
    public static void selectorPoligono(Poligono poligono){
        if(poligono instanceof Triangulo){
            System.out.println("El objeto es un triangulo");
        }
        else if (poligono instanceof Cuadrilatero){
            System.out.println("El objeto es un cuadrilatero");
        }
        else if(poligono instanceof Poligono){
            System.out.println("El objeto es un poligono");
        }
        else {
            System.out.println("El objete es otra figura");
        }
    }
    
}
