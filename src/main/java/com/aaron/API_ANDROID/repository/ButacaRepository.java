package com.aaron.API_ANDROID.repository;

import com.aaron.API_ANDROID.domain.Butaca;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ButacaRepository extends CrudRepository<Butaca, Long> {

    @Query(value = "SELECT * from butaca where id_butaca = :id",nativeQuery = true)
    Butaca getQuery(int id);
}
