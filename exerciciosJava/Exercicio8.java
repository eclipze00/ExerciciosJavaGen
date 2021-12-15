package br.com.generation.exerciciosJava;

import java.util.Scanner;

public class Exercicio8 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double carroN, carroF, carroIF;
		
		System.out.println("Digite o valor do carro: ");
		carroN = leia.nextDouble();
		
		carroF = ((carroN * 28) / 100) + carroN;
		carroIF = ((carroF * 45) / 100) + carroF;
		
		System.out.println("Valor do carro com a porcentagem do distribuidor é de: R$" + carroF);
		System.out.println("\nValor do carro com a porcentagem do distribuidor e impostos inclusos: R$" + carroIF);
	}

}
