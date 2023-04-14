package com.portafolioBackend.portafolioBackend.service.implementations;

import com.portafolioBackend.portafolioBackend.model.Educacion;
import com.portafolioBackend.portafolioBackend.repository.EducacionRepository;
import com.portafolioBackend.portafolioBackend.service.IService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EducacionService implements IService<Educacion> {

    @Autowired
    private EducacionRepository educacionRepository;

    @Override
    public List<Educacion> getAll() {
        return educacionRepository.findAll();
    }

    @Override
    public Educacion save(Educacion entity) {
        return educacionRepository.save(entity);
    }

    @Override
    public void deleteById(Integer id) {
        educacionRepository.deleteById(id);
    }

    @Override
    public Educacion getById(Integer id) {
        return educacionRepository.findById(id).orElse(null);
    }

    @Override
    public Educacion edit(Educacion entity) {
        return null;
    }
}
