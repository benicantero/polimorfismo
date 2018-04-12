package com.iesvirgendelcarmen.teoria.cuatro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEstudiante {

	public static void main(String[] args) {
		
		Estudiante estudiante1 = new Estudiante("juan", 25);
		Estudiante estudiante2 = new Estudiante("luis", 35);
		Estudiante estudiante3 = new Estudiante("pepe", 15);
		
		List<Estudiante> lista = new ArrayList<>();
		lista.add(estudiante1);
		lista.add(estudiante2);
		lista.add(estudiante3);
		
		System.out.println(lista);

		Collections.sort(lista);
		
		System.out.println(lista);
		
	}

}
