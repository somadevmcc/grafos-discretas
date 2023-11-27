package Clases;

import java.util.ArrayList;
import java.util.List;

public class Grafo<T> {
    List<Nodo<T>> nodos;

    public Grafo() {
        nodos = new ArrayList<>();
    }

    public void agregarNodo(Nodo<T> nodo) {
        nodos.add(nodo);
    }

    public List<Nodo<T>> obtenerNodos() {
        return nodos;
    }
}
