package com.sofiaavila.avila.Interface;

import com.sofiaavila.avila.entity.Persona;
import java.util.List;

public interface IPersonaService {
    //Traer persona
    public List<Persona> getPersona();    
    //Guarda persona
    public void savePersona(Persona persona);
    //Eliminar usuario hallado mediante ID
    public void deletePersona(Long id);
    //Buscar persona por ID
    public Persona searchPersona(Long id);
}
