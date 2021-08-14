package com.damianarp.poointerfaces.modelo;

import java.util.Objects;

public class Cliente {
    private Integer id;
    private String nombre;
    private String apellido;
    private static int ultimoId; // Sirve para auto-incrementar el id.

    public Cliente() {
        this.id = ++ultimoId; // Auto-incrementamos el id en el constructor vacío.
    }

    public Cliente(String nombre, String apellido) {
        this(); // Invoca al constructor vacío.
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'';
    }

    // Método equals para comparar el id que se pasa como parámetro con el de la lista de clientes.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Si los objetos son iguales, retorna true y se sale.
        if (o == null || getClass() != o.getClass()) return false; // Si el objeto es nulo, o la clase es distinta a la del objeto, retorna false y se sale.
        // Si se cumple esto, compara los clientes.
        Cliente cliente = (Cliente) o;
        // Se compara el id pasado por parámetro con el del cliente con el método equals().
        return Objects.equals(id, cliente.id); // Esto es igual a return this.id != null && this.id.equals(cliente.id);
    }
}
