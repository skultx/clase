/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7;

import java.util.Arrays;

/**
 *
 * @author delcrego
 */
public class Matriz1 {
    public static void imprimirMatriz(int [][] m) {
        int filas=m.length;
        int columnas=m[0].length;
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if(i%2 ==0){
                    m[i][j]= (j+1)*2;
                }else{
                    m[i][j]= (j+1)*3;
                }
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }   
    }
    public static void sumaMatriz(int [][] m, int s){
        int filas=m.length;
        int columnas=m[0].length;
        
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                
                s=s+m[i][j];
                
                
            }
        }
        System.out.println(s);
    }
    public static void diagonal(int[][] m){
        int filas=m.length;
        for (int i = 0; i < filas; i++) {
            System.out.print(m[i][i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        int[][] matriz;
        int suma= 0;
        
        matriz=new int[5][5];
        
        imprimirMatriz(matriz);
        
        
        
        System.out.println("diagonal principal");
        diagonal(matriz);
        
        System.out.println("La suma es: ");
        sumaMatriz(matriz, suma);
        
        
        
    } 
}
