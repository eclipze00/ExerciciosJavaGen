package br.com.generation.Exercicios.exerciciosVetorEMatriz;

import java.util.Scanner;

public class ExercicioNaoObrigatorioVetorMatriz02 {

	public static void main(String[] args) {
		/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
			� Os n�meros pares digitados;  
			� A soma dos n�meros pares digitados; 
			� Os n�meros �mpares digitados; 
			� A quantidade de n�meros �mpares digitados.
			*/
		
		Scanner leia = new Scanner(System.in);
		
		int[] num = new int[6];
		int somaPar = 0, impar = 0, par = 0;
				
		System.out.println("Insira os n�meros: ");
			for(int i = 0; i < 5; i++) {
				num[i] = leia.nextInt();
				
				if(num[i] % 2 == 0) {	
					System.out.println(num[i] + " � par!");
					somaPar = somaPar + num[i];
				}
				else {	
					System.out.println(num[i] + " � �mpar!");
					impar++;
				}
			}
			
			System.out.println("A soma dos n�meros pares � de: " + somaPar);
			System.out.println("A quantidade de n�meors impares � de: " + impar);
			
			leia.close();
	}

}
