package com.aaron.API_ANDROID.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity(name = "entrada")
public class Entrada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_entrada;

    @Column
    private float importe;

    @ManyToOne
    @JoinColumn(name = "id_sesion")
    @JsonBackReference(value = "sesion")
    private Sesion sesion;

    @ManyToOne
    @JoinColumn(name = "id_compra")
    @JsonBackReference(value = "compra")
    private Compra compra;

    @ManyToOne
    @JoinColumn(name = "id_butaca")
    private Butaca butaca;

    @ManyToOne
    @JoinColumn(name = "id_tarifa")
    @JsonBackReference(value = "tarifa")
    private Tarifa tarifa;
}
