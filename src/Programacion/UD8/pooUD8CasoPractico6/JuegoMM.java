package Programacion.UD8.pooUD8CasoPractico6;

import javax.swing.*;

public class JuegoMM {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            InterfazAdivinar interfazAdivinar = new InterfazAdivinar();
            interfazAdivinar.setVisible(true);
        });
    }
}
