/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiendaonline;

import pojos.Almacen;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedDeque;

/**
 *
 * @author losgu
 */
public class TiendaOnline {

    // Aqui se crea un almacen con una estructura concurrente para que sea seguro.
    private static final Almacen almacen = new Almacen(new ConcurrentLinkedDeque<>());

    // Aqui se crea un almacen con una estructura no concurrente para que no sea seguro y demostrar que falla.
    private static final Almacen almacenNoSeguro = new Almacen(new LinkedList<>());

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\tBienvenido al Bazar 冰淇淋\n");
            System.out.println("¿Qué operación deseas realizar?");
            System.out.println("\t1. Mostrar todos los productos.");
            System.out.println("\t2. Añadir productos.");
            System.out.println("\t3. Añadir productos de forma no segura.");
            System.out.println("\t0. Salir\n");

            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    mostrarProductos();
                    break;
                case 2:
                    addProductos();
                    break;
                case 3:
                    addProductosNoSeguro();
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción válida.");
                    break;
            }

        } while (opcion != 0);

        sc.close();
    }

    /**
     * Muestra todos los productos del almacen
     */
    private static void mostrarProductos(){
        System.out.println("Has seleccionado mostrar todos los productos.");
        // Muestra todos los productos del almacen
        almacen.mostrarCatalogo();

    }

    /**
     * Añade productos de forma segura
     */
    private static void addProductos(){
        System.out.println("Has seleccionado añadir productos.");
        // Añade un numero aleatorio de productos al almacen

        for (int i = 0; i < (int) (Math.random() * 100); i++) {
            new Thread(new AddProducto(almacen)).start();
        }
        try {
            System.out.println("Añadiendo producto...");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Añade productos de forma no segura
     */
    private static void addProductosNoSeguro(){
        System.out.println("Has seleccionado añadir productos de manera no segura.");
        // Añade un numero aleatorio de productos al almacen

        for (int i = 0; i < (int) (Math.random() * 100); i++) {
            new Thread(new AddProducto(almacenNoSeguro)).start();
        }
        try {
            System.out.println("Añadiendo producto...");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    
}
