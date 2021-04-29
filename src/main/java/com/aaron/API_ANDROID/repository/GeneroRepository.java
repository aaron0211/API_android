package com.aaron.API_ANDROID.repository;

import com.aaron.API_ANDROID.domain.Genero;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.Set;

public interface GeneroRepository extends CrudRepository<Genero, Long> {

    Set<Genero> findAll();
    Optional<Genero> findByGenero(String genero);
}
