package br.com.henrique.modulo05.entidades;

public class ContaDeNegocio extends Conta{
	
	private Double limiteDeEmprestimo;

	
	public ContaDeNegocio() {}


	public ContaDeNegocio(Integer numero, String titular, Double saldo, Double limiteDeEmprestimo) {
		super(numero, titular, saldo);
		this.limiteDeEmprestimo = limiteDeEmprestimo;
	}


	public Double getLimiteDeEmprestimo() {
		return limiteDeEmprestimo;
	}


	public void setLimiteDeEmprestimo(Double limiteDeEmprestimo) {
		this.limiteDeEmprestimo = limiteDeEmprestimo;
	} 
	
	public void emprestimo(double valor) {
		if (valor <= this.limiteDeEmprestimo) {
			saldo += valor - 10;
		}
	}
	
	public void saque(double valor) {
		super.saque(valor);
		saldo -= 2;
	}
	
	
}
