package com.portafolioBackend.portafolioBackend.service.implementations;

import com.portafolioBackend.portafolioBackend.model.Usuario;
import com.portafolioBackend.portafolioBackend.model.Usuario;
import com.portafolioBackend.portafolioBackend.repository.UsuarioRepository;
import com.portafolioBackend.portafolioBackend.service.IService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UsuarioService implements IService<Usuario> {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> getAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario save(Usuario entity) {
        return usuarioRepository.save(entity);
    }

    @Override
    public void deleteById(Integer id) {
        usuarioRepository.deleteById(id);
    }

    @Override
    public Usuario getById(Integer id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    @Override
    public Usuario edit(Usuario entity) {
        return null;
    }
}
