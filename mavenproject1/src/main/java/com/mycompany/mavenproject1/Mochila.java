package com.mycompany.mavenproject1;

public class Mochila extends Inventario {
    public Mochila(int capacidad) {
        super(capacidad);
    }

    // Método para usar un objeto de la mochila por su ID
    public void usarObjeto(int idObjeto) {
        Interactuables objeto = buscar(idObjeto);
        if (objeto instanceof Objeto) {
            System.out.println("Usando objeto: " + objeto.getNombreObjeto());
            // Lógica para usar el objeto en la mochila
        } else {
            System.out.println("El objeto no se puede usar.");
        }
    }
}
