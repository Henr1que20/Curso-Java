package br.com.henrique.modulo05.entidades.exer02;

public class ProdutoImportado extends Produto {
	
	private Double taxaAlfandegária;
	
	public ProdutoImportado() { }

	public ProdutoImportado(String nome, Double preco, Double taxaAlfandegária) {
		super(nome, preco);
		this.taxaAlfandegária = taxaAlfandegária;
	}

	public Double getTaxaAlfandegária() {
		return taxaAlfandegária;
	}

	public void setTaxaAlfandegária(Double taxaAlfandegária) {
		this.taxaAlfandegária = taxaAlfandegária;
	}
	
	public double precoTotal() {
		return taxaAlfandegária + getPreco();
	}
	
	@Override
	public String toString() {
		return super.nome  + " $ " + precoTotal() + " (Taxa alfandefa: $ "+taxaAlfandegária+") ";
	}
	
	

}
