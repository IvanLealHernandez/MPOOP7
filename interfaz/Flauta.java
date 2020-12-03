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
public class Flauta extends InstrumentoViento{
    
    /**
    * Constructor vacio
    */
    public Flauta() {
    }

    /**
    * Metodo que regresa el tipo de instrumento
    * @return "Flauta"
    */
    @Override
    public String tipoInstrumento(){
        return "Flauta";
    }

    /**
    * Metodo que regresa la infromacion del instrumento
    * @return cadena con informacion del instrumento
    */
    @Override
    public String toString() {
        return "Flauta{" + '}';
    }
}
