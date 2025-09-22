package com.fca.biblioteca.controller;


import com.fca.biblioteca.data.Libro;
import com.fca.biblioteca.data.LibroRepository;
import com.fca.biblioteca.domain.LibroDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class LibroController {

    private LibroDomain libroDomain;
    LibroController(LibroDomain libroDomain) {
        this.libroDomain = libroDomain;
    }

    @RequestMapping(value = "/libros", method = RequestMethod.GET)
    @ResponseBody
    public List<Libro> buscarLibros(@RequestParam String titulo, @RequestParam String edicion) {
        return libroDomain.buscarLibrosDisponibles(titulo, edicion);
    }

    @RequestMapping(value = "/librosNoDisponibles", method = RequestMethod.GET)
    @ResponseBody
    public List<Libro> buscarLibrosNoDisponibles(@RequestParam String titulo, @RequestParam String edicion) {
        return libroDomain.buscarLibrosNoDisponibles(titulo, edicion); // La llamada ha sido corregida aquí
    }

    @RequestMapping(value = "/todosLosLibros", method = RequestMethod.GET)
    @ResponseBody
    public List<Libro> buscarTodosLosLibros() {
        return libroDomain.buscarTodosLosLibros();
    }

}
