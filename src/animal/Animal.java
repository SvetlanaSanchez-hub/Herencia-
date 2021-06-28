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
public class Animal {
    private int numeroPatas;
    private int edad;
    private String nombre;

    public Animal() {
    }

    public Animal(int numeroPatas, int edad, String nombre) {
        this.numeroPatas = numeroPatas;
        this.edad = edad;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Animal{" + "numeroPatas=" + numeroPatas + ", edad=" + edad + ", nombre=" + nombre + '}';
    }

    
    
    
    
            

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal a1 = new Animal (4, 3, "Firulais");
        System.out.println(a1);
        
        Perro p1 = new Perro ("Frenchpoodle", Color.white, "Tamaño: chico ", 4, 2, "El nombre del perro es: Copito");
        System.out.println(p1);
        
        Gato g1 = new Gato ("Siames", 4, Color.black, 4, 2, "El nombre del gato es: Wilson");
        System.out.println(g1);
        
        // TODO code application logic here
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
