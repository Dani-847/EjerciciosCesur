package Programacion.UD8.pooUD8CasoPractico6;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Adivinar extends JFrame {
    private JPanel panel1;
    private JLabel lblTexto;
    private JTextField tfNumero;
    private JButton btnAdivinar;
    private JButton btnNuevoJuego;
    private JLabel lblIntentos;
    private int intentos;
    private int secreto;
    private Random rand = new Random();

    public Adivinar() {
        setTitle("Juego de adivinar el número secreto");
        setContentPane(panel1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450,150);
        setLocationRelativeTo(null);
        generarSecreto();
        btnAdivinar.addActionListener(e -> {
            try {
                int numero = Integer.parseInt(tfNumero.getText());
                if (numero<1 || numero>100)
                    throw new LimiteNumero("El número debe estar entre 1 y 100");
                intentos++;
                if (numero<secreto){
                    lblTexto.setText("El número "+numero+" es menor que el número secreto");
                    lblIntentos.setText("Intentos: "+intentos);
                } else if (numero>secreto){
                    lblTexto.setText("El número "+numero+" es mayor que el número secreto");
                    lblIntentos.setText("Intentos: "+intentos);
                } else {
                    lblTexto.setText("¡Correcto! Has adivinado el número secreto "+numero+" en "+intentos+" intentos");
                    lblIntentos.setText("Intentos: "+intentos);
                    tfNumero.setEnabled(false);
                    btnAdivinar.setEnabled(false);
                }
            } catch (NumberFormatException ex) {
                lblTexto.setText("Número no válido");
            } catch (LimiteNumero ex) {
                lblTexto.setText(ex.getMessage());
            }
            tfNumero.setText("");
        });

        btnNuevoJuego.addActionListener(e -> {
            intentos=0;
            tfNumero.setEnabled(true);
            btnAdivinar.setEnabled(true);
            lblTexto.setText("Intenta adivinar el número secreto");
            lblIntentos.setText("Intentos: "+intentos);
            generarSecreto();
        });
    }

    private void generarSecreto() {
        secreto = rand.nextInt(100)+1;
    }
}
