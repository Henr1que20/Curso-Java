package br.com.henrique.modulo01;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaStaic {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o raio: ");
		double raio = sc.nextDouble();
		
		
		double c = Calculator.circunferencia(raio);
		
		double v = Calculator.volume(raio);
		
		System.out.println("Circunferencia: " + c);
		System.out.println("Volume: " + v);
		System.out.println("Valor do PI: " + Calculator.PI);
		
		
	}

}
