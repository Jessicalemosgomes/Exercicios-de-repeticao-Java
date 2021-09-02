package lacoderepeticao;

import java.util.Scanner;

public class lacoderepeticaoo2 {

	public static void main(String[] args) {
		// Exercícios de repetição 02 (for)

		 Scanner leia = new Scanner(System.in);
	        int num, contPar = 0, contImpar = 0;
	        
	        for(int i = 1; i <= 10; i++){
	            System.out.println("Digite o " + i + "º número");
	            num = leia.nextInt();
	            
	            if(num % 2 == 0){
	                contPar++;
	            }

	            if(num % 2 == 1){
	                contImpar++;
	            }
	            
	        }
	        
	        System.out.println("Foram digitados " + contPar + " números pares \n");
	        System.out.println("E " + contImpar + " números ímpares");
	}

}
