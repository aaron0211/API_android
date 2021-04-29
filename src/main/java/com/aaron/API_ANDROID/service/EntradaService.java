package com.aaron.API_ANDROID.service;

import com.aaron.API_ANDROID.domain.Entrada;
import com.aaron.API_ANDROID.domain.Tarifa;

import java.util.ArrayList;
import java.util.Set;

public interface EntradaService {

    Set<Entrada> findAll();
   // Set<Entrada> addEntrada(int id_usuario, ArrayList<Entrada> entradas, ArrayList<Tarifa> tarifas);
}
