/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes;

/**
 *
 * @author Angel
 */
public class Alumno extends Persona{//Hereda atributos y metodos
    private String numeroCuenta;
    private String Carrera;
    private int grupo;

    public Alumno() {
    }

    public Alumno(String numeroCuenta, String Carrera, int grupo) {
        this.numeroCuenta = numeroCuenta;
        this.Carrera = Carrera;
        this.grupo = grupo;
    }

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    @Override
    public String toString() {
        return super.toString() + "Alumno{" + "numeroCuenta=" + numeroCuenta + ", Carrera=" + Carrera + ", grupo=" + grupo + '}';
    }
    
    
}
