package br.com.henrique.modulo01;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaTriangulo {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo x = new Triangulo();
		Triangulo Y = new Triangulo();
		
		System.out.println("Entre com os lados do triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Entre com os lados do triangulo Y: ");
		Y.a = sc.nextDouble();
		Y.b = sc.nextDouble();
		Y.c = sc.nextDouble();
				
		System.out.printf("Area do triangulo X: %.2f\n", x.area());
		System.out.printf("Area do triangulo Y: %.2f\n", Y.area());
		
		
	}

}
