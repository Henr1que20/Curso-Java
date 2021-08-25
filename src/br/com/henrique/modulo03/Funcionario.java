package br.com.henrique.modulo03;

public class Funcionario {
	private int id;
	private String nome;
	private double salario;
	
	public Funcionario(int id, String nome, double salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	public int getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getSalario() {
		return salario;
	}
	
	
	public void aumento(double porcentagem) {
		this.salario = this.salario + (this.salario * porcentagem)/100; 
	}
	
	
	@Override
	public String toString() {
		return id + ", " + nome + ", " + String.format("%.2f", salario);
	}
	

}
