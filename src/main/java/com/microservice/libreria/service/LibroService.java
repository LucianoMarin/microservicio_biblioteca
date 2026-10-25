package com.microservice.libreria.service;

import java.util.List;

import com.microservice.libreria.model.Libro;

public interface LibroService {


    List <Libro> mostrarLibro();
    
    Libro obtenerLibro(Long id);

    Libro crearLibro();

    Libro editarLibro(Long id, Libro libro);

    void eliminarLibro(Long id);
    
}
