package BalanceoParentesis.Controladores;

import BalanceoParentesis.EstructuraLIFO.Pila;

/**
 * Clase que se encarga de verificar si una expresión aritmética
 * contiene paréntesis balanceados.
 */

public class ControlParentesis {
    private String cadena;
    private Pila<Character> pila;

    public ControlParentesis(String cadena) {
        this.cadena = cadena;
        pila = new Pila<>();
    }

    /**
     * Verifica si los paréntesis de la expresión están balanceados.
     *
     * Lógica:
     * - Recorre cada carácter de la cadena.
     * - Si encuentra un '(', lo agrega a la pila.
     * - Si encuentra un ')', elimina el último '(' de la pila (pop).
     * - Al finalizar, si la pila está vacía, los paréntesis están balanceados.
     *
     * @return true si los paréntesis están balanceados, false en caso contrario
     */

    public boolean verificarParentesis(){
        for(int i = 0; i < cadena.length(); i++) {
            if(cadena.charAt(i) == '(')
                pila.push('(');
            else if(cadena.charAt(i) == ')')
                pila.pop();
        }
        return pila.estaVacia();
    }
}
