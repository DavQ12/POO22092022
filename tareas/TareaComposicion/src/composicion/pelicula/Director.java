/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicion.pelicula;

/**
 *
 * @author Angel
 */
public class Director {
    private String nombre; 
    private int edad;
    private int peliculasDirigidas;

    public Director() {
    }

    public Director(String nombre, int edad, int peliculasDirigidas) {
        this.nombre = nombre;
        this.edad = edad;
        this.peliculasDirigidas = peliculasDirigidas;
    }

    public int getPeliculasDirigidas() {
        return peliculasDirigidas;
    }

    public void setPeliculasDirigidas(int peliculasDirigidas) {
        this.peliculasDirigidas = peliculasDirigidas;
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
        return "Director{" + "nombre=" + nombre + ", edad=" + edad + ", peliculasDirigidas=" + peliculasDirigidas + '}';
    }


    public void dirigir(String titulo){
        System.out.println(this.nombre + " esta dirigiendo la pelicula: " + titulo);
        
    }
    
    
    
    
}
