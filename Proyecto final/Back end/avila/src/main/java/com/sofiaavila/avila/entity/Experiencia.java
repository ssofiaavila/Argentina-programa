
package com.sofiaavila.avila.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreE;
    private String descripcionE;
    private int inicioE;
    private int finE;
    
    public Experiencia(){        
    }
    
    public Experiencia(String nombreE, String descripcionE, int inicioE, int finE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.inicioE=inicioE;
        this.finE=finE;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public int getInicioE() {
        return inicioE;
    }

    public void setInicioE(int inicioE) {
        this.inicioE = inicioE;
    }

    public int getFinE() {
        return finE;
    }

    public void setFinE(int finE) {
        this.finE = finE;
    }
    
    
    
    
    
}
