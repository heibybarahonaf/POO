/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

/**
 *
 * Heiby Barahona
 * 202010060463
 */
public class Medico extends Persona{
    
    String especialidad;
    String lugarAtencion;
    int horasAtencion;
    int aniosExperiencia = 5;

    @Override
    public String Profesion() {
        return "Médico";
    }
    
    public Medico(){
        setNombre("Maria Pérez");
        setIdentidad("0801-1987-01287");
        setDireccion("Res. Plaza");
        setEdad(33);
        setEmail("mariap@gmail.com");
        setSexo('F');
    }
    
    public int AniosExperiencia(){
        return aniosExperiencia;
    }
    
}
