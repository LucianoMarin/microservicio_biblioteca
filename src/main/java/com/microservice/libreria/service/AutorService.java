package com.microservice.libreria.service;

import java.util.List;
import java.util.Optional;

import com.microservice.libreria.model.Autor;

public interface AutorService {

    List <Autor> mostrarAutor();
    
    Autor obtenerAutor(Long id);

    Autor crearAutor(Autor autor);

    Autor modificarAutor(Long id,Autor autor);

    void eliminarAutor(Long id);



}
