package Programacion.UD8.pooUD8CasoPractico7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

public class Calificaciones extends JFrame {
    private JPanel panel1;
    private JLabel lblTexto;
    private JTextField tfCalificacion;
    private JTextField tfNombre;
    private JButton btnAgregar;
    private JButton btnGuardar;
    private JButton btnCargar;
    private JTextArea txtHCalificaciones;

    private String[] nombres = new String[30];
    private double[] notas = new double[30];
    private int count = 0;

    public Calificaciones() {
        setTitle("Gestión de Calificaciones");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        txtHCalificaciones.setEditable(false);

        add(panel1);

        btnAgregar.addActionListener(e -> agregarNota());

        btnGuardar.addActionListener(e -> guardarNotas());

        btnCargar.addActionListener(e -> cargarNotas());
    }

    private void agregarNota() {
        String nombre = tfNombre.getText().trim();
        String calificacionStr = tfCalificacion.getText().trim();

        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El nombre no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double calificacion;
        try {
            calificacion = Double.parseDouble(calificacionStr);
            if (calificacion < 0 || calificacion > 10) {
                throw new LimiteNota("La calificación debe estar entre 0 y 10.");
            }
        } catch (NumberFormatException | LimiteNota e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        for (int i = 0; i < count; i++) {
            if (nombres[i].equalsIgnoreCase(nombre)) {
                int respuesta = JOptionPane.showConfirmDialog(this, "El estudiante ya existe. ¿Desea modificar la nota?", "Modificar Nota", JOptionPane.YES_NO_OPTION);
                if (respuesta == JOptionPane.YES_OPTION) {
                    notas[i] = calificacion;
                    JOptionPane.showMessageDialog(this, "Nota modificada.");
                }
                actualizarTextoArea();
                return;
            }
        }

        if (count < 30) {
            nombres[count] = nombre;
            notas[count] = calificacion;
            count++;
            JOptionPane.showMessageDialog(this, "Nota agregada.");
        } else {
            JOptionPane.showMessageDialog(this, "No se pueden agregar más estudiantes.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        actualizarTextoArea();
    }

    private void guardarNotas() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/Programacion/UD8/pooUD8CasoPractico7/files/calificaciones.txt"))) {
            for (int i = 0; i < count; i++) {
                writer.write(nombres[i] + " - " + notas[i]);
                writer.newLine();
            }
            JOptionPane.showMessageDialog(this, "Notas guardadas en calificaciones.txt.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al guardar las notas: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void cargarNotas() {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/Programacion/UD8/pooUD8CasoPractico7/files/calificaciones.txt"))) {
                String line;
             count = 0; // Reset count before loading
             txtHCalificaciones.setText(""); // Clear the text area

            while ((line = reader.readLine()) != null && count < 30) {
            String[] parts = line.split(" - ");
            if (parts.length == 2) {
                nombres[count] = parts[0].trim();
                notas[count] = Double.parseDouble(parts[1].trim());
                count++;
            }
        }
        JOptionPane.showMessageDialog(this, "Notas cargadas desde calificaciones.txt.");
        actualizarTextoArea();
    } catch (FileNotFoundException e) {
        JOptionPane.showMessageDialog(this, "El archivo calificaciones.txt no se encontró.", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error al cargar las notas: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Error en el formato de las notas en el archivo.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    private void actualizarTextoArea() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(nombres[i]).append(" - ").append(notas[i]).append("\n");
        }
        txtHCalificaciones.setText(sb.toString());
    }

}