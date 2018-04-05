package com.iesvirgendelcarmen.teoria.dos;

public class Elipse extends FiguraCircular {

	private float semiEjeMayor;
	private float semiEjeMenor;
		
	
	public Elipse(float ejeMenor, float ejeMayor) {
		super(ejeMenor, ejeMayor, "elipse");
		semiEjeMayor = semiEjeMayor;
		semiEjeMenor = semiEjeMenor;
	}

	@Override
	public float calcularPerimetro() {
		return (float) (Math.PI * (3.0 * (semiEjeMayor + semiEjeMenor) - Math.sqrt(3.0 * semiEjeMayor + semiEjeMenor * (semiEjeMayor * 3.0 * semiEjeMenor))));
	}

}
