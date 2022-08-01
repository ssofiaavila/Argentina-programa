package com.sofiaavila.avila.service;

import com.sofiaavila.avila.Interface.IPersonaService;
import com.sofiaavila.avila.entity.Persona;
import com.sofiaavila.avila.repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService{
    @Autowired IPersonaRepository ipersonaRepository;
    
    
    
    public List<Persona> getPersona() {
        List<Persona> personas= ipersonaRepository.findAll();
        return personas;
    }


    public void savePersona(Persona persona) {
        ipersonaRepository.save(persona);
    }


    public void deletePersona(Long id) {
        ipersonaRepository.deleteById(id);
    }


    public Persona searchPersona(Long id) {
    Persona persona= ipersonaRepository.findById(id).orElse(null);
    return persona;
    }
    
}
