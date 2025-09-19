package com.fca.biblioteca.data;

import jakarta.persistence.*;

@Entity
@Table(name = "profesor")
public class Profesor {
    @Id
    @Column(name = "numeroTrabajador", nullable = false, unique = true)
    private String numeroTrabajador;

}
