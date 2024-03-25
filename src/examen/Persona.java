/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

/**
 *
 * @author delcrego
 * 
 * -idPersona
 * -constructores
 * -huerfano: xxx
 * -familiaHomoparentalxxx
 * -toString: nombres padre/madre
 * -sonHermanos: xxx
 */
public class Persona {
    
    //atributos
    private int idPersona;
    private String nombre;
    private boolean sexo;
    private String padre;
    private String madre;

    public Persona(int idPersona, String nombre, boolean sexo, String padre, String madre) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.sexo = sexo;
        this.padre = padre;
        this.madre = madre;
    }

    public Persona() {
    }

    public int getIdPersona() {
        return idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isSexo() {
        if(sexo==true){
            System.out.println("h");
        }else{
            System.out.println("m");
        }
        return sexo;
    }

    public String getPadre() {
        return padre;
    }

    public String getMadre() {
        return madre;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(boolean sexo) {
        if(sexo==true){
            System.out.println("Hombre");
        }else{
            System.out.println("Mujer");
        }
        this.sexo = sexo;
    }

    public void setPadre(String padre) {
        this.padre = padre;
    }

    public void setMadre(String madre) {
        this.madre = madre;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre 
                + ", sexo=" + sexo + ", padre=" + padre + ", madre=" 
                + madre + '}';
    }
    
    
    
    
}
