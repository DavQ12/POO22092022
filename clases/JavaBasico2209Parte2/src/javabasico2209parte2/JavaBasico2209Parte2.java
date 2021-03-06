/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico2209parte2;

import ico.fes.Aritmetica;
import ico.fes.Circulo;
import ico.fes.Cuadrado;
import ico.fes.herencia.EstudianteDeportistaArtista;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class JavaBasico2209Parte2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Excepciones
        */
        ArrayList<String> nombres= new ArrayList<String>();
        nombres.add("Alma");
        nombres.add("Bartolo");
        nombres.add("Carlos");
        nombres.add("Diana");
        nombres.add("Ernesto");
        
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
        
        System.out.println("-----------------------");
        Scanner teclado = new Scanner(System.in);
       
        int seleccion=0;
        
        String elNombre="";
        try {
            seleccion = teclado.nextInt();
            elNombre=nombres.get(seleccion);
        } catch(InputMismatchException ie){
            System.out.println("Debe teclear valores numéricos");
        }catch(IndexOutOfBoundsException ioe){
            System.out.println("Error, debe ser entre 0 y 4");
            elNombre=nombres.get(0);
        }
        catch (Exception e) {
            System.out.println("Generica");
            elNombre=nombres.get(1);
            
        }finally{
            System.out.println(elNombre);
            //elNombre=null;//limpieza
        }
                
        
        //System.out.println(nombres.get(seleccion));//incorrecto, no hay 10 elem
        
        System.out.println("Continua el programa...");
        
        Aritmetica cal=new Aritmetica(2, 0);
        System.out.println(cal.getA()+"+"+cal.getB()+"="+cal.sumar());
        
        try {
            System.out.println(cal.getA()+"/"+cal.getB()+"="+cal.dividir());
        } catch (Exception e) {
            System.out.println("Error de aritmética");
        } 
        System.out.println("Fin del programa");
        
        
        System.out.println("------------------HASTA AQUÏ-------------------------");
        Cuadrado cuad=new Cuadrado(3.0f);
        Circulo cir=new Circulo(4.0f);
        
        System.out.println("El area del cuadrado es: "+cuad.calcularArea());
        System.out.println("El area del circulo es: "+cir.calcularArea());
        
        System.out.println("---------------------------------------");
        EstudianteDeportistaArtista eda=new EstudianteDeportistaArtista();
        eda.setNombre("Angel");
        eda.setCarrera("ICO");
        eda.setDisciplinaDeportiva("Futbol");
        eda.setGeneroArtistico("Fotografía, estampa, dibujo");
        eda.ensayar();
        eda.comer();
        eda.entrenar();
                
                
    }
    
}
