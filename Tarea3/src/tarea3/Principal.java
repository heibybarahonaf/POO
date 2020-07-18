
package tarea3;

/**
 *
 * @author Heiby
 */
public class Principal {

    public static void main(String[] args) {
        //Creando el objeto estudiante 
        Estudiante estudiante = new Estudiante();
        estudiante.setIdentidad("0801-1997-01287");
        estudiante.setNombre("Heiby");
        estudiante.setApellido("Barahona");
        estudiante.setEdad(23);
        estudiante.setCuenta("202010060463");
        estudiante.setCarrera("Ingenieria en Computacion");
        estudiante.setCampus("Tegucigalpa");
        
        System.out.println("Identidad: "+ estudiante.getIdentidad());
        System.out.println("Nombre: "+ estudiante.getNombre());
        System.out.println("Apellido: "+ estudiante.getApellido());
        System.out.println("Edad: "+ estudiante.getEdad()); 
        System.out.println("Cuenta: "+ estudiante.getCuenta());
        System.out.println("Carrera: "+ estudiante.getCarrera());
        System.out.println("Campus: "+ estudiante.getCampus());
        
    }
    
}
