package com.fca.biblioteca.data;

import jakarta.persistence.*;

@Entity
@Table(name = "libro")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idLibro")
    private Integer id;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    @Column(name = "añoPublicacion")
    private Integer anioPublicacion;

    @Column(name = "editorial")
    private String editorial;

    @Column(name = "edicion")
    private String edicion;

    @Column(name = "isbn", unique = true)
    private String isbn;

    @Column(name = "existencia")
    private Integer existencias;

    // Constructores
    public Libro() {
    }

    public Libro(String titulo, Integer añoPublicacion, String editorial, String edicion, String isbn, Integer existencias) {
        this.titulo = titulo;
        this.anioPublicacion = añoPublicacion;
        this.editorial = editorial;
        this.edicion = edicion;
        this.isbn = isbn;
        this.existencias = existencias;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(Integer añoPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getExistencias() {
        return existencias;
    }

    public void setExistencias(Integer existencias) {
        this.existencias = existencias;
    }
}