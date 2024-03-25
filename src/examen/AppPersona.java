/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author delcrego
 */
public class AppPersona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int idPersona=1;
        boolean sexo2=true;
        System.out.println("Crear una persona");
        System.out.print("Nombre de la persona: ");
        String nombre=sc.nextLine();
        System.out.print("Sexo (h/m): ");
        String sexo=sc.nextLine();
        System.out.print("Padre: ");
        String padre=sc.nextLine();
        System.out.print("Madre: ");
        String madre=sc.nextLine();
        
        if(sexo=="h"){
            sexo2 = true;
        }else if(sexo=="m"){
            sexo2 = false;
        }
        
        Persona uno = new Persona(idPersona,nombre,sexo2,padre,madre);
        
        System.out.println(uno);
    }
    
}
