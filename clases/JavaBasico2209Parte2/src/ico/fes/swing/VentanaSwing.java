/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.swing;

import ico.fes.herencia.Persona;
import ico.fes.modelo.ModeloPersonaCombo;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Angel
 */
public class VentanaSwing extends JFrame{
    private JTextField cuadro;
    private JButton boton;
    private JLabel resultado;
    private JComboBox<Persona> lista;
    private ModeloPersonaCombo modelo;
    private JTextArea texto;

    public VentanaSwing() throws HeadlessException {
        setTitle("Conversión de °C a °F");
        setSize(400, 300);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        //crear los componentes
        cuadro=new JTextField(5);
        
        ImageIcon icono=new ImageIcon(System.getProperty("user.dir")+"\\src\\ico\\fes\\swing\\carro.png");
        boton=new JButton(icono);
        boton.setBackground(Color.RED);
        boton.setOpaque(true);
        boton.setToolTipText("Click para convertir en °F");
        resultado=new JLabel("°F");
        lista=new JComboBox<>();
        texto=new JTextArea(5, 20);
        /*
        lista.addItem("Ingeniería");
        lista.addItem("Derecho");
        lista.addItem("Periodimismo");
        lista.addItem("Arquitectura");
        */
        modelo=new ModeloPersonaCombo();
        modelo.consultarBaseDeDatos();
        lista.setModel(modelo);
        
        //añadir los componentes a la ventana
        this.getContentPane().add(cuadro);
        this.getContentPane().add(boton);
        this.getContentPane().add(resultado);
        this.getContentPane().add(lista);
        this.getContentPane().add(texto);
        this.validate();
        this.setVisible(true);
        /*
        Cerrar ventana
        1. window listener ctrl+espacio
        2. new window adapter doble enter
        3. ctrl espacio(borrar el exceso) para override
        y agregar system
        */
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }          
        });
        
        this.lista.addItemListener(new ItemAdapter() {
            @Override
            public void itemStateChanged(ItemEvent ie) {
                System.out.println("Evento..."+ie.getItem());
                texto.setText(ie.getItem()+"\n");
            }
            
        });
        
        this.boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                float gradosFarenheit=0.0f;
                float celsius=0.0f;
                try {
                    celsius=Float.parseFloat(cuadro.getText());
                    gradosFarenheit=(celsius*(9.0f/5.0f))+32.0f;
                    resultado.setText(gradosFarenheit+" °F");
                          
                } catch (NumberFormatException ex) {
                    System.out.println(ex.toString());
                    JOptionPane.showMessageDialog(null, "Intorduce un valor correcto", "Error de captura", JOptionPane.ERROR_MESSAGE);
                }

            }
            
        });
        
    }
     
    
}
