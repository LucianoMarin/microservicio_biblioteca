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
    public Libro crearLibro(Libro libro) {


        return libroRepository.save(libro);
    }
    

    @Override
    public Libro editarLibro(Long id, Libro libro) {
        Libro existe=libroRepository.findById(id).orElseThrow();


        if(existe.getCodigo()!=null){
            existe.setCodigo(libro.getCodigo());

        }
        if(existe.getTitulo()!=null){
            existe.setTitulo(libro.getTitulo());

        }
        if(existe.getAutor()!=null){
            existe.setAutor(libro.getAutor());
        }
         
        if(existe.getAnoPublicacion()>=0){
            existe.setAnoPublicacion(libro.getAnoPublicacion());
        }

        if(existe.getGenero()!=null){
            existe.setGenero(libro.getGenero());
        }

        if(existe.getEditorial()!=null){
            existe.setEditorial(libro.getEditorial());
        }

        if(existe.getCantidad()>=0){
            existe.setCantidad(libro.getCantidad());
        }
        
        return libroRepository.save(existe);
    }

    @Override
    public void eliminarLibro(Long id) {
    
        libroRepository.deleteById(id);
    }

    @Override
    public List<Libro> mostrarLibro() {
        return libroRepository.findAll();
    }

    @Override
    public Libro obtenerLibro(Long id) {
        
        return libroRepository.findById(id).orElseThrow();
    }
}
