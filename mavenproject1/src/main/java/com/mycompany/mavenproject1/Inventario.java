package com.mycompany.mavenproject1;

import java.util.ArrayList;


// Clase abstracta que representa un inventario
public abstract class Inventario implements CRUD {
    protected int capacidad; // Capacidad máxima del inventario
    protected ArrayList<Interactuables> listaObjetos; // Lista de objetos en el inventario

    // Constructor que recibe la capacidad del inventario
    public Inventario(int capacidad) {
        this.capacidad = capacidad;
        this.listaObjetos = new ArrayList<>();
    }

    public int getCapacidad() {
        return capacidad;
    }

    public ArrayList<Interactuables> getListaObjetos() {
        return listaObjetos;
    }

    @Override
    public void agregar(Interactuables objeto) {
        listaObjetos.add(objeto);
        System.out.println("Objeto agregado al inventario.");
    }

    @Override
    public void eliminar(int idObjeto) {
        Interactuables objeto = buscar(idObjeto);
        if (objeto != null) {
            listaObjetos.remove(objeto);
            System.out.println("Objeto eliminado del inventario.");
        } else {
            System.out.println("El objeto no se encuentra en el inventario.");
        }
    }

    @Override
    public void actualizar(int idObjeto, Interactuables objeto) {
        int index = -1;
        for (int i = 0; i < listaObjetos.size(); i++) {
            if (listaObjetos.get(i).getIdObjeto() == idObjeto) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            listaObjetos.set(index, objeto);
            System.out.println("Objeto actualizado en el inventario.");
        } else {
            System.out.println("El objeto no se encuentra en el inventario.");
        }
    }

    @Override
    public Interactuables buscar(int idObjeto) {
        for (Interactuables objeto : listaObjetos) {
            if (objeto.getIdObjeto() == idObjeto) {
                return objeto;
            }
        }
        return null;
    }
}
