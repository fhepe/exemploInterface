package br.edu.unoesc.smo.aulaOO.exemploInterface;

public class Soma implements Calculadora {

	@Override
	public Double calcular(double valor1, double valor2) {
		return (valor1 + valor2);
	}

}
