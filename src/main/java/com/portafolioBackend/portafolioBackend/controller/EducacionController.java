package com.portafolioBackend.portafolioBackend.controller;

import com.portafolioBackend.portafolioBackend.model.Educacion;
import com.portafolioBackend.portafolioBackend.security.JwtUtil;
import com.portafolioBackend.portafolioBackend.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class EducacionController {

    @Autowired
    private IService<Educacion> educacionService;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/educacion/crear")
    public Educacion crearEducacion(
            @RequestHeader(value = "Authorization") String token,
            @RequestBody Educacion educacion) {

        return educacionService.save(educacion);
    }

    @DeleteMapping("/educacion/eliminar/{idEducacion}")
    public void eliminarEducacion(
            @RequestHeader(value = "Authorization") String token,
            @PathVariable int idEducacion) {

        String usuarioId = jwtUtil.getKey(token);

        // Se puede buscar en la bd si existe
        if(usuarioId != null) {
            educacionService.deleteById(idEducacion);
        }
    }

    @PutMapping("/educacion/editar")
    public void editarEducacion(
            @RequestHeader(value = "Authorization") String token,
            @RequestBody Educacion educacion) {

        String usuarioId = jwtUtil.getKey(token);

        // Se puede buscar en la bd si existe
        if(usuarioId != null) {
            educacionService.edit(educacion);
        }
    }
}
