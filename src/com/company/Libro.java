package com.company;

public class Libro {
    private String titulo;
    private String edicion;
    private String autor;
    private Boolean prestamo;

    public String getTitulo() {
        return titulo;
    }

    public Boolean getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Boolean prestamo) {
        this.prestamo = prestamo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Libro(){

    }

    public Libro(String titulo, String edicion, String autor){
        this.titulo = titulo;
        this.edicion = edicion;
        this.autor = autor;
    }
    public void Prestamo(){
        this.prestamo = true;
    }

    public void Devolucion(){
        this.prestamo = false;
    }

    @Override
    public String toString(){
        return this.titulo + ", " + this.autor + ", " + this.edicion + ".";
    }
}
