package br.com.henrique.modulo02;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaContaBancaria {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta conta;
		
		System.out.print("Entre com O numero da conta: ");
		int numeroConta = sc.nextInt();
		
		System.out.print("Entre com o titular da conta: ");
		String nome = sc.next();
		
		
		System.out.print("Deseja realizar deposito inicial (y/n)? ");
		String opcao = sc.next();
		
		
		
		if(opcao.equals("y")) {
			System.out.println("Entre com o valor do deposito inicial: ");
			double valor = sc.nextDouble();
			
			conta = new Conta(numeroConta, nome, valor);
		}else {
			conta = new Conta(numeroConta, nome);
		}
		
		System.out.println("Dados da conta: " + conta);
		System.out.println();
		System.out.print("Entre com o valor do deposito: ");
		double valor = sc.nextDouble();
		
		conta.deposito(valor);
		
		System.out.println("Dados atualizados da conta: " + conta);
		
		
		System.out.print("Entre com o valor que deseja sacar: ");
		valor = sc.nextDouble();
		
		conta.sacar(valor);
		
		System.out.println("Dados atualizados da conta: " + conta);
		
		
		
	}
}
