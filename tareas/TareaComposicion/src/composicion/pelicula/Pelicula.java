/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicion.pelicula;

/**
 *
 * @author Angel
 */
public class Pelicula {
    private String nombre;
    private int anoEstreno;
    private Director director;
    private Actor actor;
    private Productora productora;

    public Pelicula() {
    }

    public Pelicula(String nombre, int anoEstreno, Director director, Actor actor, Productora productora) {
        this.nombre = nombre;
        this.anoEstreno = anoEstreno;
        this.director = director;
        this.actor = actor;
        this.productora = productora;
    }

    public Productora getProductora() {
        return productora;
    }

    public void setProductora(Productora productora) {
        this.productora = productora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnoEstreno() {
        return anoEstreno;
    }

    public void setAnoEstreno(int anoEstreno) {
        this.anoEstreno = anoEstreno;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nombre=" + nombre + ", anoEstreno=" + anoEstreno + ", director=" + director + ", actor=" + actor + ", productora=" + productora + '}';
    }
    
    
    
    
}
