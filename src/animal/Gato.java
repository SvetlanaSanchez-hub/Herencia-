/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

import java.awt.Color;

/**
 *
 * @author sve_c
 */
public class Gato extends Animal{
    private String raza;
    private int peso;
    private Color color;

    public Gato() {
    }

    public Gato(String raza, int peso, Color color) {
        this.raza = raza;
        this.peso = peso;
        this.color = color;
    }

    public Gato(String raza, int peso, Color color, int numeroPatas, int edad, String nombre) {
        super(numeroPatas, edad, nombre);
        this.raza = raza;
        this.peso = peso;
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString()+ "Gato{" + "raza=" + raza + ", peso=" + peso + ", color=" + color + '}';
    }

    
    
    
    
}
