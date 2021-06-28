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
public class Perro extends Animal{
    private String raza;
    private Color color;
    private String tamaño;

    public Perro() {
    }

    public Perro(String raza, Color color, String tamaño) {
        this.raza = raza;
        this.color = color;
        this.tamaño = tamaño;
    }

    public Perro(String raza, Color color, String tamaño, int numeroPatas, int edad, String nombre) {
        super(numeroPatas, edad, nombre);
        this.raza = raza;
        this.color = color;
        this.tamaño = tamaño;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return super.toString()+ "Perro{" + "raza=" + raza + ", color=" + color + ", tama\u00f1o=" + tamaño + '}';
    }

   

   
   
            
    
}
