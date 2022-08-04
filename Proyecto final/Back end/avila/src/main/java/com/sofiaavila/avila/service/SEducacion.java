
package com.sofiaavila.avila.service;

import com.sofiaavila.avila.entity.Educacion;
import com.sofiaavila.avila.repository.REducacion;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional 
public class SEducacion {
    @Autowired
     REducacion rExperiencia;
     
     public List<Educacion> list(){
         return rExperiencia.findAll();
     }
     
     public Optional<Educacion> getOne(int id){
         return rExperiencia.findById(id);
     }
     
     public Optional<Educacion> getByNombreE(String nombreE){
         return rExperiencia.findByNombreE(nombreE);
     }
     
     public void save(Educacion expe){
         rExperiencia.save(expe);
     }
     
     public void delete(int id){
         rExperiencia.deleteById(id);
     }
     
     public boolean existsById(int id){
         return rExperiencia.existsById(id);
     }
     
     public boolean existsByNombreE(String nombreE){
         return rExperiencia.existsByNombreE(nombreE);
     }

}
