package com.aaron.API_ANDROID.service;

import com.aaron.API_ANDROID.domain.Sesion;

import java.util.Set;

public interface SesionService {

    Set<Sesion> getSesionByIdPelicula(int id_pelicula);
}
