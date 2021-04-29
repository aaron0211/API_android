package com.aaron.API_ANDROID.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
@NoArgsConstructor
@Entity(name = "genero")
public class Genero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_genero;

    @NotBlank
    @Column
    private String genero;

    @OneToMany(mappedBy = "genero", cascade = CascadeType.REMOVE)
    @JsonBackReference
    private List<Pelicula> pelicula;
}
