package hn.uth.ejerciciosmoduloi;

import java.util.Scanner;

/**
 *
 * @author Heiby
 */
public class Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       int a=6, b=2;
       int m=6, t=1, k=-10;
       boolean resultado1=(m>t), 
                resultado2=(t/k == -5), 
                resultado3= ((m+t==7)||(m-t==5));
       String nombre;
       double nota;
        
        
        System.out.println("Hola, soy Heiby Barahona");
        System.out.println("----------------------------------");
        
        System.out.println("OPERACIONES ARITMETICAS DE DOS NUMEROS");
        System.out.println("a = "+ a + "            " + "b = " + b);
        System.out.println("suma (a+b) = "+ (a+b) + "\n" +
                            "resta (a-b) = " + (a-b) + "\n" +
                            "multiplicacion (a*b) = " + (a*b) + "\n" +
                            "division (a/b) = " + (a/b) + "\n" +
                            "residuo de (a/b) = " + (a%b)+ "\n");
        System.out.println("----------------------------------");
        
        System.out.println("EVALUACION DE EXPRESIONES");
        System.out.println("m = " +m  +"  t = " +t +"  k = " +k);
        System.out.print("m>t: " +resultado1 + "\n"+
                         "t/k == -5: " +resultado2 + "\n"+
                         "(m+t==7)||(m-t==5): " +resultado3 + "\n");
        System.out.println("----------------------------------");
        
        String nombres[]={"Esdras","Carlos","Jeferson","Karen","Keyner",
                          "Fernando","Danny","Bessy","Milton","Jose"};
        
        System.out.println("COMPAÑEROS DE LA CLASE POO UTH:");
        for(int i=0; i<10; i++){
            System.out.println(i+1 +")" +nombres[i]);
        }
        System.out.println("----------------------------------");
        
        String[][] datos={{" NOMBRE  ","  APELLIDO "," CARRERA ",
                              "   LUGAR DE TRABAJO" +"\n" },
                          {"1)" +"Esdras  ","  Ramos ",  "  Electrica ",
                              "  No especificado" +"\n" }, 
                          {"2)" +"Carlos  ","  Cruz ",   "   Electrica",
                              "   No especificado" +"\n" }, 
                          {"3)" +"Karen   "," Mendoza", "  Industrial",
                              "  No especificado"  +"\n" }, 
                          {"4)" +"Keyner  "," Garcia",  "   Industrial",
                              "  No especificado"+"\n" }, 
                          {"5)" +"Fernando"," Jimenez", "  Industrial",
                              "  No especificado"  +"\n" } };
        
        System.out.println("DATOS GENERALES DE COMPAÑEROS DE LA CLASE POO UTH"+"\n");
        for(int i=0; i<6; i++){
            for(int j=0; j<4; j++){
                System.out.printf(datos[i][j]);
            }
        }
        System.out.println("----------------------------------");
        
        nombre=nombres[3];
        System.out.println("Ingrese la nota de " +nombres[3] + ":");
        nota = teclado.nextDouble();
        if(nota>=70){
            System.out.println("NOMBRE " + " NOTA " + " ESTADO");
            System.out.println(nombre +"   "+ nota + "  Aprobado");
        }else{
            System.out.println("NOMBRE " + " NOTA " + " ESTADO");
            System.out.println(nombre +"   "+ nota + "  Reprobado");
        }
        System.out.println("----------------------------------");
        
        System.out.println("Numeros pares del 2 al 100");
        for(int i=2; i<=100; i++){
            if(i%2==0){
                System.out.print(i+",");
            }      
        }
    }
}
