package org.foobarspam.test.testing;

import static org.junit.Assert.*;

import org.foobarspam.cotxox.carrera.*;
import org.junit.Test;

public class CarreraTest {

	@Test
	public void constructorCarreraTest() {

		String tarjetaCredito = "4916119711304546";
		Carrera carrera = new Carrera(tarjetaCredito);
		
				
		String tarjetaEsperada = "4916119711304546";
		String origenEsperado = "Aeroport Son Sant Joan";
		String destinoEsperado = "Magaluf";
		double distanciaEsperada = 7.75;
		
		
		assertEquals(tarjetaEsperada, carrera.getTarjetaCredito());
//		assertEquals(origenEsperado, carrera.getOrigen());
//		assertEquals(destinoEsperado, carrera.getDestino());
//		assertEquals(distanciaEsperada, carrera.getDistancia(),0);

	}
	
	@Test
	public void costeEsperadoTest(){
		double costeMinimo = 5;
		
		Carrera carrera = new Carrera(2);
		
		assertEquals(costeMinimo, carrera.getCosteEsperado(),0);
		
	}
	
	@Test
	public void realizarPagoTest(){
		
	}
}
