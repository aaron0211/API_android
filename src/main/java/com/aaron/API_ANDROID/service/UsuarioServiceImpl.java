package com.aaron.API_ANDROID.service;

import com.aaron.API_ANDROID.domain.Usuario;
import com.aaron.API_ANDROID.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario getUsuarioLogin(String email, String password) {
        return usuarioRepository.findByEmailAndPassword(email,password);
    }
}
