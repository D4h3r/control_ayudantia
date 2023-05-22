package com.mycompany.mavenproject1;

// Clase abstracta base para objetos interactivos
public abstract class Interactuables {
    protected int idObjeto; // ID del objeto
    protected String nombreObjeto; // Nombre del objeto

    // Constructor que recibe el ID y nombre del objeto
    public Interactuables(int idObjeto, String nombreObjeto) {
        this.idObjeto = idObjeto;
        this.nombreObjeto = nombreObjeto;
    }

    public int getIdObjeto() {
        return idObjeto;
    }

    public String getNombreObjeto() {
        return nombreObjeto;
    }
}
