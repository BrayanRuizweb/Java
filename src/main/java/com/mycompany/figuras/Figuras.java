/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.figuras;

/**
 *
 * @author Bello
 */
public class Figuras {

    public static void main(String[] args) {
      
        Cuadrado c1 = new Cuadrado("Verde",2);
        Circulo s1 = new Circulo ("Azul",5);
        
       System.out.println("Área del cuadrado de color " + c1.getColor() + ": " + c1.calcularArea());
        System.out.println("Área del círculo de color " + s1.getColor() + ": " + s1.calcularArea());
    
    }   
}
