/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones;

/**
 *
 * @author delcrego
 */
public class Contactos {
    
    //Atributos de nuestra agenda
    private static int id = 0;
    private int idContacto;
    private String nombre;
    private String tlf;

    //Constructor
    public Contactos(String nombre, String tlf) {
        this.idContacto = ++id;
        this.nombre = nombre;
        this.tlf = tlf;
    }

    //Getter y Setter
    public int getIdContacto() {
        return idContacto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTlf() {
        return tlf;
    }

    public void setIdContacto(int idContacto) {
        this.idContacto = idContacto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    @Override
    public String toString() {
        return "Contactos{" + "idContacto=" + idContacto + ", nombre=" + nombre + ", tlf=" + tlf + '}';
    }
    
        
    
}
