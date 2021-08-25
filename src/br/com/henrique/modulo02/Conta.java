package br.com.henrique.modulo02;

public class Conta {
	private int numeroConta;
	private String nome;
	private double saldo;
	
	public Conta(int numeroConta, String nome, double saldo) {
		super();
		this.numeroConta = numeroConta;
		this.nome = nome;
		this.saldo = saldo;
	}

	public Conta(int numeroConta, String nome) {
		super();
		this.numeroConta = numeroConta;
		this.nome = nome;
		saldo = 0.00;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public void deposito(double valor) {
		this.saldo += valor;

	}
	
	public void sacar(double valor) {
		this.saldo -= valor + 5;
	}

	@Override
	public String toString() {
		return "Numero da conta " + numeroConta + ", Nome: " + nome + ", R$ " + String.format("%.2f", saldo);
	}
	
	
	
	
	
	

}
