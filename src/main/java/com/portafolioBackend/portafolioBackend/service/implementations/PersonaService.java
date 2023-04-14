package com.portafolioBackend.portafolioBackend.service.implementations;

import com.portafolioBackend.portafolioBackend.model.Persona;
import com.portafolioBackend.portafolioBackend.repository.PersonaRepository;
import com.portafolioBackend.portafolioBackend.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class PersonaService implements IService<Persona> {

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public List<Persona> getAll() {
        return personaRepository.findAll();
    }

    @Override
    public Persona save(Persona entity) {
        return personaRepository.save(entity);
    }

    @Override
    public void deleteById(Integer id) {
        personaRepository.deleteById(id);
    }

    @Override
    public Persona getById(Integer id) {
        return personaRepository.findById(id).orElse(null);
    }

    @Override
    public Persona edit(Persona entity) {
        return null;
    }

//    public Persona editarPersona(Integer id, String nuevoNombre, String nuevoApellido, int nuevaEdad) {
//
//        Persona persona = getById(id);
//
//        persona.set
//    }
}
