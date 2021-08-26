package br.com.henrique.modulo05.aplicacao.exer01;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import br.com.henrique.modulo05.entidades.exer01.Funcionario;
import br.com.henrique.modulo05.entidades.exer01.FuncionarioTerceirizado;

public class Programa {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com a quantidade de funcionarios: ");
		int n = sc.nextInt();
		
		List<Funcionario> funcionarios = new ArrayList<>();
		
		Funcionario fun;
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do Funcionario #"+i+": ");
			System.out.print("Funcionario tercerizado (y/n)? ");
			String input = sc.next();
			
			if (input.equalsIgnoreCase("y")) {
				System.out.print("Nome: ");
				String nome = sc.next();
				System.out.print("Horas: ");
				Integer horas = sc.nextInt();
				System.out.print("Valor por hora: ");
				Double valorPorHora = sc.nextDouble();
				System.out.print("Despesa adicional: ");
				Double despesaAdicional = sc.nextDouble();
				
				fun = new FuncionarioTerceirizado(nome, horas, valorPorHora, despesaAdicional);
				funcionarios.add(fun);
			}else {
				System.out.print("Nome: ");
				String nome = sc.next();
				System.out.print("Horas: ");
				Integer horas = sc.nextInt();
				System.out.print("Valor por hora: ");
				Double valorPorHora = sc.nextDouble();
				
				fun = new Funcionario(nome, horas, valorPorHora);
				
				funcionarios.add(fun);
				
			}
			
		}
		
		
		for (Funcionario f : funcionarios) {
			System.out.println(f);
		}
		
	}
}
