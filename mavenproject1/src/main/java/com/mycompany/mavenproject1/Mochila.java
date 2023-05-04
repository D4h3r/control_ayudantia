package com.mycompany.mavenproject1;

public class Mochila extends Inventario {
    public Mochila(int capacidad) {
        super(capacidad);
    }

    // Método para usar un objeto de la mochila
    public void usarObjeto(int index) {
        Objeto objeto = (Objeto) listaObjetos.get(index);
        System.out.println("Usando objeto: " + objeto.nombreObjeto + " de tipo " + objeto.tipoObjeto);
        eliminarObjeto(index);
    }
}
