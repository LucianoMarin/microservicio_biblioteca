package com.microservice.libreria.model;

public class Libro {

private int id;
private String codigo;
private String titulo;
private Autor autor;
private int ann_publicacion;
private String genero;
private int cantidad;



    public Libro(int id,String codigo,String titulo,int cantidad){
        
        this.id=id;
        this.codigo=codigo;
        this.titulo=titulo;
        this.cantidad=cantidad;


    }



    public int getId(){return this.id;}

    public String getCodigo(){return this.codigo;}

    public String getTitulo(){return this.titulo;}

    public Autor getAutor(){return this.autor;}

    public int getAnoPublicacion(){return this.ann_publicacion;}

    public String getGenero(){return this.genero;}

    public int getCantidad(){return this.cantidad;}


}
