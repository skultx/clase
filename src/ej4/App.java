/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.ej4;

import java.util.Scanner;

/**
 *
 * @author margalar
 */
public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //men� de opciones
        System.out.println("Elija entre las siguientes figuras: ");
        System.out.println("1) Circulo ");
        System.out.println("2) Cuadrado ");
        System.out.println("3) Rect�ngulo ");
        System.out.println("4) Tri�ngulo");
        int opcion = sc.nextInt();

        Areas app = new Areas();

        //switch de opciones 
        switch (opcion) {
            case 1: //c�rculo 
            {
                //pedir dato 
                System.out.println("Introduce el radio: ");
                double radio = sc.nextDouble();

                double solucion = app.circulo(radio); //llamar al objeto
                System.out.println("El �rea es: " + solucion); //mostrar soluci�n
                break;
            }
            case 2: //cuadrado
            {
                //pedir dato 
                System.out.println("Introduce el lado: ");
                double lado = sc.nextDouble();

                double solucion = app.cuadrado(lado); //llamar al objeto
                System.out.println("El �rea es: " + solucion); //mostrar soluci�n 
                break;
            }
            case 3: //rect�ngulo
            {
                //pedir datos
                System.out.println("Introduce el largo: ");
                double largo = sc.nextDouble();
                System.out.println("Introduce el ancho: ");
                double ancho = sc.nextDouble();

                double solucion = app.rectangulo(largo, ancho);//llamar al objeto 
                System.out.println("El �rea es: " + solucion); //mostrar la soluci�n 
                break;
            }
            case 4: //tri�ngulo
            {
                //pedir datos 
                System.out.println("Introduce la base: ");
                double base = sc.nextDouble();
                System.out.println("Introduce la altura: ");
                double altura = sc.nextDouble();

                double solucion = app.triangulo(base, altura); //llamar al objeto 
                System.out.println("El �rea es: " + solucion); //mostrar la soluci�n
                break;
            }
            default: {
                System.out.println("Opci�n no contemplada"); //otras opciones 
                break;
            }
        }
    }
}
