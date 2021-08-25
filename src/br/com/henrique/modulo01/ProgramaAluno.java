package br.com.henrique.modulo01;

import java.util.Locale;

public class ProgramaAluno {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Aluno aluno = new Aluno("Alex Green");
		
		aluno.calcularMedia(17.00, 20.00, 15.00);

		System.out.println(aluno.validarAprovado());
		
	}

}
