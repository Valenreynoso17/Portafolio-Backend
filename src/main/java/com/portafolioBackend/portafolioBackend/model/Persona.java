package com.portafolioBackend.portafolioBackend.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "PERSONAS")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String nombre;
    private String situacionActual;
    private String ubicacion;
    private String email;
    private String telefono;
    private String acercaDe;
    private String linkGithub;
    private String linkLinkedIn;
    private String linkInstagram;
    private String fotoPerfil;
    private String fotoPortada;

    @OneToMany
    @JoinColumn(name = "ID_PERSONA", referencedColumnName = "ID")
    private List<Educacion> listaEducacion;

    @OneToMany
    @JoinColumn(name = "ID_PERSONA", referencedColumnName = "ID")
    private List<Proyecto> listaProyectos;

    @OneToMany
    @JoinColumn(name = "ID_PERSONA", referencedColumnName = "ID")
    private List<Experiencia> listaExperiencia;

    @OneToMany
    @JoinColumn(name = "ID_PERSONA", referencedColumnName = "ID")
    private List<Conocimiento> listaConocimiento;
}
