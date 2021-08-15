package com.damianarp.poointerfaces.repositorio;

import java.util.List;

// Interface CrudRepositorio con parámetro genérico T.
public interface CrudRepositorio<T> {

    // Método para listar todos los elementos de la lista.
    List<T> listar();

    // Método para obtener el detalle de un cliente por el id.
    T obtenerPorId(Integer id);

    // Método para crear un elemento.
    void crear(T cliente);

    // Método para editar un elemento.
    void editar(T cliente);

    // Método para eliminar un cliente por su id.
    void eliminar(Integer id);
}
