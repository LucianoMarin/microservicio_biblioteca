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

@Column (name="editorial")
private Editorial editorial;

@Column(name="cantidad")
private int cantidad;




/* CONSTRUCTOR CLASE LIBRO */

    public Libro(Long id,String codigo,Autor autor,int ann_publicacion,String genero,Editorial editorial,String titulo,int cantidad){
        
        this.id=id;
        this.codigo=codigo;
        this.autor=autor;
        this.ann_publicacion=ann_publicacion;
        this.genero=genero;
        this.editorial=editorial;
        this.titulo=titulo;
        this.cantidad=cantidad;



    }


    /* CREACION DE GETTER AND SETTER PARA CLASE LIBROS */


    public void setId(Long id){ this.id=id; }

    public void setCodigo(String codigo){ this.codigo=codigo; }

    public void setAutor(Autor autor){ this.autor=autor; }

    public void setAnoPublicacion(int ann_publicacion){ this.ann_publicacion=ann_publicacion; }

    public void setGenero(String genero){ this.genero=genero; }

    public void setEditorial(Editorial editorial){ this.editorial=editorial; }

    public void setTitulo(String titulo){ this.titulo=titulo; }

    public void setCantidad(int cantidad){ this.cantidad=cantidad; }




    public Long getId(){return this.id;}

    public String getCodigo(){return this.codigo;}

    public Autor getAutor(){return this.autor;}

    public int getAnoPublicacion(){return this.ann_publicacion;}

    public String getGenero(){return this.genero;}

    public Editorial getEditorial(){return this.editorial;}

    public String getTitulo(){return this.titulo;}

    public int getCantidad(){return this.cantidad;}


}
