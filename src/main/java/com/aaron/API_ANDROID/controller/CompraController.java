package com.aaron.API_ANDROID.controller;

import com.aaron.API_ANDROID.domain.Compra;
import com.aaron.API_ANDROID.domain.DTO.EntradaDTO;
import com.aaron.API_ANDROID.domain.Entrada;
import com.aaron.API_ANDROID.domain.Tarifa;
import com.aaron.API_ANDROID.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@RestController
public class CompraController {

    @Autowired
    private CompraService compraService;

    @GetMapping(value = "/compras", produces = "application/json")
    public ResponseEntity<Set<Compra>> getCompras(){
        Set<Compra> compras = compraService.findAll();
        return new ResponseEntity<>(compras,HttpStatus.OK);
    }


    @GetMapping(value = "/compras/id", produces = "application/json")
    public ResponseEntity<Set<Compra>> getCompraIdUsuario(@RequestParam("id")int id){
        Set<Compra> compras = compraService.findByUsuario(id);
        return new ResponseEntity<>(compras, HttpStatus.OK);
    }

    @PostMapping(value = "/compra", produces = "application/json")
    public ResponseEntity<Compra> addCompra(@RequestBody ArrayList<EntradaDTO> entradas){
        Compra compra = compraService.addCompra(entradas);
        return new ResponseEntity<>(compra,HttpStatus.CREATED);
    }
}
