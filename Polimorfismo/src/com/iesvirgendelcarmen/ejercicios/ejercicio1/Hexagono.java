package com.iesvirgendelcarmen.ejercicios.ejercicio1;

public class Hexagono extends PoligonoRegular {

	public Hexagono(double longitudLado) {
		super("Hexagono", 6 , longitudLado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (getPerimetro() * (longitudLado/1.15))/2;
	}

}
