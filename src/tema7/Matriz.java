/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author delcrego
 */
public class Matriz {
    
    public static void mostrarMatriz(int[][] m){
        int filas=m.length;
        int columnas=m[0].length;
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void mostrarMatriz_bis(int[][] m){
        for (int i = 0; i < m.length; i++) {
            System.out.println(Arrays.toString(m[i]));
            
            System.out.println();
        }
    }
    
    public static void llenarMatriz(int [][] m){
        Random r=new Random();
        int filas=m.length;
        int columnas=m[0].length;
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                m[i][j] = r.nextInt(1, 11);
            }
        }
    }
    
    public static void main(String[] args) {
           
        //creamos matriz
        
        int [][] matriz;
        matriz =new int [5][4];
        
        System.out.println("Nº filas: " + matriz.length);
        System.out.println("Nº columnas: " + matriz[0].length);
        
        llenarMatriz(matriz);
        
        mostrarMatriz(matriz);
        
        mostrarMatriz_bis(matriz);
        
        
    }
    
}
