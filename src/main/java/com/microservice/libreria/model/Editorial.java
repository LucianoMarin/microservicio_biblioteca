package com.microservice.libreria.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="editorial") 
public class Editorial {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;
    @Column (name="nombre")
    private String nombre;


    /* CONSTRUCTOR DE LA CLASE EDITORIAL */


    public Editorial(){}

    
    public Editorial(Long id, String nombre){
        
        this.id=id;
        this.nombre=nombre;

    }



    /*  GETTER AND SETTER DE LA CLASE EDITORIAL */ 

    public void setId(Long id){ this.id=id; }

    public void setNombre(String nombre){ this.nombre=nombre; }



    public Long getId(){return this.id;}

    public String getNombre(){return this.nombre;}
    

    
}
