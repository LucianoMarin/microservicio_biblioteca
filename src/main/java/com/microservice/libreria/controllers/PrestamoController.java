package com.microservice.libreria.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.libreria.model.Prestamo;
import com.microservice.libreria.service.PrestamoService;

@RestController 
@RequestMapping ("/prestamos")
@CrossOrigin ("*")
public class PrestamoController {
    
    @Autowired 
    private PrestamoService prestamoService;

   @GetMapping 
    public List <Prestamo> mostrarAutores(){

        return prestamoService.mostrarPrestamo();
    }
    

    
}
