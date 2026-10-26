package com.microservice.libreria.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.libreria.model.Socio;
import com.microservice.libreria.service.SocioService;

@RestController 
@RequestMapping("/socios")

public class SocioController {

@Autowired 
private SocioService socioService;
    

@GetMapping
public List <Socio> mostrarSocios(){

    return socioService.mostrarSocio();
}


@PostMapping
public Socio agregarSocio(@RequestBody Socio socio){

    return socioService.crearSocio(socio);
}

@GetMapping("/{id}")
public Socio mostrarSocio(@PathVariable Long id){

    return socioService.obtenerSocio(id);

}


@PutMapping("/{id}")
public Socio editarSocio(@PathVariable Long id, @RequestBody Socio socio){

    return socioService.editarSocio(id, socio);
}


@DeleteMapping("/{id}")
public void EliminarSocio(@PathVariable Long id){

    socioService.eliminarSocio(id);
}

}
