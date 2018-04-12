package com.iesvirgendelcarmen.ejercicios.ejercicio1;

public abstract class PoligonoRegular implements Comparable<PoligonoRegular>{

		String nombrePoligono;
		int numeroLados;
		double longitudLado;
		
		
		public PoligonoRegular(String nombrePoligono, int numeroLados, double longitudLado) {
			this.nombrePoligono = nombrePoligono;
			this.numeroLados = numeroLados;
			this.longitudLado = longitudLado;
		}
		
		public double getPerimetro() {
			return numeroLados * longitudLado;
		}
		
		public abstract double getArea();

		@Override
		public String toString() {
			return "Nombre del poligono: " + nombrePoligono + " y longitud de lado= " + longitudLado ;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			long temp;
			temp = Double.doubleToLongBits(longitudLado);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			result = prime * result + numeroLados;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			PoligonoRegular other = (PoligonoRegular) obj;
			if (Double.doubleToLongBits(longitudLado) != Double.doubleToLongBits(other.longitudLado))
				return false;
			if (numeroLados != other.numeroLados)
				return false;
			return true;
		}
		
		@Override
		public int compareTo(PoligonoRegular poligono1) {
			return numeroLados - poligono1.numeroLados;
		}
		
		
		
}
