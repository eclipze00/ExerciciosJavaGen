package br.com.generation.Exercicios.exerciciosJava;

import java.util.Scanner;

public class Exercicio7 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double a, b, c, d, g, f, x, y;
		
		System.out.println("Qual o valor de A: ");
		a = leia.nextDouble();
		System.out.println("Qual o valor de B: ");
		b = leia.nextDouble();
		System.out.println("Qual o valor de C: ");
		c = leia.nextDouble();
		System.out.println("Qual o valor de D: ");
		d = leia.nextDouble();
		System.out.println("Qual o valor de G: ");
		g = leia.nextDouble();
		System.out.println("Qual o valor de F: ");
		f = leia.nextDouble();
		
			x = ((c*g) - (b*f)) / ((a*g) - (b*d));
			y = ((a*f) - (c*d)) / ((a*g) - (b*d));
		
		System.out.println("O valor de X é de: " + x + ". E o valor de y é de: " + y);	
	}

}
