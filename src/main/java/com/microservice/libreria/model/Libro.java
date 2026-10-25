package com.microservice.libreria.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="Libro") 
public class Libro {

@Id 
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Column (name="codigo")
private String codigo;

@Column (name="titulo")
private String titulo;

@Column(name="autor")
private Autor autor;

@Column(name="ann_publicacion")
private int ann_publicacion;

@Column(name="genero")
private String genero;

@Column(name="cantidad")
private int cantidad;



    public Libro(Long id,String codigo,String titulo,int cantidad){
        
        this.id=id;
        this.codigo=codigo;
        this.titulo=titulo;
        this.cantidad=cantidad;


    }



    public Long getId(){return this.id;}

    public String getCodigo(){return this.codigo;}

    public String getTitulo(){return this.titulo;}

    public Autor getAutor(){return this.autor;}

    public int getAnoPublicacion(){return this.ann_publicacion;}

    public String getGenero(){return this.genero;}

    public int getCantidad(){return this.cantidad;}


}
