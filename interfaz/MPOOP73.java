/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author Leal Hernandez Haziel Ivan
 */
public class MPOOP73 {
    
     public static void main(String[] args) {
        System.out.println("************************************");
        System.out.println("Actividad 4");
        InstrumentoMusical instrumento;
        instrumento = new InstrumentoViento();
        instrumento.afinar();
        System.out.println(instrumento);
        instrumento = new Flauta();
        instrumento.afinar();
        System.out.println(instrumento);
        
        
    }
    
}
