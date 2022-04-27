package ar.edu.unlam.pb2;

public abstract class Figura {
	private String color;
	
	public Figura(String color) {
		this.color = color;
	}


	public String toString() {
		return "Soy una figura de color: " + color ;
	}
	

	public abstract Double calcularArea();
	public abstract Double calcularPerimetro();
}
