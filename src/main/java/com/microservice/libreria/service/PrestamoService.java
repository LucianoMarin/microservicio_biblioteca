package com.microservice.libreria.service;

import java.util.List;

import com.microservice.libreria.model.Prestamo;

public interface PrestamoService {


    List <Prestamo> mostrarPrestamo();
    
    Prestamo obtenerPrestamo(Long id);

    Prestamo crearPrestamo(Prestamo prestamo);

    Prestamo editarPrestamo(Long id, Prestamo prestamo);

    void eliminarPrestamo(Long id);
}
