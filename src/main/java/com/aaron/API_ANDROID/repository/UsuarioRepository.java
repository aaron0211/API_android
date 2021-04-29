package com.aaron.API_ANDROID.repository;

import com.aaron.API_ANDROID.domain.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

    Usuario findByEmailAndPassword(String email, String password);
    @Query(value = "SELECT * from usuario where id_usuario = :id",nativeQuery = true)
    Usuario getQuery(int id);
}
