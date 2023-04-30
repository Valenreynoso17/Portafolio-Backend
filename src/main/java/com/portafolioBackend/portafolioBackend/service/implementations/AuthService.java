package com.portafolioBackend.portafolioBackend.service.implementations;

import com.portafolioBackend.portafolioBackend.model.Usuario;
import com.portafolioBackend.portafolioBackend.repository.UsuarioRepository;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2d);

    public Usuario verificarCredenciales(Usuario usuario) {

        Usuario usuarioEnBD = usuarioRepository.getUsuariosPorEmail(usuario.getEmail());

        if(usuarioEnBD != null && argon2.verify(usuarioEnBD.getPassword(), usuario.getPassword())) {
            return usuarioEnBD;
        }

        return null;
    }

    public void registrarUsuario(Usuario usuario) {
        String hash = argon2.hash(1, 1024, 1, usuario.getPassword());

        usuario.setPassword(hash);

        usuarioRepository.save(usuario);
    }
}
