package Programacion.UD9.pooUD9CasoPractico1;

public class RadioPortatil implements Radio{
    @Override
    public void escucharSintonia(String sintonia) {
        System.out.println("Escuchando la sintonía "+sintonia);
    }
}
