/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentahabiente;

/**
 *
 * @author Angel
 */
public class PruebaEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuentahabiente[] lista=new Cuentahabiente[5];
       lista[0]=new Cuentahabiente(112355, "Angel", 51000.00f);
       lista[1]=new Cuentahabiente(212366, "Ana", 45000.00f);
       lista[2]=new Cuentahabiente(312377, "Ernesto", 23000.00f);
       lista[3]=new Cuentahabiente(412388, "Alan", 60000.00f);
       lista[4]=new Cuentahabiente(512399, "Oliver", 12000.00f);
       
       
       
        for (Cuentahabiente cuentahabiente : lista) {
            System.out.println(cuentahabiente.evaluarCliente());
            
        }
        
        
    }
    
}
