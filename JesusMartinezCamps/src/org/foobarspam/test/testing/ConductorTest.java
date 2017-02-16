package org.foobarspam.test.testing;

import static org.junit.Assert.*;
import org.foobarspam.cotxox.conductores.*;
import org.junit.Test;

public class ConductorTest {

	@Test
	public void valoracionMediaTest() {
		int valoracionEsperada = 4;
		
		Conductor conductor = new Conductor();
		
		
		assertEquals(valoracionEsperada, conductor.getValoracionMedia());
		
	}

}
