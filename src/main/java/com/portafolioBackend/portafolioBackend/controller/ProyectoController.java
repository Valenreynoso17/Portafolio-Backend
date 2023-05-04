package com.portafolioBackend.portafolioBackend.controller;

import com.portafolioBackend.portafolioBackend.model.Proyecto;
import com.portafolioBackend.portafolioBackend.security.JwtUtil;
import com.portafolioBackend.portafolioBackend.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class ProyectoController {

    @Autowired
    private IService<Proyecto> proyectoService;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/proyecto/crear")
    public Proyecto crearProyecto(
            @RequestHeader(value = "Authorization") String token,
            @RequestBody Proyecto proyecto) {

        return proyectoService.save(proyecto);
    }

    @DeleteMapping("/proyecto/eliminar/{idProyecto}")
    public void eliminarProyecto(
            @RequestHeader(value = "Authorization") String token,
            @PathVariable int idProyecto) {

        String usuarioId = jwtUtil.getKey(token);

        // Se puede buscar en la bd si existe
        if(usuarioId != null) {
            proyectoService.deleteById(idProyecto);
        }
    }

    @PutMapping("/proyecto/editar")
    public void editarProyecto(
            @RequestHeader(value = "Authorization") String token,
            @RequestBody Proyecto proyecto) {

        String usuarioId = jwtUtil.getKey(token);

        // Se puede buscar en la bd si existe
        if(usuarioId != null) {
            proyectoService.edit(proyecto);
        }
    }
}
