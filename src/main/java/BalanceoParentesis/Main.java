package BalanceoParentesis;

import BalanceoParentesis.EstructuraLIFO.Pila;

import java.util.Scanner;

public class Main {
    private static final Scanner teclado = new Scanner(System.in);

    public void correrPrograma(){
        while(true) {
            System.out.println("=== MENU ===");
            System.out.println("1.) Usar Strings");
            System.out.println("2.) Usar Enteros");
            System.out.println("3.) Salir");

            System.out.print("Ingrese una opción: ");
            String opcion = teclado.nextLine();

            switch (opcion){
                case "1":

                    //Usar Strings

                    break;
                case "2":

                    //Usar Enteros

                    break;
                case "3":

                    System.out.println("Saliendo del sistema...");
                    teclado.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opcion inválida. Intente de nuevo");
            }
        }
    }

    public void ingresarStrings(){
        System.out.println("== Strings == ");

        Pila<String> pila = new Pila<>();
    }

    public static void main( String[] args ) {
       Main m = new Main();
       m.correrPrograma();
    }
}
