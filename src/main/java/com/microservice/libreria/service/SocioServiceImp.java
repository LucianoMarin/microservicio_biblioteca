package com.microservice.libreria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.libreria.model.Socio;
import com.microservice.libreria.repository.SocioRepository;

import lombok.extern.slf4j.Slf4j;


@Service 
@Slf4j 
public class SocioServiceImp implements SocioService {

    @Autowired
    SocioRepository socioRepository;

    @Override
    public Socio crearSocio(Socio socio) {

        return socioRepository.save(socio);
    }

    @Override
    public Socio editarSocio(Long id, Socio socio) {

        Socio existe = socioRepository.findById(id).orElseThrow();
        if (socio.getRut() != null && socio.getRut().isBlank()) {
            existe.setRut(socio.getRut());
        }
        if (socio.getPrimerNombre() != null && socio.getPrimerNombre().isBlank()) {
            existe.setPrimerNombre(socio.getPrimerNombre());
        }
        if (socio.getSegundoNombre() != null && socio.getSegundoNombre().isBlank()) {
            existe.setSegundoNombre(socio.getSegundoNombre());
        }
        if (socio.getApellidoPaterno() != null && socio.getApellidoPaterno().isBlank()) {
            existe.setApellidoPaterno(socio.getApellidoPaterno());
        }
        if (socio.getApellidoMaterno() != null && socio.getApellidoMaterno().isBlank()) {
            existe.setApellidoMaterno(socio.getApellidoMaterno());
        }
        if (socio.getEdad() >=0) {
            existe.setEdad(socio.getEdad());
        }

        if (socio.getEstado() != null && socio.getEstado().isBlank()) {
            existe.setEstado(socio.getEstado());
        }
        return socioRepository.save(existe);
    }

    @Override
    public void eliminarSocio(Long id) {

        socioRepository.deleteById(id);
    }

    @Override
    public List<Socio> mostrarSocio() {
        
        return socioRepository.findAll();
    }

    @Override
    public Socio obtenerSocio(Long id) {

        return socioRepository.findById(id).orElseThrow();
    }
}
