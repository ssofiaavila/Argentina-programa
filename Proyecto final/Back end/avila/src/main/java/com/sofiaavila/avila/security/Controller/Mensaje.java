
package com.sofiaavila.avila.security.Controller;


public class Mensaje {
    private String mensaje;
    
    
    //constructores
    
    public Mensaje(){
        
    }

    public Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    //assets

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
    
}
