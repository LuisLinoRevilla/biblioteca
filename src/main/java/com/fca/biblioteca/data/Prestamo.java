package com.fca.biblioteca.data;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "prestamo")
public class Prestamo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPrestamo")
    private Integer id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "idPersona", referencedColumnName = "idPersona")
    private Persona persona;

    @ManyToOne(optional = false)
    @JoinColumn(name = "idLibro", referencedColumnName = "idLibro")
    private Libro libro;

    @Column(name = "fechaPrestamo", nullable = false)
    private LocalDate fechaPrestamo;

    @Column(name = "diasPrestamo", nullable = false)
    private Integer diasPrestamo;

    // Constructores
    public Prestamo() {
    }

    public Prestamo(Persona persona, Libro libro, LocalDate fechaPrestamo, Integer diasPrestamo) {
        this.persona = persona;
        this.libro = libro;
        this.fechaPrestamo = fechaPrestamo;
        this.diasPrestamo = diasPrestamo;
    }
}