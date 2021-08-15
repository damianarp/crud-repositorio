package com.damianarp.poointerfaces.repositorio;

import java.util.*;

// Clase abstracta ClienteListRepositorio con parámetro genérico T que implementa la interface OrdenablePaginableContableCrudRepositorio con parámetro T.
public abstract class AbstractaListaRepositorio<T> implements OrdenablePaginableContableCrudRepositorio<T> {

    protected List<T> dataSource; // Lista donde se van a almacenar los elementos.

    public AbstractaListaRepositorio() {
        this.dataSource = new ArrayList<>(); // Inicializamos la lista en el constructor vacío.
    }

    @Override
    public List<T> listar() {
        return dataSource;
    }

    /*@Override
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
    }*/

    @Override
    public void crear(T t) {
        this.dataSource.add(t);
    }

    @Override
    public void eliminar(Integer id) {
        // Al método remove() aplicado a la lista, le pasamos como argumento el cliente (id obtenido con el método obtenerPorId), para eliminar el registro.
        this.dataSource.remove(this.obtenerPorId(id));
    }

    @Override
    public List<T> listar(int desde, int hasta) {
        return dataSource.subList(desde,hasta);
    }

    @Override
    public int total() {
        return this.dataSource.size();
    }
}
