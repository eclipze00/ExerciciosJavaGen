package br.com.generation.Exercicios.exerciciosLacosRepeticao;

import java.util.Scanner;

public class ExercicioRepeticao02 {
	
	public static void main(String[] args) {
		//2- Ler 10 números e imprimir quantos são pares e quantos são ímpares.
		
		int par = 0, impar = 0, i;
		
		Scanner scanner = new Scanner(System.in);
		
		for (int n = 1; n <= 10; n++) {
			System.out.println("Digite o Número: ");
			i = scanner.nextInt();
			
			if (i % 2 == 0) {
				par++;
				
		}
			else {
				impar++;
			}
			
		}
		
		System.out.println("O total de números pares são: " + par);
		System.out.println("O total de números impares são: " + impar);
		
		scanner.close();
	}

}
