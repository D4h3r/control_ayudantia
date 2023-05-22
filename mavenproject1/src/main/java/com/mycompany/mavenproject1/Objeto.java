package com.mycompany.mavenproject1;

public class Objeto extends Interactuables {
    private String tipoObjeto; // Tipo específico del objeto

    // Constructor que recibe el ID, nombre y tipo del objeto
    public Objeto(int idObjeto, String nombreObjeto, String tipoObjeto) {
        super(idObjeto, nombreObjeto);
        this.tipoObjeto = tipoObjeto;
    }

    public String getTipoObjeto() {
        return tipoObjeto;
    }
}

