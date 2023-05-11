package com.portafolioBackend.portafolioBackend.controller;

import com.portafolioBackend.portafolioBackend.model.Conocimiento;
import com.portafolioBackend.portafolioBackend.security.JwtUtil;
import com.portafolioBackend.portafolioBackend.service.IService;
import com.portafolioBackend.portafolioBackend.service.implementations.ConocimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class ConocimientoController {

    @Autowired
    private IService<Conocimiento> conocimientoService;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/conocimiento/crear")
    public Conocimiento crearConocimiento(
            @RequestHeader(value = "Authorization") String token,
            @RequestBody Conocimiento conocimiento) {

        return conocimientoService.save(conocimiento);
    }

    @DeleteMapping("/conocimiento/eliminar/{idConocimiento}")
    public void eliminarConocimiento(
            @RequestHeader(value = "Authorization") String token,
            @PathVariable int idConocimiento) {

        String usuarioId = jwtUtil.getKey(token);

        // Se puede buscar en la bd si existe
        if(usuarioId != null) {
            conocimientoService.deleteById(idConocimiento);
        }
    }

    @PutMapping("/conocimiento/editar")
    public void editarConocimiento(
            @RequestHeader(value = "Authorization") String token,
            @RequestBody Conocimiento conocimiento) {

        String usuarioId = jwtUtil.getKey(token);

        // Se puede buscar en la bd si existe
        if(usuarioId != null) {
            conocimientoService.edit(conocimiento);
        }
    }
}
