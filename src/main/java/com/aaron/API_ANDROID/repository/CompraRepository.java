package com.aaron.API_ANDROID.repository;

import com.aaron.API_ANDROID.domain.Compra;
import com.aaron.API_ANDROID.domain.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface CompraRepository extends CrudRepository<Compra, Long> {

    Set<Compra> findAll();
    Set<Compra> findByUsuario(Usuario usuario);
    @Query(value = "SELECT * from compra where id_usuario = :id",nativeQuery = true)
    Set<Compra> getQuery(int id);
}
