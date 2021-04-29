package com.aaron.API_ANDROID.controller;

import com.aaron.API_ANDROID.domain.Genero;
import com.aaron.API_ANDROID.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.Set;

@RestController
public class GeneroController {

    @Autowired
    private GeneroService generoService;

    @GetMapping(value = "/generos", produces = "application/json")
    public ResponseEntity<Set<Genero>> getGeneros(){
        Set<Genero> generos = generoService.findAll();
        return new ResponseEntity<>(generos, HttpStatus.OK);
    }

    @GetMapping(value = "/genero/nombre", produces = "application/json")
    public ResponseEntity<Optional<Genero>> getGeneroName(@RequestParam("nombre")String genero){
        Optional<Genero> generos = generoService.findByGenero(genero);
        return new ResponseEntity<>(generos,HttpStatus.OK);
    }
}
