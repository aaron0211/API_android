package com.aaron.API_ANDROID.service;

import com.aaron.API_ANDROID.domain.Cine;
import com.aaron.API_ANDROID.repository.CineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class CineServiceImpl implements CineService{

    @Autowired
    private CineRepository cineRepository;

    @Override
    public Set<Cine> findAll() {
        return cineRepository.findAll();
    }

    @Override
    public Set<Cine> findByNombre(String nombre) {
        return cineRepository.findByNombre(nombre);
    }

    @Override
    public Set<Cine> findByLocalidad(String localidad) {
        return cineRepository.findByLocalidad(localidad);
    }

    @Override
    public Set<Cine> findByIdPelicula(int id) {
        return cineRepository.getQuery(id);
    }
}
