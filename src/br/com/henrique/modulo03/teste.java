package br.com.henrique.modulo03;

import java.util.Locale;
import java.util.Scanner;

public class teste {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double[] vet = new double[n];
		
		for (int i = 0; i < vet.length; i++) {
			vet[i] = sc.nextDouble();
		}
		
		double soma = 0;
		for(double vetor : vet) {
			soma += vetor;
		}
		
		double media = soma/n; 
		
		System.out.println("Media: " + media);
		
		
		
	}

}
