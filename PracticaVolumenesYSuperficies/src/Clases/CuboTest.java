package Clases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CuboTest {

	@Test
	void testSuperficie() {
		Cubo c = new Cubo(1);
		double superficieObtenida = c.superfice();

		double superficieEsperada = 6;

		assertEquals(superficieEsperada, superficieObtenida);
	}

	@Test
	void testVolumen() {
		Cubo d = new Cubo(1);
		double volumenObtenida = d.volumen();

		double volumenEsperada = 1;

		assertEquals(volumenEsperada, volumenObtenida);
	}
}