package com.microservice.libreria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.microservice.libreria.model.Editorial;
import com.microservice.libreria.repository.EditorialRepository;

public class EditorialServiceImp implements EditorialService{

    @Autowired 
    private EditorialRepository editorialRepository;

    @Override
    public Editorial crearEditorial() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Editorial editarEditorial(Long id, Editorial editorial) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void eliminarEditorial(Long id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Editorial> mostrarEditorial() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Editorial obtenerEditorial(Long id) {
        // TODO Auto-generated method stub
        return null;
    }
}
