package edu.tallerweb.pptls;

import java.util.ArrayList;


public int cero = 0;
public int uno = 1;
public int dos = 2;
public int tres = 3;
public int cuatro = 4;

/**
 * Representa una de las Manos involucradas en el juego
 */
public class Mano {
	private Forma valorForma = null;
	private String nombreJugador = null;

	/**
	 * Toda Mano debe crearse con una forma dada, que será la que determine su
	 * condición en el juego.
	 * 
	 * @param forma
	 *            , la Forma que adopta la Mano.
	 */
	public Mano(final Forma forma) {
		this.valorForma = forma;
	}

	/**
	 * Evaluará el resultado de la partida según las reglas del juego.
	 * 
	 * @param otra
	 *            , la otra Mano.
	 * @return un Resultado, de acuerdo al estado del juego.
	 */
	public Resultado jugarCon(final Mano otra) {
		Forma formaJugador1 = this.valorForma;
		Forma formaJugador2 = otra.getForma();
		if (formaJugador1.getValor() == formaJugador2.getValor()) {
			return Resultado.EMPATA;
		} else {
			ArrayList<Integer> aQuienLeGana = new ArrayList<Integer>();
			switch (formaJugador1.getValor()) {
			case 0:
				aQuienLeGana.add(tres);
				aQuienLeGana.add(cuatro);
				break;
			case 1:
				aQuienLeGana.add(cero);
				aQuienLeGana.add(cuatro);
				break;
			case 2:
				aQuienLeGana.add(cero);
				aQuienLeGana.add(uno);
				break;
			case 3:
				aQuienLeGana.add(uno);
				aQuienLeGana.add(dos);
				break;
			case 4:
				aQuienLeGana.add(dos);
				aQuienLeGana.add(tres);
				break;
			default:
				break;
			}
			if (aQuienLeGana.contains(formaJugador2.getValor())) {
				return Resultado.GANA;
			} else {
				return Resultado.PIERDE;
			}
		}
	}

	public String getNombre() {
		return this.nombreJugador;
	}

	public void setNombre(final String nom) {
		this.nombreJugador = nom;
	}

	public Forma getForma() {
		return this.valorForma;
	}
}
