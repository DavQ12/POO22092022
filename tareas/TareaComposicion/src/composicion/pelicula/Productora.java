/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicion.pelicula;

/**
 *
 * @author Angel
 */
public class Productora {
    private String nombre;
    private String ubicacion;

    public Productora() {
    }

    public Productora(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Productora{" + "nombre=" + nombre + ", ubicacion=" + ubicacion + '}';
    }
    
    public void producir(String titulo){
        System.out.println(this.nombre + " esta produciendo la pelicula: " + titulo);
    }
    
}
