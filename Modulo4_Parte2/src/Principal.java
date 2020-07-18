
import helpers.CostaRica;
import helpers.ElSalvador;
import helpers.Honduras;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heiby
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Honduras hn = new Honduras();
        ElSalvador es = new ElSalvador();
        CostaRica cr = new CostaRica();
        
        System.out.println(hn.getPais());
        System.out.println(hn.getPresidente());
        System.out.println(es.getPais());
        System.out.println(es.getPresidente());
        System.out.println(cr.getPais());
        System.out.println(cr.getPresidente());        
        
    }
    
}
