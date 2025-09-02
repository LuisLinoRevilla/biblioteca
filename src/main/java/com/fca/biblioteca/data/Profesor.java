package com.fca.biblioteca.data;

import jakarta.persistence.*;

@Entity
@Table(name = "profesor")
@PrimaryKeyJoinColumn(name = "idPersona") // Hereda PK de Persona
public class Profesor extends Persona {

    @Column(name = "numeroTrabajador", nullable = false, unique = true)
    private String numeroTrabajador;

}
