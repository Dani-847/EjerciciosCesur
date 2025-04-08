package Programacion.UD8.pooUD8CasoPractico10;

import javax.swing.*;
import java.io.*;

public class ListaDeContactos extends JFrame {
    private JPanel panel1;
    private JButton btnNuevoContacto;
    private JButton btnCargarContactos;
    private JButton btnGuardarContactos;
    private JTextField tfNombre;
    private JTextField tfTelefono;
    private JTextField tfEmail;
    private JComboBox<String> cbCategoria;
    private JTextArea taArchivo;

    private Contacto[] listaContactos = new Contacto[30];
    private int contadorContactos = 0;

    public ListaDeContactos() {
        setTitle("Lista de Contactos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 550);
        setLocationRelativeTo(null);
        setContentPane(panel1);
        taArchivo.setEditable(false);
        cbCategoria.addItem("");
        cbCategoria.addItem("Familia");
        cbCategoria.addItem("Amigos");
        cbCategoria.addItem("Trabajo");
        cbCategoria.addItem("Otros");

        btnNuevoContacto.addActionListener(e -> crearContacto());
        btnCargarContactos.addActionListener(e -> cargarContactos());
        btnGuardarContactos.addActionListener(e -> guardarContactos());
        mostrarMensajeInicial();
    }

    private void crearContacto() {
        String nombre = tfNombre.getText();
        String telefono = tfTelefono.getText();
        String email = tfEmail.getText();
        String categoria = (String) cbCategoria.getSelectedItem();

        if (nombre.isEmpty() || telefono.isEmpty() || email.isEmpty() || categoria.isEmpty() || categoria.equals("")) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos y seleccione una categoría válida.", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (contadorContactos < 30) {
            Contacto nuevoContacto = new Contacto(nombre, telefono, email, categoria);
            listaContactos[contadorContactos] = nuevoContacto;
            contadorContactos++;
            taArchivo.append(nuevoContacto.toString() + "\n");
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(this, "No se pueden agregar más de 30 contactos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void cargarContactos() {
        limpiarTF();
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\DanielRodriguezKarcz\\IdeaProjects\\EjerciciosCesur\\src\\Programacion\\UD8\\pooUD8CasoPractico10\\files\\contactos.csv"))) {
            String linea;
            while ((linea = br.readLine()) != null && contadorContactos < 30) {
                String[] datos = linea.split(",");
                if (datos.length == 4) {
                    Contacto contacto = new Contacto(datos[0], datos[1], datos[2], datos[3]);
                    listaContactos[contadorContactos] = contacto;
                    contadorContactos++;
                    taArchivo.append(contacto.toString() + "\n");
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar el archivo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void guardarContactos() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\DanielRodriguezKarcz\\IdeaProjects\\EjerciciosCesur\\src\\Programacion\\UD8\\pooUD8CasoPractico10\\files\\contactos.csv"))) {
            for (int i = 0; i < contadorContactos; i++) {
                Contacto contacto = listaContactos[i];
                bw.write(contacto.getNombre() + "," + contacto.getTelefono() + "," + contacto.getEmail() + "," + contacto.getCategoria());
                bw.newLine();
            }
            JOptionPane.showMessageDialog(this, "Contactos guardados correctamente en contactos.csv", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al guardar el archivo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void mostrarMensajeInicial() {
        JOptionPane.showMessageDialog(this, "Para cargar los datos, pulse sobre el botón 'Cargar contactos'.", "Información", JOptionPane.INFORMATION_MESSAGE);
    }

    private void limpiarTF() {
        taArchivo.setText("");
    }

    private void limpiarCampos() {
        tfNombre.setText("");
        tfTelefono.setText("");
        tfEmail.setText("");
        cbCategoria.setSelectedIndex(0);
    }
}