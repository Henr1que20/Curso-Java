package br.com.henrique.modulo05.entidades.exer03;

public class Circulo extends Shape{
	
	private Double raio;
	
	public Circulo() {	}


	public Circulo(Cor cor, Double raio) {
		super(cor);
		this.raio = raio;
	}
	
	public Double getRaio() {
		return raio;
	}


	public void setRaio(Double raio) {
		this.raio = raio;
	}


	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * raio * raio;
	}

}
