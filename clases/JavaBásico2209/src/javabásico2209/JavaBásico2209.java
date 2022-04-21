/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabásico2209;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Angel
 */
public class JavaBásico2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad =18;
        System.out.println("Edad = "+edad);
        Integer edad2 = new Integer(18);
        System.out.println(edad2);
        double x = edad2.doubleValue();
        System.out.println(x);
        System.out.println(edad2.shortValue());
        System.out.println("-----------------------------------------");
        //Convertir string a entero.
        String cadena = "99";
        int altura = Integer.parseInt(cadena);//metodo miembro o metodo de clase
        Color c1=Color.BLUE;//atributo miembro o atributo de clase
        
        altura += 1;
        System.out.println("Altura = "+altura);
        
        float y = Float.parseFloat(cadena);
        y+=0.5f;
        System.out.println("Altura = "+y);
        System.out.println("-------------------------");
        
        Arbol tree1 = new Arbol(2.4f, 15);
        System.out.println(tree1);
        
        System.out.println("Troncos de un arbol = "+Arbol.Tronco);
        Arbol.generarOxigeno();
        
        //JOptionPane.showMessageDialog(null, "Hola mundo", "Aqui va el titulo", JOptionPane.ERROR_MESSAGE);
        //String edad5 = JOptionPane.showInputDialog(null, "Dame tu edad", "Introducir datos", JOptionPane.QUESTION_MESSAGE);
        //System.out.println(edad5);
        
        //sin operador ternario
        int edad3 = 18;
        //validar si es mayor de edad
        String resultado="";
        if (edad3<18){
            resultado="Menor de edad";
        }else{
            resultado="Mayor de edad, ten un tequila para la garganta";
        }
        System.out.println(resultado);
        //con operador ternario <cond>? <True> <False>
       int edad4= 18;
       String res="";
       res = edad4 < 18? "Menor de edad" : "Mayor de edad, tequilita";
        System.out.println(res);
        
       //version minima
       int edad5 = 21;
       
        System.out.println(res=edad5 < 18? "Menor de edad 5":"Ya! el tequila");
        
        //comparacion or a nivel de bits
        int val1=1;
        int val2=2;
       
        /*
        val1=000...0001
        or
        val2=000...0010
        resul
        000...0011=3
        */
        System.out.println(val1 & val2);
        
        //desplazamiento a nivel bit
        int val3=1;
        int val4=0;
        val4= val3<<1;//indica cuantas veces se va desplazar el bit
        System.out.println(val4);
        
        
        System.out.println("--------Arreglos-----------");
        int[] edades;//1st se declara
        //2nd es reservarlo, de un tamaño especifico
        edades=new int[5];
        System.out.println(edades);
        edades[0]=10;
        System.out.println("La primer edad es: "+edades[0]);
        //inicializr en una sola linea
        int [] estaturas =new int[5];
        //al igual q en c++ se puede asignar valores
        int [] pesos = {86,99,56,75,77};
        //observamos contenido
        System.out.println(pesos[0]);
        System.out.println(pesos[1]);
        System.out.println(pesos[2]);
        System.out.println(pesos[3]);
        System.out.println(pesos[4]);
        //con ciclo for
        for(int i=0; i<pesos.length; i++){
            
            System.out.println(pesos[i]);
        }
        System.out.println("-----------Inverso----------");
        
        for(int k = pesos.length-1; k>=0; k--){
            
            System.out.println(pesos[k]);
        }
        
        System.out.println("Arreglo de alumnos");
        Alumno[] lista=new Alumno[5];
        lista[0]=new Alumno("9999999", 2, 9.0f);
        lista[1]=new Alumno("9998888", 2, 7.0f);
        lista[2]=new Alumno("9997777", 2, 7.0f);
        lista[3]=new Alumno("9996666", 2, 8.0f);
        lista[4]=new Alumno("9995555", 2, 6.0f);
        
        for (int i = 0; i < lista.length; i++) {
            Alumno alumno = lista[i];
            System.out.println(alumno.evaluarDesempnio());
        }
        
        /*
        for each es un for especial, introducido para
        simplificar los FOR con arreglos.
        
        */
        System.out.println("Ahora con For each");
        for (Alumno alumno : lista) {
            System.out.println(alumno.evaluarDesempnio());
            
        }
        
        
    }
    
}
