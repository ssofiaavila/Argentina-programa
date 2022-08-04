
package com.sofiaavila.avila.controller;

import com.sofiaavila.avila.DTO.DTOExperiencia;
import com.sofiaavila.avila.entity.Experiencia;
import com.sofiaavila.avila.security.Controller.Mensaje;
import com.sofiaavila.avila.service.SExperiencia;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/experiencia")
@CrossOrigin(origins= "http://localhost:4200")
public class CExperiencia {
    @Autowired
    SExperiencia experiencia;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Experiencia>> list(){
        List<Experiencia> list= experiencia.list();
        return new ResponseEntity(list,HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody DTOExperiencia dtoexp){      
        if(StringUtils.isBlank(dtoexp.getNombreE()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        if(experiencia.existsByNombre(dtoexp.getNombreE()))
            return new ResponseEntity(new Mensaje("Esa experiencia existe"), HttpStatus.BAD_REQUEST);
        
        Experiencia exp = new Experiencia(dtoexp.getNombreE(), dtoexp.getDescripcionE());
        experiencia.save(exp);
        
        return new ResponseEntity(new Mensaje("Experiencia agregada"), HttpStatus.OK);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody DTOExperiencia dtoexp){
        //validacion si existe ID
        if (!experiencia.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        // si ya existe sa experiencia 
        if (experiencia.existsByNombre(dtoexp.getNombreE()) && experiencia.getByNombreE(dtoexp.getNombreE()).get().getId() != id)
            return new ResponseEntity(new Mensaje("Esa experiencia ya existe"), HttpStatus.BAD_REQUEST);
        
        //en caso que reciba en blanco
        if (dtoexp.getNombreE().isBlank())
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        
        Experiencia exp= experiencia.getOne(id).get();
        exp.setNombreE(dtoexp.getNombreE());
        exp.setDescripcionE(dtoexp.getDescripcionE());
        
        experiencia.save(exp);
        return new ResponseEntity(new Mensaje("Experiencia actualizada"), HttpStatus.OK);      
        
    }
    
    public ResponseEntity<?> delete(@PathVariable ("id")int id){
        if (!experiencia.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        
        experiencia.delete(id);
        return new ResponseEntity(new Mensaje("Experiencia eliminada"), HttpStatus.OK);
    }
    
    
}
