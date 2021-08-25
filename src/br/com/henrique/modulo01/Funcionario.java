package br.com.henrique.modulo01;

public class Funcionario {
	private String nome;
	private double salarioBruto;
	private double taxa;
	
	public Funcionario(String nome, double salarioBruto, double taxa) {
		this.nome = nome;
		this.salarioBruto = salarioBruto;
		this.taxa = taxa;
	}
	
	public double salarioLiquido() {
		return salarioBruto - taxa;
	}
	
	public void aumentoSalario(double porcentagem) {
	     this.salarioBruto += (this.salarioBruto * porcentagem)/100;
	}
	
	@Override
	public String toString() {
		return nome + ", $ " + String.format("%.2f", salarioLiquido()); 
	}

}
