package com.iesvirgendelcarmen.teoria;

public class Circulo extends FiguraCircular {

	private float radio;
	
	public Circulo(float radio) {
		super(radio * 2, radio * 2, "circulo");
		this.radio = radio;
	}

	@Override
	public float calcularPerimetro() {
		// TODO Auto-generated method stub
		return (float) (2 * Math.PI * (radio * radio));
	}
	
	public float getRadio() {
		return radio;
	}

}
