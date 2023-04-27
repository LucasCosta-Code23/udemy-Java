package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();

		int[] vect = new int[n];

		System.out.println("Digite um numero: ");

		for (int i = 0; i < vect.length; i++) {

			vect[i] = sc.nextInt();
		}

		int totP = 0;
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				sum += vect[i];
				totP++;
			}

		}
		if (totP == 0) {
			System.out.println("NENHUM NUMERO PAR");
		} else {
			double avg = sum / totP;
			System.out.printf("MEDIA DOS PARES = %.1f%n", avg);
		}

		sc.close();
	}

}
