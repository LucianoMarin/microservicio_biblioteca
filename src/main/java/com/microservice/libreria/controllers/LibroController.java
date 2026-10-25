package com.microservice.libreria.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.libreria.model.Libro;
import com.microservice.libreria.service.LibroService;

@RestController 
@RequestMapping("/libros")
@CrossOrigin ("*")
public class LibroController {

    @Autowired 
    private LibroService libroService;

   @GetMapping 
    public List <Libro> mostrarAutores(){

        return libroService.mostrarLibro();
    }
    
    
}
