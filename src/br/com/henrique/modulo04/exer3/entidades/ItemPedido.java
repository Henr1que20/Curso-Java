package br.com.henrique.modulo04.exer3.entidades;

public class ItemPedido {
	private Integer quantidade;
	private Double preco;
	private Produto produto;
	
	public ItemPedido() {

	}

	public ItemPedido(Integer quantidade, Double preco, Produto produto) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public double subTotal() {
		return quantidade * preco;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(produto + ", ");
		sb.append(quantidade + ", $");
		sb.append(preco + ", ");
		sb.append(subTotal() + "\n");
 		return sb.toString();
	}
	
	

}
