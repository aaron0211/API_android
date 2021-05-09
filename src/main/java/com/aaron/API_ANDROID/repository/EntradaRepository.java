package com.aaron.API_ANDROID.repository;

import com.aaron.API_ANDROID.domain.Entrada;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface EntradaRepository extends CrudRepository<Entrada, Long> {

    Set<Entrada> findAll();
    @Query(value = "select * from entrada INNER JOIN sesion on entrada.id_sesion = sesion.id_sesion " +
            "where sesion.id_sesion = :id", nativeQuery = true)
    Set<Entrada> findEntradaSesion(int id);
}
