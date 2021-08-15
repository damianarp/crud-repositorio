package com.damianarp.genericsclass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Camion implements Iterable {

    private List objetos;
    private int max; // Máximo de elementos a transportar.

    public Camion(int max) {
        this.max = max;
        this.objetos = new ArrayList(); // Inicializamos la lista de objetos en el constructor.
    }

    // Método para agregar objetos. Le pasamos un objeto genérico del tipo Object.
    // Validamos el máximo de objetos.
    public void add(Object objeto) {
        if (this.objetos.size() <= max) {
            this.objetos.add(objeto);
        } else {
            // Se llenó el camión, lanzamos una excepción.
            throw new RuntimeException("No hay más espacio disponible.");
        }
    }

    @Override
    public Iterator iterator() {
        return this.objetos.iterator();
    }
}
