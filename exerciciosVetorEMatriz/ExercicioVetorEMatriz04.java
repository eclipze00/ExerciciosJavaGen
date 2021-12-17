package br.com.generation.Exercicios.exerciciosVetorEMatriz;

import java.util.Scanner;

public class ExercicioVetorEMatriz04 {

	public static void main(String[] args) {
		/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida, 
		 *exiba a soma dos valores dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal.
		 */
			
		Scanner leia = new Scanner(System.in);
		
		double[][] m = new double[3][3];
		double diag = 0.0, soma = 0.0;
		
		System.out.println("====Valores para as Matrizes!====");
			for(int l = 0; l < 3; l++) {
				for(int c = 0; c < 3; c++) {
					System.out.printf("Digite os valores: [%d][%d]: ", l, c);
					m[l][c] = leia.nextDouble();
					soma = soma + m[l][c];
					diag = m[0][0] + m[1][1] + m[2][2];
				}
			}
			
			System.out.println("\nEsse é o valor das Matrizes somadas: " + soma);
			System.out.println("\nEsse é o valor da soma referente a Diagonal Principal: " + diag);
			
			leia.close();
	}

}
