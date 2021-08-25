package br.com.henrique.modulo01;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaConversorMoeda {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual e o preco do dolar? ");
		double precoDolar = sc.nextDouble();
		
		System.out.print("Quanto vc deseja comprar de dolar? ");
		double qtdDolar = sc.nextDouble();
		
		double valorTotal = ConversorMoeda.valorEmReais(precoDolar, qtdDolar);
		
		System.out.println("Vc vai pagar em reias = " + valorTotal);
		
		
		
	}

}
