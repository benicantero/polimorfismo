package com.iesvirgendelcarmen.ejercicios.ejercicio3;

public class Motocicleta extends TipoVehiculo {

	private int cilindrada;

	// este constructor crea una motocicleta pasando dos argumentos
	public Motocicleta(int velocidad, int cilindrada) {
		super(velocidad,2);
		this.cilindrada = cilindrada;
	}
	
	// este constructor crea una motociclieta de velocidad 0 con un solo argumento
	public Motocicleta (int cilindrada) {
		super(2);
		this.cilindrada = cilindrada;
	}
	
	@Override
	public String acelerar(int velocidad) {
		// TODO Auto-generated method stub
		return "Motocicleta " + super.acelerar(velocidad);
	}
	
}
