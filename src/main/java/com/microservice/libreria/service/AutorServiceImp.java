package com.microservice.libreria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.microservice.libreria.model.Autor;
import com.microservice.libreria.repository.AutorRepository;

public class AutorServiceImp implements AutorService  {

    @Autowired 
    private AutorRepository autorRepository;


    @Override
    public Autor crearAutor() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void eliminarAutor(Long id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Autor modificarAutor(Long id, Autor autor) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Autor> mostrarAutor() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public Autor obtenerAutor(Long id) {
        // TODO Auto-generated method stub
        return null;
    }
}
