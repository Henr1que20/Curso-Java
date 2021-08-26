package br.com.henrique.modulo05.aplicacao.exer02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import br.com.henrique.modulo05.entidades.exer02.Produto;
import br.com.henrique.modulo05.entidades.exer02.ProdutoImportado;
import br.com.henrique.modulo05.entidades.exer02.ProdutoUsado;

public class Programa {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Produto> list = new ArrayList<>();
				
		System.out.print("Entre com o numero de produtos que voce vai entrar: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do Produto #"+i+": ");
			System.out.print("Comum, usado ou importado (c, u, i): ");
			String input = sc.next();
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Preco: ");
			Double preco = sc.nextDouble();
			
			if (input.equalsIgnoreCase("c")) {
				Produto prod = new Produto(nome, preco);
				list.add(prod);
				
			}else if (input.equalsIgnoreCase("u")) {
				System.out.print("Data de fabricação: ");
				Date dataFabricao = sdf.parse(sc.next());
				Produto prod = new ProdutoUsado(nome, preco, dataFabricao);
				list.add(prod);
				
			}else if (input.equalsIgnoreCase("i")) {
				System.out.print("Taxa importação: ");
				Double taxaAlfandega = sc.nextDouble();
				Produto prod = new ProdutoImportado(nome, preco, taxaAlfandega);
				list.add(prod);
				
			}
		}
		System.out.println();
		System.out.println("Etiqueta de Preco");
		
		for (Produto p : list) {
			System.out.println(p);
		}
		
	}

}
