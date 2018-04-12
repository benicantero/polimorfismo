package com.iesvirgendelcarmen.teoria.tres;

public interface Direccionable {

	String getDireccion();
	String getCiudad();
	
	default String getNombreCompleto() {
		return getDireccion() + "---" + getCiudad();
	}
	
	default String getNombreSinCiudad() {
		return getDireccion() + " solo direccion";
	}
	
	static String getDefecto() {
		return "IES Virgen del Carmen, Paseo de la estacion num 44";
	}
}
