package br.com.henrique.modulo02;

import java.util.Locale;
import java.util.Scanner;


public class ProgramaProduto {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Produto produto = new Produto("TV", 900.00, 10);
		
		System.out.println("Dados do Produtos: " + produto);
		
		produto.adicionarProdutoEstoque(5);
		
		System.out.println("\nDados Atualizados: " + produto);
		
		produto.removerProdutoEstoque(3);
		
		System.out.println("\nDados Atualizados: " + produto);
		
		
		
	}

}
