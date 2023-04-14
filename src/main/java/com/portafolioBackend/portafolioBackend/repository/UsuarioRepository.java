package com.portafolioBackend.portafolioBackend.repository;

import com.portafolioBackend.portafolioBackend.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
