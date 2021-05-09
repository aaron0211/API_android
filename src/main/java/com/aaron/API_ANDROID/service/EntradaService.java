package com.aaron.API_ANDROID.service;

import com.aaron.API_ANDROID.domain.Entrada;

import java.util.Set;

public interface EntradaService {

    Set<Entrada> findAll();
    Set<Entrada> findEntradaSesion(int id);
}
