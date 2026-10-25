package com.microservice.libreria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.libreria.model.Libro;

public interface LibroRepository extends JpaRepository <Libro, Long>{
    
}
