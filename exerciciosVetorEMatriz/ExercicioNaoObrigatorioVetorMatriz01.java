package br.com.generation.exerciciosVetorEMatriz;

public class ExercicioNaoObrigatorioVetorMatriz01 {

	public static void main(String[] args) {
		/*1- Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros inteiros. O programa deve executar os seguintes passos: 
		(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
		(b) Armazene em uma vari�vel inteira (simples) a soma entre os valores das posi��es A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
		(c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100. 
		(d) Mostre na tela cada valor do vetor A, um em cada linha.
		*/
		
		int[] A = new int[6];
		// (a)
		A[0] = 1;
		A[1] = 0;
		A[2] = 5;
		A[3] = -2;
		A[4] = -5;
		A[5] = 7;
		// (b)
		int soma = 0;
		
			for(int b = 0; b <= 5; b++) {
				System.out.println(b + " - " + A[b]);  //(d)
				soma = A[0] + A[1] + A[5];
				A[3] = 100; // (c)
				
			}
			
			System.out.println("O valor da soma dos Vetores solicitados � de: " + soma);			
	}
		

}
