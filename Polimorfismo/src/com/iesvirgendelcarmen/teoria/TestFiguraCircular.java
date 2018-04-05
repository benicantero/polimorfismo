package com.iesvirgendelcarmen.teoria;

import java.util.ArrayList;
import java.util.List;

public class TestFiguraCircular {

	public static void main(String[] args) {
		// no se puede instanciar objetos de una clase abstracta
		
		/*FiguraCircular f = new FiguraCircular(3,3) {
			
			@Override
			public float calcularPerimetro() {
				// TODO Auto-generated method stub
				return 0;
			}
		};*/

		List<FiguraCircular> listaFiguras = new ArrayList<>();
		FiguraCircular figura1 = new Circulo(4.2f);
		System.out.printf("Figura %s de perimetro %.2f y area %.2f%n", figura1.getNombre(), figura1.calcularArea(),figura1.calcularArea());
		
	}

}
