package BalanceoParentesis.EstructuraLIFO;

/**
 * Nodo genérico para usar en estructuras tipo Pila.
 * @param <T> tipo de dato que almacena el nodo
 */

public class Nodo <T> {
    private Nodo<T> siguiente;
    private T dato;

    public Nodo(T dato){
        this.dato = dato;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public T getDato() {
        return dato;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }
}
