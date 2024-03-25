/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package poo.biblioteca_corregido;

/**
 *
 * @author macarena
 */
public class Alumno {
    
    private String dni;
    
    public Alumno(String dni){
        this.dni=dni;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return """
               Alumno... 
               \tDNI:""" + dni;
    }
    
    
    
}
