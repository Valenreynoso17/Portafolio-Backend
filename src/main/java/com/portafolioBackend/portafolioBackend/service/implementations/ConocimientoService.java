package com.portafolioBackend.portafolioBackend.service.implementations;

import com.portafolioBackend.portafolioBackend.model.Conocimiento;
import com.portafolioBackend.portafolioBackend.repository.ConocimientoRepository;
import com.portafolioBackend.portafolioBackend.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConocimientoService implements IService<Conocimiento> {

    @Autowired
    private ConocimientoRepository conocimientoRepository;

    @Override
    public List<Conocimiento> getAll() {
        return conocimientoRepository.findAll();
    }

    @Override
    public Conocimiento save(Conocimiento entity) {
        return conocimientoRepository.save(entity);
    }

    @Override
    public void deleteById(Integer id) {
        conocimientoRepository.deleteById(id);
    }

    @Override
    public Conocimiento getById(Integer id) {
        return conocimientoRepository.findById(id).orElse(null);
    }

    @Override
    public Conocimiento edit(Conocimiento entity) {
        return null;
    }
}
