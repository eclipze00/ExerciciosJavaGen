package br.com.generation.Exercicios.exerciciosVetorEMatriz;

import java.util.Scanner;

public class ExercicioVetorEMatriz02 {

	public static void main(String[] args) {
		/*	Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa que gere um vetor com os lan�amentos, escreva esse vetor. 
		 * 	A seguir determine e imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o.
		 */
			
		Scanner leia = new Scanner(System.in);
		
		int[] dado = new int[10];
		int i, soma = 0, media = 0, maior = 0, cont = 0; 
		
		System.out.println("O valor do dado foi de: ");
			for(i = 0; i < dado.length; i++) {
				dado[i] = leia.nextInt();
				soma = soma + dado[i];
				media = soma / 10;
				
				if(dado[i] > maior) {
					maior = dado[i];
				}
			}	
					if(maior == 6) {
						for(int x = 0; x < 10; x++) {
							if(dado[x] == 6) {
								cont++;
							}
						}
					}		
					if(maior == 5) {
						for(int x = 0; x < 10; x++) {
							if(dado[x] == 5) {
								cont++;
							}
						}
					}		
					if(maior == 4) {
						for(int x = 0; x < 10; x++) {
							if(dado[x] == 4) {
								cont++;
							}
						}
					}
					if(maior == 4) {
						for(int x = 0; x < 10; x++) {
							if(dado[x] == 4) {
								cont++;
							}
						}
					}		
					if(maior == 3) {
						for(int x = 0; x < 10; x++) {
							if(dado[x] == 3) {
								cont++;
							}
						}
					}		
					if(maior == 2) {
						for(int x = 0; x < 10; x++) {
							if(dado[x] == 2) {
								cont++;
							}
						}
					}
					if(maior == 1) {
						for(int x = 0; x < 10; x++) {
							if(dado[x] == 1) {
								cont++;
							}
						}
					}						
				
				System.out.println("O valor total dos dados foi de: " + soma + "\nCom uma m�dia de: " + media);
				System.out.println("E o maior valor foi digitado: " + cont + " vezes.");
		
				leia.close();
			}
		}
