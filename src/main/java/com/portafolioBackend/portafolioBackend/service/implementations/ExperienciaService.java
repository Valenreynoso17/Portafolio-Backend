package com.portafolioBackend.portafolioBackend.service.implementations;

import com.portafolioBackend.portafolioBackend.model.Experiencia;
import com.portafolioBackend.portafolioBackend.repository.ExperienciaRepository;
import com.portafolioBackend.portafolioBackend.service.IService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ExperienciaService implements IService<Experiencia> {

    @Autowired
    private ExperienciaRepository experienciaRepository;

    @Override
    public List<Experiencia> getAll() {
        return experienciaRepository.findAll();
    }

    @Override
    public Experiencia save(Experiencia entity) {
        return experienciaRepository.save(entity);
    }

    @Override
    public void deleteById(Integer id) {
        experienciaRepository.deleteById(id);
    }

    @Override
    public Experiencia getById(Integer id) {
        return experienciaRepository.findById(id).orElse(null);
    }

    @Override
    public Experiencia edit(Experiencia entity) {
        return null;
    }
}
