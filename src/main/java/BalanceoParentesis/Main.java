package BalanceoParentesis;

import BalanceoParentesis.Controladores.ControlParentesis;

import java.util.Scanner;

/**
 * Clase principal que controla la ejecución del programa de
 * balanceo de paréntesis.
 *
 * Permite al usuario ingresar expresiones aritméticas y verifica
 * si sus paréntesis están balanceados usando la clase ControlParentesis.
 */

public class Main {
    private static final Scanner teclado = new Scanner(System.in);

    public void correrPrograma(){
        while(true) {
            System.out.println("=== MENU PRINCIPAL ===");
            System.out.println("1.) Usar Strings (balanceo de parentesis)");
            System.out.println("2.) Salir");

            System.out.print("\nIngrese una opción: ");
            String opcion = teclado.nextLine();

            switch (opcion){
                case "1":
                    ingresarStrings();
                    break;
                case "2":
                    System.out.println("\nSaliendo del sistema...");
                    teclado.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nOpcion inválida. Intente de nuevo");
            }
        }
    }

    /**
     * Permite al usuario ingresar una expresión aritmética
     * y verifica si sus paréntesis están balanceados.
     *
     * La función asegura que la entrada no esté vacía y utiliza
     * la clase ControlParentesis para la validación.
     */

    public void ingresarStrings(){
        System.out.println("\n=== VERIFICAR EXPRESION ===");

        String expresion = "";
        while(expresion.isEmpty()){
            System.out.print("Ingrese la expresión aritmética que desea verificar: ");
            expresion = teclado.nextLine();

            if(expresion.isEmpty())
                System.out.println("No se ingresó ninguna expresion. Intente nuevamente");
        }

        ControlParentesis cp = new ControlParentesis(expresion);

        System.out.println("\nExpresion: " + expresion);

        boolean estaBalanceado = cp.verificarParentesis();
        if(estaBalanceado)
            System.out.println("La expresión está balanceada");
        else
            System.out.println("La expresion no está balanceada");
        System.out.println("\n-----------------------------------------\n");
    }

    /**
     * Ejecuta el programa
     */

    public static void main( String[] args ) {
       Main m = new Main();
       m.correrPrograma();
    }
}
