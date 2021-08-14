package com.damianarp.poointerfaces.repositorio;

import com.damianarp.poointerfaces.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {

    // Método para ordenar la lista de clientes a través de un campo y una dirección.
    List<Cliente> listar(String campo, Direccion dir);
}
