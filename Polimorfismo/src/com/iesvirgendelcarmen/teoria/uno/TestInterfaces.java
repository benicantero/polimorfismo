package com.iesvirgendelcarmen.teoria.uno;

import java.util.ArrayList;
import java.util.List;

public class TestInterfaces {

	public static void main(String[] args) {

		List<A> lista = new ArrayList<>();
		A referencia = new B();
		referencia.metodoA1();
		referencia.metodoA2("argumento");
		
		A nuevaReferencia = new C();
		/*nuevaReferencia.metodoA1();
		nuevaReferencia.metodoA2("otro argumento");*/

		A otrareferencia = new E();
		//D otraNuevaReferencia = new E();
		
		lista.add(referencia);
		lista.add(nuevaReferencia);
		lista.add(otrareferencia); 
		for (A a : lista) {
			a.metodoA1();
		}
		
		
	}

}
