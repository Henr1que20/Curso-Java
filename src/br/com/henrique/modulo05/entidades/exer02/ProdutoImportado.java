package br.com.henrique.modulo05.entidades.exer02;

public class ProdutoImportado extends Produto {
	
	private Double taxaAlfandeg�ria;
	
	public ProdutoImportado() { }

	public ProdutoImportado(String nome, Double preco, Double taxaAlfandeg�ria) {
		super(nome, preco);
		this.taxaAlfandeg�ria = taxaAlfandeg�ria;
	}

	public Double getTaxaAlfandeg�ria() {
		return taxaAlfandeg�ria;
	}

	public void setTaxaAlfandeg�ria(Double taxaAlfandeg�ria) {
		this.taxaAlfandeg�ria = taxaAlfandeg�ria;
	}
	
	public double precoTotal() {
		return taxaAlfandeg�ria + getPreco();
	}
	
	@Override
	public String toString() {
		return super.nome  + " $ " + precoTotal() + " (Taxa alfandefa: $ "+taxaAlfandeg�ria+") ";
	}
	
	

}
