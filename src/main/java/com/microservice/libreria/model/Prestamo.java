package com.microservice.libreria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table (name="prestamo")
public class Prestamo {

    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    
}
