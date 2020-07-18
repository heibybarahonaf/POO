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
public class Circulo extends Formas {
    double radio;
    
    public Circulo() {
        Dibujar("Circulo");
        establecerColor("Azul");
        
    }
    
    public void CalcularRadio(){
        double circunferencia = 2.5;
        radio = (circunferencia)/(2*Math.PI);
        System.out.println("Radio = " + radio+ "\n");
    }
    
}
