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
public class Cuadrilatero extends Poligono{
    
    private int alpha, beta;
    private float a,b,base,altura;

    /**
    * Consttructor vacio
    */
    public Cuadrilatero() {
    }

    /**
    * Constructor con parametros
    * @param a
    * @param b
    */
    public Cuadrilatero(float a, float b) {
        this.a = a;
        this.b = b;
    }

    /**
    * Metdo para obtener el angulo alpha
    * @return alpha
    */
    public int getAlpha() {
        return alpha;
    }

    /**
    * Metdo para insertar el angulo alpha
    * @param alpha
    */
    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }

    /**
    * Metdo para obtener el angulo beta
    * @return alpha
    */
    public int getBeta() {
        return beta;
    }

    /**
    * Metdo para insetar el angulo beta
    * @param beta
    */
    public void setBeta(int beta) {
        this.beta = beta;
    }

    /**
    * Metdo para obtener el lado a
    * @return a
    */
    public float getA() {
        return a;
    }

    /**
    * Metdo para insertar el lado a
    * @param a
    */
    public void setA(float a) {
        this.a = a;
    }

    /**
    * Metdo para obtener el lado b
    * @return b
    */
    public float getB() {
        return b;
    }

    /**
    * Metdo para insetar el lado b
    * @param b
    */
    public void setB(float b) {
        this.b = b;
    }

    /**
    * Metdo para obtener la base
    * @return base
    */
    public float getBase() {
        return base;
    }

    /**
    * Metdo para insetar la base
    * @param base
    */
    public void setBase(float base) {
        this.base = base;
    }

    /**
    * Metdo para obtener la altura
    * @return altura
    */
    public float getAltura() {
        return altura;
    }

    /**
    * Metdo para insetar la altur<
    * @param altura
    */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
    * Metdo que imoprime la informacion del cuadrilatero
     * @return cadena con el valor de los atributos
    */
    @Override
    public String toString() {
        return "Cuadrilatero{" + "alpha=" + alpha + ", beta=" + beta + ", a=" + a + ", b=" + b + ", base=" + base + ", altura=" + altura + '}';
    }
    
}
