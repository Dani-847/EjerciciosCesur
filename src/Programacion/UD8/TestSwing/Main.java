package Programacion.UD8.TestSwing;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Prueba prueba = new Prueba();
            prueba.setVisible(true);
        });
    }
}
