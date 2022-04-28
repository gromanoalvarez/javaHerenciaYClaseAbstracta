package ar.edu.unlam.pb2;

public class Circulo extends Figura {

	private Integer radio;
	private Double resultado;

	public Circulo(String color, Integer radio) {
		super(color);
		this.radio = radio;
	}
	
	/*
	public Double area(Integer radio) {
		resultado = radio * radio * Math.PI;
		return resultado;
	}
	
	public Double perimetro(Integer radio) {
		resultado = (2*Math.PI*radio);
		return resultado;
	}
	*/
	
	@Override
	public  Double calcularArea() {
		resultado = Math.pow(radio,2) * Math.PI;
		return resultado;
	}
	
	@Override
	public  Double calcularPerimetro() {
		resultado = (2*Math.PI*radio);
		return resultado;
	}
	
	public void nada() {
		
	}
}
