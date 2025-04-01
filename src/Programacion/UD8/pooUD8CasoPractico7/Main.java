package Programacion.UD8.pooUD8CasoPractico7;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Calificaciones calificaciones = new Calificaciones();
            calificaciones.setVisible(true);
        });
    }
}
