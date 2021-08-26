package br.com.henrique.modulo05.entidades.exer03;

public abstract class Shape {
	private Cor cor;
	
	public Shape() { }
	
	public Shape(Cor cor) {
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}
	
	public abstract double area();
	
	
}

