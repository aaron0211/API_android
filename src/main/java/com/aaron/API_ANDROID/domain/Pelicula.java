package com.aaron.API_ANDROID.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
@NoArgsConstructor
@Entity(name = "pelicula")
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_pelicula;

    @NotBlank
    @Column
    private String titulo;

    @Column
    private float precio;

    @Column
    private String trailer;

    @Lob
    @Column(name="sinopsis", length=1024)
    private String sinopsis;

    @Column
    private int votos;

    @Column
    private int puntuacion;

    @Column
    private String fecha_estreno;

    @Column
    private String URL;

    @ManyToOne
    @JoinColumn(name = "id_genero")
    private Genero genero;

    @OneToMany(mappedBy = "pelicula", cascade = CascadeType.REMOVE)
    @JsonBackReference
    private List<Sesion> sesion;
}
