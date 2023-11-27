package Main;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

import Clases.*;
public class Main {
    public static void main(String[] args) {
        Grafo<String> grafo = new Grafo<>();

        Nodo<String> nodoA = new Nodo<>("a");
        Nodo<String> nodoB = new Nodo<>("b");
        Nodo<String> nodoC = new Nodo<>("c");
        Nodo<String> nodoD = new Nodo<>("d");
        Nodo<String> nodoE = new Nodo<>("e");
        Nodo<String> nodoF = new Nodo<>("f");
        Nodo<String> nodoG = new Nodo<>("g");
        Nodo<String> nodoH = new Nodo<>("h");
        Nodo<String> nodoI = new Nodo<>("i");
        Nodo<String> nodoJ = new Nodo<>("j");
        Nodo<String> nodoZ = new Nodo<>("z");

        nodoA.agregarVecino(nodoB);
        nodoA.agregarVecino(nodoC);
        nodoB.agregarVecino(nodoD);
        nodoB.agregarVecino(nodoE);
        nodoC.agregarVecino(nodoF);
        nodoC.agregarVecino(nodoG);
        nodoD.agregarVecino(nodoH);
        nodoD.agregarVecino(nodoI);
        nodoE.agregarVecino(nodoJ);

        grafo.agregarNodo(nodoA);
        grafo.agregarNodo(nodoB);
        grafo.agregarNodo(nodoC);
        grafo.agregarNodo(nodoD);
        grafo.agregarNodo(nodoE);
        grafo.agregarNodo(nodoF);
        grafo.agregarNodo(nodoG);
        grafo.agregarNodo(nodoH);
        grafo.agregarNodo(nodoI);
        grafo.agregarNodo(nodoJ);

        imprimirGrafo(grafo.obtenerNodos().get(0));
       // imprimirGrafoConsola(grafo.obtenerNodos().get(0)); // Imprimir el primer nodo del grafo
        System.out.println("Recorrido BFS del grafo:");
        bfsRecursivo(grafo.obtenerNodos().get(0), new HashSet<>());
    }
     public static void bfsRecursivo(Nodo<String> nodo, Set<Nodo<String>> visitados) {
        if (nodo == null || visitados.contains(nodo)) return;

        System.out.print(nodo.getDato() + " ");
        visitados.add(nodo);

        for (Nodo<String> vecino : nodo.getVecinos()) {
            bfsRecursivo(vecino, visitados);
        }
    }
    public static void imprimirGrafoConsola(Nodo<String> nodo) {
        System.out.println("Representación gráfica del grafo:");
        if (nodo == null) {
            System.out.println("El grafo está vacío.");
            return;
        }

        imprimirNodo(nodo, "");
    }

    private static void imprimirNodo(Nodo<String> nodo, String espacio) {
        System.out.println(espacio + nodo.getDato());
        if (!nodo.getVecinos().isEmpty()) {
            for (Nodo<String> vecino : nodo.getVecinos()) {
                System.out.println(espacio + "|");
                System.out.println(espacio + "---");
                imprimirNodo(vecino, espacio + "   ");
            }
        }
    }

    public static void imprimirGrafo(Nodo<String> nodo) {
        if (nodo == null) {
            return;
        }

        System.out.println("Nodo: " + nodo.getDato());

        for (Nodo<String> vecino : nodo.getVecinos()) {
            System.out.println("Vecino: " + vecino.getDato());
        }

        for (Nodo<String> vecino : nodo.getVecinos()) {
            imprimirGrafo(vecino);
        }
    }
}