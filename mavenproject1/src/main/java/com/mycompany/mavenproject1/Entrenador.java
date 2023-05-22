package com.mycompany.mavenproject1;

// Clase que representa al entrenador
public class Entrenador {
    private Mochila mochila; // Atributo de tipo Mochila

    public Entrenador(Mochila mochila) {
        this.mochila = mochila;
    }

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }
}
