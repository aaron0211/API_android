package com.aaron.API_ANDROID.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
@NoArgsConstructor
@Entity(name = "tarifa")
public class Tarifa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_tarifa;

    @NotBlank
    @Column
    private String nombre_tarifa;

    @NotBlank
    @Column
    private float importe;

    @OneToMany(mappedBy = "tarifa")
    private List<Entrada> entrada;
}
