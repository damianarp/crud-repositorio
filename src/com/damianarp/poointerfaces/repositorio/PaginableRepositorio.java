package com.damianarp.poointerfaces.repositorio;

import com.damianarp.poointerfaces.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {

    // Método para paginar la lista de clientes.
    List<Cliente> listar(int desde, int hasta);
}
