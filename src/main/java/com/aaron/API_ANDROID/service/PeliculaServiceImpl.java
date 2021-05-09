package com.aaron.API_ANDROID.service;

import com.aaron.API_ANDROID.domain.Genero;
import com.aaron.API_ANDROID.domain.Pelicula;
import com.aaron.API_ANDROID.repository.GeneroRepository;
import com.aaron.API_ANDROID.repository.PeliculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class PeliculaServiceImpl implements PeliculaService{

    @Autowired
    private PeliculaRepository peliculaRepository;

    @Autowired
    private GeneroRepository generoRepository;

    @Override
    public Set<Pelicula> findAll() {
        return peliculaRepository.findAll();
    }

    @Override
    public Set<Pelicula> findBySinopsisContaining(String sinopsis) {
        return peliculaRepository.findBySinopsisContaining(sinopsis);
    }

    @Override
    public Set<Pelicula> findByIdGenero(String nombre_genero) {
        Optional<Genero> genero = generoRepository.findByGenero(nombre_genero);
        Set<Pelicula> peliculas = peliculaRepository.findByGenero(genero);
        return peliculas;
    }

    @Override
    public Set<Pelicula> top10() {
        return peliculaRepository.top10();
    }
}
