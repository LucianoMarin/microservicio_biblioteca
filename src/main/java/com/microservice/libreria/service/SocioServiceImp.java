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
        if (existe.getRut() != null) {
            existe.setRut(socio.getRut());
        }
        if (existe.getPrimerNombre() != null) {
            existe.setPrimerNombre(socio.getPrimerNombre());
        }
        if (existe.getSegundoNombre() != null) {
            existe.setSegundoNombre(socio.getSegundoNombre());
        }
        if (existe.getApellidoPaterno() != null) {
            existe.setApellidoPaterno(socio.getApellidoPaterno());
        }
        if (existe.getApellidoMaterno() != null) {
            existe.setApellidoMaterno(socio.getApellidoMaterno());
        }
        if (existe.getEdad() >=0) {
            existe.setEdad(socio.getEdad());
        }

        if (existe.getEstado() != null) {
            existe.setEstado(socio.getEstado());
        }
        return null;
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
