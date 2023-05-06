package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int[][] mat = new int[4][4];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		int maiorValor = 0;
		int linhaMaiorValor = 0;
		int colunaMaiorValor = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] > maiorValor) {
					maiorValor = mat[i][j];
					linhaMaiorValor = i;
					colunaMaiorValor = j;
				}
			}
		}
		System.out.println("O maior valor e " + maiorValor + " e esta localizado na linha " + linhaMaiorValor + " e coluna " +
		colunaMaiorValor + ".");
		

		sc.close();
	}

}
