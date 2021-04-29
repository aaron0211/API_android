package com.aaron.API_ANDROID.service;

import com.aaron.API_ANDROID.domain.Usuario;

public interface UsuarioService {

    Usuario getUsuarioLogin(String email, String password);
}
