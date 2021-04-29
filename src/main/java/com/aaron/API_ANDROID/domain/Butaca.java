package com.aaron.API_ANDROID.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
@NoArgsConstructor
@Entity(name = "butaca")
public class Butaca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_butaca;

    @NotBlank
    @Column
    private int fila;

    @NotBlank
    @Column
    private int columna;

    @OneToMany(mappedBy = "butaca", cascade = CascadeType.REMOVE)
    @JsonBackReference(value = "butaca")
    private List<Entrada> entrada;

    @ManyToOne
    @JoinColumn(name = "id_sala")
    @JsonBackReference
    private Sala sala;
}
