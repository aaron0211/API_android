package com.aaron.API_ANDROID.domain.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EntradaDTO {
    private int id;
    private String tarifa;
    private int butaca;
    private int sesion;
}
