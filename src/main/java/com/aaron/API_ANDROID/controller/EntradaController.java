package com.aaron.API_ANDROID.controller;

import com.aaron.API_ANDROID.domain.Entrada;
import com.aaron.API_ANDROID.domain.Tarifa;
import com.aaron.API_ANDROID.service.EntradaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Set;

@RestController
public class EntradaController {

    @Autowired
    private EntradaService entradaService;

    @GetMapping(value = "/entradas", produces = "application/json")
    public ResponseEntity<Set<Entrada>> getEntradas(){
        Set<Entrada> entradas = entradaService.findAll();
        return new ResponseEntity<>(entradas,HttpStatus.OK);
    }
}
