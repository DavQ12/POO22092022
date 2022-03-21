/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareacomposicion;

import composicion.libro.Autor;
import composicion.libro.Editorial;
import composicion.libro.Libro;
import composicion.pelicula.Actor;
import composicion.pelicula.Director;
import composicion.pelicula.Pelicula;
import composicion.pelicula.Productora;

/**
 *
 * @author Angel
 */
public class TareaComposicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Libro miLibro = new Libro();
        miLibro.setColor(" Amarillo");
        miLibro.setAnoPublicacion(2019);
        miLibro.setTitulo(" Drácula");
        miLibro.setAutor(new Autor(" Bram Stoker ", (int)30, " Británico "));
        miLibro.setEditorial(new Editorial(" Lectorum ", (int)55813202, " Col. Leyes de reforma "));
        System.out.println(miLibro);
        
        
        
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Real Steel");
        miPelicula.setAnoEstreno(2011);
        miPelicula.setDirector(new Director(" Shawn Levy ", (int)53, (int)17));
        miPelicula.setActor(new Actor(" Hugh Jackman ", (int)53, (int)23));
        miPelicula.setProductora(new Productora(" DreamWorks ", " Glendale, California "));
        System.out.println(miPelicula);
                
    }
    
}
