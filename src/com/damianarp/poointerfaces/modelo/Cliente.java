package com.damianarp.poointerfaces.modelo;

// Clase Cliente que hereda de BaseEntidad.
public class Cliente extends BaseEntidad {

    private String nombre;
    private String apellido;

    public Cliente(String nombre, String apellido) {
        super(); // Invoca al constructor vacío de BaseEntidad.
        this.nombre = nombre;
        this.apellido = apellido;
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
