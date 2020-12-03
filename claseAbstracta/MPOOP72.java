/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseAbstracta;

/**
 *
 * @author Leal Hernandez Haziel Ivan
 */
public class MPOOP72 {
    
    public static void main(String[] args) {
        System.out.println("***********************************");
        System.out.println("Actividad 3");
        // Poligono poligono = new Poligono(); Linea incorrecta
        Poligono poligono = new Triangulo();
        System.out.println(poligono);
        poligono = new Cuadrilatero();
        System.out.println(poligono);
    }
    
}
