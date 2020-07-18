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
public class Formas {
    private String color;
    private String forma;
    
    public Formas(){
        
    }
    
    public void establecerColor(String color){
        this.color = color;
    }
    
    public void Dibujar(String forma){
        this.forma= forma;
    }
    
    public void DibujarForma(){
        System.out.println(forma);
        System.out.println(color);
    }
}

