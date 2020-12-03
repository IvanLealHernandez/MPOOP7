/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 * @author Leal Hernandez Haziel Ivan
 */
public class InstrumentoViento implements InstrumentoMusical{
   
    /**
    * Metodo que imprime un mensaje cuando se toca el instrumento de viento
    */
    @Override
    public void tocar(){
        System.out.println("Estoy tocando un instrumento de viento");
    }
 
    /**
    * Metodo que imprime un mensaje cuando se afina el instrumento
    */
    @Override
    public void afinar(){
        System.out.println("Estoy afinando un instrumento de viento");
    }

    /**
    * Metodo que regresa una cadena con el tipo de instrumento
    * @return cadena con tipo de instrumento
    */
    @Override
    public String tipoInstrumento(){
        return "Instrumento de viento";
    }

    /**
    * Metodo que imprime la informacion del instrumento
    * @return cadena con informacion del instrumento
    */
    @Override
    public String toString() {
        return "instrumentoViento{" + '}';
    }
    
}
