package lacoderepeticao;

import java.util.Scanner;

public class lacoderepeticao05 {

	
	public static void main(String[] args) {
		// Exercícios de repetição 05
		
		int somaNumeros = 0, num;

		Scanner scan = new Scanner(System.in);
		System.out.println("\nEntre com um número: ");
		num=scan.nextInt();

		do {
			System.out.println("\nEntre com um número: ");
			num=scan.nextInt();
			somaNumeros+=num;
		}
		while(num !=0);

		System.out.println("\n A soma dos números é: " +somaNumeros);
	}
}
