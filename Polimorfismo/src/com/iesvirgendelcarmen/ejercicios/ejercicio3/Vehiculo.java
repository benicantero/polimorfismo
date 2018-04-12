package com.iesvirgendelcarmen.ejercicios.ejercicio3;

public interface Vehiculo {

	int VELOCIDAD_MAXIMA = 120; // TODOS LOS ATRIBUTOS DE UNA INTERFAZ SON FINAL Y ESTATICOS
	
	String acelerar(int valor);
	String frenar(int valor);
	int obtenerNumeroDePlazas();
	
}
