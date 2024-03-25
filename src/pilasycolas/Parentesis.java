/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilasycolas;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author delcrego
 */
public class Parentesis {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Introduce tus parentesis a validar:");
        String ejemplo = sc.nextLine();
        
        LinkedList<Character> pila = new LinkedList<>();
           
        for (char caracter : ejemplo.toCharArray()) {
            if (caracter == '(') {
                pila.push(caracter);
            } else if (caracter == ')') {
                if (!pila.isEmpty() && pila.peek() == '(') {
                    pila.pop();
                } else {
                    System.out.println("Mal cerrado");
                }
            }
        }

        if (pila.isEmpty()) {
            System.out.println("Bien cerrado");
        } else {
            System.out.println("Mal cerrado");
        }
    }
}
