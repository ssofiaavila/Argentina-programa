
package com.sofiaavila.avila.security.Service;

import com.sofiaavila.avila.security.Entity.Usuario;
import com.sofiaavila.avila.security.Entity.UsuarioPrincipal;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service

public class UserDetailImpl implements UserDetailsService{
    @Autowired
    UsuarioService usuarioService;

    @Override
    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
        Optional<Usuario> usuario= usuarioService.getByNombreUsuario(nombreUsuario);
        return UsuarioPrincipal.build(usuario);
    }
}
