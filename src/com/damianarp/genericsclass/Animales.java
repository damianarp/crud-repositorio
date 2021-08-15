package com.damianarp.genericsclass;

public class Animales {
    private String nombre;
    private String tipo;

    public Animales(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    // Solo usamos el getter, ya que el nombre y el tipo los estamos pasando por el constructor.
    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }
}
