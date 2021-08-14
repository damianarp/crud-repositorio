package com.damianarp.poointerfaces.repositorio;

import com.damianarp.poointerfaces.modelo.Cliente;

import java.util.List;

public interface CrudRepositorio {

    // Método para listar todos los clientes.
    List<Cliente> listar();

    // Método para obtener el detalle de un cliente por el id.
    Cliente obtenerPorId(Integer id);

    // Método para crear un cliente
    void crear(Cliente cliente);

    // Método para editar un cliente
    void editar(Cliente cliente);

    // Método para eliminar un cliente por su id.
    void eliminar(Integer id);
}
