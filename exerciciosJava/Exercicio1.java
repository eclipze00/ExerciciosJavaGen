package br.com.generation.Exercicios.exerciciosJava;

	/*Exercicio 1
	 *Autor: Guilherme Barbosa Rodrigues
	 *Data: 29/11/2021
	 */
	//Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.
	

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		   Scanner leia = new Scanner(System.in);
			int IdadeAnos, IdadeMeses, IdadeDias, IdadeTotalDias;
			
			System.out.print("Calculadora de idade em dias\n\n");


			System.out.print("Digite os anos: ");
			IdadeAnos = leia.nextInt();
			
			System.out.print("Digite os meses: ");
			IdadeMeses = leia.nextInt();

			System.out.print("Digite os dias: ");
			IdadeDias = leia.nextInt();


			IdadeTotalDias = IdadeAnos * 365 + IdadeMeses * 30 + IdadeDias;
			System.out.print("Idade total em dias = " + IdadeTotalDias + "\n");
			
		    }

		}
