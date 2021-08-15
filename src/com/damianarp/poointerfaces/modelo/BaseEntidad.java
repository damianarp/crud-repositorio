package com.damianarp.poointerfaces.modelo;

public class BaseEntidad {

    protected Integer id;
    private static int ultimoId; // Sirve para auto-incrementar el id.

    public BaseEntidad() {
        this.id = ++ultimoId; // Auto-incrementamos el id en el constructor vacío.
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
