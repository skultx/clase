/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema7;

import java.util.Scanner;

/**
 *
 * @author delcrego
 */
public class Frases {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] frase = new String[5];

        
        for (int i = 0; i < frase.length; i++) {
            System.out.print("Frase " + (i + 1) + ": ");
            frase[i] = sc.nextLine();
        }

        
        System.out.println("Tus frases:");
        imprimeFrases(frase);

        
        mayorFrase(frase);

        
        menorFrase(frase);
    }

    public static void imprimeFrases(String[] frases) {
        for (String frase : frases) {
            System.out.println(frase);
        }
    }

    public static void mayorFrase(String[] frases) {
        int mayor = 0;
        String frasemayor = "";
        int posicion = 0;

        for (int i = 0; i < frases.length; i++) {
            if (frases[i].length() > mayor) {
                mayor = frases[i].length();
                frasemayor = frases[i];
                posicion = i;
            }
        }

        System.out.println("frase mayor es: " + frasemayor + " en la posicion " + (posicion + 1));
    }

    public static void menorFrase(String[] frases) {
        int menor = Integer.MAX_VALUE;
        String frasemenor = "";
        int posicion = 0;

        for (int i = 0; i < frases.length; i++) {
            if (frases[i].length() < menor) {
                menor = frases[i].length();
                frasemenor = frases[i];
                posicion = i;
            }
        }

        System.out.println("frase menor es: " + frasemenor + " en la posicion " + (posicion + 1));
    }
}
