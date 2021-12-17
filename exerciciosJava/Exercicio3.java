package br.com.generation.Exercicios.exerciciosJava;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int minutos = 60, horas = 3600, tempo;
		
		System.out.println("Favor colocar a duração do evento em horas: ");
		tempo = leia.nextInt();
		
		minutos = tempo * minutos;
		horas = horas * tempo;
		
		System.out.println("O tempo do evento em minutos foi de: " + minutos);
		System.out.println("O tempo do evento em segundos foi de: " + horas);
		
		
	}

}
