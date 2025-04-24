package Examen.src;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LectorDeEmpleados lectorDeEmpleados = new LectorDeEmpleados();
            lectorDeEmpleados.setVisible(true);
        });
    }
}