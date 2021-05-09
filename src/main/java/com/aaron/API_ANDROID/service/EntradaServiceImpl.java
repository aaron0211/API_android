package com.aaron.API_ANDROID.service;

import com.aaron.API_ANDROID.domain.Entrada;
import com.aaron.API_ANDROID.repository.EntradaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class EntradaServiceImpl implements EntradaService{

    @Autowired
    private EntradaRepository entradaRepository;

    @Override
    public Set<Entrada> findAll() {
        return entradaRepository.findAll();
    }

    @Override
    public Set<Entrada> findEntradaSesion(int id) {
        return entradaRepository.findEntradaSesion(id);
    }
}
