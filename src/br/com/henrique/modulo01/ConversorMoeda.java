package br.com.henrique.modulo01;

public class ConversorMoeda {
	
	public static double valorEmReais(double reais, double qtdDesejada) {
		double valorTotal = reais * qtdDesejada;
		
		valorTotal += valorTotal * 0.06;
		
		return valorTotal;
	}

}
