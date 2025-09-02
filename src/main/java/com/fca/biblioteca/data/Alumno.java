package com.fca.biblioteca.data;

import jakarta.persistence.*;

@Entity
@Table(name = "alumno")
@PrimaryKeyJoinColumn(name = "idPersona") // La PK de alumno es también la FK a persona
public class Alumno extends Persona {

    @Column(name = "numeroCuenta", nullable = false, unique = true)
    private String numeroDeCuenta;

}
