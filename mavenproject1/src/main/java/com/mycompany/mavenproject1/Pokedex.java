package com.mycompany.mavenproject1;

public class Pokedex extends Inventario {
    public Pokedex(int capacidad) {
        super(capacidad);
    }

    // Método para elegir un Pokemon de la Pokedex por su ID
    public void elegirPokemon(int idPokemon) {
        Interactuables pokemon = buscar(idPokemon);
        if (pokemon instanceof Pokemon) {
            System.out.println("Seleccionando Pokemon: " + pokemon.getNombreObjeto());
            // Lógica para seleccionar el Pokemon en la Pokedex
        } else {
            System.out.println("El objeto seleccionado no es un Pokemon válido.");
        }
    }
}
