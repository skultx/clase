/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Gonzalo Delgado Crespo
 * Realiza un programa Java que dada una cadena de caracteres introducida por 
 * teclado, cuya longitud es arbitraria, muestre como resultado la lista de 
 * caracteres que contiene, junto el nº de veces que cada uno de ellos aparece 
 * en la cadena, ordenada ascendentemente por el nº de ocurrencias.
 * Además, mostrará el carácter que más veces aparece en la cadena y ese 
 * nº de veces. Para resolver el problema, utiliza el API de las 
 * colecciones Java.
 */
public class Problema1 {
    
    
    //Metodo principal
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        
        //Recoger la cadena de texto
        System.out.print("Introduce tu cadena: ");
        String cadena=sc.nextLine().trim();
        
        String[] frase = new String[cadena.length()];
               
        
        dividirCadena(frase, cadena);
        System.out.println(Arrays.toString(frase));
        
    }
    
    //Dividir la cadena y mostrarla
    public static void dividirCadena(String[] frase, String cadena){
        
        for (int i = 0; i < cadena.length(); i++) {
            frase[i]= cadena;
        }
        
    }

    
    
    
}
