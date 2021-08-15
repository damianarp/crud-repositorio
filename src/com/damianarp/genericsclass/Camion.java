package com.damianarp.genericsclass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Clase Camión con parámetro genérico que implementa la interface Iterable también con parámetros genéricos.
public class Camion<T> implements Iterable<T> {

    private List<T> objetos; // Lista de objetos genéricos.
    private int max; // Máximo de elementos a transportar.

    public Camion(int max) {
        this.max = max;
        this.objetos = new ArrayList<>(); // Inicializamos la lista de objetos en el constructor.
    }

    // Método para agregar objetos. Le pasamos un objeto genérico del tipo T.
    // Validamos el máximo de objetos.
    public void add(T objeto) {
        if (this.objetos.size() <= max) {
            this.objetos.add(objeto);
        } else {
            // Se llenó el camión, lanzamos una excepción.
            throw new RuntimeException("No hay más espacio disponible.");
        }
    }

    @Override
    public Iterator<T> iterator() {
        return this.objetos.iterator();
    }
}
