
package com.sofiaavila.avila.security.Repository;

import com.sofiaavila.avila.security.Entity.Rol;
import com.sofiaavila.avila.security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol,Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
