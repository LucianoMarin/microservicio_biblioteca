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
    
    @Column (name="rut")
    private String rut;
    
    @Column(name="primer_nombre")
    private String primer_nombre;
    
    @Column(name="segundo_nombre")
    private String segundo_nombre;
    
    @Column(name="apellido_paterno")
    private String apellido_paterno;

    @Column(name="apellido_materno")
    private String apellido_materno;



    public Autor(Long id, String rut, String primer_nombre,String segundo_nombre,String apellido_paterno,String apellido_materno){

        this.id=id;
        this.rut=rut;
        this.primer_nombre=primer_nombre;
        this.segundo_nombre=segundo_nombre;
        this.apellido_paterno=apellido_paterno;
        this.apellido_materno=apellido_materno;


    }

    public Long getId(){return this.id;}

    public String getRut(){return this.rut;}

    public String getPrimerNombre(){return this.primer_nombre;}

    public String getSegundoNombre(){return this.segundo_nombre;}

    public String getApellidoPaterno(){return this.apellido_paterno;}

    public String getApellidoMaterno(){return this.apellido_materno;}

    
}
