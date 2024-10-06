package test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Esta clase realiza las pruebas unitarias de los metodos de la clase Calculadora.
 * @author Carmen Pérez
 */

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Calculadora;

class CalculadoraTest {
	
	private int valor1;
	private int valor2;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before All: configuracion antes de todas las pruebas");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After All: limpieza despues de todas las pruebas");
	}

	@BeforeEach
	void setUp() throws Exception {
		this.valor1 = 5;
		this.valor2 = 3;
		System.out.println("->Ejecutando Before each: configuracion antes de cada prueba");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After Each: limpieza despues de cada prueba");
	}

	@Test
	void testSuma() {
		int expected = 8;
		int actual = Calculadora.suma(valor1, valor2);
		
		assertEquals(expected, actual);
	}

	@Test
	void testResta() {
		int expected = 2;
		int actual = Calculadora.resta(valor1, valor2);
		
		assertEquals(expected, actual);
	}

	@Test
	void testMultiplica() {
		int expected = 15;
		int actual = Calculadora.multiplica(valor1, valor2);
		
		assertEquals(expected, actual);
	}

	@Test
	void testDivide() {
		int expected = 1;
		int actual = Calculadora.divide(valor1, valor2);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testDividePor0() {
		int expected = -1;
		valor2 = 0;
		int actual = Calculadora.divide(valor1, valor2);
		
		assertEquals(expected, actual);
	}

}
