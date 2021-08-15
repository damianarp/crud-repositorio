package com.damianarp.genericsclass;

public class Genericos {
    public static void main(String[] args) {

        // Creamos la instancia de Camion para transportar caballos.
        Camion transporteCaballos = new Camion(5);

        // Agregamos los caballos.
        transporteCaballos.add(new Animal("Corazón Valiente", "Caballo"));
        transporteCaballos.add(new Animal("Galopante", "Caballo"));
        transporteCaballos.add(new Animal("Saeta", "Caballo"));
        transporteCaballos.add(new Animal("Pegaso", "Caballo"));
        transporteCaballos.add(new Animal("Pelopony", "Caballo"));

        // Separador
        System.out.println("Transporte de Caballos");

        // Iteramos el objeto Camion (gracias a la interface Iterable) para mostrar el nombre y tipo de animal.
        // Como el método add() agrega un objeto del tipo Object, debemos realizar un cast al tipo Animal.
        for (Object o : transporteCaballos) {
            Animal a = (Animal) o;
            System.out.println(a.getNombre() + " - " + a.getTipo());
        }

        // Salto de línea
        System.out.println();

        // Creamos la instancia de Camion para transportar maquinaria.
        Camion transporteMaquinaria = new Camion(3);

        // Agregamos la maquinaria.
        transporteMaquinaria.add(new Maquinaria("Bulldozer"));
        transporteMaquinaria.add(new Maquinaria("Grúa Horquilla"));
        transporteMaquinaria.add(new Maquinaria("Perforadora"));

        // Separador
        System.out.println("Transporte de Maquinaria");

        // Iteramos el objeto Camion (gracias a la interface Iterable) para mostrar el tipo de maquinaria.
        // Como el método add() agrega un objeto del tipo Object, debemos realizar un cast al tipo Maquinaria.
        for (Object o : transporteMaquinaria) {
            Maquinaria m = (Maquinaria) o;
            System.out.println(m.getTipo());
        }

        // Salto de línea
        System.out.println();

        // Creamos la instancia de Camion para transportar automóviles.
        Camion transporteAutomovil = new Camion(4);

        // Agregamos la maquinaria.
        transporteAutomovil.add(new Automovil("Eco Sport"));
        transporteAutomovil.add(new Automovil("Siena"));
        transporteAutomovil.add(new Automovil("Duna"));
        transporteAutomovil.add(new Automovil("Twingo"));

        // Separador
        System.out.println("Transporte de Automóviles");

        // Iteramos el objeto Camion (gracias a la interface Iterable) para mostrar el tipo de Automovil.
        // Como el método add() agrega un objeto del tipo Object, debemos realizar un cast al tipo Automovil.
        for (Object o : transporteAutomovil) {
            Automovil a = (Automovil) o;
            System.out.println(a.getMarca());
        }

    }
}
