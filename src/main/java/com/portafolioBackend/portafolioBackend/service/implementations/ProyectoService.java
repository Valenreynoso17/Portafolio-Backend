package com.portafolioBackend.portafolioBackend.service.implementations;

import com.portafolioBackend.portafolioBackend.model.Proyecto;
import com.portafolioBackend.portafolioBackend.repository.ProyectoRepository;
import com.portafolioBackend.portafolioBackend.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProyectoService implements IService<Proyecto> {

    @Autowired
    private ProyectoRepository proyectoRepository;

    @Override
    public List<Proyecto> getAll() {
        return proyectoRepository.findAll();
    }

    @Override
    public List<Proyecto> getAllByIdPerson(Integer idPersona) {
        return null;
    }

    @Override
    public Proyecto save(Proyecto entity) {
        return proyectoRepository.save(entity);
    }

    @Override
    public void deleteById(Integer id) {
        proyectoRepository.deleteById(id);
    }

    @Override
    public Proyecto getById(Integer id) {
        return proyectoRepository.findById(id).orElse(null);
    }

    @Override
    public Proyecto edit(Proyecto entity) {
        return proyectoRepository.save(entity);
    }
}
