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
public class ConjuntoLibro {
    private Libro[] libros;
public ConjuntoLibro(){
    this.libros=new Libro[10];
}
public boolean AñadirLibro(Libro libro){
    for(int i=0;i<10;i++){
        if(this.libros[i]!=null){
        this.libros[i]=libro;
    return true;
    }
    }
    
    return false;
}

public boolean EliminarLibroxTitulo(String titulo){
    
    for(int i=0;i<this.libros.length;i++){
        if(this.libros[i].getTitulo().equals(titulo)&&this.libros[i]!=null){
        this.libros[i]=null;
    return true;
    }
    }
return false;
}

public boolean EliminarLibroxAutor(String nombreAutor,String apellidoAutor){
    
    for(int i=0;i<this.libros.length;i++){
        if(this.libros[i]!=null&&this.libros[i].getAutor().getNombre().equals(nombreAutor)&&this.libros[i].getAutor().getApellido().equals(apellidoAutor)){
        this.libros[i]=null;
    return true;
    }
    }
return false;
}

public Libro buscarMejorCalificado(){
    Libro mejor=null;
    for(int i=0;i<this.libros.length;i++){
        if(i==0){
            mejor=this.libros[i];
        }
   if(this.libros!=null&&this.libros[i].getCalificacion()>mejor.getCalificacion()){
       mejor=this.libros[i];
   }
    }
return mejor;
}

public Libro buscarPeorCalificado(){
    Libro mejor=null;
    for(int i=0;i<this.libros.length;i++){
        if(i==0){
            mejor=this.libros[i];
        }
   if(this.libros!=null&&this.libros[i].getCalificacion()<mejor.getCalificacion()){
       mejor=this.libros[i];
   }
    }
return mejor;
}

    public Libro[] getLibros() {
        return libros;
    }


}
