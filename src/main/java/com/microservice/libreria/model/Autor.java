package com.microservice.libreria.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table (name="Autor")
public class Autor {

    @Id 
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="nombre")
    private String nombre;
    
    @Column(name="apellido")
    private String apellido;



    /* CONSTRUCTOR DE LA CLASE AUTOR */

    public Autor(Long id, String nombre,String apellido){

        this.id=id;
        this.nombre=nombre;
        this.apellido=apellido;

    }



    /* GETTER AND SETTER CLASE AUTOR */

    public void setId(Long id){ this.id=id;}

    public void setNombre(String nombre){ this.nombre=nombre; }

    public void setApellido(String apellido){ this.apellido=apellido; }


    public Long getId(){return this.id;}

    public String getNombre(){return this.nombre;}

    public String getApellido(){return this.apellido;}

    
}
