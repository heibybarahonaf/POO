/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import helpers.Juan;
import helpers.Maria;

public class Polimorfismo {
    
    public static void main(String[] args) {
        
        Juan juan = new Juan();
        Maria maria = new Maria();
        
        System.out.println(juan.datosPersonales());
        System.out.println(maria.datosPersonales());
  
    }
    
}
