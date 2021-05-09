package com.aaron.API_ANDROID.service;

import com.aaron.API_ANDROID.domain.Pelicula;

import java.util.Set;

public interface PeliculaService {

    Set<Pelicula> findAll();
    Set<Pelicula> findBySinopsisContaining(String sinopsis);
    Set<Pelicula> findByIdGenero(String genero);
    Set<Pelicula> top10();
}
