package BalanceoParentesis.Expresiones;

import BalanceoParentesis.EstructuraLIFO.Pila;

public class ControlParentesis {
    private String cadena;
    private Pila<Character> pila;

    public ControlParentesis(String cadena) {
        this.cadena = cadena;
        pila = new Pila<>();
    }

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
