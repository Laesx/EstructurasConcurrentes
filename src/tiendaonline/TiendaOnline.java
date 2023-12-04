/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiendaonline;

import java.util.Scanner;

/**
 *
 * @author losgu
 */
public class TiendaOnline {

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
            System.out.println("\t0. Salir\n");

            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    mostrarProductos();
                    break;
                case 2:
                    añadirProductos();
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

    private static void mostrarProductos(){
        System.out.println("Has seleccionado mostrar todos los productos.");
    }

    private static void añadirProductos(){
        System.out.println("Has seleccionado añadir productos.");
    }

    
}
