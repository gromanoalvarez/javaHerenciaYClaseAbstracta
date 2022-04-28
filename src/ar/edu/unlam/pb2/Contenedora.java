package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Contenedora {
				//PRACTICA CLASE CONTENEDORA
	
	//ArrayList es un array puedo ir a la posicion que quiera directamente o empiezo a rrecorrer hasta encontrar lo quye quiero
	//En memoria estan obligados a ponerse uno al lado del otro en forma continua
	
	//LinkedList nos permite guardar datos en una lista donde cada valor tiene un puntero de memoria que apunta hacia donde esta el proximo valor
	//en este no es necesario hacer desplazamiento ni guardar todo de manera contigua. 
	//por eso no es obligatorio instanciar con un tamaño limite.
	List<Figura> figuras = new LinkedList<>();
	
	
	public void agregarFigura(Figura figura) {
		figuras.add(figura); //aca ya agrego el valor gracias a arraylist
	}
	
	public Integer contarCirculos() {
		
		Integer contadorDeCirculo=0;
		
		for(Figura contadorFigura: figuras) {
			//instanceof es un operador booleano para reconocer "si es instancia de " la clase circulo
			if(contadorFigura instanceof Circulo) {
				contadorDeCirculo++;
			}
		}
		return contadorDeCirculo;
	}
	
	public List<Imprimible> obtenerObjetosImprimibles() {
		List<Imprimible> imprimibles = new ArrayList<>();
		
		for(Figura f: this.figuras) {
		  if(f instanceof Cuadrado) {
			  //casteo la Figura a Rectangulo para que sea imprimible y compatible por la Interfaz
			  imprimibles.add((Cuadrado)f);
		  }
		}
		
		return null;
	}

}
