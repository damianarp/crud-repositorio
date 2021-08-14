package com.damianarp.poointerfaces.repositorio;

import com.damianarp.poointerfaces.modelo.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteListRepositorio implements CrudRepositorio, OrdenableRepositorio, PaginableRepositorio {

    private List<Cliente> dataSource; // Contenedor de los datos donde se van a almacenar los clientes.

    public ClienteListRepositorio() {
        this.dataSource = new ArrayList<>(); // Inicializamos la lista en el constructor vacío.
    }

    @Override
    public List<Cliente> listar() {
        return dataSource;
    }

    @Override
    public Cliente obtenerPorId(Integer id) {
        Cliente resultado = null; // Inicializamos el resultado de la búsqueda del id como nulo por defecto.
        // Iteramos la lista de clientes para obtener el id.
        for(Cliente cli : this.dataSource) {
            // Si el id del cliente de la lista es igual al id introducido como parámetro en el método,
            // significa que el resultado es igual al cli, hacemos un break para salirnos del bucle y retornamos el resultado.
            if(cli.getId().equals(id)){
                resultado = cli;
                break;
            }
        }
        return resultado;
    }

    @Override
    public void crear(Cliente cliente) {
        this.dataSource.add(cliente);
    }

    @Override
    public void editar(Cliente cliente) {
        // Primero debemos seleccionar al cliente, lo buscamos con el método obtenerPorId().
        Cliente cli = this.obtenerPorId(cliente.getId());
        // Luego modificamos los datos con el cliente que recibimos por argumento.
        cli.setNombre(cliente.getNombre());
        cli.setApellido(cliente.getApellido());
    }

    @Override
    public void eliminar(Integer id) {
        // Al método remove() aplicado a la lista, le pasamos como argumento el cliente (id obtenido con el método obtenerPorId), para eliminar el registro.
        this.dataSource.remove(this.obtenerPorId(id));
    }

    @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        return null;
    }

    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return null;
    }
}
