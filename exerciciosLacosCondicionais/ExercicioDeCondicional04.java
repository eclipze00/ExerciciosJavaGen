package br.com.generation.exerciciosLacosCondicionais;

import java.util.Scanner;

public class ExercicioDeCondicional04 {

	public static void main(String[] args) {
		/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
		n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
		�mpar exiba o n�mero elevado ao quadrado.
		 */
		
		Scanner leia = new Scanner (System.in);
		
		int num, conta;
		double pot, raiz;
		
		System.out.println("Favor digite o n�mero: ");
		num = leia.nextInt();
		
		conta = num % 2;
		
		if(conta == 0) {
			System.out.println("O n�mero � Par!");
			raiz = Math.sqrt(num);
			System.out.println("\nE sua raiz �: " + raiz);
		}
		else {
			System.out.println("O n�mero � �mpar!");
			pot = Math.pow(num, 2);
			System.out.println("\nE sua potencia � de: " + pot);
		}
			leia.close();				
	}
		
}


