package com.fca.biblioteca.data;

import jakarta.persistence.*;

@Entity
@Table(name = "autorLibro")
public class AutorLibro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAutorLibro")
    private Integer id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "idAutor", referencedColumnName = "idAutor")
    private Autor autor;

    @ManyToOne(optional = false)
    @JoinColumn(name = "idLibro", referencedColumnName = "idLibro")
    private Libro libro;

    // Constructores
    public AutorLibro() {
    }

    public AutorLibro(Autor autor, Libro libro) {
        this.autor = autor;
        this.libro = libro;
    }
}