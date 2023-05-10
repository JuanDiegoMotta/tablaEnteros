package tablaEnteros;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class TablaEnterosTest {
	Integer[] enteros= {1, 2, 3, 4, 5};
	TablaEnteros tabla;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Comenzando pruebas");
		System.out.println("*********************************");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("*********************************");
		System.out.println("Acabando pruebas");
	}

	@BeforeEach
	void setUp() throws Exception {
		tabla = new TablaEnteros(enteros);
		}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSumaTabla() {
		assertEquals(15, tabla.sumaTabla());
	}

	@Test
	void testMayorTabla() {
		assertEquals(5, tabla.mayorTabla());
	}


	
	

}
