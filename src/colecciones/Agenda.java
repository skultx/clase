/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author delcrego
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Agenda {
    //Creamos lista de contactos
    private ArrayList<Contactos> listaAgenda;

    //Constructor
    public Agenda() {
        listaAgenda = new ArrayList<>();
    }

    //Metodo principal
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner sc = new Scanner(System.in);

        System.out.println("-------------------------------------");
        System.out.println("Bienvenido a tu agenda");
        System.out.println("-------------------------------------");

        // Menu de inicio
        boolean terminarBucle = false;
        do {
            System.out.println("1. Agregar un contacto");
            System.out.println("2. Buscar un contacto o número de teléfono");
            System.out.println("3. Modificar un contacto");
            System.out.println("4. Eliminar un contacto");
            System.out.println("5. Mostrar todos los contactos");
            System.out.println("6. Vaciar la agenda");
            System.out.println("7. Salir");
            System.out.println("-------------------------------------------");
            System.out.print("Que quieres hacer?: ");
            int opcion = sc.nextInt();

            // Navegar por el menú
            switch (opcion) {
                case 1:
                    agenda.agregarContacto();
                    break;
                case 2:
                    agenda.buscarContacto();
                    break;
                case 3:
                    agenda.modificarContacto();
                    break;
                case 4:
                    agenda.eliminarContacto();
                    break;
                case 5:
                    agenda.mostrarContactos();
                    break;
                case 6:
                    agenda.vaciarAgenda();
                    break;
                case 7:
                    System.out.print("Quieres salir de tu agenda?(s/n): ");
                    String salir = sc.next().toLowerCase();
                    if (salir.equals("s")) {
                        System.out.println("Adios!!");
                        terminarBucle = true;
                    }
                    break;
                default:
                    System.out.println("Error. Opción introducida no valida");
            }
        } while (!terminarBucle);
    }

    // Método para agregar un contacto
    public void agregarContacto() {
        Scanner sc = new Scanner(System.in);

        // Añadimos contactos vía teclado
        System.out.println("Añadir un nuevo contacto");
        System.out.print("Introduce el nombre con el que lo quieres agregar: ");
        String nombre = sc.nextLine();
        System.out.print("Introduce su número de teléfono: ");
        String tlf = sc.nextLine();

        // Validamos si el contacto ya está creado
        for (Contactos contacto : listaAgenda) {
            if (contacto.getNombre().equals(nombre) && contacto.getTlf().equals(tlf)) {
                System.out.println("El contacto ya está creado");
                return;
            }
        }

        // Si el contacto no existe, lo creamos y lo agregamos a la lista
        Contactos nuevoContacto = new Contactos(nombre, tlf);
        listaAgenda.add(nuevoContacto);
        System.out.println("Contacto añadido como: " + nuevoContacto);
    }

    // Método para buscar un contacto
    public void buscarContacto() {
        Scanner sc = new Scanner(System.in);

        // Buscamos el contacto
        System.out.println("Buscar el contacto");
        System.out.print("Introduce el nombre o el teléfono: ");
        String buscar = sc.nextLine();

        // Buscamos dentro de nuestra lista de contactos y lo mostramos
        boolean encontrado = false;
        for (Contactos contacto : listaAgenda) {
            if (contacto.getNombre().equals(buscar) || contacto.getTlf().equals(buscar)) {
                System.out.println("Contacto encontrado: " + contacto);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Este contacto no existe");
        }
    }

    // Método para modificar un contacto
    public void modificarContacto() {
        Scanner sc = new Scanner(System.in);

        // Buscamos el contacto que se desea modificar
        System.out.println("Modificar un contacto");
        buscarContacto();
        System.out.println("Introduce el nuevo nombre y teléfono:");
        System.out.print("Nuevo nombre: ");
        String nombreNuevo = sc.nextLine();
        System.out.print("Nuevo teléfono: ");
        String telefonoNuevo = sc.nextLine();

        // Modificamos el contacto
        Contactos contacto = buscarContacto(nombreNuevo, telefonoNuevo);
        if (contacto != null) {
            contacto.setNombre(nombreNuevo);
            contacto.setTlf(telefonoNuevo);
            System.out.println("Contacto modificado como: " + contacto);
        } else {
            System.out.println("El contacto no existe en la agenda.");
        }
    }

    // Método para eliminar un contacto
    public Contactos eliminarContacto() {
        Scanner sc = new Scanner(System.in);

        // Buscamos el contacto que se desea eliminar
        System.out.println("Eliminar un contacto");
        buscarContacto();
        System.out.print("¿Quieres borrar este contacto? (s/n): ");
        String confirmar = sc.next().toLowerCase();
        if (confirmar.equals("s")) {
            listaAgenda.remove(buscarContacto());
            System.out.println("Contacto eliminado");
        } else if (confirmar.equals("n")) {
            System.out.println("No se ha eliminado el contacto");
        } else {
            System.out.println("Opción no válida");
        }
    }

    // Método para mostrar todos los contactos
    public void mostrarContactos() {
        ArrayList<Contactos> listaOrdenada = mostrarContactosOrdenados();
        for (Contactos contacto : listaOrdenada) {
            System.out.println(contacto);
        }
    }

    // Método para vaciar la agenda
    public void vaciarAgenda() {
        listaAgenda.clear();
        System.out.println("Agenda vaciada correctamente.");
    }

    // Método para mostrar los contactos ordenados
    private ArrayList<Contactos> mostrarContactosOrdenados() {
        // Copiar la lista de contactos para no modificar la original
        ArrayList<Contactos> listaCopiada = new ArrayList<>(listaAgenda);

        // Ordenar la lista de contactos por nombre o teléfono
        Collections.sort(listaCopiada, new Comparator<Contactos>() {
            @Override
            public int compare(Contactos c1, Contactos c2) {
               

