package br.com.henrique.modulo05.aplicacao.exer03;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import br.com.henrique.modulo05.entidades.exer03.Circulo;
import br.com.henrique.modulo05.entidades.exer03.Cor;
import br.com.henrique.modulo05.entidades.exer03.Retangulo;
import br.com.henrique.modulo05.entidades.exer03.Shape;

public class Programa {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o numero de formas: ");
		int n = sc.nextInt();
		
		List<Shape> list = new ArrayList<>();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Dados da forma #"+i+":");
			System.out.print("Retangulo ou Circulo  (r/c? ");
			String forma = sc.next();
			
			if (forma.equalsIgnoreCase("r")) {
				System.out.print("Cor (PRETO/AZUL/VERMELHO): ");
				String cor = sc.next();
				System.out.print("Largura: ");
				Double largura = sc.nextDouble();
				System.out.print("Altura: ");
				Double altura = sc.nextDouble();
				
				Shape sp = new Retangulo(Cor.valueOf(cor), largura, altura);
				
				list.add(sp);
				
			}else if (forma.equalsIgnoreCase("c")) {
				System.out.print("Cor (PRETO/AZUL/VERMELHO): ");
				String cor = sc.next();
				System.out.print("Raio: ");
				Double raio = sc.nextDouble();
				
				Shape sp = new Circulo(Cor.valueOf(cor), raio);
				
				list.add(sp);
			}	
			
		}
		
		
		System.out.println("SHAPE AREAS: ");
		for (Shape sp : list) {
			System.out.println(sp.area());
		}	
	}
}
