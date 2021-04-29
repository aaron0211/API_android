package com.aaron.API_ANDROID.service;

import com.aaron.API_ANDROID.domain.Compra;
import com.aaron.API_ANDROID.domain.DTO.EntradaDTO;

import java.util.ArrayList;
import java.util.Set;

public interface CompraService {

    Set<Compra> findAll();
    Set<Compra> findByUsuario(int id_usuario);
    Compra addCompra(ArrayList<EntradaDTO> entradas);
}
