package com.aaron.API_ANDROID.repository;

import com.aaron.API_ANDROID.domain.Cine;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface CineRepository extends CrudRepository<Cine, Long> {

    Set<Cine> findAll();
    Set<Cine> findByNombre(String nombre);
    Set<Cine> findByLocalidad(String localidad);
    @Query(value = "SELECT * from cine c " +
            "INNER JOIN sala s on s.id_cine = c.id_cine " +
            "INNER JOIN sesion se on se.id_sala = s.id_sala " +
            "INNER JOIN pelicula p on p.id_pelicula = se.id_pelicula " +
            "where p.id_pelicula = :id",nativeQuery = true)
    Set<Cine> getQuery(int id);
}
