/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema7;

import java.util.Arrays;
import java.util.LinkedList;

/**
 *
 * @author delcrego
 */
public class EjemploFila {

    
    public static void main(String[] args) {
        String[] diaSemana={"Lunes","Martes","Miercoles","Jueves","Viernes"
                ,"Sabado","Domingo"};
        
        //creamos una pila con el contenido del array
        LinkedList<String>pila=new LinkedList<>();
        
        for(String dia:diaSemana){
            pila.push(dia);//apilo
        }
        
        //vuelvo a introducir elementos en el array
        //usando la pila
        int pos=0;
        while(!pila.isEmpty()){
            diaSemana[pos]=pila.pop();
            pos++;
        }
        
        //mostramos array
        System.out.println(Arrays.toString(diaSemana));
        
    }
    
}
