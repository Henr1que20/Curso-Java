package br.com.henrique.modulo04.exer3.aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import br.com.henrique.modulo04.exer3.entidades.Cliente;
import br.com.henrique.modulo04.exer3.entidades.ItemPedido;
import br.com.henrique.modulo04.exer3.entidades.Pedido;
import br.com.henrique.modulo04.exer3.entidades.Produto;
import br.com.henrique.modulo04.exer3.entidades.StatusPedido;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Entre com o dados do cliente: ");
		System.out.print("Nome: ");
		String nomeCliente = sc.nextLine();
		System.out.print("Email: ");
		String emailCliente = sc.nextLine();
		System.out.print("Data de aniversario (dd/MM/yyyy): ");
		Date dataAniversario = sdf.parse(sc.next());

		Cliente cliente = new Cliente(nomeCliente, emailCliente, dataAniversario);

		System.out.println("Dados do Pedido");
		System.out.print("Status: ");
		String status = sc.next();

		Pedido pedido = new Pedido(new Date(), StatusPedido.valueOf(status), cliente);

		System.out.println("Entre com a quantidades de pedidos");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Entre com o #" + i + " pedido: ");
			System.out.print("Produto: ");
			String nomeProduto = sc.next();
			System.out.print("Entre com o preço: ");
			double preco = sc.nextDouble();
			System.out.println("Entre com a quantidade: ");
			Integer quantidade = sc.nextInt();

			Produto produto = new Produto(nomeProduto, preco);

			ItemPedido it = new ItemPedido(quantidade, preco, produto);

			pedido.addPedido(it);

		}

		System.out.println();
		System.out.println(pedido);

		sc.close();
	}

}
