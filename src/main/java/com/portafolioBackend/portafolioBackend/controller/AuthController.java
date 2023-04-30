package com.portafolioBackend.portafolioBackend.controller;

import com.portafolioBackend.portafolioBackend.model.Usuario;
import com.portafolioBackend.portafolioBackend.security.JwtUtil;
import com.portafolioBackend.portafolioBackend.service.implementations.AuthService;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class AuthController {

    @Autowired
    private AuthService authService;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/autenticar")
    public String loginUser(@RequestBody Usuario usuario) {

        Usuario usuarioLogueado = authService.verificarCredenciales(usuario);
        if(usuarioLogueado != null) {
           return jwtUtil.create(String.valueOf(usuarioLogueado.getId()), usuarioLogueado.getEmail());
        }
        return "FAIL";
    }

    @PostMapping("/registrar")
    public void registerUser(@RequestBody Usuario usuario) {

        authService.registrarUsuario(usuario);
    }
}
