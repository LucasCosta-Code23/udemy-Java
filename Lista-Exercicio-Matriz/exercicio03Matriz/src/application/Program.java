package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int[][] mat = new int[5][5];
		
		
		for (int i = 0; i < mat.length; i++) {
			mat[i][i] = 1;
		}
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (i != j) {
					mat[i][j] = 0;
				}
			}
		}
		
		for ( int i = 0; i< mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();

	}

}
