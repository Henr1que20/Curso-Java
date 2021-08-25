package br.com.henrique.modulo01;

import java.awt.geom.Area;

public class Retangulo {
	private double altura;
	private double largura;
	
	public Retangulo(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
	}
	
	public double area() {
		return largura * altura;
	}
	
	public double perimetro() {
		return (largura + altura) * 2;
	}

	public double diagonal() { 
		return Math.sqrt( Math.pow(largura, 2) + Math.pow(altura, 2) );
	}

	@Override
	public String toString() {
		return "Area = " + String.format("%.2f", area())
			+ "\nPerimetro = "
			+ String.format("%.2f", perimetro())
			+ "\nDiagonal = " 
			+ String.format("%.2f", diagonal());
	}
	
	
}
