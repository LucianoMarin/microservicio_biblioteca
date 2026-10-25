package com.microservice.libreria.service;

import java.util.List;

import com.microservice.libreria.model.Autor;

public interface AutorService {

    List <Autor> mostrarAutor();
    
    Autor obtenerAutor(Long id);

    Autor crearAutor();

    Autor modificarAutor(Long id,Autor autor);

    void eliminarAutor(Long id);



}
