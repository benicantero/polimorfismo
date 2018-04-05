package com.iesvirgendelcarmen.teoria.uno;

public class B implements A {

	@Override
	public void metodoA1() {
		System.out.println("implementando metodo A1");
	}

	@Override
	public void metodoA2(String argumento) {
		System.out.println("En el metodo A2 " + argumento);

	}

}
