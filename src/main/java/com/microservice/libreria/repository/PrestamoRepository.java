package com.microservice.libreria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.libreria.model.Prestamo;

public interface PrestamoRepository extends JpaRepository<Prestamo,Long>{
    
}
