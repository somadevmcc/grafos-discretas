package Clases;

import java.util.ArrayList;
import java.util.List;

public class Nodo<T> {
    private T elemento;
    private List<Nodo<T>> vecinos;
    private boolean visitado;

    public Nodo(T elemento) {
        this.elemento = elemento;
        this.vecinos = new ArrayList<>();
        this.visitado = false;
    }

    public T getDato() {
        return this.elemento;
    }
    public boolean getVisitado(){
        return this.visitado;
    }
    public void setVisitado(boolean flag){
        this.visitado = flag;
    }

    public List<Nodo<T>> getVecinos() {
        return this.vecinos;
    }

    public void agregarVecino(Nodo<T> vecino) {
        if (!this.vecinos.contains(vecino)) {
            this.vecinos.add(vecino);
        }
    }
}
