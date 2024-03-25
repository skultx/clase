/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ordenacion1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author delcrego
 */
public class Ordenacion1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        //Crea el array de las palabras
        String[] palabras=new String[10];
        
        //Pedir longitud de array
        System.out.print("¿Cuantas palabras vas a introducir (1-10)? ");
        int num_palabra =sc.nextInt();
        
        //Verificar la longitud del array
        if(num_palabra<=0){
            System.out.println("No has metido ninguna palabra");
        }else if (num_palabra>10){
            System.out.println("Te has excedido en el numero de palabras");
        }
        //Damos al array el tamaño que hemos puesto
        palabras = new String [num_palabra];
        
        sc.nextLine();
        
        //Pedimos las palabras
        IntroducePalabra(palabras);
        
        //Preguntamos si queremos ordenar las palabras
        System.out.print("Quieres ordenar las palabras en funcion "
                + "de su longitud? (s/n): ");
        String respuesta=sc.nextLine();
        
        //Validamos respuesta
        if (respuesta.equals("n")) {
            //Imprimimos las palabras que tenemos guardadas
            System.out.println(Arrays.toString(palabras));
        }else{
            //Imprimimos palabras ordenadas
            OrdenarPalabras(palabras);
            System.out.println(Arrays.toString(palabras));
        }
        
        
    }
    public static void IntroducePalabra(String array[]){
        Scanner sc=new Scanner(System.in);

        //Pedimos palabras
        System.out.println("Introduce tus palabras: ");
        
        //Pedimos una palabra y la almacenamos en el array
        for (int i = 0; i < array.length; i++) {
            System.out.print("Palabra " + (i+1) + " : ");
            array[i] =sc.nextLine(); 
        } 
    }
    public static void OrdenarPalabras(String[] array){ 
        int N = array.length; 
        for (int i=1; i<=N-1; i++) { //pasadas
            for (int j=1; j<=N-i; j++) { //parejas
                if (array [j-1].length() > array[j].length()) { 
                    String tmp = array [j-1]; 
                    array [j-1] = array[j]; 
                    array [j] = tmp; 
                }        
            } 
        }
    }
    
}
