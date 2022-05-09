package JUnit.Junit09_Geometria.test;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import JUnit.Junit09_Geometria.dto.*;

class GeometriaTest {

	Geometria geometria;

	// testeamos los métodos que calculan las areas de las figuras
	@Test
	public void testAreaCuadrado() {

		int resultado = Geometria.areacuadrado(1);
		int esperado = 1;
		assertEquals(resultado, esperado);

	}

	@Test
	public void testAreaCirculo() {

		int resultado = (int) Geometria.areaCirculo(1);

		int esperado = 3;
		int delta = 1;

		assertEquals(resultado, esperado, delta);

	}

	@Test
	public void testAreaTriangulo() {

		int resultado = (int) Geometria.areatriangulo(2, 2);

		int esperado = 2;

		assertEquals(resultado, esperado);
	}

	@Test
	public void testAreaRectangulo() {

		int resultado = Geometria.arearectangulo(2, 2);

		int esperado = 4;

		assertEquals(resultado, esperado);
	}

	@Test
	public void testAreaPentagono() {

		int resultado = Geometria.areapentagono(2, 2);

		int esperado = 2;

		assertEquals(resultado, esperado);
	}

	@Test
	public void testAreaRombo() {

		int resultado = Geometria.arearombo(2, 2);

		int esperado = 2;

		assertEquals(resultado, esperado);

	}

	@Test
	public void testAreaRomboide() {

		int resultado = Geometria.arearomboide(2, 2);

		int esperado = 4;

		assertEquals(resultado, esperado);
	}

	@Test
	public void testAreaTrapecio() {

		int resultado = Geometria.areatrapecio(2, 2, 2);

		int esperado = 4;

		assertEquals(resultado, esperado);
	}

	// testeamos el constructor con parámetro y switch de cada caso
	@Test
	public void testFigura() {

		for (int i = 0; i <= 9; i++) {
			geometria = new Geometria(i);
			assertEquals(geometria.getId(), i);
		}
	}

	// testeamos el constructor vacío y getters&setters
	@Test
	public void testSetId() {
		geometria = new Geometria();
		geometria.setId(2);
		int resultado = geometria.getId();
		int esperado = 2;
		assertEquals(esperado, resultado);
	}

	@Test
	public void testSetNom() {
		geometria = new Geometria();
		geometria.setNom("octágono");
		String resultado = geometria.getNom();
		String esperado = "octágono";
		assertEquals(esperado, resultado);
	}

	@Test
	public void testSetArea() {
		geometria = new Geometria();
		geometria.setArea(2.5);
		double resultado = geometria.getArea();
		double esperado = 2.5;
		int delta = 1;

		assertEquals(esperado, resultado, delta);
	}

	// testeamos el método toString
	@Test
	public void testToString() {
		geometria = new Geometria(1);

		String resultado = geometria.toString();
		String esperado = "Geometria [id=1, nom=cuadrado, area=0.0]";

		assertEquals(esperado, resultado);
	}

}
