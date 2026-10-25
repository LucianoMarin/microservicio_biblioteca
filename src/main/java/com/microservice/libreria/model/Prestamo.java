package com.microservice.libreria.model;

import java.sql.Date;
import java.util.List;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity 
@Table (name="prestamo")
public class Prestamo {

    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne 
    @JoinColumn (name="socio_id")
    private Socio socio;

    @ManyToMany
    @JoinTable(
    name = "prestamo_libro",
    joinColumns = @JoinColumn(name = "prestamo_id"),
    inverseJoinColumns = @JoinColumn(name = "libro_id"))
    private List<Libro> libros;

    @Column (name="fecha_prestamo")
    private Date fecha_prestamo;

    @Column (name="fecha_devolucion")
    private Date fecha_devolucion;

    @Column (name="fecha_entregado")
    private Date fecha_entregado;





    /* CONSTRUCTOR CLASE PRESTAMO */

    public Prestamo(){}
    
    public Prestamo(Long id,Socio socio,List <Libro> libros,Date fecha_prestamo,Date fecha_devolucion, Date fecha_entregado){

        this.id=id;
        this.socio=socio;
        this.libros=libros;
        this.fecha_prestamo=fecha_prestamo;
        this.fecha_devolucion=fecha_devolucion;
        this.fecha_entregado=fecha_entregado;
    }


    /* GETTER AND SETTER CLASE PRESTAMO */
    public void setId(Long id){ this.id=id; }

    public void setSocio(Socio socio){ this.socio=socio; }

    public void setLibros(List <Libro> libros){ this.libros=libros; }

    public void setFechaPrestamo(Date fecha_prestamo){ this.fecha_prestamo=fecha_prestamo; }

    public void setFechaDevolucion(Date fecha_devolucion){ this.fecha_devolucion=fecha_devolucion; }

    public void setFechaEntregado(Date fecha_entregado){ this.fecha_entregado=fecha_entregado; }



    public Long getId(){ return this.id;}

    public Socio getSocio(){ return this.socio;}

    public List <Libro> getLibro(){ return this.libros; }

    public Date getFechaPrestamo(){ return this.fecha_prestamo; }

    public Date getFechaDevolucion(){ return this.fecha_devolucion; }

    public Date getFechaEntregado(){ return this.fecha_entregado; }

    
}
