package com.portafolioBackend.portafolioBackend.repository;

import com.portafolioBackend.portafolioBackend.model.Conocimiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConocimientoRepository extends JpaRepository<Conocimiento, Integer> {
}
