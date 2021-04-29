package com.aaron.API_ANDROID.controller;

import com.aaron.API_ANDROID.domain.Cine;
import com.aaron.API_ANDROID.service.CineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class CineController {

    @Autowired
    private CineService cineService;

    @GetMapping(value = "/cines", produces = "application/json")
    public ResponseEntity<Set<Cine>> getCines(){
        Set<Cine> cines = cineService.findAll();
        return new ResponseEntity<>(cines, HttpStatus.OK);
    }

    @GetMapping(value = "/cine/nombre",produces = "application/json")
    public ResponseEntity<Set<Cine>> getCineNombre(@RequestParam("nombre")String nombre){
        Set<Cine> cines = cineService.findByNombre(nombre);
        return new ResponseEntity<>(cines,HttpStatus.OK);
    }

    @GetMapping(value = "/cine/localidad", produces = "application/json")
    public ResponseEntity<Set<Cine>> getCineLocalidad(@RequestParam("localidad")String localidad){
        Set<Cine> cines = cineService.findByLocalidad(localidad);
        return new ResponseEntity<>(cines,HttpStatus.OK);
    }

    @GetMapping(value = "/cines/pelicula", produces = "application/json")
    public ResponseEntity<Set<Cine>> getCinePelicula(@RequestParam("id") int id){
        Set<Cine> cines = cineService.findByIdPelicula(id);
        return new ResponseEntity<>(cines,HttpStatus.OK);
    }
}
