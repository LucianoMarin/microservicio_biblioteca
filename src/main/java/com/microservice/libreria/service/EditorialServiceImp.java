package com.microservice.libreria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.libreria.model.Editorial;
import com.microservice.libreria.repository.EditorialRepository;

import lombok.extern.slf4j.Slf4j;

@Service 
@Slf4j 


public class EditorialServiceImp implements EditorialService{

    @Autowired 
    private EditorialRepository editorialRepository;

    @Override
    public Editorial crearEditorial(Editorial editorial) {
        
        return editorialRepository.save(editorial);
    }

    @Override
    public Editorial editarEditorial(Long id, Editorial editorial) {
        Editorial existe=editorialRepository.findById(id).orElseThrow();


        if(editorial.getNombre()!=null && !editorial.getNombre().isBlank()){
            
            existe.setNombre(editorial.getNombre());

        }


        return editorialRepository.save(existe);
    }



    @Override
    public void eliminarEditorial(Long id) {
        
        editorialRepository.deleteById(id);
    }

    @Override
    public List<Editorial> mostrarEditorial() {

        return editorialRepository.findAll();
    }

    @Override
    public Editorial obtenerEditorial(Long id) {
  
        return editorialRepository.findById(id).orElseThrow();
    }
}
