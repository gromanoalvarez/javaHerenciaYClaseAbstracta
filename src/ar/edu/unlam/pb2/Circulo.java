package ar.edu.unlam.pb2;

public class Circulo extends Figura {

	private String color;
	private Integer radio;
	private Double resultado;

	public Circulo(String color) {
		super(color);
	}
	
	
	public Double area(Integer radio) {
		resultado = radio * radio * Math.PI;
		return resultado;
	}
	
	public Double perimetro(Integer radio) {
		resultado = (2*Math.PI*radio);
		return resultado;
	}

}
