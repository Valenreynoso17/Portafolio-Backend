package com.portafolioBackend.portafolioBackend.controller;

import com.portafolioBackend.portafolioBackend.model.Persona;
import com.portafolioBackend.portafolioBackend.security.JwtUtil;
import com.portafolioBackend.portafolioBackend.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class PersonaController {

    @Autowired
    private IService<Persona> personaService;

    @Autowired
    private JwtUtil jwtUtil;

    @GetMapping("/")
    public Persona getPersonaPrincipal() {
        return personaService.getById(1);
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

    @PutMapping("/persona/editar")
    public void editarPersona(
            @RequestHeader(value = "Authorization") String token,
            @RequestBody Persona persona) {

        String usuarioId = jwtUtil.getKey(token);

        // Se puede buscar en la bd si existe
        if(usuarioId != null) {
            personaService.save(persona);
        }

    }
}
