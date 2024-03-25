/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ahorcado;

/**
 *
 * @author delcrego
 */
import java.util.Random;
import java.util.Scanner;

public class Ahorcado {
    String[] palabras = {"MARIPOSA", "GATO", "CERDO", "PERRO"};
    private String palabraelegida;
    private char[] palabradivinada;
    private int fallos;

    public Ahorcado() {
        Random r = new Random();
        
        palabraelegida = palabras[r.nextInt(palabras.length)];
        
        palabradivinada = new char[palabraelegida.length()];
        for (int i = 0; i < palabradivinada.length; i++) {
            palabradivinada[i] = '-';
        }
        fallos = 0;
    }

    public void jugar() {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Adivina la palabra:");

        while (fallos < 8) {
            System.out.println("Palabra: " + String.valueOf(palabradivinada));

            System.out.print("Introduce una letra: ");
            
            char letra = scanner.next().toUpperCase().charAt(0);

            boolean adivinado = false;
            for (int i = 0; i < palabraelegida.length(); i++) {
                
                if (palabraelegida.charAt(i) == letra) {
                    
                    palabradivinada[i] = letra;
                    
                    adivinado = true;
                }
            }

            if (!adivinado) {
                
                fallos++;
                System.out.println("incorrecta fallos: " + fallos);
            }

            if (palabradivinada.equals(palabraelegida)) {
                System.out.println("win");
                return;
            }
        }

        System.out.println("has perdido, palabra: " + palabraelegida);
    }

    public static void main(String[] args) {
        Ahorcado a = new Ahorcado();
        a.jugar();
    }
}
