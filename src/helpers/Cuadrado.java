/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

/**
 *
 * @author Heiby
 */
public class Cuadrado extends Formas{
    double area;
    
    public Cuadrado(){
        Dibujar("Cuadrado");
        establecerColor("Azul");
    }
    
    public void CalcularArea(){
        double lado = 6.5;
        area = lado*lado;
        System.out.println("Area del cuadrado = " + area +"\n");
    }
}
