package BalanceoParentesis;

import BalanceoParentesis.EstructuraLIFO.Pila;
import BalanceoParentesis.Expresiones.ControlParentesis;

import java.util.Scanner;

public class Main {
    private static final Scanner teclado = new Scanner(System.in);

    public void correrPrograma(){
        while(true) {
            System.out.println("=== MENU PRINCIPAL ===");
            System.out.println("1.) Usar Strings (balanceo de parentesis)");
            System.out.println("2.) Usar Enteros (Implementación de Pila con int)");
            System.out.println("3.) Salir");

            System.out.print("\nIngrese una opción: ");
            String opcion = teclado.nextLine();

            switch (opcion){
                case "1":
                    ingresarStrings();
                    break;
                case "2":
                    //Usar Enteros
                    break;
                case "3":

                    System.out.println("\nSaliendo del sistema...");
                    teclado.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("\nOpcion inválida. Intente de nuevo");
            }
        }
    }

    public void ingresarStrings(){
        System.out.println("\n=== VERIFICAR EXPRESION ===");
        System.out.print("Ingrese la expresión aritmética que desea verificar: ");

        String expresion = teclado.nextLine();

        ControlParentesis cp = new ControlParentesis(expresion);

        System.out.println("\nExpresion: " + expresion);

        boolean estaBalanceado = cp.verificarParentesis();
        if(estaBalanceado)
            System.out.println("La expresión está balanceada");
        else
            System.out.println("La expresion no está balanceada");
        System.out.println("\n-----------------------------------------\n");
    }

    public static void main( String[] args ) {
       Main m = new Main();
       m.correrPrograma();
    }
}
