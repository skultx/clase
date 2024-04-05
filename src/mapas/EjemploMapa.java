/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapas;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author delcrego
 */
public class EjemploMapa {
    
    //Metodo que recibe un mapa
    public static void pruebaMapa(Map mapa){
        //añadimos elementos clave-valor al mapa
        mapa.put(1, "cliente1");
        mapa.put(2, "cliente2");
        mapa.put(3, "cliente3");
        
        //mostramos las claves
        System.out.println("Tamaño del mapa: "+ mapa.size());
        System.out.println(mapa.keySet());
        
        //mostramos los valores
        System.out.println(mapa.values());
        
        //mostramos el contenido del mapa
        System.out.println(mapa);
        
        //buscamos un elemento por clave
        if (mapa.containsKey(2)) System.out.println(mapa.get(2));
        else System.out.println("Clave inexistente");
        
        //buscamos un elemento pòr valor
        if (mapa.containsValue("cliente99")) System.out.println("Elemento existente");
        else System.out.println("Clave inexistente");
    }
    
    //Metodo principal
    public static void main(String[] args) {
        System.out.println("Prueba HashMap");
        Map mapa1=new HashMap();
        pruebaMapa(mapa1);
        
        System.out.println("Prueba TreeMap");
        Map mapa2=new HashMap();
        pruebaMapa(mapa2);
        
    }
    
}
