package BalanceoParentesis.EstructuraLIFO;

public class Pila <T>{
    private Nodo<T> ultimo;
    private int size;

    public Pila(){
        this.ultimo = null;
    }

    public void push(T dato){
        Nodo<T> nuevoParentesis = new Nodo<>(dato);
        nuevoParentesis.setSiguiente(ultimo);
        ultimo = nuevoParentesis;
        size++;
    }

    public void pop(){
        if(!estaVacia()) {
            Nodo<T> eliminar = ultimo;
            T eliminarParentesis = eliminar.getDato();
            ultimo = eliminar.getSiguiente();
            size--;
        }else

            //Crear otra clase de exepciones
            System.out.println("No hay datos en la pila");

    }

    // En el main
    public void imprimirPila(){
        Nodo<T> recorrer = ultimo;
        while(recorrer != null){
            System.out.println(recorrer.getDato());
            recorrer = recorrer.getSiguiente();
        }
    }

    public boolean estaVacia(){
        return ultimo == null;
    }

    public int getSize() {
        return size;
    }
}
