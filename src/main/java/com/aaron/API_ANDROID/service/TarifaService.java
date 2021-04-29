package com.aaron.API_ANDROID.service;

import com.aaron.API_ANDROID.domain.Tarifa;

public interface TarifaService {

    Tarifa findByNombre(String nombre);
}
