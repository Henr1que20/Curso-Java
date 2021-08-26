package br.com.henrique.modulo05.entidades.exer02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {
	
	private Date dataFabricacao;

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public ProdutoUsado() { }

	public ProdutoUsado(String nome, Double preco, Date dateFabricacao) {
		super(nome, preco);
		this.dataFabricacao = dateFabricacao;
	}

	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	
	@Override
	public String toString() {
		return super.nome  + "(usado) $ " + super.preco + " (data de fabricação):  "+sdf.format(dataFabricacao)+") ";
	}
	
	
	
	
}
