package ar.edu.unlam.pb2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class FiguraTest {
	
	@Test
	public void queSePuedaCrearUnaFigura() {
		Figura miFigura = new Figura("rojo");
		
		assertNotNull(miFigura);
	}
	
	@Test
	public void queSePuedaCrearUnCirculo() {
		Circulo miFigura = new Circulo("azul");
		
		assertNotNull(miFigura);
	}
	
	@Test
	public void queSePuedaCrearUnCuadrado() {
		Cuadrado miFigura = new Cuadrado("verde");
		
		assertNotNull(miFigura);
	}
	
	@Test
	public void queSePuedaAccederAlColorDelCirculo() {
		Circulo miFigura = new Circulo("violeta");
		final String COLOR_ESPERADO = "Soy una figura de color: violeta";
		
		assertEquals(COLOR_ESPERADO, miFigura.toString());
	}
	
	
	@Test
	public void queSePuedaAccederAlColorDelCuadrado() {
		Cuadrado miFigura = new Cuadrado("morado");
		final String COLOR_ESPERADO = "Soy una figura de color: morado";
	
		assertEquals(COLOR_ESPERADO, miFigura.toString());
	}
	
	@Test
	public void queSePuedaCalcularElAreaDeUnCirculo() {
		Circulo miFigura = new Circulo("rosa");
		final Integer RADIO = 3;
		final Double RESULTADO_ESPERADO = 28.27;
		
		assertEquals(RESULTADO_ESPERADO, miFigura.area(RADIO), 0.01);
	}
	
	@Test
	public void queSePuedaCalcularElAreaDeUnCuadrado() {
		Cuadrado miCuadrado = new Cuadrado("blanco");
		final Integer LADO = 4;
		final Double RESULTADO_ESPERADO = 16.0;
		
		assertEquals(RESULTADO_ESPERADO, miCuadrado.area(LADO), 0.01);
	}
	
	@Test
	public void queSePuedaCalcularElPerimetroDeUnCirculo() {
		Circulo miFigura = new Circulo("negro");
		final Integer RADIO = 5;
		final Double RESULTADO_ESPERADO = 31.42;
		
		assertEquals(RESULTADO_ESPERADO, miFigura.perimetro(RADIO), 0.01);
	}
	
	@Test
	public void queSePuedaCalcularElPerimetroDeUnCuadrado() {
		Cuadrado miFigura = new Cuadrado("negro");
		final Integer LADO = 20;
		final Double RESULTADO_ESPERADO = 80.0;
		
		assertEquals(RESULTADO_ESPERADO, miFigura.perimetro(LADO), 0.01);
	}

}
