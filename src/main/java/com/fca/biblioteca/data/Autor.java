package com.fca.biblioteca.data;

public class Autor {
    private String id;
    private String nombre;

    // Constructores
    public Autor() {}

    public Autor(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    // Getters y setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    @Override
    public String toString() {
        return "Autor{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}