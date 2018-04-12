package com.iesvirgendelcarmen.ejercicios.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class ListaPoligonoRegular {

		private List<PoligonoRegular> lista = new ArrayList<>();
		
		public boolean aniadirPoligono(PoligonoRegular poligono) {
	    return lista.add(poligono);
		}

		public List<PoligonoRegular> getLista() {
		return lista;
		}
		
}
		

