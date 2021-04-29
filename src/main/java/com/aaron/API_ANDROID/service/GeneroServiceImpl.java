package com.aaron.API_ANDROID.service;

import com.aaron.API_ANDROID.domain.Genero;
import com.aaron.API_ANDROID.repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class GeneroServiceImpl implements GeneroService{

    @Autowired
    private GeneroRepository generoRepository;

    @Override
    public Set<Genero> findAll() {
        return generoRepository.findAll();
    }

    @Override
    public Optional<Genero> findByGenero(String genero) {
        return generoRepository.findByGenero(genero);
    }
}
