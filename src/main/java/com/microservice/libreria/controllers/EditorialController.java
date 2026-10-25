package com.microservice.libreria.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.libreria.model.Editorial;
import com.microservice.libreria.service.EditorialService;

@RestController 
@RequestMapping ("/editoriales")
@CrossOrigin ("*")
public class EditorialController {
    
    @Autowired  
    private EditorialService editorialService;

    @GetMapping 
    public List <Editorial> mostrarAutores(){

        return editorialService.mostrarEditorial();
    }
    
}
