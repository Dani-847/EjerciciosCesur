package Programacion.UD8.pooUD8CasoPractico8;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;

public class Editor extends JFrame {
    private JPanel panel1;
    private JTextArea areaTexto;

    public Editor() {
        setTitle("Bloc de notas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450,350);
        setLocationRelativeTo(null);
        setContentPane(panel1);

        UIManager.put("FileChooser.saveButtonText", "Guardar");
        UIManager.put("FileChooser.saveButtonToolTipText", "Guardar el archivo seleccionado");
        UIManager.put("FileChooser.cancelButtonText", "Cancelar");
        UIManager.put("FileChooser.cancelButtonToolTipText", "Cancelar");
        UIManager.put("FileChooser.newFolderButtonToolTipText", "Nueva carpeta");

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Archivo");
        JMenuItem abrir = new JMenuItem("Abrir");
        JMenuItem guardar = new JMenuItem("Guardar");
        JMenuItem salir = new JMenuItem("Salir");
        menu.add(abrir);
        menu.add(guardar);
        menu.addSeparator();
        menu.add(salir);
        menuBar.add(menu);
        setJMenuBar(menuBar);
        abrir.addActionListener(e-> abrirArchivo() );
        guardar.addActionListener( e-> guardarArchivo());
        salir.addActionListener( e-> System.exit(0));
    }

    private void guardarArchivo() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Guardar archivo");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos txt", "txt"));
        int opcion = fileChooser.showSaveDialog(this);
        if (opcion == JFileChooser.APPROVE_OPTION) {
            File archivo = fileChooser.getSelectedFile();
            PrintWriter pw = null;
            try{
                pw=new PrintWriter(archivo);
                areaTexto.write(pw);
            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(panel1,"Archivo no encontrado");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(panel1,"Error al escribir el archivo");
            } finally {
                if (pw != null)
                    pw.close();
            }
        }
    }

    private void abrirArchivo() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Abrir archivo");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos txt","txt"));
        int opcion = fileChooser.showOpenDialog(this);
        if (opcion == JFileChooser.APPROVE_OPTION) {
            File archivo = fileChooser.getSelectedFile();
            BufferedReader br=null;
            try{
                br=new BufferedReader(new FileReader(archivo));
                areaTexto.read(br,null);
                String texto=areaTexto.getText();
                areaTexto.setCaretPosition(texto.length());
            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(panel1, "Archivo no encontrado");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(panel1, "Error al leer el archivo");
            } finally {
                try{
                    if (br!=null)
                        br.close();
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(panel1, "Error al cerrar el archivo");
                }
            }
        }
    }
}
