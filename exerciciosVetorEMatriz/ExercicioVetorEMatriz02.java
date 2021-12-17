package br.com.generation.Exercicios.exerciciosVetorEMatriz;

import java.util.Scanner;

public class ExercicioVetorEMatriz02 {

	public static void main(String[] args) {
		/*	Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
		 * 	A seguir determine e imprima a média aritmética dos lançamentos, contabilize e apresente também quantas foram as ocorrências da maior pontuação.
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
				
				System.out.println("O valor total dos dados foi de: " + soma + "\nCom uma média de: " + media);
				System.out.println("E o maior valor foi digitado: " + cont + " vezes.");
		
				leia.close();
			}
		}
