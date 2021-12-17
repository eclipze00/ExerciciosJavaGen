package br.com.generation.Exercicios.exerciciosLacosCondicionais;

import java.util.Scanner;

public class ExercicioDeCondicional03 {

	public static void main(String[] args) {
		/* 3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
		categoria ela se encontra:
			 10-14 infantil
			 15-17 juvenil
			 18-25 adulto
		*/
		
		Scanner leia = new Scanner (System.in);		
				
		System.out.println("Favor coloque sua idade: ");
		String idade = leia.nextLine();
		
		switch(idade) {
			case "10", "11", "12", "13", "14":
				System.out.println("Voce está na categoria Infantil!");
			break;
			case "15", "16", "17":
				System.out.println("Voce está na categoria Juvenil!");
			break;
			case "18", "19", "20","21", "22", "23", "24", "25":
				System.out.println("Voce está na categoria Adulto!");
			break;							
		}
		leia.close();

	}

}
