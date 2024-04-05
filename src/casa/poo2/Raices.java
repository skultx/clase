/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casa.poo2;

/**
 *
 * @author gdelg
 */
public class Raices {
    
    //Atributos
    private double a;
    private double b;
    private double c;
    
    //Constructor
    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    //Getter
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    
    //Setter
    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    //Metodos
    
    //Metodo para obtener las dos raices
    public void obtenerRaices(){
        
        //obtenemos x1 y x2
        double x1= (-b+(Math.sqrt(getDiscriminante())))/(2*a);
        double x2= (-b-(Math.sqrt(getDiscriminante())))/(2*a);
        
        System.out.println("Solucion X1: " + x1);
        System.out.println("Solucion X2: " + x2);
    }
    
    //Metodo para obtener una raiz
    public void obtenerRaiz(){
        
        //obtenemos x
        double x= (-b)/(2*a);
        
        System.out.println("Solicion x: " + x);
    }
    
    //Metodo para coger el discriminante
    public double getDiscriminante(){
        //calculamos el valor que sera b^2-4*a*c
        return Math.pow(b,2)-(4*a*c);   
    }
    
    //Si el discriminante es mayor que 0 tiene mas de una raiz
    public boolean tieneRaices(){
        return getDiscriminante()>0;
    }
    
    //Si el discriminante es igual a cero tiene una sola raiz
    public boolean tieneRaiz(){
        return getDiscriminante()==0;
    }

    //Metodo para calcular la ecuacion de 2 grado
    public void calcular(){
        if (tieneRaices()){
            obtenerRaices();
        }else if (tieneRaiz()){
            obtenerRaiz();
        }else{
            System.out.println("No tiene soluciones");
        }
        
    }
    
    
    
    
}
