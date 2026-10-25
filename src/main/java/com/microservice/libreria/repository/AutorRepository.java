package com.microservice.libreria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.libreria.model.Autor;

public interface AutorRepository extends JpaRepository<Autor,Long> {
    
}
