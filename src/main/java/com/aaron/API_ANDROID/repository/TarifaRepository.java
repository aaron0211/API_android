package com.aaron.API_ANDROID.repository;

import com.aaron.API_ANDROID.domain.Tarifa;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface TarifaRepository extends CrudRepository<Tarifa, Long> {

    @Query(value = "SELECT * from tarifa where nombre_tarifa = :nombre",nativeQuery = true)
    Tarifa getQuery(String nombre);
}
