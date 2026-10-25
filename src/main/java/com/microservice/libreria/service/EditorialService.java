package com.microservice.libreria.service;

import java.util.List;

import com.microservice.libreria.model.Editorial;

public interface EditorialService {


    List <Editorial> mostrarEditorial();
    
    Editorial obtenerEditorial(Long id);

    Editorial crearEditorial(Editorial editorial);

    Editorial editarEditorial(Long id,Editorial editorial);

    void eliminarEditorial(Long id);

}
