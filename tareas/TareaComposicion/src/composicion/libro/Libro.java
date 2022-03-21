/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicion.libro;

/**
 *
 * @author Angel
 */
public class Libro {
    String color;
    String titulo;
    int anoPublicacion;
    Autor autor;
    Editorial editorial;

    public Libro() {
    }

    public Libro(String color, String titulo, int anoPublicacion, Autor autor, Editorial editorial) {
        this.color = color;
        this.titulo = titulo;
        this.anoPublicacion = anoPublicacion;
        this.autor = autor;
        this.editorial = editorial;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" + "color=" + color + ", titulo=" + titulo + ", anoPublicacion=" + anoPublicacion + ", autor=" + autor + ", editorial=" + editorial + '}';
    }
   
    
    
    
}
