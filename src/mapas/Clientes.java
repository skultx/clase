/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author delcrego
 */
public class Clientes {
    Scanner sc = new Scanner(System.in);
    
    //atributos
    private int id;
    private String dni;
    private String nombre;
    private double saldo;
    
    //Contructores

    public Clientes(String dni) {
        this.dni = dni;
    }

    public Clientes(int id, String dni, String nombre, double saldo) {
        this.id = id++;
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldo;
    }
    
    //Getter y Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    //Metodos
    
    //Metodo para introducir clientes en el mapa
    public static void introducirClientes(Map mapa){
        mapa.put(mapa, mapa);
    }
    
    //Metodo para modificar los datos de un cliente 
    public static void modificarClientes(Map mapa){
        mapa.replace(mapa, mapa);
    }
    
    //Metodo para eliminar los clientes
    public static void eliminarClientes(Map mapa){
        mapa.remove(mapa);
    }
    
    //Metodo para buscar clientes por dni y id
    public static void buscarClientes(Map mapa){
        mapa.containsKey(mapa);
    }
    
    //Metodo para mostrar todos los clientes del mapa
    public static void mostrarClientes(Map mapa){
        System.out.println(mapa);
    }
    
    
}
