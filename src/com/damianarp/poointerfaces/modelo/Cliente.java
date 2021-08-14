package com.damianarp.poointerfaces.modelo;

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
}
