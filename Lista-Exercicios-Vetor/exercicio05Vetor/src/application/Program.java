package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for(int i=0;i<vect.length;i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		int position = 0;
		double maior = 0.0;
		for(int i=0;i<vect.length;i++) {
			if(vect[i] > maior) {
				maior = vect[i];
				position = i;
			}
			
		}
		System.out.printf("MAIOR VALOR = %.1f%n",maior);
		System.out.print("POSICAO DO MAIOR VALOR = "+position);
		
		sc.close();
	}

}
