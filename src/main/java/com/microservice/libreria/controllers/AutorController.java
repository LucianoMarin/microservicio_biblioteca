package com.microservice.libreria.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.libreria.model.Autor;
import com.microservice.libreria.service.AutorService;

@RestController 
@RequestMapping ("/autores")
@CrossOrigin ("*")
public class AutorController {

    @Autowired 
    private AutorService autorService;

    @GetMapping 
    public List <Autor> mostrarAutores(){

        return autorService.mostrarAutor();
    }

    

    
}
