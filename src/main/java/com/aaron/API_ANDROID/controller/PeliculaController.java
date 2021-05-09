package com.aaron.API_ANDROID.controller;

import com.aaron.API_ANDROID.domain.Pelicula;
import com.aaron.API_ANDROID.service.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class PeliculaController {

    @Autowired
    private PeliculaService peliculaService;

    @GetMapping(value = "/peliculas", produces = "application/json")
    public ResponseEntity<Set<Pelicula>> getPeliculas(){
        Set<Pelicula> peliculas = peliculaService.findAll();
        return new ResponseEntity<>(peliculas, HttpStatus.OK);
    }

    @GetMapping(value = "/peliculas/sinopsis", produces = "application/json")
    public ResponseEntity<Set<Pelicula>> getPeliculaSinopsis(@RequestParam("sinopsis")String sinopsis){
        Set<Pelicula> peliculas = peliculaService.findBySinopsisContaining(sinopsis);
        return new ResponseEntity<>(peliculas,HttpStatus.OK);
    }

    @GetMapping(value = "/peliculas/genero", produces = "application/json")
    public ResponseEntity<Set<Pelicula>> getPeliculaByGenero(@RequestParam("genero")String genero){
        Set<Pelicula> peliculas = peliculaService.findByIdGenero(genero);
        return new ResponseEntity<>(peliculas,HttpStatus.OK);
    }

    @GetMapping(value = "/peliculas/top10", produces = "application/json")
    public ResponseEntity<Set<Pelicula>> getTop10(){
        Set<Pelicula> peliculas = peliculaService.top10();
        return new ResponseEntity<>(peliculas,HttpStatus.OK);
    }
}
