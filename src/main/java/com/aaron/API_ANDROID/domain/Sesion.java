package com.aaron.API_ANDROID.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity(name = "sesion")
public class Sesion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_sesion;

    @Column
    private String hora;

    @Column
    private String fecha;

    @ManyToOne
    @JoinColumn(name = "id_sala")
    private Sala sala;

    @ManyToOne
    @JoinColumn(name = "id_pelicula")
//    @JsonBackReference
    private Pelicula pelicula;

    @OneToMany(mappedBy = "sesion", cascade = CascadeType.REMOVE)
    @JsonBackReference(value = "sesion")
    private List<Entrada> entrada;

}
