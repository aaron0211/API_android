package com.aaron.API_ANDROID.controller;

import com.aaron.API_ANDROID.domain.Usuario;
import com.aaron.API_ANDROID.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping(value = "/usuario")
    public ResponseEntity<Usuario> getUsuarioLogin(@RequestParam("email")String email, @RequestParam("password")String password){
        Usuario usuario = usuarioService.getUsuarioLogin(email,password);
        return new ResponseEntity<>(usuario, HttpStatus.OK);
    }

    @PostMapping(value = "/usuario")
    public ResponseEntity<Usuario> postUsuario(@RequestBody Usuario usuario){
        Usuario usuario1 = usuarioService.addUsuario(usuario);
        return new ResponseEntity<>(usuario1,HttpStatus.CREATED);
    }
}
