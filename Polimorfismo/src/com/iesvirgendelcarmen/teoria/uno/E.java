package com.iesvirgendelcarmen.teoria.uno;

public class E implements A, D {

	@Override
	public int metodoD(int numero) {
		// TODO Auto-generated method stub
		return numero * 2;
	}

	@Override
	public void metodoA1() {
		// TODO Auto-generated method stub
		System.out.println("Implementado metodo A1");
	}

	@Override
	public void metodoA2(String argumento) {
		// TODO Auto-generated method stub
		System.out.println("En el metodo 2 " + argumento);
	}

}
