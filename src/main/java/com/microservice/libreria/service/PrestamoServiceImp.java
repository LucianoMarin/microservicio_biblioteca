package com.microservice.libreria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.libreria.model.Prestamo;
import com.microservice.libreria.repository.PrestamoRepository;

import lombok.extern.slf4j.Slf4j;

@Service 
@Slf4j 
public class PrestamoServiceImp implements PrestamoService{


    @Autowired 
    private PrestamoRepository prestamoRepository;
    

    @Override
    public Prestamo crearPrestamo(Prestamo prestamo) {
        
        return prestamoRepository.save(prestamo);
    }
    

    @Override
    public Prestamo editarPrestamo(Long id, Prestamo prestamo) {

        Prestamo existe=prestamoRepository.findById(id).orElseThrow();

        if(existe.getLibro()!=null){
            existe.setLibros(prestamo.getLibro());
        }
        if(existe.getSocio()!=null){
            existe.setSocio(prestamo.getSocio());
        }
        if(existe.getFechaPrestamo()!=null){
            existe.setFechaPrestamo(prestamo.getFechaPrestamo());
        }
        if(existe.getFechaPrestamo()!=null){
            existe.setFechaPrestamo(prestamo.getFechaPrestamo());
        }
        if(existe.getFechaDevolucion()!=null){
            existe.setFechaDevolucion(prestamo.getFechaDevolucion());
        }

        return prestamoRepository.save(existe);
    }

    @Override
    public void eliminarPrestamo(Long id) {
    
        prestamoRepository.deleteById(id);
    }

    @Override
    public List<Prestamo> mostrarPrestamo() {
        
        return prestamoRepository.findAll();
    }

    @Override
    public Prestamo obtenerPrestamo(Long id) {

        return prestamoRepository.findById(id).orElseThrow();
    }

    
}
