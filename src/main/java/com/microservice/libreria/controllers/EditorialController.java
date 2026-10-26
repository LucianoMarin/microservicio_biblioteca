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


    @GetMapping("/{id}") 
    public Editorial mostrarAutor(@PathVariable Long id){

        return editorialService.obtenerEditorial(id);

    }


    @PostMapping 
    public Editorial agregaEditorial(@RequestBody Editorial editorial){
        return editorialService.crearEditorial(editorial);

    }
    

    @PutMapping("/{id}") 
    public Editorial modificarEditorial(@PathVariable Long id, @RequestBody Editorial editorial){

        return editorialService.editarEditorial(id, editorial);
    }


    @DeleteMapping("/{id}")
    public void eliminarEditorial(@PathVariable Long id){

        editorialService.eliminarEditorial(id);
    }
}
