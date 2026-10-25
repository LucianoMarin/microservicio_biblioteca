package com.microservice.libreria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.microservice.libreria.model.Prestamo;
import com.microservice.libreria.repository.PrestamoRepository;

public class PrestamoServiceImp implements PrestamoService{


    @Autowired 
    private PrestamoRepository prestamoRepository;
    

    @Override
    public Prestamo crearPrestamo() {
        // TODO Auto-generated method stub
        return null;
    }
    

    @Override
    public Prestamo editarPrestamo(Long id, Prestamo prestamo) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void eliminarPrestamo(Long id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Prestamo> mostrarPrestamo() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Prestamo obtenerPrestamo(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    
}
