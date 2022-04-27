package ar.edu.unlam.pb2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class FiguraTest {
	
	/* YA NO SE PODRA INSTANCIAR LA FIGURA PORQUE AHORA ESTA DECLARADA COMO CLASE ABSTRACTA
	@Test
	public void queSePuedaCrearUnaFigura() {
		Figura miFigura = new Figura("rojo");
		
		assertNull(miFigura);
	}
	*/
	
	@Test
	public void queSePuedaCrearUnCirculo() {
		Circulo miFigura = new Circulo("azul", 2);
		
		assertNotNull(miFigura);
	}
	
	@Test
	public void queSePuedaCrearUnCuadrado() {
		Cuadrado miFigura = new Cuadrado("verde",3);
		
		assertNotNull(miFigura);
	}
	
	@Test
	public void queSePuedaAccederAlColorDelCirculo() {
		Circulo miFigura = new Circulo("violeta",4);
		final String COLOR_ESPERADO = "Soy una figura de color: violeta";
		
		assertEquals(COLOR_ESPERADO, miFigura.toString());
	}
	
	
	@Test
	public void queSePuedaAccederAlColorDelCuadrado() {
		Cuadrado miFigura = new Cuadrado("morado",5);
		final String COLOR_ESPERADO = "Soy una figura de color: morado";
	
		assertEquals(COLOR_ESPERADO, miFigura.toString());
	}
	
	@Test
	public void queSePuedaCalcularElAreaDeUnCirculo() {
		Circulo miFigura = new Circulo("rosa",3);
		final Double RESULTADO_ESPERADO = 28.27;
		
		assertEquals(RESULTADO_ESPERADO, miFigura.calcularArea(), 0.01);
	}
	
	@Test
	public void queSePuedaCalcularElAreaDeUnCuadrado() {
		Cuadrado miCuadrado = new Cuadrado("blanco",4);
		final Double RESULTADO_ESPERADO = 16.0;
		
		assertEquals(RESULTADO_ESPERADO, miCuadrado.calcularArea(), 0.01);
	}
	
	@Test
	public void queSePuedaCalcularElPerimetroDeUnCirculo() {
		Circulo miFigura = new Circulo("negro",5);
		final Double RESULTADO_ESPERADO = 31.42;
		
		assertEquals(RESULTADO_ESPERADO, miFigura.calcularPerimetro(), 0.01);
	}
	
	@Test
	public void queSePuedaCalcularElPerimetroDeUnCuadrado() {
		Cuadrado miFigura = new Cuadrado("negro",20);
		final Double RESULTADO_ESPERADO = 80.0;
		
		assertEquals(RESULTADO_ESPERADO, miFigura.calcularPerimetro(), 0.01);
	}

}
