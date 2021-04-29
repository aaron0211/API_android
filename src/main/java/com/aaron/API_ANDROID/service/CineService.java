package com.aaron.API_ANDROID.service;

import com.aaron.API_ANDROID.domain.Cine;

import java.util.Set;

public interface CineService {

    Set<Cine> findAll();
    Set<Cine> findByNombre(String nombre);
    Set<Cine> findByLocalidad(String localidad);
    Set<Cine> findByIdPelicula(int id);
}
