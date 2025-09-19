package com.fca.biblioteca.domain;

import com.fca.biblioteca.data.Libro;
import com.fca.biblioteca.data.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service

public class LibroDomain {
    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> buscarLibrosDisponibles(String titulo, String edicion) {
        if (titulo == null || titulo.isEmpty() || edicion == null || edicion.isEmpty()) {
            return new ArrayList<>();
        }

        Predicate<Libro> filtroLibro = libro ->
                libro != null && /*como el filtro de arriba pero solo ve que libro sea nulo o vacio*/
                        libro.getTitulo().equals(titulo) && libro.getEdicion().equals(edicion); /*va a iterar sobre solo un elemento a la vez*/

        Predicate<Libro> disponible = libro ->
                libro != null &&
                        libro.getExistencias() > 0;


        return libroRepository.findAll()
                .stream() /*sustituye un for*/
                .filter(filtroLibro.and(disponible))
                .collect(Collectors.toList());
    }

    public List<Libro> buscarLibrosNoDisponibles(String titulo, String edicion) {
        if (titulo == null || titulo.isEmpty() || edicion == null || edicion.isEmpty()) {


            Predicate<Libro> filtroLibro = libro ->
                    libro != null && /*como el filtro de arriba pero solo ve que libro sea nulo o vacio*/
                            libro.getTitulo().equals(titulo) && libro.getEdicion().equals(edicion); /*va a iterar sobre solo un elemento a la vez*/


            Predicate<Libro> noDisponible = libro ->
                    libro == null &&
                            libro.getExistencias() > 0;

            return libroRepository.findAll()
                    .stream() /*sustituye un for*/
                    .filter(filtroLibro.and(noDisponible))
                    .collect(Collectors.toList());

        }
        return List.of();
    }
}