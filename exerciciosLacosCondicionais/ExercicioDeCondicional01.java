package br.com.generation.exerciciosLacosCondicionais;

import java.util.Scanner;

public class ExercicioDeCondicional01 {

	public static void main(String[] args) {
		// 1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		
		Scanner leia = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Favor digite o 1�n�mero: ");
		num1 = leia.nextInt();
		System.out.println("Favor digite o 2�n�mero: ");
		num2 = leia.nextInt();
		System.out.println("Favor digite o 3�n�mero: ");
		num3 = leia.nextInt();
		
		if(num1 > num2 && num1 > num3){
			System.out.println("O maior n�mero � o primeiro digitado: " + num1);
		}
		else if(num2 > num1 && num2 > num3){
			System.out.println("\nO maior n�mero � o segundo digitado: " + num2);			
		}
		else if(num3 > num1 && num3 > num2){
			System.out.println("\nO maior n�mero � o terceiro digitado: " + num3);
		}
		else {
			System.out.println("Valor inv�lido!");
		}
		leia.close();

	}

}
