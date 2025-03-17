package pooUD5CasoPractico5;

public class Main {
    public static void main(String[] args) {
        Electrodomestico[] electrodomesticos = new Electrodomestico[10];
        electrodomesticos[0] = new Television(200, ColorElectrodomestico.BLANCO, 'A', 20, 50, false);
        electrodomesticos[1] = new Lavadora(300, ColorElectrodomestico.NEGRO, 'B', 30,70);
        electrodomesticos[2] = new Electrodomestico(300, ColorElectrodomestico.ROJO, 'C', 10);
        electrodomesticos[3] = new Electrodomestico(300, ColorElectrodomestico.AZUL, 'D', 20);
        electrodomesticos[4] = new Electrodomestico(300, ColorElectrodomestico.GRIS, 'E', 40);
        electrodomesticos[5] = new Electrodomestico(300, ColorElectrodomestico.BLANCO, 'F', 60);
        electrodomesticos[6] = new Television(300, ColorElectrodomestico.NEGRO, 'A', 20, 20, true);
        electrodomesticos[7] = new Electrodomestico(300, ColorElectrodomestico.ROJO, 'B', 10);
        electrodomesticos[8] = new Lavadora(300, ColorElectrodomestico.MORADO, 'J', 20, 50);
        electrodomesticos[9] = new Electrodomestico(300, ColorElectrodomestico.GRIS, 'A', 30);

        double precioFinalTelevisiones = 0;
        double precioFinalLavadoras = 0;
        double precioFinalElectrodomesticos = 0;

        for (Electrodomestico elec : electrodomesticos) {
            if(elec instanceof Lavadora)
                precioFinalLavadoras+= elec.precioFinal();
            if(elec instanceof Television)
                precioFinalTelevisiones+= elec.precioFinal();
            if(elec instanceof Electrodomestico)
                precioFinalElectrodomesticos+= elec.precioFinal();
        }

        System.out.println("Total teles: " + precioFinalTelevisiones + ", Total lavadoras: " + precioFinalLavadoras + ", Total elec: " + precioFinalElectrodomesticos);
    }
}
