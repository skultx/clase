/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.biblioteca_corregido;

/**
 *
 * @author fuehered
 */
public class Software extends DocDigitales{
    
    public Software(int numDoc, String titulo, String autor, String editorial, int anioLanzado, 
                String licencia) {
        super(numDoc,titulo, autor, editorial, anioLanzado,  licencia);
    }

    @Override
    public String toString() {
        return "Software:" + super.toString();
    }
    
    
}
