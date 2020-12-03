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
public class Triangulo extends Poligono {

    private int alpha, beta, gamma;
    private float a, b, c, base, altura;

    /**
    * Constructor vacio
    */
    public Triangulo() {
    }

    /**
    * Constructor co parametros 
    * @param a
    * @param b
    * @param c
    */
    public Triangulo(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
    * Metdo para obtener el angulo alpha
    * @return alpha
    */
    public int getAlpha() {
        return alpha;
    }

    /**
    * Metdo para insetar el angulo alpha
    * @param alpha
    */
    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }

    /**
    * Metdo para obtener el angulo beta
    * @return beta
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
    * Metdo para obtener el angulo gamma
    * @return gamma
    */
    public int getGamma() {
        return gamma;
    }

    /**
    * Metdo para insetar el angulo gamma
    * @param gamma
    */
    public void setGamma(int gamma) {
        this.gamma = gamma;
    }

    /**
    * Metdo para obtener el lado a
    * @return a
    */
    public float getA() {
        return a;
    }

    /**
    * Metdo para insetar el lado a
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
    * Metdo para obtener el lado c
    * @return c
    */
    public float getC() {
        return c;
    }

    /**
    * Metdo para insetar el lado c
    * @param c
    */
    public void setC(float c) {
        this.c = c;
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
    * Metdo para insetar la altura
    * @param altura
    */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
    * Metdo para obtener la infromacion del triangulo
     * @return cadena con el valor de los atributos
    */
    @Override
    public String toString() {
        return "Triangulo{" + "alpha=" + alpha + ", beta=" + beta + ", gamma=" + gamma + ", a=" + a + ", b=" + b + ", c=" + c + ", base=" + base + ", altura=" + altura + '}';
    }

}
