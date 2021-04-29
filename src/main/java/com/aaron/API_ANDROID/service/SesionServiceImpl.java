package com.aaron.API_ANDROID.service;

import com.aaron.API_ANDROID.domain.Sesion;
import com.aaron.API_ANDROID.repository.SesionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SesionServiceImpl implements SesionService{

    @Autowired
    private SesionRepository sesionRepository;

    @Override
    public Set<Sesion> getSesionByIdPelicula(int id_pelicula) {
        return sesionRepository.getQuery(id_pelicula);
    }
}
