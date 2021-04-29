package com.aaron.API_ANDROID.repository;

import com.aaron.API_ANDROID.domain.Sesion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface SesionRepository extends CrudRepository<Sesion, Long> {

    @Query(value = "SELECT * from sesion se " +
            "INNER JOIN sala s on se.id_sala = s.id_sala " +
            "INNER JOIN cine c on  s.id_cine = c.id_cine " +
            "INNER JOIN pelicula p on p.id_pelicula = se.id_pelicula " +
            "where p.id_pelicula = :id",nativeQuery = true)
    Set<Sesion> getQuery(int id);

    @Query(value = "SELECT * from sesion where id_sesion = :id",nativeQuery = true)
    Sesion getSesionById(int id);
}
