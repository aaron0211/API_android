package com.aaron.API_ANDROID.repository;

import com.aaron.API_ANDROID.domain.Genero;
import com.aaron.API_ANDROID.domain.Pelicula;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.Set;

public interface PeliculaRepository extends CrudRepository<Pelicula, Long> {

    Set<Pelicula> findAll();
    Set<Pelicula> findBySinopsisContaining(String sinopsis);
    Set<Pelicula> findByGenero(Optional<Genero> genero);
}
