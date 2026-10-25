package com.microservice.libreria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.libreria.model.Socio;

public interface SocioRepository extends JpaRepository <Socio,Long> {
    
}
