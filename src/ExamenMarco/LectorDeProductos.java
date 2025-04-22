package ExamenMarco;

import javax.swing.*;

public class LectorDeProductos extends JFrame{
    private JPanel panel1;
    private JButton button1;
    private JTextPane textPane1;

    public LectorDeProductos() {
        setTitle("Lector de Productos - CSV");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setContentPane(panel1);
        setLocationRelativeTo(null);
    }
}
