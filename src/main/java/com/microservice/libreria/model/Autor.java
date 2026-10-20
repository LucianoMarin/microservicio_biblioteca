package com.microservice.libreria.model;

public class Autor {

    private int id;
    private String rut;
    private String primer_nombre;
    private String segundo_nombre;
    private String apellido_paterno;
    private String apellido_materno;



    public Autor(int id, String rut, String primer_nombre,String segundo_nombre,String apellido_paterno,String apellido_materno){

        this.id=id;
        this.rut=rut;
        this.primer_nombre=primer_nombre;
        this.segundo_nombre=segundo_nombre;
        this.apellido_paterno=apellido_paterno;
        this.apellido_materno=apellido_materno;


    }

    public int getId(){return this.id;}

    public String getRut(){return this.rut;}

    public String getPrimerNombre(){return this.primer_nombre;}

    public String getSegundoNombre(){return this.segundo_nombre;}

    public String getApellidoPaterno(){return this.apellido_paterno;}

    public String getApellidoMaterno(){return this.apellido_materno;}

    
}
