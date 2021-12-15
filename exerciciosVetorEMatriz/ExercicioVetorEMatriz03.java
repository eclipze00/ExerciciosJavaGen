package br.com.generation.exerciciosVetorEMatriz;

import java.util.Scanner;

public class ExercicioVetorEMatriz03 {

	public static void main(String[] args) {
		/*Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
		a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
		b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.
		 */
		
		Scanner leia = new Scanner(System.in);
		
		int[][] n1 = new int [4][6];
		int[][] n2 = new int [4][6];
		int[][] m1 = new int [4][6];
		double [][] m2 = new double [4][6];
		
		System.out.println("====Números das Matrizes====");
			for(int l = 0; l < n1.length; l++) {
				for(int c = 0; c < n1[l].length; c++) {
					System.out.printf("Digite os números da primeira Matriz:  : ", l, c);
					n1[l][c] = leia.nextInt();
				}
			}
			for(int i = 0; i < n2.length; i++) {
				for(int j = 0; j < n2[i].length; j++) {
				System.out.printf("Digite os números da segunda Matriz: [%d][%d]: ", i, j);
				n2[i][j] = leia.nextInt();
				}
			}			
			for(int a = 0; a < m1.length; a++) {
				for(int b = 0; b < m1[a].length; b++) {
				System.out.printf("A soma das Matrizes N1 e N2 é de: [%d][%d]: ", a, b);
				m1[a][b] = n1[a][b] + n2[a][b];
				System.out.println("\nTotal da soma: " + m1[a][b]);
					}
				}
			for(int a2 = 0; a2 < m2.length; a2++) {
				for(int b2 = 0; b2 < m2[a2].length; b2++) {
				System.out.printf("A diferença das Matrizes N1 e N2 é de: [%d][%d]: ", a2, b2);
				m2[a2][b2] = n1[a2][b2] - n2[a2][b2];
				System.out.println("\nTotal da diferença: " + m2[a2][b2]);
					}
				}
			leia.close();
	}

}
