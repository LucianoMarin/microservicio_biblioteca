package com.microservice.libreria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.libreria.model.Editorial;

public interface EditorialRepository extends JpaRepository <Editorial,Long> {
    
}
