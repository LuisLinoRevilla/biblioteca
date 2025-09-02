package com.fca.biblioteca.data;

import jakarta.persistence.*;

@Entity
@Table(name = "autor")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAutor")
    private Integer id;

    @OneToOne(optional = false)
    @JoinColumn(name = "idPersona", referencedColumnName = "idPersona", unique = true)
    private Persona persona;

}