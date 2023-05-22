package com.mycompany.mavenproject1;

import java.util.ArrayList;

// Interfaz para operaciones básicas de CRUD
public interface CRUD {
    // Agregar un objeto al inventario
    void agregar(Interactuables objeto);

    // Eliminar un objeto del inventario por su ID
    void eliminar(int idObjeto);

    // Actualizar un objeto del inventario por su ID
    void actualizar(int idObjeto, Interactuables objeto);

    // Buscar un objeto del inventario por su ID
    Interactuables buscar(int idObjeto);
}
