/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicion.libro;

/**
 *
 * @author Angel
 */
public class Editorial {
    private String nombre;
    private int telefono;
    private String direccion;

    public Editorial() {
    }

    public Editorial(String nombre, int telefono, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion + '}';
    }
    
    public void publicar(String titulo){
        System.out.println(this.nombre + " esta publicando el libro: " + titulo);
    }
    
}
