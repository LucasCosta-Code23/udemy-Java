package application;

import java.util.Locale;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		
		String[] vectName = new String[n];
		int[] vectAge = new int[n];
		
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Dados %da pessoa:\n", i + 1);
			System.out.print("Nome: ");
			vectName[i] = sc.next();
			System.out.print("Idade: ");
			vectAge[i] = sc.nextInt();
		}
		
		int older = vectAge[0];
		int positionOlder = 0;
		
		for (int i = 0; i < n; i++) {
			if(vectAge[i] > older) {
				older = vectAge[i];
				positionOlder = i;
				
			}
		}
		

		System.out.printf("PESSOA MAIS VELHA: %s\n" , vectName[positionOlder]);

		sc.close();

	}

}
