package com.fca.biblioteca.data;

import jakarta.persistence.*;

@Entity
@Table(name = "alumno")
public class Alumno {

    @Id
    @Column(name = "numeroCuenta", nullable = false, unique = true)
    private String numeroDeCuenta;

}
