package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, qtdF, qtdM;
		double menorA, maiorA, altMediaF, totalAltM;
		
		System.out.print("Quantos alunos serao digitados?");
		n = sc.nextInt();
		
		double[] alturas = new double[n];
		char[] generos = new char[n];
		
		for (int i=0;i<n;i++) {
			System.out.printf("Altura da %da pessoa: ", i + 1);
			alturas[i] = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", i + 1);
			generos[i] = sc.next().charAt(0);
		}
		
		menorA = alturas[0];
		maiorA = alturas[0];
		
		for (int i=0;i<n;i++) {
			if(alturas[i] > maiorA) {
				maiorA = alturas[i];
			}
			if(alturas[i] < menorA) {
				menorA = alturas[i];
			}
		}
		
		qtdM = 0;
		qtdF = 0;
		totalAltM = 0;
		for (int i=0;i<n;i++) {
			if(generos[i]=='M') {
				qtdM++;
			}
			else {
				qtdF++;
				totalAltM += alturas[i]; 	
			}
		}
		
		altMediaF = totalAltM / qtdF;
		
		System.out.printf("Menor altura = %.2f\n",menorA);
		System.out.printf("Maior altura = %.2f\n",maiorA);
		System.out.printf("Media das alturas das mulheres = %.2f\n", altMediaF);
		System.out.printf("Numero de homens = %d\n", qtdM);
		
		
		
		sc.close();
	}

}
