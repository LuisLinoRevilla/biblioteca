package com.fca.biblioteca.data;

public class PestamoPresentation {

    // Métodos de presentación para el módulo de restamos/préstamos
    public void mostrarMenuPrestamos() {
        System.out.println("Mostrando menú de préstamos...");
    }

    public void mostrarInformacionPrestamo(Prestamo prestamo) {
        System.out.println("Mostrando información del préstamo: " + prestamo);
    }
}