package com.aaron.API_ANDROID.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
@NoArgsConstructor
@Entity(name = "cine")
public class Cine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_cine;

    @NotBlank
    @Column
    private String nombre;

    @NotBlank
    @Column
    private String localidad;

    @OneToMany(mappedBy = "cine", cascade = CascadeType.REMOVE)
    @JsonBackReference
    private List<Sala> sala;
}
