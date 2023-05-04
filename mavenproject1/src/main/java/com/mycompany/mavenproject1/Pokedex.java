package com.mycompany.mavenproject1;

public class Pokedex extends Inventario {
    public Pokedex(int capacidad) {
        super(capacidad);
    }

    // Método para elegir un Pokemon
    public void elegirPokemon(int index) {
        Pokemon pokemon = (Pokemon) listaObjetos.get(index);
        System.out.println("Pokemon elegido: " + pokemon.nombreObjeto);
    }
}
