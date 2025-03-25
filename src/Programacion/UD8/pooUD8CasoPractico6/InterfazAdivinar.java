package Programacion.UD8.pooUD8CasoPractico6;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class InterfazAdivinar extends JFrame{
    private JTextArea txtTitle;
    private JTextArea txtPregunta;
    private JTextField txfNumero;
    private JButton btnAdivinar;
    private JTextArea txtIntentos;
    private JButton btnNuevoJuego;
    private JPanel interfaz;

    private int numeroAleatorio = (int)(Math.random()*100);
    private int intentos = 0;

    public InterfazAdivinar(){
        setTitle("Adivina el número");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(interfaz);
        setLocationRelativeTo(null);
        setSize(350, 250);

        btnAdivinar.addActionListener(e -> {
            acciones(e);
        });

        btnNuevoJuego.addActionListener(e -> {
            reiniciarJuego(e);
        });
    }

    private void reiniciarJuego(ActionEvent e){
        numeroAleatorio = (int)(Math.random()*100);
        txtIntentos.setText("");
        txtPregunta.setText("");
        txfNumero.setText("");
    }

}
