package br.com.generation.exerciciosLacosCondicionais;

import java.util.Scanner;

public class ExercicioDeCondicional04 {

	public static void main(String[] args) {
		/*Faça um programa em que permita a entrada de um número qualquer e exiba se este
		número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
		ímpar exiba o número elevado ao quadrado.
		 */
		
		Scanner leia = new Scanner (System.in);
		
		int num, conta;
		double pot, raiz;
		
		System.out.println("Favor digite o número: ");
		num = leia.nextInt();
		
		conta = num % 2;
		
		if(conta == 0) {
			System.out.println("O número é Par!");
			raiz = Math.sqrt(num);
			System.out.println("\nE sua raiz é: " + raiz);
		}
		else {
			System.out.println("O número é Ímpar!");
			pot = Math.pow(num, 2);
			System.out.println("\nE sua potencia é de: " + pot);
		}
			leia.close();				
	}
		
}


