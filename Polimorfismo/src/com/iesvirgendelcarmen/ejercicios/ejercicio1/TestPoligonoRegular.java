package com.iesvirgendelcarmen.ejercicios.ejercicio1;

import java.util.ArrayList;
import java.util.List;

import com.iesvirgendelcarmen.ejercicios.ejercicio1.Cuadrado;
import com.iesvirgendelcarmen.ejercicios.ejercicio1.Hexagono;
import com.iesvirgendelcarmen.ejercicios.ejercicio1.PoligonoRegular;
import com.iesvirgendelcarmen.ejercicios.ejercicio1.TrianguloEquilatero;

public class TestPoligonoRegular {

	public static void main(String[] args) {
		PoligonoRegular triangulo1 = new TrianguloEquilatero(3);
		PoligonoRegular triangulo2 = new TrianguloEquilatero(4);
		PoligonoRegular triangulo3 = new TrianguloEquilatero(5);
		
		PoligonoRegular cuadrado1 = new Cuadrado(2);
		PoligonoRegular cuadrado2 = new Cuadrado(3);
		PoligonoRegular cuadrado3 = new Cuadrado(4);
		
		PoligonoRegular hexagono1 = new Hexagono(5);
		PoligonoRegular hexagono2 = new Hexagono(6);
		PoligonoRegular hexagono3 = new Hexagono(7);

		List<PoligonoRegular> listaPoligonos = new ArrayList<>();
		
		listaPoligonos.add(triangulo1);
		listaPoligonos.add(triangulo2);
		listaPoligonos.add(triangulo3);
		listaPoligonos.add(cuadrado1);
		listaPoligonos.add(cuadrado2);
		listaPoligonos.add(cuadrado3);
		listaPoligonos.add(hexagono1);
		listaPoligonos.add(hexagono2);
		listaPoligonos.add(hexagono3);
		
		for (PoligonoRegular poligonoRegular : listaPoligonos) {
			System.out.println(poligonoRegular);
		}
		
		for (PoligonoRegular poligonoRegular : listaPoligonos) {
			System.out.println(poligonoRegular.equals(listaPoligonos.get(0)));
		}
		
		for (PoligonoRegular poligonoRegular : listaPoligonos) {
			System.out.println(poligonoRegular.compareTo(listaPoligonos.get(0)));
		}
	}

}
