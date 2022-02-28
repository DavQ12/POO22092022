/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TareaLibro;

/**
 *
 * @author Angel
 */
//Atributos
public class Libro {
    private String color;
    private String tamano;
    private String forma;
    private int paginas;
    private int AñoPublicacion;
    private String posicion;
    private String titulo;

    public Libro() {
    }

    public Libro(String color, String tamano, String forma, int paginas, int AñoPublicacion, String posicion, String titulo) {
        this.color = color;
        this.tamano = tamano;
        this.forma = forma;
        this.paginas = paginas;
        this.AñoPublicacion = AñoPublicacion;
        this.posicion = posicion;
        this.titulo = titulo;
    }

    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getAñoPublicacion() {
        return AñoPublicacion;
    }

    public void setAñoPublicacion(int AñoPublicacion) {
        this.AñoPublicacion = AñoPublicacion;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    //Metodos
    public void Leer(){
        System.out.println("Leyendo el libro "+ this.titulo);
    }
    
    public void Agarrar(){
        System.out.println("Agarrando el libro "+ this.titulo);
    }
    
    public void Abrir(int pagina){
        System.out.println("Abriendo el libro "+ this.titulo +" en la pagina "+ pagina);
    }
    
}
