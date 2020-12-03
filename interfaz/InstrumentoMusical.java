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
public interface InstrumentoMusical {
    
    /**
    * Metodo abstracto para tocar instrumento
    */
    void tocar();

    /**
    * Metodo abstracto para afinar
    */
    void afinar();

    /**
    * Metodo abstracto para obtener infromacion del instrumento
    */
    String tipoInstrumento();
    
}
