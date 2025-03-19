package pooUD7CasoPractico5.tanques.model;

import pooUD7CasoPractico5.tanques.exceptions.TanqueLlenoException;
import pooUD7CasoPractico5.tanques.exceptions.TanqueVacioException;

public class Tanque {
	private int capacidad;
	private int vol_max;
	private int vol_min;
	private int vol_act;

	public Tanque(int cap) {
		capacidad = cap;
		vol_act = 0;
		vol_max = cap;
		vol_min = 0;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public int getVolMax() {
		return vol_max;
	}

	public int getVolMin() {
		return vol_min;
	}

	public int getVolActual() {
		return vol_act;
	}

	public void setVolMinimo(int min) {
		if (min >= 0)
			vol_min = min;
	}

	public void setVolMaximo(int max) {
		if (max <= capacidad)
			vol_max = max;
	}

	public void llenar(int litros) throws TanqueLlenoException {
		if (vol_act + litros > vol_max)
			throw new TanqueLlenoException("Imposible agregar " + litros
					+ " litros al tanque. Peligro de rebosar !!");
		else
			vol_act += litros;
	}

	public void vaciar(int litros) throws TanqueVacioException {
		if (vol_act - litros < vol_min)
			throw new TanqueVacioException("Imposible extraer " + litros
					+ " litros al tanque. Bomba en vacio !!");
		else
			vol_act -= litros;
	}

	public void trasvasar(Tanque destino, int litros)
			throws TanqueVacioException, TanqueLlenoException {
		if (destino.getVolActual() + litros > destino.getVolMax())
			throw new TanqueLlenoException("Imposible trasvasar " + litros
					+ " litros al tanque. Peligro de rebosar !!");
		if (vol_act - litros < vol_min)
			throw new TanqueVacioException("Imposible trasvasar " + litros
					+ " litros desde el tanque. Bomba en vacio !!");
		destino.llenar(litros);
		vaciar(litros);
	}
}
