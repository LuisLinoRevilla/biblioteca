package com.fca.biblioteca.data;

public class AutorLibro {
    private String idAutor;
    private String idLibro;

    public AutorLibro() {}

    public AutorLibro(String idAutor, String idLibro) {
        this.idAutor = idAutor;
        this.idLibro = idLibro;
    }

    public  String getIdAutor() {return idAutor;}
    public void setIdAutor(String idAutor) {this.idAutor = idAutor;}
    public String getIdLibro() {return idLibro;}
    public void setIdLibro(String idLibro) {this.idLibro = idLibro;}

}
