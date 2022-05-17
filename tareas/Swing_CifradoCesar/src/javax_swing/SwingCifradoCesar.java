/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javax_swing;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Angel
 */
public class SwingCifradoCesar extends JFrame{
    private JTextField cuadroL;
    private JTextField cuadroN;
    private JButton boton;
    private JLabel salida;

    public SwingCifradoCesar() throws HeadlessException {
        setTitle("Cifrado César");
        setSize(500, 400);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        //crear componentes
        cuadroL=new JTextField(5);
        cuadroL.setToolTipText("Ingrese el texto a cifrar");
        cuadroN = new JTextField(5);
        cuadroN.setToolTipText("Ingrese el numero a desplazarse");
        boton=new JButton("Cifrar");
        boton.setToolTipText("Click para cifrar u codigo :)");
        salida=new JLabel("Su codigo cifrado es: ");
        //añadir
        this.getContentPane().add(cuadroL);
        this.getContentPane().add(cuadroN);
        this.getContentPane().add(boton);
        this.getContentPane().add(salida);
        this.validate();
        this.setVisible(true);
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
        this.boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String lMay="ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
                String texto="";
                String res="";
                int desplazamiento=0;
                
 
                try {
                    desplazamiento=Integer.parseInt(cuadroN.getText());
                    texto=cuadroL.getText().toUpperCase();
                   
                    char carac;
                    for (int i = 0; i < texto.length(); i++) {
                         carac=texto.charAt(i);
                         
                         int pos=lMay.indexOf(carac);
                         
                         if(pos==-1){
                             res+=carac;
                             
                         }else{
                             
                             res+=lMay.charAt((pos+desplazamiento)% lMay.length());
                             salida.setText("Su codigo cifrado es: "+res);
                         }
                         
                    }
                     
                } catch(NumberFormatException ex){
                    System.out.println(ex.toString());
                    JOptionPane.showMessageDialog(null, "Intorduce un valor correcto", "Error de captura", JOptionPane.ERROR_MESSAGE);
                }
      
            }
            
        });
        
        
        
    }
    
    
    
    
}
