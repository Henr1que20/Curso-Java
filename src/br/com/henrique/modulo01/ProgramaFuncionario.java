package br.com.henrique.modulo01;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaFuncionario {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario("Joao Silva", 6000.00, 1000.00);
		
		System.out.println("Funcionario: " + funcionario);
		
		System.out.print("\nQual a porcentagem de aumento: ");
		double porcentagem = sc.nextDouble();
		
		funcionario.aumentoSalario(porcentagem);
		
		System.out.println("\nDados atualizados: " + funcionario);
		
		
	}

}
