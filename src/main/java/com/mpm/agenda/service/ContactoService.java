package com.mpm.agenda.service;

import java.util.List;

import com.mpm.agenda.models.Contacto;

public interface ContactoService {
    
    public List<Contacto> findAll();
    public Contacto findById(int id);
    public Contacto save(Contacto contacto);
    public void update(Contacto contacto, int id);
    public void deleteById(int id);
    public void deleteAll();
}
