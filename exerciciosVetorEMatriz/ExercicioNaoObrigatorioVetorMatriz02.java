package br.com.generation.Exercicios.exerciciosVetorEMatriz;

import java.util.Scanner;

public class ExercicioNaoObrigatorioVetorMatriz02 {

	public static void main(String[] args) {
		/*2- Faça um programa que receba 6 números inteiros e mostre: 
			• Os números pares digitados;  
			• A soma dos números pares digitados; 
			• Os números ímpares digitados; 
			• A quantidade de números ímpares digitados.
			*/
		
		Scanner leia = new Scanner(System.in);
		
		int[] num = new int[6];
		int somaPar = 0, impar = 0, par = 0;
				
		System.out.println("Insira os números: ");
			for(int i = 0; i < 5; i++) {
				num[i] = leia.nextInt();
				
				if(num[i] % 2 == 0) {	
					System.out.println(num[i] + " É par!");
					somaPar = somaPar + num[i];
				}
				else {	
					System.out.println(num[i] + " É Ímpar!");
					impar++;
				}
			}
			
			System.out.println("A soma dos números pares é de: " + somaPar);
			System.out.println("A quantidade de númeors impares é de: " + impar);
			
			leia.close();
	}

}
