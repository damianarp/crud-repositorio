package com.damianarp.poointerfaces.repositorio;

import com.damianarp.poointerfaces.modelo.Cliente;

import java.util.ArrayList;
import java.util.Comparator;
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
            // Si el id del cliente de la lista no es nulo y es igual al id introducido como parámetro en el método,
            // significa que el resultado es igual al cli, hacemos un break para salirnos del bucle y retornamos el resultado.
            if(cli.getId() != null && cli.getId().equals(id)){
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
        List<Cliente> listaOrdenada = new ArrayList<>(this.dataSource); // Cremoa una nueva lista a partir del dataSource para no modificar el dataSource original.
        // Ordenamos la lista, mediante la implementación lambda de la interface funcional Comparator.
        listaOrdenada.sort((a, b) -> { // a y b son del tipo Cliente

                // Ordenamos según la dirección.
                int resultado = 0; // Inicializamos el resultado en 0.
                // ORDEN ASCENDENTE
                if (dir == Direccion.ASC) {
                    resultado = ordenar(campo, a, b);
                    // ORDEN DESCENDENTE
                } else if (dir == Direccion.DESC) {
                    resultado = ordenar(campo, b, a);
                }
                return resultado;
            });
        // Retorna la lista ordenada.
        return listaOrdenada;
    }

    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return dataSource.subList(desde,hasta);
    }

    // Método para ordenar los clientes
    public static int ordenar(String campo, Cliente a, Cliente b) {
        // Ordenamos según la dirección.
        int resultado = 0; // Inicializamos el resultado en 0.
        // Usamos un switch para ordenar según id, nombre o apellido.
        switch (campo) {
            case "id" ->
                    resultado = a.getId().compareTo(b.getId());
            case "nombre" ->
                    resultado = a.getNombre().compareTo(b.getNombre());
            case "apellido" ->
                    resultado = a.getApellido().compareTo(b.getApellido());
        }
        return resultado;
    }

}
