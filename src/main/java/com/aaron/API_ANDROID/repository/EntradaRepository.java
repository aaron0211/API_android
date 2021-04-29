package com.aaron.API_ANDROID.repository;

import com.aaron.API_ANDROID.domain.Entrada;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface EntradaRepository extends CrudRepository<Entrada, Long> {

    Set<Entrada> findAll();
}
