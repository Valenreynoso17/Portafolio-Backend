package com.portafolioBackend.portafolioBackend.repository;

import com.portafolioBackend.portafolioBackend.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia, Integer> {
}
