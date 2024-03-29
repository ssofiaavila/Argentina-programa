
package com.sofiaavila.avila.DTO;

import javax.validation.constraints.NotBlank;


public class DTOExperiencia {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    @NotBlank
    private int inicioE;
    @NotBlank
    private int finE;
    
    //Constructores

    public DTOExperiencia() {
    }

    public DTOExperiencia(String nombreE, String descripcionE, int inicioE, int finE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.inicioE= inicioE;
        this.finE= inicioE;
    }
    //Getters & Setters

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
