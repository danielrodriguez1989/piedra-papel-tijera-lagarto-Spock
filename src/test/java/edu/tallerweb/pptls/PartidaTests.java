package edu.tallerweb.pptls;

import static org.junit.Assert.*;

import java.util.FormatFlagsConversionMismatchException;

import org.junit.Test;

public class PartidaTests {

	@Test
	public void queSpockVaporizaPiedra() {

		Mano jugadorUno = new Mano(Forma.TIJERA);
		jugadorUno.setNombre("Daniel");
		Mano jugadorDos = new Mano(Forma.PIEDRA);
		jugadorDos.setNombre("Juan");
		
		//System.out.println(jugadorUno.jugarCon(jugadorDos));
		//Par1 = Descripcion
		//Par2 = Valor esperado
		//Par3 = Valor obtenido
		
		//assertEquals("TIJERA contra PIEDRA", Resultado.EMPATA, jugadorUno.jugarCon(jugadorDos));
		
		System.out.println(jugadorUno.getNombre() + " " + jugadorUno.jugarCon(jugadorDos) + " contra " + jugadorDos.getNombre());
	}

}
