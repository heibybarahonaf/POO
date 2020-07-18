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
public class Triangulo extends Formas {
    double area;
    
    public Triangulo(){
        Dibujar("Triangulo");
        establecerColor("Rojo");
    }
    
    public void CalcularArea(){
        double base=5.3;
        double altura= 6;
        area = (base*altura)/2;
        System.out.println("Area = " + area+ "\n");
    }

}
