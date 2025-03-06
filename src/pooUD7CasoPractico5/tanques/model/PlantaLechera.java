package pooUD7CasoPractico5.tanques.model;

import pooUD7CasoPractico5.tanques.exceptions.TanqueLlenoException;
import pooUD7CasoPractico5.tanques.exceptions.TanqueVacioException;

public class PlantaLechera {
	private Tanque[] tanques;
	private int num_tanques;

	public PlantaLechera(int max_tanques, int[] capacidades) {
		tanques = new Tanque[max_tanques];
		// Creaci�n e inicializaci�n de los tanques
		for (int i = 0; i < capacidades.length; i++) {
			tanques[i] = new Tanque(capacidades[i]);
			num_tanques++;
		}
	}

	public void comprar(int litros) {
		int num_tanque = 0;
		boolean terminado = false;
		while (!terminado && num_tanque < num_tanques) {
			try {
				tanques[num_tanque].llenar(litros);
				terminado = true;
				System.out.println("Añadidos " + litros + " al tanque "
						+ num_tanque);
			} catch (TanqueLlenoException tle) {
				System.out.println("---> TanqueLlenoException tanque: "
						+ num_tanque);
			} catch (SecurityException se) {
				System.out.println("---> SecurityException tanque: "
						+ num_tanque);
			} catch (Exception e) {
				System.out.println("---> Exception en tanque: " + num_tanque);
			} finally {
				num_tanque++; // Avanzamos al siguiente tanque
			}
		}
		if (!terminado)
			System.out.println("Imposible completar la operacion de llenado");
		mostrarTanques(); // Muestra el estado actual de los tanques
	}

	public void vender(int litros) {
		int num_tanque = 0;
		boolean terminado = false;
		while (!terminado && num_tanque < num_tanques) {
			try {
				tanques[num_tanque].vaciar(litros);
				terminado = true;
				System.out.println("Vaciados " + litros + " de tanque "
						+ num_tanque);
			} catch (TanqueVacioException tve) {
				System.out.println("---> TanqueVacioException tanque: "
						+ num_tanque);
			} catch (SecurityException se) {
				System.out.println("---> SecurityException tanque: "
						+ num_tanque);
			} catch (Exception e) {
				System.out.println("---> Exception tanque: " + num_tanque);
			} finally {
				num_tanque++; // Avanzamos al siguiente tanque
			}
		}
		if (!terminado)
			System.out.println("Imposible completar la operacion de vaciado");
		mostrarTanques(); // Muestra el estado actual de los tanques
	}

	public void trasvasar(int orig, int dest, int litros) {
		try {
			tanques[orig].trasvasar(tanques[dest], litros);
			System.out.println("Trasvasados " + litros + " de " + orig + " a "
					+ dest);
		} catch (TanqueLlenoException tle) {
			System.out
					.println("---> TanqueLlenoException: " + tle.getMessage());
		} catch (TanqueVacioException tve) {
			System.out
					.println("---> TanqueVacioException: " + tve.getMessage());
		} catch (SecurityException se) {
			System.out.println("---> SecurityException: " + se.getMessage());
		} catch (Exception e) {
			System.out.println("---> Exception: " + e.getMessage());
		}
		mostrarTanques(); // Muestra el estado actual de los tanques
	}

	public void mostrarTanques() {
		System.out.println("TANQUE \t CAP \t MAX \t MIN \t VOL_ACT");
		for (int i = 0; i < num_tanques; i++) {
			System.out.print("T_" + i + "\t\t");
			System.out.print(tanques[i].getCapacidad() + "\t");
			System.out.print(tanques[i].getVolMax() + "\t\t");
			System.out.print(tanques[i].getVolMin() + "\t\t");
			System.out.println(tanques[i].getVolActual());
		}
	}

}
