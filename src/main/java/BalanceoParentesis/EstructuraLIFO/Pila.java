package BalanceoParentesis.EstructuraLIFO;

/**
 * Clase que representa una pila genérica (LIFO).
 * Se implementa utilizando nodos enlazados manualmente.
 *
 * @param <T> el tipo de dato que almacenará la pila
 */

public class Pila <T>{
    private Nodo<T> ultimo;

    public Pila(){
        this.ultimo = null;
    }

    /**
     * Agrega un elemento a la cima de la pila.
     *
     * @param dato el elemento a agregar
     */

    public void push(T dato){
        Nodo<T> nuevoParentesis = new Nodo<>(dato);
        nuevoParentesis.setSiguiente(ultimo);
        ultimo = nuevoParentesis;
    }

    /**
     * Elimina el elemento que se encuentra en la cima de la pila.
     * Si la pila está vacía, muestra un mensaje informativo.
     */

    public void pop(){
        if(!estaVacia()) {
            Nodo<T> eliminar = ultimo;
            T eliminarParentesis = eliminar.getDato();
            ultimo = eliminar.getSiguiente();
        }else

            //Crear otra clase de exepciones
            System.out.println("No hay datos en la pila");
    }

    /**
     * Verifica si la pila está vacía.
     *
     * @return true si la pila no contiene elementos; false en caso contrario
     */

    public boolean estaVacia(){
        return ultimo == null;
    }
}
