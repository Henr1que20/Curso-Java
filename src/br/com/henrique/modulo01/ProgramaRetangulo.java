package br.com.henrique.modulo01;

import java.util.Locale;

public class ProgramaRetangulo {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Retangulo retangulo = new Retangulo(3.00, 4.00);
		
		System.out.println(retangulo);
	}

}
