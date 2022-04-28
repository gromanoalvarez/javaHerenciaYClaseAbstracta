package ar.edu.unlam.pb2;

public class Cuadrado extends Figura implements Imprimible {

	private String color;
	private Integer lado;
	private Double resultado;

	public Cuadrado(String color, Integer lado) {
		super(color);
		this.lado = lado;
	}
	
	/*
	public Double area(Integer lado) {
		return Math.pow(lado, 2);
	}
	
	public Double perimetro(Integer lado) {
		resultado = (double) (lado*4);
		return resultado;
	}
	*/
	
	@Override  //OBLIGATORIO POR ABSTRAC
	public  Double calcularArea() {
		return Math.pow(lado, 2);
	}
	@Override//OBLIGATORIO POR ABSTRAC
	public  Double calcularPerimetro() {
		resultado = (double) (lado*4);
		return resultado;
	}
	

	public String getColor() {
		return color;
	}

	@Override //OBLIGATORIA PRQUE IMPLEMENTO LA INTERFAZ
	public void imprimir() {
			System.out.println("IMPRIMO UN CUADRADO DE COLOR " + getColor() );		
	}
}
