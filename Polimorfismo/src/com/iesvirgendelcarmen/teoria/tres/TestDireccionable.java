package com.iesvirgendelcarmen.teoria.tres;

public class TestDireccionable {

	public static void main(String[] args) {
		Direccion direccion1 = new Direccion("avd. granada", "jaen");
		Direccionable direccion2 = new Direccion("avd. barcelona", "jaen");
		System.out.println(direccion1.getNombreCompleto());
		System.out.println(direccion2.getNombreCompleto());
		System.out.println(direccion1.getNombreSinCiudad());
		System.out.println(direccion2.getCiudad() + "---" + direccion2.getDireccion());
		System.out.println(Direccionable.getDefecto());
	}
}
