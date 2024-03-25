/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7;

/**
 *
 * @author delcrego
 */
public class Archivo {
    
    private String nombreArchivo;
    private int tamanio; //En bytes

    public Archivo() {
    }

    public Archivo(String nombreArchivo, int tamanio) throws Exception{
        if (nombreArchivo==null || nombreArchivo.isBlank()){
            throw new Exception("ERROR. Nombre archivo oobligatorio");
        }
        this.nombreArchivo = nombreArchivo;
        this.tamanio = tamanio;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "nombreArchivo=" + nombreArchivo;
    }
    
    
}
