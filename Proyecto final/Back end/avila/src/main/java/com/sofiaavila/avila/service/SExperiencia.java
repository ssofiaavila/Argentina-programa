
package com.sofiaavila.avila.service;

import com.sofiaavila.avila.entity.Experiencia;
import com.sofiaavila.avila.repository.RExperiencia;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional 
public class SExperiencia {
    @Autowired
    RExperiencia experiencia;
    
    
    public List<Experiencia> list(){
        return experiencia.findAll();
    }
    
    public Optional<Experiencia> getOne(int id){
        return experiencia.findById(id);
    }
    
    public Optional<Experiencia> getByNombreE(String nombre){
        return experiencia.findByNombreE(nombre);
    }
    
    public void save(Experiencia exp){
        experiencia.save(exp);
    }
    
    public void delete(int id){
        experiencia.deleteById(id);
    }
    
    public boolean existsById(int id){
        return experiencia.existsById(id);
    }
    
    public boolean existsByNombre(String nombre){
        return experiencia.existsByNombreE(nombre);
    }
}
