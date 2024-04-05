/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapas;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author delcrego
 */
public class EjemploConjunto {
    
    //Metodo para recibir conjuntos
    public static void pruebaConjunto(Set conjunto){
        //añadimos elementos al conjunto
        conjunto.add("uno");
        conjunto.add("dos");
        conjunto.add("tres");
        conjunto.add("tres");
        conjunto.add("tres");
        conjunto.add("cuatro");
        conjunto.add("cinco");
        
        //le mostramos
        System.out.println(conjunto);
        
        //buscamos un elemento en el conjunto
        System.out.println(conjunto.contains("tres"));
    }

    //Metodo principal
    public static void main(String[] args) {
        
        System.out.println("Prueba HashSet");
        Set hs=new HashSet<>();
        pruebaConjunto(hs);
        
        System.out.println("Prueba TreeSet");
        Set ts=new TreeSet<>();
        pruebaConjunto(ts);
        
        
    }
}
