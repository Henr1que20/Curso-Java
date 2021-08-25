package br.com.henrique.modulo01;

public class Produto {
	private String nome;
	private double preco;
	private int quantidade;
	
	public Produto(String nome, double preco, int quantidade) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	
	public double valorTotalEstoque() {
		return this.preco * this.quantidade;
	}
	
	public void adicionarProdutoEstoque(int quantidade){
		this.quantidade += quantidade;
	}
	
	public void removerProdutoEstoque(int quantidade){
		this.quantidade -= quantidade;
	}


	@Override
	public String toString() {
		return nome 
				   + ", $ " 
	               + String.format("%.2f", this.preco) 
	               + ", "  
	               + quantidade
	               + ", Total: $ "
	               + String.format("%.2f", this.valorTotalEstoque());
	}
	
	 
}
