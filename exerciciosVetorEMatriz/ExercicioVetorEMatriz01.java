package br.com.generation.exerciciosVetorEMatriz;

import java.util.Scanner;

public class ExercicioVetorEMatriz01 {

	public static void main(String[] args) {
		
		/* 1- Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o escreva em seguida. 
		Encontre após a maior pontuação e a apresente. 
		*/
		
		Scanner leia = new Scanner(System.in);
		
		int[] pont = new int[5];
		int i, maior = 0;
		
		System.out.println("Favor entrar com os 5 valores: ");
			for(i = 0; i < pont.length; i ++) {
				pont[i] = leia.nextInt(); 
				
				if(pont[i] > maior) {
					maior = pont[i];
				}
			}	
			
			System.out.println("A maior pontuação registrada é de: " + maior);
			
			leia.close();
	}
	
}
