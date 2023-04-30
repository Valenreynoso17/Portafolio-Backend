package com.portafolioBackend.portafolioBackend.controller;

import com.portafolioBackend.portafolioBackend.model.Conocimiento;
import com.portafolioBackend.portafolioBackend.service.IService;
import com.portafolioBackend.portafolioBackend.service.implementations.ConocimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConocimientoController {

    @Autowired
    private IService<Conocimiento> conocimientoService;

    @GetMapping("/knowledge")
    public List<Conocimiento> getListaConocimientosPorIdPersona(Integer idPersona) {
        return conocimientoService.getAllByIdPerson(idPersona);
    }
}
