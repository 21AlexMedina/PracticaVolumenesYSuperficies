package Clases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCilindro {

	@Test
	void testSuperficie() {
		Cilindro cilindro1 = new Cilindro();

		double superficieObtenida = cilindro1.superficie();

		double superficieEsperada = 12.56;
		assertEquals(superficieEsperada, superficieObtenida);
	}

	@Test
	void testVolumen() {
		Cilindro cilindro1 = new Cilindro();

		double volumenObtenido = cilindro1.volumen();

		double volumenEsperado = 3.14;
		assertEquals(volumenEsperado, volumenObtenido);
	}
}