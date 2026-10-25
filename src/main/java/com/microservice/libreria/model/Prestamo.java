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


    /* CONSTRUCTOR CLASE PRESTAMO */
    public Prestamo(Long id){

        this.id=id;
    }


    /* GETTER AND SETTER CLASE PRESTAMO */
    public void setId(Long id){ this.id=id; }


    public Long getId(){ return this.id;}
    
}
