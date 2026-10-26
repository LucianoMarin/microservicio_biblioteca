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

import com.microservice.libreria.model.Autor;
import com.microservice.libreria.service.AutorService;

@RestController
@RequestMapping("/autores")
@CrossOrigin("*")
public class AutorController {

    @Autowired
    private AutorService autorService;

    @GetMapping
    public List<Autor> mostrarAutores() {

        return autorService.mostrarAutor();
    }

    @GetMapping("/{id}")
    public Autor mostrarAutor(@PathVariable Long id) {

        return autorService.obtenerAutor(id);
    }

    @PostMapping
    public Autor agregarAutor(@RequestBody Autor autor) {

        return autorService.crearAutor(autor);
    }

    @PutMapping("/{id}")
    public Autor modificarAutor(@PathVariable Long id, @RequestBody Autor autor) {

        return autorService.modificarAutor(id, autor);
    }

    @DeleteMapping("/{id}")
    public void eliminarAutor(@PathVariable Long id) {

        autorService.eliminarAutor(id);

    }

}
