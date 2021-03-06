/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicion.pelicula;

/**
 *
 * @author Angel
 */
public class Actor {
    private String nombre;
    private int edad;
    private int peliculasActuadas;

    public Actor() {
    }

    public Actor(String nombre, int edad, int peliculasActuadas) {
        this.nombre = nombre;
        this.edad = edad;
        this.peliculasActuadas = peliculasActuadas;
    }

    public int getPeliculasActuadas() {
        return peliculasActuadas;
    }

    public void setPeliculasActuadas(int peliculasActuadas) {
        this.peliculasActuadas = peliculasActuadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Actor{" + "nombre=" + nombre + ", edad=" + edad + ", peliculasActuadas=" + peliculasActuadas + '}';
    }
    
    
    public void actuar(String titulo){
        System.out.println(this.nombre + " esta actuando en la pelicula: "+ titulo);
    }
    
    
    
}
