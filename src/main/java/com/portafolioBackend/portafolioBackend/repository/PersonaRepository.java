package com.portafolioBackend.portafolioBackend.repository;

import com.portafolioBackend.portafolioBackend.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer> {
}
