/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;


/**
 *
 * @author Gonzalo Delgado Crespo
 * 
 * No rellenas la matriz, solo muestras los valores generados
 * Método independiente para mostrar la matriz
 * 
 */
public class Problema2 {
    
    //Metodo principal
    public static void main(String[] args) {
        
        //creamos nuestra matriz
        int[][] Matriz = new int[10][10];
        
        //LLamamos al metodo matriz para que nos imprima la matriz
        lLenarMatriz(Matriz);
 
    }
    
    //Llenamos nuestra matriz de numeros 
    public static void lLenarMatriz(int [][] m) {
        
        //ponemos la condicion para llenar
        for (int i = 1; i < m.length+1; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print((1+j)*i); 
                System.out.print(" ");
            }
        System.out.println(" ");
        }       
    }    
}
