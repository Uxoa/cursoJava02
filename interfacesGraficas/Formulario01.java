package interfacesGraficas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario01  extends JFrame{
    private JTextField nombreField;
    private JTextField documentoField;
    private JTextField paisField;
    
    public Formulario01(){
        setLayout(new GridLayout(4,2));
        
        // Creación de campos de texto para recoger información
        nombreField = new JTextField(20);
        documentoField = new JTextField(20);
        paisField = new JTextField(20);
        
        // Creación de botón para enviar el formulario
        JButton enviarButton = new JButton("Enviar");
        enviarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String nombre = nombreField.getText();
                String documento = documentoField.getText();
                String pais = paisField.getText();
                
                if (nombre.isEmpty() || documento.isEmpty() || pais.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "¡Faltan campos obligatorios por completar!");
                } else {
                    JOptionPane.showMessageDialog(null,
                          "Nombre: " + nombre +
                                "\nDocumento: " + documento +
                                "\nPaís: " + pais);
                }
            }
        });
        
        // Adición de etiquetas y campos de texto al formulario
        add(new JLabel("Nombre:")); add(nombreField);
        add(new JLabel("Documento:")); add(documentoField);
        add(new JLabel("País:")); add(paisField);
        
        // Adición de botón al formulario
        add(enviarButton);
        
        // Configuración de la ventana
        setTitle("Formulario de hotel");
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Formulario01().setVisible(true);
            }
        });
    }
}