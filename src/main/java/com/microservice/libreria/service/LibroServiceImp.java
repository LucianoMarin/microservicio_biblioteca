package com.microservice.libreria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.microservice.libreria.model.Libro;
import com.microservice.libreria.repository.AutorRepository;
import com.microservice.libreria.repository.EditorialRepository;
import com.microservice.libreria.repository.LibroRepository;

public class LibroServiceImp implements LibroService {

    @Autowired 
    private LibroRepository libroRepository;

    @Autowired 
    private AutorRepository autorRepository;

    @Autowired 
    private EditorialRepository editorialRepository;


    @Override
    public Libro crearLibro() {
        // TODO Auto-generated method stub
        return null;
    }
    

    @Override
    public Libro editarLibro(Long id, Libro libro) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void eliminarLibro(Long id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Libro> mostrarLibro() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Libro obtenerLibro(Long id) {
        // TODO Auto-generated method stub
        return null;
    }
}
