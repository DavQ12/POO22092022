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
        String edad5 = JOptionPane.showInputDialog(null, "Dame tu edad", "Introducir datos", JOptionPane.QUESTION_MESSAGE);
        System.out.println(edad5);
    }
    
}
