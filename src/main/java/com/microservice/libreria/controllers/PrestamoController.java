package com.microservice.libreria.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.libreria.model.Prestamo;
import com.microservice.libreria.service.PrestamoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;



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


    @PostMapping
    public Prestamo crearPrestamo(@RequestBody Prestamo prestamo){

        return prestamoService.crearPrestamo(prestamo);

    }
    


    @GetMapping("/{id}")
    public Prestamo obtenPrestamo(@PathVariable Long id){

        return prestamoService.obtenerPrestamo(id);

    }
    


    @DeleteMapping("/{id}")
    public void eliminarPrestamo(@PathVariable Long id){
        prestamoService.eliminarPrestamo(id);
    }


    @PutMapping("/{id}")
    public Prestamo editarPrestamo(@PathVariable Long id, @RequestBody Prestamo prestamo) {
        
        return prestamoService.editarPrestamo(id, prestamo);
    }
    
    
}
