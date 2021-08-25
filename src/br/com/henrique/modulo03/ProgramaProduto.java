package br.com.henrique.modulo03;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaProduto {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		
		Produto[] prod = new Produto[n];
		
		for (int i = 0; i < prod.length; i++) {
			String nome = sc.next();
			double preco = sc.nextDouble();
			prod[i] = new Produto(nome, preco);
	
		}
		
		double soma = 0;
		
		for(Produto produto : prod) {
			soma += produto.getPreco();
		}
			
		double media = soma/n;
		
		System.out.println("Preco medio: " + media);
		
	}
}
