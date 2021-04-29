package com.aaron.API_ANDROID.controller;

import com.aaron.API_ANDROID.domain.Tarifa;
import com.aaron.API_ANDROID.service.TarifaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TarifaController {

    @Autowired
    private TarifaService tarifaService;

    @GetMapping(value = "/tarifa", produces = "application/json")
    public ResponseEntity<Tarifa> getTarifa(@RequestParam("nombre")String nombre){
        Tarifa tarifa = tarifaService.findByNombre(nombre);
        return new ResponseEntity<>(tarifa, HttpStatus.OK);
    }
}
