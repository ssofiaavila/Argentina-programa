
package com.sofiaavila.avila.controller;

import com.sofiaavila.avila.Interface.IPersonaService;
import com.sofiaavila.avila.entity.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
    @Autowired IPersonaService ipersonaService;
    
    @GetMapping("personas/traer")
    public List<Persona> getPersona(){
        return ipersonaService.getPersona();
    }
    
    public 
    
}
