package com.microservice.libreria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.microservice.libreria.model.Autor;
import com.microservice.libreria.repository.AutorRepository;

public class AutorServiceImp implements AutorService  {

    @Autowired 
    private AutorRepository autorRepository;


    @Override
    public Autor crearAutor(Autor autor) {
        
        return autorRepository.save(autor);

    }

    @Override
    public void eliminarAutor(Long id) {

        autorRepository.deleteById(id);
        
    }

    @Override
    public Autor modificarAutor(Long id, Autor autor) {

        Autor existe=autorRepository.findById(id).orElseThrow();

        if(existe.getNombre()!=null){
        
            existe.setNombre(autor.getNombre());
        }

        if(existe.getApellido()!=null){
    
            existe.setApellido(autor.getApellido());
        }

        return autorRepository.save(existe);

    }

    @Override
    public List<Autor> mostrarAutor() {
        return autorRepository.findAll();
    }


    @Override
    public Autor obtenerAutor(Long id) {
        
        return autorRepository.findById(id).orElseThrow();
    }
}
