package br.com.henrique.modulo03;

import java.util.Random;
import java.util.Scanner;

public class ExercicioMatriz {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Random gerador = new Random();

		int linha = sc.nextInt();
		int coluna = sc.nextInt();

		int[][] mat = new int[linha][coluna];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = gerador.nextInt(100);
			}
		}

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println();
		}

		int num = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == num) {
					System.out.println("Posição " + i + "," + j + ": ");

					if (j > 0 ) {
						System.out.println("Esquerda: " + mat[i][j - 1]);
					}
					
					if (i > 0 ) {
						System.out.println("cima: " + mat[i - 1][j]);
					}

					if (j < mat[i].length-1) {
						System.out.println("Direira: " + mat[i][j + 1]);
					}


					if (i < mat.length-1) {
						System.out.println("baixo: " + mat[i + 1][j]);
					}

				}
			}

		}

	}

}
