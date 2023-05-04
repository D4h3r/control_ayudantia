package com.mycompany.mavenproject1;

public class Objeto extends Interactuables {
    protected String tipoObjeto;

    public Objeto(int idObjeto, String nombreObjeto, String tipoObjeto) {
        super(idObjeto, nombreObjeto);
        this.tipoObjeto = tipoObjeto;
    }

    // Getters y Setters
    public String getTipoObjeto() {
        return tipoObjeto;
    }

    public void setTipoObjeto(String tipoObjeto) {
        this.tipoObjeto = tipoObjeto;
    }
}
