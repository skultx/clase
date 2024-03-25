/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7;

import java.util.ArrayList;

/**
 *
 * @author delcrego
 */
public class EjemploArrayList {
    public static void main(String[] args) {
        ArrayList<String> lista=new ArrayList();
        
        System.out.println(lista.isEmpty());
        System.out.println(lista.size());
        
        lista.add("uno");
        lista.add("dos");
        lista.add("tres");
        lista.add("cuatro");
        
        System.out.println(lista.isEmpty());
        System.out.println(lista.size());
        
        lista.add(0, "cero");
        System.out.println(lista);
        
        String old = lista.set(1, "primero");
        System.out.println("Has sustituido " + old);
        System.out.println(lista);
        
        System.out.println("Ultimo elemento de la lista: " + lista.get(lista.size()-1));
        
        System.out.println("Esta es la cadena 'tres?" + lista.contains("tres"));
        System.out.println("Esta es la cadena 'uno?" + lista.indexOf("uno"));
        
        System.out.println("");
        
    }
    
}
