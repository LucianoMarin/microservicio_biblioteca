package com.microservice.libreria.service;

import java.util.List;

import com.microservice.libreria.model.Socio;

public interface SocioService  {
    
    List <Socio> mostrarSocio();
    
    Socio obtenerSocio(Long id);

    Socio crearSocio(Socio socio);

    Socio editarSocio(Long id, Socio socio);
    
    void eliminarSocio(Long id);



}
