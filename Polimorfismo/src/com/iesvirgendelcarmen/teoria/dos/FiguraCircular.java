package com.iesvirgendelcarmen.teoria.dos;

public abstract class FiguraCircular implements Poligono{

	private String nombre;
	private float ejeMenor;
	private float ejeMayor;
	
	public FiguraCircular(float ejeMenor, float ejeMayor, String nombre) {
		this.ejeMenor = ejeMenor;
		this.ejeMayor = ejeMayor;
		this.nombre = nombre;
	}
	
	public abstract float calcularPerimetro(); // las clases abstractas tienen que tener almenos un metodo abstracto
	
	public float calcularArea() {
		return (float) (NUMERO_PI*((ejeMayor / 2.0)));
	}

	public String getNombre() {
		return nombre;
	}


	
}
