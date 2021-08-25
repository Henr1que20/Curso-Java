package br.com.henrique.modulo01;

public class Aluno {
	private String nome;
	private double notaFinal;

	public Aluno(String nome) {
		super();
		this.nome = nome;
	}

	public void calcularMedia(double n1, double n2, double n3) {
		notaFinal = n1 + n2 + n3;
	}

	public String validarAprovado() {

		if (notaFinal >= 60) {

			return "Nota final: " + String.format("%.2f", notaFinal) + "\nAprovado";
		}

		double faltouPontos = 60 - notaFinal;

		return "Nota final: " + String.format("%.2f", notaFinal) +
			   "\nReprovado\n" + String.format("%.2f", faltouPontos) + " Pontos Faltando";
	}

}
