package br.com.henrique.modulo03;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramaFuncionario {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> funcionario = new ArrayList<>();
		
		System.out.print("Quantos funcionarios voce vai informar: ");
		int n = sc.nextInt();
		System.out.println();
		
		for (int i = 0; i < n; i++) {
			
			System.out.println("Funcionario #"+ (i+1) );
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Nome: ");
			String nome = sc.next();
			sc.nextLine();
			System.out.print("Salario: ");
			double salario = sc.nextDouble();
			
			funcionario.add(new Funcionario(id, nome, salario));
			System.out.println();
			
		}
		
		
		System.out.print("Entre com o Id do funcionario que vai receber o aumento: ");
		int id = sc.nextInt();
		
		boolean exite = false;
		Funcionario funcionarioAux = null;
		
		for(Funcionario funcio : funcionario) {
			if(funcio.getId() == id) {
				exite = true;
				funcionarioAux = funcio;
			}
		}
		
		if (exite) {
			System.out.print("Entre com porcentagem: ");
			double porcentagem = sc.nextDouble();
			
			funcionarioAux.aumento(porcentagem);
			
		}else {
			System.out.println("Este id nao existe!");
		}
		
		System.out.println("\nLista de Funcionario");
		for(Funcionario funcio : funcionario) {
			System.out.println(funcio);
		}
	
	}

}
