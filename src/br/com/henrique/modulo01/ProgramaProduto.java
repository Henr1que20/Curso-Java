package br.com.henrique.modulo01;

import java.util.Locale;

public class ProgramaProduto {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Produto produto = new Produto("TV", 900.00, 10);
		
		System.out.println("Dados do Produtos: " + produto);
		
		produto.adicionarProdutoEstoque(5);
		
		System.out.println("\nDados Atualizados: " + produto);
		
		produto.removerProdutoEstoque(3);
		
		System.out.println("\nDados Atualizados: " + produto);
	}

}
