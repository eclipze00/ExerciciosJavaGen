package br.com.generation.Exercicios.exerciciosLacosRepeticao;

import java.util.Scanner;

public class ExercicioRepeticao02 {
	
	public static void main(String[] args) {
		//2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.
		
		int par = 0, impar = 0, i;
		
		Scanner scanner = new Scanner(System.in);
		
		for (int n = 1; n <= 10; n++) {
			System.out.println("Digite o N�mero: ");
			i = scanner.nextInt();
			
			if (i % 2 == 0) {
				par++;
				
		}
			else {
				impar++;
			}
			
		}
		
		System.out.println("O total de n�meros pares s�o: " + par);
		System.out.println("O total de n�meros impares s�o: " + impar);
		
		scanner.close();
	}

}
