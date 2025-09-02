package com.fca.biblioteca.controller;


import ch.qos.logback.core.model.Model;
import com.fca.biblioteca.data.Libro;
import com.fca.biblioteca.data.LibroRepository;
import com.fca.biblioteca.domain.LibroDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class LibroController {

    @Autowired
    private LibroDomain libroDomain;

    @RequestMapping(value = "/Libros", method = RequestMethod.GET)
    public List<Libro> buscarLibros(@RequestParam String titulo, @RequestParam String edicion) {
        return libroDomain.buscarLibros(titulo, edicion);
    }

}
