package pooCasoPractico3;

import pooCasoPractico2.CuentaBancaria;

public class LibroTest {
    public static void main(String[] args) {
        Libro l1 = new Libro("La divina comedia", "Juan Alberto", 1564);
        Libro l2 = new Libro("Luna de pluton", "Adrian Toledo Diaz", 6);
        for (int i = 1;i<=1060;i++)
            l1.leerPagina();
        for (int i = 1;i<=40;i++)
            l2.leerPagina();

        l1.retrocederPagina();
        l2.retrocederPagina();

        System.out.println(l1.mostrarInfo());
        System.out.println(l2.mostrarInfo());
    }
}
