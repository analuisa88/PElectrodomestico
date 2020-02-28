package cl.awakelab.EvaluN2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TelevisionTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testGetResolucion() {
		Television tele=new Television();
		assertEquals(20, tele.getResolucion());
	}

	@Test
	void testIsSintonizadorTDT() {
		Television tele=new Television();
		assertEquals(false, tele.isSintonizadorTDT());
	}

	@Test
	void testGetPrecioBase() {
		Television tele=new Television();
		assertEquals(100000, tele.getPrecioBase());
	}

	@Test
	void testGetColor() {
		Television tele=new Television();
		assertEquals("blanco", tele.getColor());
	}

	@Test
	void testGetConsumoEnergetico() {
		Television tele=new Television();
		assertEquals('F', tele.getConsumoEnergetico());
	}

	@Test
	void testGetPeso() {
		Television tele=new Television();
		assertEquals(5, tele.getPeso());
	}

}
