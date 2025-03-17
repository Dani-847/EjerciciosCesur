package pooUD7CasoPractico5.tanques.main;

import pooUD7CasoPractico5.tanques.model.PlantaLechera;

public class Principal {
	public static void main(String[] args) {
		int[] capacidades = { 25000, 10000, 10000, 5000, 5000 }; // Capacidad tanques
		PlantaLechera planta = new PlantaLechera(15, capacidades);
		planta.mostrarTanques();
		String[] operaciones = {"IN 22500","IN 8000","IN 2000","IN 2500","IN 1000","OUT 23000","OUT 8000","OUT 2000","TRANS 2-0 500","OUT 2000","OUT 1000","OUT 500"};
		/*planta.comprar(22500);
		planta.comprar(8000);
		planta.comprar(2000);
		planta.comprar(2500);
		planta.comprar(1000);
		planta.vender(23000);
		planta.vender(8000);
		planta.vender(2000);
		planta.trasvasar(2, 0, 500);
		planta.vender(2000);
		planta.vender(1000);
		planta.vender(500);*/

        for (String operacion : operaciones) {
            String[] comando = operacion.split(" ");
            switch (comando[0]) {
                case "IN" -> planta.comprar(Integer.parseInt(comando[1]));
                case "OUT" -> planta.vender(Integer.parseInt(comando[1]));
                case "TRANS" -> {
                    String[] tanques = comando[1].split("-");
                    planta.trasvasar(Integer.parseInt(tanques[0]), Integer.parseInt(tanques[1]), Integer.parseInt(comando[2]));
                }
            }
        }
	}
}
