package com.aaron.API_ANDROID.service;

import com.aaron.API_ANDROID.domain.Genero;

import java.util.Optional;
import java.util.Set;

public interface GeneroService {

    Set<Genero> findAll();
    Optional<Genero> findByGenero(String genero);
}
