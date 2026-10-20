package com.microservice.libreria.model;

public class Editorial {
    
    private int id;
    private String nombre;



    public Editorial(int id, String nombre){
        
        this.id=id;
        this.nombre=nombre;

    }


    public int getId(){return this.id;}

    public String getNombre(){return this.nombre;}
    

    
}
