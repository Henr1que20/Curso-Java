package br.com.henrique.modulo05.entidades.exer03;

public class Retangulo extends Shape{

	private Double largula;
	private Double altura;
	
	public Retangulo() { }


	public Retangulo(Cor cor, Double largula, Double altura) {
		super(cor);
		this.largula = largula;
		this.altura = altura;
	}


	@Override
	public double area() {
		// TODO Auto-generated method stub
		return altura * largula;
	}

}
