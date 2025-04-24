package Programacion.Examenes.ExamenMarco;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LectorDeProductos lectorDeProductos = new LectorDeProductos();
            lectorDeProductos.setVisible(true);
        });
    }
}
