package com.microservice.libreria.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.libreria.model.Libro;
import com.microservice.libreria.repository.AutorRepository;
import com.microservice.libreria.repository.EditorialRepository;
import com.microservice.libreria.service.LibroService;

@RestController 
@RequestMapping("/libros")
@CrossOrigin ("*")
public class LibroController {

    @Autowired 
    private LibroService libroService;

       
    @Autowired 
    private AutorRepository autorRepository;

    

    @Autowired 
    private EditorialRepository editorialRepository;

   @GetMapping 
    public List <Libro> mostrarAutores(){

        return libroService.mostrarLibro();
    }
    

    @PostMapping
    public Libro agregarLibro(@RequestBody Libro libro){

        return libroService.crearLibro(libro);
    }

    @GetMapping("/{id}") 
    public Libro mostrarLibro(@PathVariable Long id){

        return libroService.obtenerLibro(id);
    }
    

    @PutMapping ("/{id}")
    public Libro editarLibro(@PathVariable Long id, @RequestBody Libro libro){

        return libroService.editarLibro(id, libro);
    }

    @DeleteMapping("/{id}") 
    public void eliminarLibro(@PathVariable Long id){

        libroService.eliminarLibro(id);
    }
}
