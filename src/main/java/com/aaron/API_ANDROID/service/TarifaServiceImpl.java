package com.aaron.API_ANDROID.service;

import com.aaron.API_ANDROID.domain.Tarifa;
import com.aaron.API_ANDROID.repository.TarifaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TarifaServiceImpl implements TarifaService{

    @Autowired
    private TarifaRepository tarifaRepository;

    @Override
    public Tarifa findByNombre(String nombre) {
        return tarifaRepository.getQuery(nombre);
    }
}
