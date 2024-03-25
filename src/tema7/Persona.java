/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7;

/**
 *
 * @author delcrego
 */
public class Persona {
    private String idPersona;
    private String nombrePersona;
    private String edad;

    public Persona(String idPersona, String nombrePersona, String edad) {
        this.idPersona = idPersona;
        this.nombrePersona = nombrePersona;
        this.edad = edad;
    }

    public Persona() {
    }

    public String getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(String idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombrePersona=" + nombrePersona + ", edad=" + edad + '}';
    }
     
    
    public int compareTo(Persona o){
        return this.idPersona.compareTo(o.idPersona);
    }
    
}
