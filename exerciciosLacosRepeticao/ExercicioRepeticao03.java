package br.com.generation.exerciciosLacosRepeticao;

import java.util.Scanner;

public class ExercicioRepeticao03 {
	
	public static void main(String[] args) {
		/*3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		idade for =-99. (WHILE)
		*/
		
		Scanner leia = new Scanner(System.in);
		
		int idade, cont21 = 0, cont50 = 0;
		
		System.out.println("Favor digite sua idade: ");
		idade = leia.nextInt();
		while(idade != -99) {
			if(idade < 21) cont21++;
			if(idade > 50) cont50++;
			System.out.println("Digite a idada da pessoa (Para terminar digite -99): ");
			idade = leia.nextInt();
		}
		
		System.out.println("\nO total de pessoa com menos de 21 anos é de: " + cont21);
		System.out.println("\nO total de pessoa com mais de 50 anos é de: " + cont50);
		leia.close();
		
	}
	
}
