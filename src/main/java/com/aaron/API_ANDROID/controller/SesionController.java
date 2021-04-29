package com.aaron.API_ANDROID.controller;

import com.aaron.API_ANDROID.domain.Sesion;
import com.aaron.API_ANDROID.service.SesionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class SesionController {

    @Autowired
    private SesionService service;

    @GetMapping(value = "/sesiones/pelicula")
    public ResponseEntity<Set<Sesion>> getSesionesIdPelicula(@RequestParam("id") int id_pelicula){
        Set<Sesion> sesions = service.getSesionByIdPelicula(id_pelicula);
        return new ResponseEntity<>(sesions, HttpStatus.OK);
    }

}
