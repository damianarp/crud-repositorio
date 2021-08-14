package com.damianarp.poointerfaces;

import com.damianarp.poointerfaces.modelo.Cliente;
import com.damianarp.poointerfaces.repositorio.*;

import java.util.List;

public class Repositorio {
    public static void main(String[] args) {

        // Creamos una instancia de ClienteListRepositorio
        CrudRepositorio repo = new ClienteListRepositorio();

        // Insertamos nuevos registros.
        repo.crear(new Cliente("Úrsula", "Mendez"));
        repo.crear(new Cliente("Marisa", "Gutierrez"));
        repo.crear(new Cliente("Pedro", "Arancibia"));
        repo.crear(new Cliente("Ramiro", "Suárez"));

        // Listamos a los clientes.
        List<Cliente> clientes = repo.listar();

        // Salto de línea
        System.out.println("Lista completa de clientes");

        // Iteramos la lista de clientes
        clientes.forEach(System.out::println); // System.out::println es igual a c -> System.out.println(c)

        // Salto de línea
        System.out.println();

        // Separador
        System.out.println("Clientes paginados");

        // Paginamos para obtener un subconjunto de clientes. Para eso, debemos hacer un cast del tipo PaginableRepositorio al repo.
        List<Cliente> paginable =  ((PaginableRepositorio)repo).listar(1,3); // El 1 se incluye, el 3 no se incluye.

        // Iteramos la lista de clientes paginados.
        paginable.forEach(System.out::println);

        // Salto de línea
        System.out.println();

        // Separador
        System.out.println("Clientes ordenados por nombre ascendente");

        // Orden ascendente por nombre
        List<Cliente> ordenAscNom = ((OrdenableRepositorio)repo).listar("nombre", Direccion.ASC);

        // Iteramos la lista de clientes ordenados por nombre de manera ascendente.
        ordenAscNom.forEach(System.out::println);

        // Salto de línea
        System.out.println();

        // Separador
        System.out.println("Clientes ordenados por apellido ascendente");

        // Orden ascendente por apellido
        List<Cliente> ordenAscApe = ((OrdenableRepositorio)repo).listar("apellido", Direccion.ASC);

        // Iteramos la lista de clientes ordenados por apellido de manera ascendente.
        ordenAscApe.forEach(System.out::println);

        // Salto de línea
        System.out.println();

        // Separador
        System.out.println("Clientes ordenados por id descendiente");

        // Orden ascendente por id
        List<Cliente> ordenDescId = ((OrdenableRepositorio)repo).listar("id", Direccion.DESC);

        // Iteramos la lista de clientes ordenados por id de manera descendiente.
        ordenDescId.forEach(System.out::println);

        // Salto de línea
        System.out.println();

        // Separador
        System.out.println("Clientes ordenados por nombre descendiente");

        // Orden descendiente por nombre
        List<Cliente> ordenDescNom = ((OrdenableRepositorio)repo).listar("nombre", Direccion.DESC);

        // Iteramos la lista de clientes ordenados por nombre de manera descendiente.
        ordenDescNom.forEach(System.out::println);

        // Salto de línea
        System.out.println();

        // Separador
        System.out.println("Clientes ordenados por apellido descendiente");

        // Orden descendiente por apellido
        List<Cliente> ordenDescApe = ((OrdenableRepositorio)repo).listar("apellido", Direccion.DESC);

        // Iteramos la lista de clientes ordenados por apellido de manera descendiente.
        ordenDescApe.forEach(System.out::println);

        // Salto de línea
        System.out.println();

        // Separador
        System.out.println("Clientes ordenados por id ascendente");

        // Orden descendiente por id
        List<Cliente> ordenAscId = ((OrdenableRepositorio)repo).listar("id", Direccion.ASC);

        // Iteramos la lista de clientes ordenados por apellido de manera ascendente.
        ordenAscId.forEach(System.out::println);

        // Salto de línea
        System.out.println();

        // Separador
        System.out.println("Cliente editado");

        // Actualizamos el apellido del id 1.
        Cliente ursulaActualizar = new Cliente("Úrsula" , "Dominguez");
        ursulaActualizar.setId(1);

        // Editamos el apellido.
        repo.editar(ursulaActualizar);

        // Buscamos el id del cliente editado
        Cliente ursula = repo.obtenerPorId(1);

        // Mostramos el cliente editado
        System.out.println(ursula);

        // Salto de línea
        System.out.println();

        // Separador
        System.out.println("Cliente eliminado");

        // Eliminamos el cliente con id 3.
        repo.eliminar(3);

        // Iteramos la lista de clientes.
        repo.listar().forEach(System.out::println);

    }
}
