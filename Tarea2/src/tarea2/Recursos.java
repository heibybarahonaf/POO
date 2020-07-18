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
public class Recursos {
    
    public static void mensaje(){
        System.out.println("Estoy aprendiendo, pero seré el mejor programador del mundo");
    }
    
    public static void nota(){
        int nota=90;
        if(nota>=70){
            System.out.println("Aprobado");
        }else{
            System.out.println("Reprobado");
        }
    }
    
    public static int division(int x, int y){
        int resultado = 0;
        if(y==0){
            System.out.println("Lo siento, la division entre 0 no está definida");
        }else{
           resultado = (x/y);
        }
        return resultado;  
    }
    
    public static void listaNumeros(int x){
        for(int i=1;i<=x;i++){
            System.out.println(i);
        }
    }
}
