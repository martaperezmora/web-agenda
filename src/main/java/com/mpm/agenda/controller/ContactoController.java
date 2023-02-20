package com.mpm.agenda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mpm.agenda.models.Contacto;
import com.mpm.agenda.service.ContactoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
//@RequestMapping("/contactos")
public class ContactoController {

    @Autowired
    ContactoService contactoService;

    @GetMapping("/contactos")
    public List<Contacto> lista(){
        return contactoService.findAll();
    }
    
    @GetMapping("/contactos/{id}")
    public Contacto findContacto(@PathVariable int id){
        return contactoService.findById(id);
    }

    @DeleteMapping("/contactos/{id}")
    public void deleteContacto(@PathVariable int id){
         contactoService.deleteById(id);
    }

    @PostMapping(value="/contactos")
    public Contacto guardar(@RequestBody Contacto contacto) {
        return contactoService.save(contacto);
    }

    @PutMapping(value="/contactos/{id}")
    public void modificar(@RequestBody Contacto contacto, @PathVariable("id") int id) {
        contactoService.update(contacto, id);
    }
    
}
