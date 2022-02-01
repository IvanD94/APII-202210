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
			fail("No deber�a lanzar excepci�n");
		}
		assertTrue("El elemento no quedo agregado a la lista", lista.searchElement(3));
		assertEquals("El tama�o de la lista no es 1", 1, lista.countElements());
	}

}
