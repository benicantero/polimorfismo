package com.iesvirgendelcarmen.teoria.cuatro;

public class Estudiante implements Comparable<Estudiante>, Cloneable {

	private String nombre;
	private int edad;
	
	public Estudiante(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", edad=" + edad + "]\n";
	}

	@Override
	public int compareTo(Estudiante estudiante2) {
		// TODO Auto-generated method stub
		return this.edad - estudiante2.edad;
	};
	
	
	
}
