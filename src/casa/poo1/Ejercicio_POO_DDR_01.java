/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casa.poo1;

/**
 *
 * @author gdelg
 */
public class Ejercicio_POO_DDR_01 {
    
    //Metodo principal
    public static void main(String[] args) {
        
        //creamos nuestro primer libro
        Libro libro1=new Libro(1234567890, 300, "el olvido", "yo");
        Libro libro2=new Libro(1234567891,450, "semana santa", "tu");
        
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        
        if(libro1.getNumero_paginas()>libro2.getNumero_paginas()){
            System.out.println("El libro " + libro1.getTitulo() + "tiene mas paginas");
        }else{
            System.out.println("El libro " + libro2.getTitulo() + " tiene mas paginas");
        }
    }
    
    
}
