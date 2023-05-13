package com.portafolioBackend.portafolioBackend.controller;

import com.portafolioBackend.portafolioBackend.model.Experiencia;
import com.portafolioBackend.portafolioBackend.security.JwtUtil;
import com.portafolioBackend.portafolioBackend.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class ExperienciaController {

    @Autowired
    private IService<Experiencia> experienciaService;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/experiencia/crear")
    public Experiencia crearExperiencia(
            @RequestHeader(value = "Authorization") String token,
            @RequestBody Experiencia experiencia) {

        return experienciaService.save(experiencia);
    }

    @DeleteMapping("/experiencia/eliminar/{idExperiencia}")
    public void eliminarExperiencia(
            @RequestHeader(value = "Authorization") String token,
            @PathVariable int idExperiencia) {

        String usuarioId = jwtUtil.getKey(token);

        // Se puede buscar en la bd si existe
        if(usuarioId != null) {
            experienciaService.deleteById(idExperiencia);
        }
    }

    @PutMapping("/experiencia/editar")
    public void editarExperiencia(
            @RequestHeader(value = "Authorization") String token,
            @RequestBody Experiencia experiencia) {

        String usuarioId = jwtUtil.getKey(token);

        // Se puede buscar en la bd si existe
        if(usuarioId != null) {
            experienciaService.edit(experiencia);
        }
    }
}
