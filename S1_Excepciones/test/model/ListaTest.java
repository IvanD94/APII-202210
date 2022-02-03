package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class ListaTest {

	private Lista lista;
	
	private void setupEscenario1() {
		lista = new Lista();
	}
	
	@Test
	public void testAddElementEmptyList() {
		setupEscenario1();
		try {
			lista.addElement(3);
		} catch (ListaLlenaException e) {
			fail("No debería lanzar excepción");
		}
		assertTrue("El elemento no quedo agregado a la lista", lista.searchElement(3));
		assertEquals("El tamaño de la lista no es 1", 1, lista.countElements());
	}
	
	@Test
	public void test2() {
		assertEquals(0.1 + 0.1 + 0.1, 0.3, 0.0000001);
		assertFalse(false);
		assertTrue(false);
		assertNull(lista);
		assertNotNull(lista);
		fail();
	}

}
