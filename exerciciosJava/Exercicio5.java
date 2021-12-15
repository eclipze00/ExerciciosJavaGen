package br.com.generation.exerciciosJava;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double n1, n2, n3, media;
		
		System.out.println("Coloque sua 1° nota: ");
		n1 = leia.nextDouble();
		
		System.out.println("Coloque sua 2° nota: ");
		n2 = leia.nextDouble();
		
		System.out.println("Coloque sua 3° nota: ");
		n3 = leia.nextDouble();
		
		media = ((n1*2) + (n2*3) + (n3* 5)) / 10;
		
		
		System.out.println("A média ponderada é de: " + media);		

	}

}
