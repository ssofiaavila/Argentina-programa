
package com.sofiaavila.avila.security.DTO;



import com.sun.istack.NotNull;

/**
 *
 * @author Usuario
 */
public class LoginUsuario {
    @NotNull
    private String nombreUsuario;
    @NotNull
    private String password;
    
    //Getter & Setter

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
