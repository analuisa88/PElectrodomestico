package cl.awakelab.EvaluN2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LavadoraTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testGetCarga() {
		Lavadora lav = new Lavadora();
		assertEquals(5, lav.getCarga());
	}

	@Test
	void testGetPrecioBase() {
		Lavadora lav = new Lavadora();
		assertEquals(100000, lav.getPrecioBase());
	}

	@Test
	void testGetColor() {
		Lavadora lav = new Lavadora();
		assertEquals("blanco", lav.getColor());
	}

	@Test
	void testGetConsumoEnergetico() {
		Lavadora lav = new Lavadora();
		assertEquals('F', lav.getConsumoEnergetico());
	}

	@Test
	void testGetPeso() {
		Lavadora lav = new Lavadora();
		assertEquals(5, lav.getPeso());
	}

}
