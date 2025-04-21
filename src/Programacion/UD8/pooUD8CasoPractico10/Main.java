package Programacion.UD8.pooUD8CasoPractico10;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Contactos c = new Contactos();
            c.setVisible(true);
        });
    }
}
