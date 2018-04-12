package com.iesvirgendelcarmen.ejercicios.ejercicio3;

public class TipoVehiculo implements Vehiculo {

	private int velocidad;
	private int numeroPlazas;
	
	
	public TipoVehiculo(int velocidad, int numeroPlazas) {
		this.velocidad = velocidad;
		this.numeroPlazas = numeroPlazas;
	}
	
	public TipoVehiculo (int numeroPlazas) {
		this.velocidad = 0;
		this.numeroPlazas = numeroPlazas;
	}
	
	
	

	@Override
	public String acelerar(int velocidad) {
		this.velocidad += velocidad;
		if(this.velocidad > VELOCIDAD_MAXIMA ) 
			return "Superada velocidad maxima " + "velocidad actual " + this.velocidad;
		return  "velocidad actual " + this.velocidad;
	}

	@Override
	public String frenar(int velocidad) {
		this.velocidad -= velocidad;
		if(this.velocidad < 0 ) this.velocidad = 0; 
			return "Frenando, velocidad actual " +  this.velocidad;
		}

	@Override
	public int obtenerNumeroDePlazas() {
		return this.numeroPlazas;
	}

}
