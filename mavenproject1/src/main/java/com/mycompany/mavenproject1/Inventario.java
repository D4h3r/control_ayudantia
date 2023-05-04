package com.mycompany.mavenproject1;

import java.util.ArrayList;

public class Inventario {
    protected int capacidad;
    protected ArrayList<Interactuables> listaObjetos;

    public Inventario(int capacidad) {
        this.capacidad = capacidad;
        this.listaObjetos = new ArrayList<>();
    }

    // Métodos CRUD del inventario
    public void agregarObjeto(Interactuables objeto) {
        if (listaObjetos.size() < capacidad) {
            listaObjetos.add(objeto);
        } else {
            System.out.println("Inventario lleno.");
        }
    }

    public Interactuables obtenerObjeto(int index) {
        return listaObjetos.get(index);
    }

    public void eliminarObjeto(int index) {
        listaObjetos.remove(index);
    }

    public void actualizarObjeto(int index, Interactuables objetoActualizado) {
        listaObjetos.set(index, objetoActualizado);
    }
}
