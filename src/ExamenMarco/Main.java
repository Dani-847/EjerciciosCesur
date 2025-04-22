package ExamenMarco;

import Programacion.UD8.pooUD8CasoPractico10.Contactos;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LectorDeProductos lectorDeProductos = new LectorDeProductos();
            lectorDeProductos.setVisible(true);
        });
    }
}
