package ar.edu.unlam.pb2;

public class Cuadrado extends Figura {

	private String color;
	private Integer lado;
	private Double resultado;

	public Cuadrado(String color) {
		super(color);
	}
	
	public Double area(Integer lado) {
		return Math.pow(lado, 2);
	}
	
	public Double perimetro(Integer lado) {
		resultado = (double) (lado*4);
		return resultado;
	}

}
