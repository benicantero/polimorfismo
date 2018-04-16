package com.iesvirgendelcarmen.ejercicios.ejercicio5;

import java.util.Arrays;

public class TestMath3 {

	public static void main(String[] args) {
		
		int[] listaOriginalEnteros = {11,2,3,45,3,1,4};
		int tamanno = (int)(Math.random() * 15 +1);
		double[] listaOriginalDoubles = new double[tamanno];
		for (int i = 0; i < listaOriginalDoubles.length; i ++) {
			listaOriginalDoubles[i] = Math.random() * 100;
		}
		//imprimir su valor
		
		System.out.println(Arrays.toString(listaOriginalEnteros));
		System.out.println(Arrays.toString(listaOriginalDoubles));

		//creamos un objeto Math3
		
		Math3 math3 = new Math3(listaOriginalEnteros, listaOriginalDoubles);
		System.out.println("Valor minimo de enteros: (debe dar 1): " + math3.min(listaOriginalEnteros) );
		System.out.println("Valor maximo de enteros: (debe dar 45): " + math3.max(listaOriginalEnteros));
		System.out.println("Valor minimo de doubles: " + math3.min(listaOriginalDoubles) );
		System.out.println("Valor maximo de doubles: " + math3.max(listaOriginalDoubles));
		
		
	}

	//class Math4 extends Math3{
		//ESTO NO PODEMOS HACERLO PORQUE Math3 ES FINAL Y NO PUEDE SER HEREDADA.
	//}
}
