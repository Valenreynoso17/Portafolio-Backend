package com.portafolioBackend.portafolioBackend.controller;

import com.portafolioBackend.portafolioBackend.model.Persona;
import com.portafolioBackend.portafolioBackend.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaController {

    @Autowired
    private IService<Persona> personaService;

    @GetMapping("/personas/traer")
    public List<Persona> getPersonas() {
        return personaService.getAll();
    }

    @PostMapping("/personas/crear")
    public String crearPersona(@RequestBody Persona persona) {
        personaService.save(persona);
        return "La persona fue creada correctamente";
    }

    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Integer id) {
        personaService.deleteById(id);
        return "La persona fue eliminada correctamente";
    }

//    @PutMapping("/personas/editar/{id}")
//    public Persona editarPersona(@PathVariable Integer id,
//                                 @RequestParam ("nombre") String nuevoNombre,
//                                 @RequestParam ("apellido") String nuevoApellido,
//                                 @RequestParam ("edad") int nuevaEdad) {
//
//        return personaService.editarPersona(id, nuevoNombre, nuevoApellido, nuevaEdad);
//
//    }
}
