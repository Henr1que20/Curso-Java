package br.com.henrique.modulo04.aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import br.com.henrique.modulo04.entidade.ContratoHora;
import br.com.henrique.modulo04.entidade.Departamento;
import br.com.henrique.modulo04.entidade.Trabalhador;
import br.com.henrique.modulo04.entidade.enums.NivelTrabalho;

public class Programa {
	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Entre com o nome do departamaneto: ");
		String departamentoNome = sc.next();
		

		System.out.println("Entre com os dados do trabalhador: ");
		System.out.print("Nome: ");
		String nomeTabalhador = sc.next();
		

		System.out.print("Nivel: ");
		String nivelTrabalhador = sc.next();
		

		System.out.println("Salario Base: ");
		double salarioBase = sc.nextDouble();

		Trabalhador trabalhador = new Trabalhador(nomeTabalhador, NivelTrabalho.valueOf(nivelTrabalhador), salarioBase,
				new Departamento(departamentoNome));

		System.out.print("Quantos contratos o trabalhador vai ter? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			
			System.out.println("Entre com os dados do contrato #" + i + ": ");
			System.out.println("Data (DD/MM/YYYY): ");
			Date dataContrato = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valorPorHora = sc.nextDouble();
			System.out.print("Duração: ");
			int horas = sc.nextInt();
			ContratoHora contrato = new ContratoHora(dataContrato, valorPorHora, horas);
			
			trabalhador.addContrato(contrato);
		}
		
		System.out.println();
		System.out.print("Entre com um mes e ano para calcular a renda (MM/YYYY): ");
		String mesAno = sc.next();
		
		int mes = Integer.parseInt(mesAno.substring(0,2));
		int ano = Integer.parseInt(mesAno.substring(3));
		
		System.out.println("Nome: " + trabalhador.getName());
		System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
		System.out.println("Randa no " +mesAno+": " + String.format("%.2f", trabalhador.renda(ano, mes)));
		
		sc.close();

	}

}
