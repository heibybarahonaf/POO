/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import helpers.Circulo;
import helpers.Cuadrado;
import helpers.Linea;
import helpers.Triangulo;

/**
 *
 * @author Heiby
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado();
        Circulo circulo = new Circulo();
        Triangulo triangulo = new Triangulo();
        Linea linea = new Linea();
        
        cuadrado.DibujarForma();
        cuadrado.CalcularArea();
        circulo.DibujarForma();
        circulo.CalcularRadio();
        triangulo.DibujarForma();
        triangulo.CalcularArea();
        linea.DibujarForma();
        
        
    }
    
}