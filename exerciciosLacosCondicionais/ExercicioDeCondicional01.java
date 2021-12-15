package br.com.generation.exerciciosLacosCondicionais;

import java.util.Scanner;

public class ExercicioDeCondicional01 {

	public static void main(String[] args) {
		// 1- Faça um programa que receba três inteiros e diga qual deles é o maior.
		
		Scanner leia = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Favor digite o 1°número: ");
		num1 = leia.nextInt();
		System.out.println("Favor digite o 2°número: ");
		num2 = leia.nextInt();
		System.out.println("Favor digite o 3°número: ");
		num3 = leia.nextInt();
		
		if(num1 > num2 && num1 > num3){
			System.out.println("O maior número é o primeiro digitado: " + num1);
		}
		else if(num2 > num1 && num2 > num3){
			System.out.println("\nO maior número é o segundo digitado: " + num2);			
		}
		else if(num3 > num1 && num3 > num2){
			System.out.println("\nO maior número é o terceiro digitado: " + num3);
		}
		else {
			System.out.println("Valor inválido!");
		}
		leia.close();

	}

}
