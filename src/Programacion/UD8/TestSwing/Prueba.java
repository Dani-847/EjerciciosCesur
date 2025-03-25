package Programacion.UD8.TestSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Prueba extends JFrame{
    private JPanel panel1;
    private JLabel lblTexto;
    private JButton btnLimpiar;
    private JButton btnEscribir;
    private JButton btnAutor;

    public Prueba(){
        setTitle("Control de eventos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel1);
        setLocationRelativeTo(null);
        setSize(350, 250);

        btnLimpiar.addActionListener(e -> {
            acciones(e);
        });

        btnEscribir.addActionListener(e -> {
            acciones(e);
        });

        btnAutor.addActionListener(e -> {
            acciones(e);
        });
    }

    private void acciones(ActionEvent e){
        if(e.getSource() == btnLimpiar){
            lblTexto.setText("");
            setSize(350, 250);
        }else if(e.getSource() == btnEscribir){
            lblTexto.setText("Hola mundo!!!!!");
            setSize(350, 250);
        }else if(e.getSource() == btnAutor){
            lblTexto.setText("Daniel R. K.");
            setSize(350, 250);
        }
    }
}
