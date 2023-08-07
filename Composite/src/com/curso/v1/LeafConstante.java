package com.curso.v1;

public class LeafConstante implements Component {
	
	private double valor;
	
	public LeafConstante(double valor) {
		this.valor = valor;
	}

	@Override
	public double getValor() {
		return valor;
	}

}
