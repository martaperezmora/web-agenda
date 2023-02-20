package com.mpm.agenda.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpm.agenda.models.Contacto;
import com.mpm.agenda.repository.ContactoRepository;
import com.mpm.agenda.service.ContactoService;

@Service
public class ContactoServiceImpl implements ContactoService{

    @Autowired
    ContactoRepository contactoRepository;

    @Override
    public List<Contacto> findAll() {
        return contactoRepository.findAll();
    }

    @Override
    public Contacto findById(int id) {
        Optional<Contacto> findById = contactoRepository.findById(id);
        if(findById != null){
            return findById.get();
        }
        return null;
    }

    @Override
    public Contacto save(Contacto contacto) {
        return contactoRepository.save(contacto);
    }

    // comprobar id
    @Override
    public void update(Contacto contacto, int id) {
        this.findById(id);
        contacto.setId(id);
       contactoRepository.save(contacto);
    }

    @Override
    public void deleteById(int id) {
        contactoRepository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        contactoRepository.deleteAll();
    }
    
}
