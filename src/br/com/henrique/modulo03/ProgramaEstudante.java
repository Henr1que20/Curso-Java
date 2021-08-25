package br.com.henrique.modulo03;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaEstudante {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de quartos: ");
		int n = sc.nextInt();
		
		Estudante[] vet = new Estudante[10];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Rent #"+(i+1));
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			
			vet[quarto] = new Estudante(nome, email);
			System.out.println();
			
		}
		
		System.out.println();
		System.out.println("Quartos ocupados: ");
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] != null) {
				System.out.println(i + ": " + vet[i]);
			}
		}
		
	}

}
