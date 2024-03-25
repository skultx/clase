/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author delcrego
 * 
 * No tiene mucho sentido lo que haces, ya que lo que tienes que comprobar si es par o impar es el array no el valor,
 * y para calcular la mediana hay que acceder directamente a las posiciones del array, no hacen falta los bucles.
 * 
 */
public class Problema3 {
    //Metodo principal
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        //Creamos nuestro array
        double[] frase = new double[7];
        
        mediana2(frase);       
        
    }
    
    //Logica para el calculo de mediana
    public static double mediana2(double m[]) {
        
        //creamos nuestra variable mediana
        double mediana= 0.0;
        
        //si es par cogemos los dos numeros del medio si es impar el array 
        //cogemos solo el del medio
        if (mediana % 2 == 0) {
            double valor1= 0.0;
            double valor2= 0.0;
            for (int i = 0; m.length/2 < m.length/2; i++) {
                valor1=(m.length); 
                System.out.println(valor1);
            }
            for (int i = 0; m.length/2 < m.length; i++) {
                valor2=(m.length/2);
            }
           
            System.out.println(valor2);
            
        }else{
            double valor1= 0.0;
            for (int i = 0; i< m.length; i++) {
                valor1=(m.length/2); 
                System.out.println(valor1);
            }
            
        }
        
        
        return mediana;
    }
    
}
