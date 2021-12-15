package br.com.generation.exerciciosLacosCondicionais;

import java.util.Scanner;

public class ExercicioDeCondicional02 {

	public static void main(String[] args) {
		// 2 - Faça um programa que entre com três números e coloque em ordem crescente.
		
		Scanner leia = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Favor digite o 1°número: ");
		num1 = leia.nextInt();
		System.out.println("Favor digite o 2°número: ");
		num2 = leia.nextInt();
		System.out.println("Favor digite o 3°número: ");
		num3 = leia.nextInt();
		
		if(num1 <= num2 && num2 <= num3){
			System.out.println("A ordem crescente é de: " + "\n" + num1 + "\n" + num2 + "\n" + num3);
		}
		else if(num1 <= num3 && num3 <= num2) {
			System.out.println("A ordem crescente é de: " + "\n" + num1 + "\n" + num2 + "\n" + num3);
		}
		else if(num2 <= num1 && num2 <= num3) {
			System.out.println("A ordem crescente é de: " + "\n" + num2 + "\n" + num1 + "\n" + num3);
		}
		else if(num2 <= num3 && num3 <= num1) {
			System.out.println("A ordem crescente é de: " + "\n" + num2 + "\n" + num3 + "\n" + num1);
		}
		else if(num3 <= num1 && num3 <= num2) {
			System.out.println("A ordem crescente é de: " + "\n" + num3 + "\n" + num2 + "\n" + num1);
		}
		else if(num3 <= num2 && num2 < num1) {
			System.out.println("A ordem crescente é de: " + "\n" + num3 + "\n" + num2 + "\n" + num1);
		}
		leia.close();

	}

}
