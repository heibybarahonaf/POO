/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

/**
 *
 * @author Heiby
 */
public class Principal {
    public static void main(String arg[ ]) {
        Recursos recurso= new Recursos();
        
       recurso.mensaje();
       
       recurso.nota();
       
       System.out.println("Resultado de la division: "+ recurso.division(12,3));
       
       recurso.division(12,0);
        
       recurso.listaNumeros(10);
       
    }

}
