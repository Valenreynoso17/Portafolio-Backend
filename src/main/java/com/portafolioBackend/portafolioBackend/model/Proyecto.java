package com.portafolioBackend.portafolioBackend.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "PROYECTOS")
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String nombre;
    private String descripcion;
    private String link;
    @Column(name = "id_persona")
    private int idPersona;
}
