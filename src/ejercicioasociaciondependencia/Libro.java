/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioasociaciondependencia;

/**
 *
 * @author Estudiante
 */
public class Libro {
    private String titulo;
    private int numPaginas;
    private float calificacion;
    private Autor autor;

    public Libro(String titulo, int numPaginas, float calificacion, Autor autor) {
        this.titulo = titulo;
        this.numPaginas = numPaginas;
        this.calificacion = calificacion;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
    
    
    
}
