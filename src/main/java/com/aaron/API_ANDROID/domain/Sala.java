package com.aaron.API_ANDROID.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
@NoArgsConstructor
@Entity(name = "sala")
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_sala;

    @NotBlank
    @Column
    private String planta;

    @ManyToOne
    @JoinColumn(name = "id_cine")
    private Cine cine;

    @OneToMany(mappedBy = "sala", cascade = CascadeType.REMOVE)
    @JsonBackReference
    private List<Sesion> sesion;

    @OneToMany(mappedBy = "sala", cascade = CascadeType.REMOVE)
    private List<Butaca> butaca;
}
