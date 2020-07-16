
package tarea3;

/**
 *
 * @author Heiby
 */
public class Estudiante {
    //Atributos
    private String identidad;
    private String nombre;
    private String apellido;
    private int edad;
    private String cuenta;
    private String carrera;
    private String campus;

    //Métodos públicos para acceder a los datos
    public String getIdentidad() {
        return identidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getCuenta() {
        return cuenta;
    }

    public String getCarrera() {
        return carrera;
    }
    
    public String getCampus() {
        return campus;
    }
    
    
    //Métodos públicos para establecer los datos
    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    public void setCampus(String campus) {
        this.campus = campus;
    }
    
}
